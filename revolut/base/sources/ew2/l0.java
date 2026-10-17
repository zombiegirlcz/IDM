package ew2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f130028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f130029b;

    public l0(dj0.d amountToTopup, boolean z) {
        Intrinsics.checkNotNullParameter(amountToTopup, "amountToTopup");
        this.f130028a = amountToTopup;
        this.f130029b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f130028a, l0Var.f130028a) && this.f130029b == l0Var.f130029b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130029b) + (this.f130028a.hashCode() * 31);
    }
}
