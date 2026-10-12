const CLASS_ID = Components.ID("{BBC7C690-7411-49D7-A074-93AD2884CD2F}");
const CLASS_NAME = "IDM CC Component9";
const CONTRACT_ID = "@idm/mozilla_cc_helper9;1";

const Cc = Components.classes;
const Ci = Components.interfaces;

function CCIN(cName, ifaceName) {
     return Cc[cName].createInstance(Ci[ifaceName]);
}

function IDMCCStreamListener(manager)
{
  this.manager = manager.QueryInterface(Ci.iIDMSListener);;
  this.orig = null;
}

IDMCCStreamListener.prototype = {
  QueryInterface: function(aIID)
  {
    if (!aIID.equals(Ci.nsIRequestObserver) &&    
	!aIID.equals(Ci.nsIStreamListener) &&    
        !aIID.equals(Ci.nsISupports))
      throw Components.results.NS_ERROR_NO_INTERFACE;
    return this;
  },

  onStartRequest: function(request, context) {
    return this.orig.onStartRequest(request, context);
  },

  onStopRequest: function(request, context, statusCode) {
    return this.orig.onStopRequest(request, context, statusCode);
  },

  onDataAvailable: function(request, context, inputStream, offset, count) {
	if (this.manager.bNeedCheck)
	{
		 var binaryInputStream = CCIN("@mozilla.org/binaryinputstream;1", "nsIBinaryInputStream");
        	 var storageStream = CCIN("@mozilla.org/storagestream;1", "nsIStorageStream");
	         var binaryOutputStream = CCIN("@mozilla.org/binaryoutputstream;1", "nsIBinaryOutputStream");

        	binaryInputStream.setInputStream(inputStream);
	         storageStream.init(8192, count, null);
        	 binaryOutputStream.setOutputStream(storageStream.getOutputStream(0));

	         var data = binaryInputStream.readBytes(count);
		this.manager.OnData(data, count);

        	binaryOutputStream.writeBytes(data, count);

	        this.orig.onDataAvailable(request, context, storageStream.newInputStream(0), offset, count);
	}
	else
		this.orig.onDataAvailable(request, context, inputStream, offset, count);
  }
};



function IDMCCHelperComponent9() {
};

IDMCCHelperComponent9.prototype = {
  aIDMSListener: null,
  parentListener: null,
  QueryInterface: function(aIID)
  {
    if (!aIID.equals(Components.interfaces.iIDMHelper9) &&    
        !aIID.equals(Components.interfaces.nsISupports))
      throw Components.results.NS_ERROR_NO_INTERFACE;
    return this;
  },
  SetListener: function(pIDMSListener, aChannel)
  {
	var v_pChannel = aChannel.QueryInterface(Ci.nsIHttpChannel).QueryInterface(Ci.nsITraceableChannel);
	if (v_pChannel)
	{
	var listener = new IDMCCStreamListener(pIDMSListener);
        var orig = v_pChannel.setNewListener(listener);
        listener.orig = orig;
	}
  }
};



var IDMCCHelperComponentOldFactory = {
  createInstance: function (aOuter, aIID)
  {
    if (aOuter != null)
      throw Components.results.NS_ERROR_NO_AGGREGATION;
    return (new IDMCCHelperComponent9()).QueryInterface(aIID);
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


	