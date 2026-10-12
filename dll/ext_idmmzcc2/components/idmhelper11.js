const CLASS_ID = Components.ID("{4195D87F-0EE0-4E16-B937-8224A606618C}");
const CLASS_NAME = "IDM CC Component11";
const CONTRACT_ID = "@idm/mozilla_cc_helper11;1";


function IDMCCHelperComponent11() {
};

IDMCCHelperComponent11.prototype = {
  QueryInterface: function(aIID)
  {
    if (!aIID.equals(Components.interfaces.iIDMHelper11) &&    
        !aIID.equals(Components.interfaces.nsISupports))
      throw Components.results.NS_ERROR_NO_INTERFACE;
    return this;
  },
  GetBW3: function()
  {
	var wm = Components.classes["@mozilla.org/appshell/window-mediator;1"].getService(Components.interfaces.nsIWindowMediator);
	var recentWindow = wm.getMostRecentWindow("navigator:browser");
	return recentWindow.QueryInterface(Components.interfaces.nsIInterfaceRequestor).getInterface(Components.interfaces.nsIWebNavigation).QueryInterface(Components.interfaces.nsIDocShellTreeItem).treeOwner.QueryInterface(Components.interfaces.nsIInterfaceRequestor).getInterface(Components.interfaces.nsIXULWindow).docShell.QueryInterface(Components.interfaces.nsISupports); 
  },
  GetSelectedTabID: function()
  {
	var wm = Components.classes["@mozilla.org/appshell/window-mediator;1"].getService(Components.interfaces.nsIWindowMediator);
	var recentWindow = wm.getMostRecentWindow("navigator:browser");
	if (recentWindow)
		recentWindow.gBrowser.selectedBrowser.messageManager.sendAsyncMessage("idmmzcc:content:getSelectedTabID");
  },
  GetTopParent: function(pDoc)
  {
	var aDoc = pDoc.QueryInterface(Components.interfaces.nsIDOMDocument);
	if (aDoc)
		return aDoc.defaultView.top.document.QueryInterface(Components.interfaces.nsISupports);
	return null;
  },
  GetFrameElement: function(pDoc)
  {
	var aFrameElement = pDoc.QueryInterface(Components.interfaces.nsIDOMDocument).defaultView.frameElement;
	if (! aFrameElement)
		return null;
	return aFrameElement.QueryInterface(Components.interfaces.nsISupports); 
  },
  GetAttributeForDoc: function(attrName, pDoc)
  {
	var aDocElement = pDoc.QueryInterface(Components.interfaces.nsIDOMDocument).documentElement;
	if (! aDocElement)
		return null;
	return aDocElement.getAttribute(attrName); 
  },
  SetAttributeForDoc: function(attrName, value, pDoc)
  {
	var aDocElement = pDoc.QueryInterface(Components.interfaces.nsIDOMDocument).documentElement;
	if (! aDocElement)
		return;
	aDocElement.setAttribute(attrName, value);
  },
  GetAttributeForTopParent: function(attrName, pNode)
  {
	var aNodeElement = pNode.QueryInterface(Components.interfaces.nsIDOMDocument).defaultView;
	return aNodeElement.top.document.documentElement.getAttribute(attrName); //.frameElement.getAttribute(attrName); 
  },
  SetAttributeForTopParent: function(attrName, value, pNode)
  {
	var aNodeElement = pNode.QueryInterface(Components.interfaces.nsIDOMDocument).defaultView;
	aNodeElement.top.document.documentElement.setAttribute(attrName, value);
  } 
};

var IDMCCHelperComponentOldFactory = {
  createInstance: function (aOuter, aIID)
  {
    if (aOuter != null)
      throw Components.results.NS_ERROR_NO_AGGREGATION;
    return (new IDMCCHelperComponent11()).QueryInterface(aIID);
  }
};

var IDMCCHelperComponentOldModule = {
  registerSelf: function(aCompMgr, aFileSpec, aLocation, aType)
  {
    aCompMgr = aCompMgr.QueryInterface(Components.interfaces.nsIComponentRegistrar);
    aCompMgr.registerFactoryLocation(CLASS_ID, CLASS_NAME, CONTRACT_ID, aFileSpec, aLocation, aType);
  },

  unregisterSelf: function(aCompMgr, aLocation, aType)
  {
    aCompMgr = aCompMgr.QueryInterface(Components.interfaces.nsIComponentRegistrar);
    aCompMgr.unregisterFactoryLocation(CLASS_ID, aLocation);        
  },
  
  getClassObject: function(aCompMgr, aCID, aIID)
  {
    if (!aIID.equals(Components.interfaces.nsIFactory))
      throw Components.results.NS_ERROR_NOT_IMPLEMENTED;

    if (aCID.equals(CLASS_ID))
      return IDMCCHelperComponentOldFactory;

    throw Components.results.NS_ERROR_NO_INTERFACE;
  },

  canUnload: function(aCompMgr) { return true; }
};



function NSGetModule(aCompMgr, aFileSpec) { return IDMCCHelperComponentOldModule; }

function NSGetFactory(cid) {
  if (! CLASS_ID.equals(cid)) throw Components.results.NS_ERROR_FACTORY_NOT_REGISTERED;
  return IDMCCHelperComponentOldFactory;
}
	
