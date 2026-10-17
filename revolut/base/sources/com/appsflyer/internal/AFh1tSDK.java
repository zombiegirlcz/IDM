package com.appsflyer.internal;

import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH×\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0087\u0002¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0087\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u001e\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0015X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012"}, d2 = {"Lcom/appsflyer/internal/AFh1tSDK;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "valueOf", "Ljava/lang/String;", "AFInAppEventType", "AFLogger", "values", "AFKeystoreWrapper", "Ljava/lang/Boolean;", "AFInAppEventParameterName", "unregisterClient", "", "d", "Ljava/util/Map;", "e", "registerClient", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class AFh1tSDK {

    /* JADX INFO: renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    public Boolean valueOf;

    /* JADX INFO: renamed from: AFInAppEventType, reason: from kotlin metadata */
    public Boolean AFKeystoreWrapper;

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public Boolean AFInAppEventParameterName;

    /* JADX INFO: renamed from: AFLogger, reason: from kotlin metadata */
    public String values;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public Map<String, Object> e;

    /* JADX INFO: renamed from: registerClient, reason: from kotlin metadata */
    public Boolean AFLogger;

    /* JADX INFO: renamed from: valueOf, reason: from kotlin metadata */
    public String AFInAppEventType;

    /* JADX INFO: renamed from: values, reason: from kotlin metadata */
    public Boolean unregisterClient;

    public AFh1tSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFh1tSDK)) {
            return false;
        }
        AFh1tSDK aFh1tSDK = (AFh1tSDK) p0;
        return Intrinsics.f(this.AFInAppEventType, aFh1tSDK.AFInAppEventType) && Intrinsics.f(this.unregisterClient, aFh1tSDK.unregisterClient) && Intrinsics.f(this.AFInAppEventParameterName, aFh1tSDK.AFInAppEventParameterName) && Intrinsics.f(this.valueOf, aFh1tSDK.valueOf) && Intrinsics.f(this.AFKeystoreWrapper, aFh1tSDK.AFKeystoreWrapper) && Intrinsics.f(this.values, aFh1tSDK.values) && Intrinsics.f(this.AFLogger, aFh1tSDK.AFLogger) && Intrinsics.f(this.e, aFh1tSDK.e);
    }

    public final int hashCode() {
        String str = this.AFInAppEventType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.unregisterClient;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.AFInAppEventParameterName;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.valueOf;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.AFKeystoreWrapper;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.values;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.AFLogger;
        return this.e.hashCode() + ((iHashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb6 = new StringBuilder("AFh1tSDK(AFInAppEventType=");
        sb6.append(this.AFInAppEventType);
        sb6.append(", unregisterClient=");
        sb6.append(this.unregisterClient);
        sb6.append(", AFInAppEventParameterName=");
        sb6.append(this.AFInAppEventParameterName);
        sb6.append(", valueOf=");
        sb6.append(this.valueOf);
        sb6.append(", AFKeystoreWrapper=");
        sb6.append(this.AFKeystoreWrapper);
        sb6.append(", values=");
        sb6.append(this.values);
        sb6.append(", AFLogger=");
        sb6.append(this.AFLogger);
        sb6.append(", e=");
        sb6.append(this.e);
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }

    private AFh1tSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, @NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.AFInAppEventType = str;
        this.unregisterClient = bool;
        this.AFInAppEventParameterName = bool2;
        this.valueOf = bool3;
        this.AFKeystoreWrapper = bool4;
        this.values = str2;
        this.AFLogger = bool5;
        this.e = map;
    }

    public /* synthetic */ AFh1tSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : bool5, (i & 128) != 0 ? new HashMap() : map);
    }
}
