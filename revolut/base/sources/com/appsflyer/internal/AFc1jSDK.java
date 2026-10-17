package com.appsflyer.internal;

import ch.qos.logback.core.CoreConstants;
import com.appsflyer.deeplink.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH×\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0007¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\u0012"}, d2 = {"Lcom/appsflyer/internal/AFc1jSDK;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/appsflyer/deeplink/DeepLink;", "AFKeystoreWrapper", "Lcom/appsflyer/deeplink/DeepLink;", "AFInAppEventType", "valueOf", "Z", "()Z", "values", "p1", "<init>", "(ZLcom/appsflyer/deeplink/DeepLink;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class AFc1jSDK {

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public final DeepLink AFInAppEventType;

    /* JADX INFO: renamed from: valueOf, reason: from kotlin metadata */
    private final boolean values;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1jSDK() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: AFInAppEventType, reason: from getter */
    public final boolean getValues() {
        return this.values;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFc1jSDK)) {
            return false;
        }
        AFc1jSDK aFc1jSDK = (AFc1jSDK) p0;
        return this.values == aFc1jSDK.values && Intrinsics.f(this.AFInAppEventType, aFc1jSDK.AFInAppEventType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.values;
        ?? r06 = z;
        if (z) {
            r06 = 1;
        }
        int i = r06 * 31;
        DeepLink deepLink = this.AFInAppEventType;
        return i + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb6 = new StringBuilder("AFc1jSDK(values=");
        sb6.append(this.values);
        sb6.append(", AFInAppEventType=");
        sb6.append(this.AFInAppEventType);
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }

    public AFc1jSDK(boolean z, DeepLink deepLink) {
        this.values = z;
        this.AFInAppEventType = deepLink;
    }

    public /* synthetic */ AFc1jSDK(boolean z, DeepLink deepLink, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : deepLink);
    }
}
