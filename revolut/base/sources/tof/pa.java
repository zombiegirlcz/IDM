package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class pa extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272997a;

    public pa(String paymentAuthorisationId) {
        Intrinsics.checkNotNullParameter(paymentAuthorisationId, "paymentAuthorisationId");
        this.f272997a = paymentAuthorisationId;
    }

    public final String a() {
        return this.f272997a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof pa) && Intrinsics.f(this.f272997a, ((pa) obj2).f272997a);
    }

    public final int hashCode() {
        return this.f272997a.hashCode();
    }
}
