package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ta extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f273092a;

    public ta(x1 paymentScheme) {
        Intrinsics.checkNotNullParameter(paymentScheme, "paymentScheme");
        this.f273092a = paymentScheme;
    }

    public final x1 a() {
        return this.f273092a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ta) && this.f273092a == ((ta) obj2).f273092a;
    }

    public final int hashCode() {
        return this.f273092a.hashCode();
    }
}
