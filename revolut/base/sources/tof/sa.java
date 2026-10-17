package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class sa extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f273049a;

    public sa(v5 paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f273049a = paymentMethod;
    }

    public final v5 a() {
        return this.f273049a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof sa) && this.f273049a == ((sa) obj2).f273049a;
    }

    public final int hashCode() {
        return this.f273049a.hashCode();
    }
}
