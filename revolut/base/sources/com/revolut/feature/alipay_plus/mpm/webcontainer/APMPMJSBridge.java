package com.revolut.feature.alipay_plus.mpm.webcontainer;

import android.webkit.WebView;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000eJ)\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J%\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ\u001d\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMJSBridge;", "", "<init>", "()V", "plugins", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMBaseJSPlugin;", "registerJSPlugin", "", "plugin", "hasPlugin", "", "api", "hasPlugin$feature_alipay_plus_nonsdk_release", "handleConsoleMessage", "message", "webView", "Landroid/webkit/WebView;", "presenter", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPresenter;", "handleConsoleMessage$feature_alipay_plus_nonsdk_release", "sendBack", "nativeMessage", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMJSMessageToNative;", "params", "Lorg/json/JSONObject;", "sendBack$feature_alipay_plus_nonsdk_release", "buildCallbackMessage", "buildCallbackMessage$feature_alipay_plus_nonsdk_release", "loadJavascript", "loadJavascript$feature_alipay_plus_nonsdk_release", "fail", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMJSBridge {

    @NotNull
    private final ConcurrentHashMap<String, APMPMBaseJSPlugin> plugins = new ConcurrentHashMap<>();

    @NotNull
    public static final String H5_BRIDGE_SCRIPT = "window.AlipayJSBridge||function(){console.log(\"begin load AlipayJSBridge\");var messenger=window.__alipayConsole__||window.console,log=messenger.log,e=function(e){log.call(messenger,\"h5container.message: \"+e)},a={};window.AlipayJSBridge={call:function(n,i,t){if('string'==typeof n){if('function'==typeof i){t=i;i=null}else'object'!=typeof i&&(i=null);var l=''+(new Date).getTime()+Math.random();'function'==typeof t&&(a[l]=t);var c=JSON.stringify({func:n,param:i,msgType:'call',clientId:l});e(c)}},callback:function(a,n){var i=JSON.stringify({clientId:a,param:n});e(i)},trigger:function(e,a,n){if(e){var i=document.createEvent('Events');i.initEvent(e,!1,!0);i.syncJsApis=[];if('object'==typeof a)for(var t in a)i[t]=a[t];i.clientId=n;var l=!document.dispatchEvent(i);n&&'back'===e&&AlipayJSBridge.callback(n,{prevent:l});n&&'closeWindow'===e&&AlipayJSBridge.callback(n,{prevent:l});n&&'firePullToRefresh'===e&&AlipayJSBridge.callback(n,{prevent:l});n&&'onShare'===e&&AlipayJSBridge.callback(n,{prevent:l});n&&'collectDestroyJsApi'===e&&AlipayJSBridge.callback(n,{syncJsApis:i.syncJsApis})}},_invokeJS:function(e){e=JSON.parse(e);console.log(\"invokeJS msgType \"+e.msgType+\" func \"+e.func);if('callback'===e.msgType){var n=a[e.clientId];'boolean'==typeof e.keepCallback&&e.keepCallback||delete a[e.clientId];'function'==typeof n&&setTimeout(function(){n(e.param)},1)}else'call'===e.msgType&&e.func&&this.trigger(e.func,e.param,e.clientId)},devPerformance4Test:\"\"};AlipayJSBridge.startupParams='{startupParams}';window.APVIEWID='{APVIEWID}';var n=document.createEvent('Events');n.initEvent('AlipayJSBridgeReady',!1,!1);var i=document.addEventListener;document.addEventListener=function(e,a){e===n.type&&setTimeout(function(){a(n)},1);i.apply(document,arguments)};document.dispatchEvent(n);console.log(\"load AlipayJSBridge dispatchEvent AlipayJSBridgeReady\")}();";

    @NotNull
    public static final String JSAPI_PREFIX = "h5container.message: ";

    @NotNull
    public static final String PARAM_SUCCESS = "success";

    @NotNull
    private static final String MSG_TYPE_CALLBACK = "callback";

    @NotNull
    public static final String PARAM_MSG = "msg";

    private final JSONObject fail(String message) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("success", "false").put("msg", message);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    @NotNull
    public final String buildCallbackMessage$feature_alipay_plus_nonsdk_release(@NotNull APMPMJSMessageToNative nativeMessage, @NotNull JSONObject params) {
        Intrinsics.checkNotNullParameter(nativeMessage, "nativeMessage");
        Intrinsics.checkNotNullParameter(params, "params");
        String string = new JSONObject().put("clientId", nativeMessage.getClientId()).put("func", nativeMessage.getFunc()).put("msgType", "callback").put("param", params).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return a0.D(string, "\"", "\\\"", false);
    }

    public final boolean handleConsoleMessage$feature_alipay_plus_nonsdk_release(String message, WebView webView, @NotNull APMPMContainerPresenter presenter) {
        Object objA;
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        boolean z = false;
        if (message != null && !d0.W(message) && a0.H(message, "h5container.message: ", false) && webView != null) {
            String strSubstring = message.substring(21);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            try {
                m.Companion companion = m.INSTANCE;
                JSONObject jSONObject = new JSONObject(strSubstring);
                String strOptString = jSONObject.optString("clientId");
                Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                String strOptString2 = jSONObject.optString("func");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                String strOptString3 = jSONObject.optString("msgType");
                Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
                objA = new APMPMJSMessageToNative(strOptString, strOptString2, strOptString3, jSONObject.optJSONObject("param"));
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            if (objA instanceof n) {
                objA = null;
            }
            APMPMJSMessageToNative aPMPMJSMessageToNative = (APMPMJSMessageToNative) objA;
            if (aPMPMJSMessageToNative != null) {
                APMPMBaseJSPlugin aPMPMBaseJSPlugin = this.plugins.get(aPMPMJSMessageToNative.getFunc());
                z = true;
                if (aPMPMBaseJSPlugin == null) {
                    sendBack$feature_alipay_plus_nonsdk_release(aPMPMJSMessageToNative, webView, fail(j6.a.q("No JSPlugin found for: ", aPMPMJSMessageToNative.getFunc())));
                    return true;
                }
                JSONObject jSONObjectOnEvent$feature_alipay_plus_nonsdk_release = aPMPMBaseJSPlugin.onEvent$feature_alipay_plus_nonsdk_release(aPMPMJSMessageToNative, presenter, new APMPMBridgeContext(webView, aPMPMJSMessageToNative));
                if (jSONObjectOnEvent$feature_alipay_plus_nonsdk_release != null) {
                    sendBack$feature_alipay_plus_nonsdk_release(aPMPMJSMessageToNative, webView, jSONObjectOnEvent$feature_alipay_plus_nonsdk_release);
                }
            }
        }
        return z;
    }

    public final boolean hasPlugin$feature_alipay_plus_nonsdk_release(@NotNull String api2) {
        Intrinsics.checkNotNullParameter(api2, "api");
        return this.plugins.containsKey(api2);
    }

    public final void loadJavascript$feature_alipay_plus_nonsdk_release(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        webView.loadUrl("javascript:window.AlipayJSBridge||function(){console.log(\"begin load AlipayJSBridge\");var messenger=window.__alipayConsole__||window.console,log=messenger.log,e=function(e){log.call(messenger,\"h5container.message: \"+e)},a={};window.AlipayJSBridge={call:function(n,i,t){if('string'==typeof n){if('function'==typeof i){t=i;i=null}else'object'!=typeof i&&(i=null);var l=''+(new Date).getTime()+Math.random();'function'==typeof t&&(a[l]=t);var c=JSON.stringify({func:n,param:i,msgType:'call',clientId:l});e(c)}},callback:function(a,n){var i=JSON.stringify({clientId:a,param:n});e(i)},trigger:function(e,a,n){if(e){var i=document.createEvent('Events');i.initEvent(e,!1,!0);i.syncJsApis=[];if('object'==typeof a)for(var t in a)i[t]=a[t];i.clientId=n;var l=!document.dispatchEvent(i);n&&'back'===e&&AlipayJSBridge.callback(n,{prevent:l});n&&'closeWindow'===e&&AlipayJSBridge.callback(n,{prevent:l});n&&'firePullToRefresh'===e&&AlipayJSBridge.callback(n,{prevent:l});n&&'onShare'===e&&AlipayJSBridge.callback(n,{prevent:l});n&&'collectDestroyJsApi'===e&&AlipayJSBridge.callback(n,{syncJsApis:i.syncJsApis})}},_invokeJS:function(e){e=JSON.parse(e);console.log(\"invokeJS msgType \"+e.msgType+\" func \"+e.func);if('callback'===e.msgType){var n=a[e.clientId];'boolean'==typeof e.keepCallback&&e.keepCallback||delete a[e.clientId];'function'==typeof n&&setTimeout(function(){n(e.param)},1)}else'call'===e.msgType&&e.func&&this.trigger(e.func,e.param,e.clientId)},devPerformance4Test:\"\"};AlipayJSBridge.startupParams='{startupParams}';window.APVIEWID='{APVIEWID}';var n=document.createEvent('Events');n.initEvent('AlipayJSBridgeReady',!1,!1);var i=document.addEventListener;document.addEventListener=function(e,a){e===n.type&&setTimeout(function(){a(n)},1);i.apply(document,arguments)};document.dispatchEvent(n);console.log(\"load AlipayJSBridge dispatchEvent AlipayJSBridgeReady\")}();");
    }

    public final void registerJSPlugin(@NotNull APMPMBaseJSPlugin plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Iterator<T> it8 = plugin.apis$feature_alipay_plus_nonsdk_release().iterator();
        while (it8.hasNext()) {
            this.plugins.put((String) it8.next(), plugin);
        }
    }

    public final boolean sendBack$feature_alipay_plus_nonsdk_release(@NotNull APMPMJSMessageToNative nativeMessage, @NotNull WebView webView, @NotNull JSONObject params) {
        Object objA;
        Intrinsics.checkNotNullParameter(nativeMessage, "nativeMessage");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            m.Companion companion = m.INSTANCE;
            webView.loadUrl("javascript:(function(){if(typeof AlipayJSBridge === 'object'){" + ("AlipayJSBridge._invokeJS(\"" + buildCallbackMessage$feature_alipay_plus_nonsdk_release(nativeMessage, params) + "\")") + "}})();");
            objA = Boolean.TRUE;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Object obj2 = Boolean.FALSE;
        if (objA instanceof n) {
            objA = obj2;
        }
        return ((Boolean) objA).booleanValue();
    }
}
