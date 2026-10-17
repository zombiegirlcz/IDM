package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\f\u0012\u0006\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b \u0010!J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000e\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0011\u0010\t\u001a\u00020\u0006X\u0007¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000f\u001a\u00020\u0011X\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0015X\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u0018X\u0007¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019"}, d2 = {"Lcom/appsflyer/internal/AFh1dSDK;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "AFInAppEventType", "()Z", "AFInAppEventParameterName", "", "Ljava/lang/String;", "AFKeystoreWrapper", "valueOf", "I", "", "F", "unregisterClient", "values", "", "Ljava/util/List;", "registerClient", "", "J", "e", "p1", "p2", "p3", "p4", "p5", "<init>", "(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AFh1dSDK {

    /* JADX INFO: renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    public final float valueOf;

    /* JADX INFO: renamed from: AFInAppEventType, reason: from kotlin metadata */
    @NotNull
    public final String AFKeystoreWrapper;

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public long e;

    /* JADX INFO: renamed from: unregisterClient, reason: from kotlin metadata */
    @NotNull
    public final String values;

    /* JADX INFO: renamed from: valueOf, reason: from kotlin metadata */
    public final int AFInAppEventType;

    /* JADX INFO: renamed from: values, reason: from kotlin metadata */
    @NotNull
    public List<String> registerClient;

    public AFh1dSDK(long j2, float f, @NotNull List<String> list, int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.e = j2;
        this.valueOf = f;
        this.registerClient = list;
        this.AFInAppEventType = i;
        this.AFKeystoreWrapper = str;
        this.values = str2;
    }

    public final boolean AFInAppEventType() {
        return TimeUnit.SECONDS.toMillis(this.e) > AFb1rSDK.AFInAppEventParameterName().AFInAppEventType().AFLogger().AFInAppEventType();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!AFh1dSDK.class.equals(p0 != null ? p0.getClass() : null)) {
            return false;
        }
        if (p0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.model.rc.RDConfiguration");
        }
        AFh1dSDK aFh1dSDK = (AFh1dSDK) p0;
        return this.e == aFh1dSDK.e && this.valueOf == aFh1dSDK.valueOf && Intrinsics.f(this.registerClient, aFh1dSDK.registerClient) && this.AFInAppEventType == aFh1dSDK.AFInAppEventType && Intrinsics.f(this.AFKeystoreWrapper, aFh1dSDK.AFKeystoreWrapper) && Intrinsics.f(this.values, aFh1dSDK.values);
    }

    public final int hashCode() {
        return this.values.hashCode() + ((this.AFKeystoreWrapper.hashCode() + ((p.a.d(m72.b.b(this.valueOf, Long.hashCode(this.e) * 31, 31), 31, this.registerClient) + this.AFInAppEventType) * 31)) * 31);
    }
}
