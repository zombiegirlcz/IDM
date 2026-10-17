package com.revolut.feature.alipay_plus.mpm.webcontainer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMJSMessageToNative;", "", "clientId", "", "func", "msgType", "param", "Lorg/json/JSONObject;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "getClientId", "()Ljava/lang/String;", "getFunc", "getMsgType", "getParam", "()Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class APMPMJSMessageToNative {

    @NotNull
    private final String clientId;

    @NotNull
    private final String func;

    @NotNull
    private final String msgType;
    private final JSONObject param;

    public APMPMJSMessageToNative(@NotNull String clientId, @NotNull String func, @NotNull String msgType, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(func, "func");
        Intrinsics.checkNotNullParameter(msgType, "msgType");
        this.clientId = clientId;
        this.func = func;
        this.msgType = msgType;
        this.param = jSONObject;
    }

    public static /* synthetic */ APMPMJSMessageToNative copy$default(APMPMJSMessageToNative aPMPMJSMessageToNative, String str, String str2, String str3, JSONObject jSONObject, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = aPMPMJSMessageToNative.clientId;
        }
        if ((i & 2) != 0) {
            str2 = aPMPMJSMessageToNative.func;
        }
        if ((i & 4) != 0) {
            str3 = aPMPMJSMessageToNative.msgType;
        }
        if ((i & 8) != 0) {
            jSONObject = aPMPMJSMessageToNative.param;
        }
        return aPMPMJSMessageToNative.copy(str, str2, str3, jSONObject);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFunc() {
        return this.func;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMsgType() {
        return this.msgType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JSONObject getParam() {
        return this.param;
    }

    @NotNull
    public final APMPMJSMessageToNative copy(@NotNull String clientId, @NotNull String func, @NotNull String msgType, JSONObject param) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(func, "func");
        Intrinsics.checkNotNullParameter(msgType, "msgType");
        return new APMPMJSMessageToNative(clientId, func, msgType, param);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APMPMJSMessageToNative)) {
            return false;
        }
        APMPMJSMessageToNative aPMPMJSMessageToNative = (APMPMJSMessageToNative) other;
        return Intrinsics.f(this.clientId, aPMPMJSMessageToNative.clientId) && Intrinsics.f(this.func, aPMPMJSMessageToNative.func) && Intrinsics.f(this.msgType, aPMPMJSMessageToNative.msgType) && Intrinsics.f(this.param, aPMPMJSMessageToNative.param);
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getFunc() {
        return this.func;
    }

    @NotNull
    public final String getMsgType() {
        return this.msgType;
    }

    public final JSONObject getParam() {
        return this.param;
    }

    public int hashCode() {
        int iC = p.a.c(p.a.c(this.clientId.hashCode() * 31, 31, this.func), 31, this.msgType);
        JSONObject jSONObject = this.param;
        return iC + (jSONObject == null ? 0 : jSONObject.hashCode());
    }
}
