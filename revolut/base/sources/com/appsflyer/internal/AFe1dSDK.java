package com.appsflyer.internal;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH×\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\tX\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1dSDK;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1cSDK;", "AFInAppEventParameterName", "Lcom/appsflyer/internal/AFe1cSDK;", "AFInAppEventType", "AFKeystoreWrapper", "Ljava/lang/String;", "values", "valueOf", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFe1cSDK;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class AFe1dSDK {

    /* JADX INFO: renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    @NotNull
    public final AFe1cSDK AFInAppEventType;

    @NotNull
    public final String AFKeystoreWrapper;

    /* JADX INFO: renamed from: values, reason: from kotlin metadata */
    public final String valueOf;

    public AFe1dSDK(@NotNull String str, String str2, @NotNull AFe1cSDK aFe1cSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFe1cSDK, "");
        this.AFKeystoreWrapper = str;
        this.valueOf = str2;
        this.AFInAppEventType = aFe1cSDK;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFe1dSDK)) {
            return false;
        }
        AFe1dSDK aFe1dSDK = (AFe1dSDK) p0;
        return Intrinsics.f(this.AFKeystoreWrapper, aFe1dSDK.AFKeystoreWrapper) && Intrinsics.f(this.valueOf, aFe1dSDK.valueOf) && this.AFInAppEventType == aFe1dSDK.AFInAppEventType;
    }

    public final int hashCode() {
        int iHashCode = this.AFKeystoreWrapper.hashCode() * 31;
        String str = this.valueOf;
        return this.AFInAppEventType.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb6 = new StringBuilder("AFe1dSDK(AFKeystoreWrapper=");
        sb6.append(this.AFKeystoreWrapper);
        sb6.append(", valueOf=");
        sb6.append(this.valueOf);
        sb6.append(", AFInAppEventType=");
        sb6.append(this.AFInAppEventType);
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }
}
