package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ra extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273031a;

    public ra(String paymentLinkId) {
        Intrinsics.checkNotNullParameter(paymentLinkId, "paymentLinkId");
        this.f273031a = paymentLinkId;
    }

    public final String a() {
        return this.f273031a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ra) && Intrinsics.f(this.f273031a, ((ra) obj2).f273031a);
    }

    public final int hashCode() {
        return this.f273031a.hashCode();
    }
}
