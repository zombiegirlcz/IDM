package com.revolut.feature.alipay_plus.mpm.webcontainer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0000¢\u0006\u0002\b\nJ'\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\fH\u0004J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0004J\u001e\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMBaseJSPlugin;", "", "<init>", "()V", "methods", "", "", "Ljava/lang/reflect/Method;", "apis", "", "apis$feature_alipay_plus_nonsdk_release", "onEvent", "Lorg/json/JSONObject;", "message", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMJSMessageToNative;", "presenter", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPresenter;", "context", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMBridgeContext;", "onEvent$feature_alipay_plus_nonsdk_release", "success", "fail", "fromJson", "", "objectValue", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class APMPMBaseJSPlugin {

    @NotNull
    private final Map<String, Method> methods = new LinkedHashMap();

    public APMPMBaseJSPlugin() {
        Method[] declaredMethods = getClass().getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            APMPMJSAPI apmpmjsapi = (APMPMJSAPI) method.getAnnotation(APMPMJSAPI.class);
            if (apmpmjsapi != null) {
                method.setAccessible(true);
                this.methods.put(apmpmjsapi.api(), method);
            }
        }
    }

    private final Map<String, String> fromJson(JSONObject objectValue) {
        if (objectValue == null) {
            return r0.g();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = objectValue.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, objectValue.optString(next));
        }
        return linkedHashMap;
    }

    @NotNull
    public final Set<String> apis$feature_alipay_plus_nonsdk_release() {
        return this.methods.keySet();
    }

    @NotNull
    public final JSONObject fail(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        JSONObject jSONObjectPut = new JSONObject().put("success", "false").put("msg", message);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    public final JSONObject onEvent$feature_alipay_plus_nonsdk_release(@NotNull APMPMJSMessageToNative message, @NotNull APMPMContainerPresenter presenter, @NotNull APMPMBridgeContext context) {
        String str;
        String message2;
        str = "Invoke JSAPI failed";
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(context, "context");
        Method method = this.methods.get(message.getFunc());
        if (method == null) {
            return fail("JSAPI method is null");
        }
        try {
            Object objInvoke = method.invoke(this, fromJson(message.getParam()), presenter, context);
            if (objInvoke == null) {
                return null;
            }
            return objInvoke instanceof JSONObject ? (JSONObject) objInvoke : objInvoke instanceof Map ? new JSONObject((Map) objInvoke) : success();
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException != null && (message2 = targetException.getMessage()) != null) {
                str = message2;
            }
            return fail(str);
        } catch (Throwable th10) {
            String message3 = th10.getMessage();
            return fail(message3 != null ? message3 : "Invoke JSAPI failed");
        }
    }

    @NotNull
    public final JSONObject success() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("success", "true").put("msg", "success");
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }
}
