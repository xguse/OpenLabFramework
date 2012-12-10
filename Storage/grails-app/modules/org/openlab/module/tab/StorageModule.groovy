package org.openlab.module.tab

import org.openlab.module.*;
import org.openlab.module.*

public class StorageModule implements Module{

	def getPluginName() {
		return "storage";
	}
	
	def getTemplateForDomainClass(def domainClass)
	{
		if(domainClass.startsWith("recombinant")) return "storage";
        else if(domainClass.startsWith("cellLineData")) return "cellLineDataStorage"
	}
	
	def isInterestedIn(def domainClass, def type)
	{
		if((type == "tab") && (domainClass.startsWith("cellLineData") || domainClass.startsWith("recombinant"))) return true
		
		return false
	}
	
	def getModelForDomainClass(def domainClass, def id)
	{
		return []
	}
}
