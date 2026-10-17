package ql4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f247091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f247092b;

    public b0(c0 initial, c0 actual) {
        Intrinsics.checkNotNullParameter(initial, "initial");
        Intrinsics.checkNotNullParameter(actual, "actual");
        this.f247091a = initial;
        this.f247092b = actual;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f247091a, b0Var.f247091a) && Intrinsics.f(this.f247092b, b0Var.f247092b);
    }

    public final int hashCode() {
        return this.f247092b.hashCode() + (this.f247091a.hashCode() * 31);
    }
}
