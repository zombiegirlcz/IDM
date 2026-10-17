package kye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f190874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f190875b;

    public x3(dj0.d remainingAnnualLimit, boolean z) {
        Intrinsics.checkNotNullParameter(remainingAnnualLimit, "remainingAnnualLimit");
        this.f190874a = z;
        this.f190875b = remainingAnnualLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj2;
        return this.f190874a == x3Var.f190874a && Intrinsics.f(this.f190875b, x3Var.f190875b);
    }

    public final int hashCode() {
        return this.f190875b.hashCode() + (Boolean.hashCode(this.f190874a) * 31);
    }
}
