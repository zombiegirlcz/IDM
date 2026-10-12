Components.utils.import("resource://gre/modules/ctypes.jsm");

var is64bit;
if (ctypes.voidptr_t.size == 4 /* 32-bit */) {
    is64bit = false;
} else if (ctypes.voidptr_t.size == 8 /* 64-bit */) {
    is64bit = true;
}
var WINABI = is64bit ? ctypes.default_abi : ctypes.winapi_abi;

var libPath;
var wrk = Components.classes["@mozilla.org/windows-registry-key;1"].createInstance(Components.interfaces.nsIWindowsRegKey);
if (wrk)
{
	wrk.open(wrk.ROOT_KEY_CURRENT_USER, "Software\\DownloadManager", wrk.ACCESS_READ);
	if (wrk.hasValue("ExePath"))
		libPath = wrk.readStringValue("ExePath");
	wrk.close();
}

var lib = ctypes.open(libPath.substr(0, (libPath.length - 9)) + (is64bit ? "idmmzcc7_64.dll" : "idmmzcc7.dll"));
var OnStartup1 = lib.declare("OnStartup", WINABI, ctypes.void_t);
OnStartup1();

var pIDMProxy;
pIDMProxy = null;

function getIDMProxy()
{
  return pIDMProxy;
}

var ContentPolicyParent = {
  init: function() {
    var ppmm = Components.classes["@mozilla.org/parentprocessmessagemanager;1"].getService(Components.interfaces.nsIMessageBroadcaster);
    ppmm.addMessageListener("idmmzcc:ContentPolicy:shl", this);
    ppmm.addMessageListener("idmmzcc:MCObserver:ms", this);
    ppmm.addMessageListener("idmmzcc:MCObserver:unload", this);
    ppmm.addMessageListener("idmmzcc:browser:ontabselect", this);
    ppmm.addMessageListener("idmmzcc:browser:getSelectedTabID", this);
    ppmm.addMessageListener("idmmzcc:browser:onDownloadWihtIDM", this);
    ppmm.addMessageListener("idmmzcc:browser:onDownloadAllWihtIDM", this);
  },

  receiveMessage: function (aMessage) {
    switch (aMessage.name) {
      case "idmmzcc:ContentPolicy:shl":
        return this.shouldLoad(aMessage.data, aMessage.objects);
        break;
      case "idmmzcc:browser:onDownloadWihtIDM":
	return this.OnDownloadWihtIDM(aMessage.data, aMessage.objects);
	break;
      case "idmmzcc:browser:onDownloadAllWihtIDM":
	return this.OnDownloadAllWihtIDM(aMessage.data, aMessage.objects);
	break;
      case "idmmzcc:MCObserver:ms":
	this.OnMouseEvent(aMessage.data, aMessage.objects);
	break;
      case "idmmzcc:MCObserver:unload":
	this.OnUnload(aMessage.data, aMessage.objects);
	break;
      case "idmmzcc:browser:getSelectedTabID":
	return this.OnGetSelectedTabID(aMessage.data, aMessage.objects);
	break;
      case "idmmzcc:browser:ontabselect":
	return this.OnTabSelect(aMessage.data, aMessage.objects);
	break;
    }
  },

  OnDownloadWihtIDM: function(aData, aObjects) {
  	return pIDMProxy.OnDownloadWithIDM(aObjects.aContent, aObjects.aPopupNode, 1);
  },

  OnDownloadAllWihtIDM: function(aData, aObjects) {
  	return pIDMProxy.OnDownloadWithIDM(aObjects.aContent, null, aObjects.aMode);
  },

  OnGetSelectedTabID: function(aData, aObjects) {
  	return pIDMProxy.OnGetSelectedTabID(aObjects.docId);
  },

  OnTabSelect: function(aData, aObjects) {
  	return pIDMProxy.OnTabSelect(aObjects.docId);
  }, 

  OnMouseEvent: function(aData, aObjects) {
	var e1 = aObjects.e.QueryInterface(Components.interfaces.nsISupports);
	if (pIDMProxy)
		pIDMProxy.OnMouseEvent(e1);
  },

  OnUnload: function(aData, aObjects) {
	return pIDMProxy.OnUnload(aObjects.docId);
  },

  shouldLoad: function(aData, aObjects) {
   try
   {
    var contentLocation1 = aObjects.contentLocation.QueryInterface(Components.interfaces.nsISupports);
    var node1 = aObjects.node.QueryInterface(Components.interfaces.nsISupports);
    if (pIDMProxy)
	pIDMProxy.ObserveSL(aObjects.contentType, contentLocation1, node1);
   } catch (e) { }
    return true;
  }
};
ContentPolicyParent.init();


const CLASS_ID = Components.ID("{93A9932F-D209-4C29-B510-59C803B0DCA1}");
const CLASS_NAME = "IDM CC Component8";
const CONTRACT_ID = "@idm/mozilla_cc_helper8;1";


function IDMCCHelperComponent8() {
};

IDMCCHelperComponent8.prototype = {
  QueryInterface: function(aIID)
  {
    if (!aIID.equals(Components.interfaces.iIDMHelper8) &&    
        !aIID.equals(Components.interfaces.nsISupports))
      throw Components.results.NS_ERROR_NO_INTERFACE;
    return this;
  },
  InitCC: function(pProxy)
  {
	pIDMProxy = pProxy.QueryInterface(Components.interfaces.iIDMHelperProxy2);
  },
  getIDMHProxy: function()
  {
	return pIDMProxy;
  }
};


var IDMCCHelperComponentOldFactory = {
  createInstance: function (aOuter, aIID)
  {
    if (aOuter != null)
      throw Components.results.NS_ERROR_NO_AGGREGATION;
    return (new IDMCCHelperComponent8()).QueryInterface(aIID);
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


	