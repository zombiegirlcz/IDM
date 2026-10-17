package com.revolut.feature.alipay_plus.mpm.webcontainer;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMBridgeContext;", "", "webView", "Landroid/webkit/WebView;", "nativeMessage", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMJSMessageToNative;", "<init>", "(Landroid/webkit/WebView;Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMJSMessageToNative;)V", "getNativeMessage$feature_alipay_plus_nonsdk_release", "()Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMJSMessageToNative;", "webView$feature_alipay_plus_nonsdk_release", "sendBridgeResult", "", "result", "Lorg/json/JSONObject;", "key", "", "value", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMBridgeContext {

    @NotNull
    private final APMPMJSMessageToNative nativeMessage;

    @NotNull
    private final WebView webView;

    public APMPMBridgeContext(@NotNull WebView webView, @NotNull APMPMJSMessageToNative nativeMessage) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(nativeMessage, "nativeMessage");
        this.webView = webView;
        this.nativeMessage = nativeMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendBridgeResult$lambda$0(APMPMBridgeContext aPMPMBridgeContext, JSONObject jSONObject) {
        APMPMWebContainerRuntime.INSTANCE.getJsBridge$feature_alipay_plus_nonsdk_release().sendBack$feature_alipay_plus_nonsdk_release(aPMPMBridgeContext.nativeMessage, aPMPMBridgeContext.webView, jSONObject);
    }

    @NotNull
    /* JADX INFO: renamed from: getNativeMessage$feature_alipay_plus_nonsdk_release, reason: from getter */
    public final APMPMJSMessageToNative getNativeMessage() {
        return this.nativeMessage;
    }

    public final boolean sendBridgeResult(@NotNull JSONObject result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.f(Looper.myLooper(), Looper.getMainLooper())) {
            return APMPMWebContainerRuntime.INSTANCE.getJsBridge$feature_alipay_plus_nonsdk_release().sendBack$feature_alipay_plus_nonsdk_release(this.nativeMessage, this.webView, result);
        }
        new Handler(Looper.getMainLooper()).post(new a4.a(this, result, 20));
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: webView$feature_alipay_plus_nonsdk_release, reason: from getter */
    public final WebView getWebView() {
        return this.webView;
    }

    public final boolean sendBridgeResult(@NotNull String key, Object value) throws JSONException {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObjectPut = new JSONObject().put(key, value);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return sendBridgeResult(jSONObjectPut);
    }
}
