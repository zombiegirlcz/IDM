package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y7 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273182a;

    public y7(String blockedMerchantId) {
        Intrinsics.checkNotNullParameter(blockedMerchantId, "blockedMerchantId");
        this.f273182a = blockedMerchantId;
    }

    public final String a() {
        return this.f273182a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y7) && Intrinsics.f(this.f273182a, ((y7) obj2).f273182a);
    }

    public final int hashCode() {
        return this.f273182a.hashCode();
    }
}
