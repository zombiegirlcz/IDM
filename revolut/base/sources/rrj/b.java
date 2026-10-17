package rrj;

import kotlin.jvm.internal.Intrinsics;
import tof.i3;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f256848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qzi.e f256849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i3 f256850c;
    public final boolean d;

    public b(dj0.d spentAmount, qzi.e budgetPeriod, i3 i3Var, boolean z) {
        Intrinsics.checkNotNullParameter(spentAmount, "spentAmount");
        Intrinsics.checkNotNullParameter(budgetPeriod, "budgetPeriod");
        this.f256848a = spentAmount;
        this.f256849b = budgetPeriod;
        this.f256850c = i3Var;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f256848a, bVar.f256848a) && this.f256849b == bVar.f256849b && Intrinsics.f(this.f256850c, bVar.f256850c) && this.d == bVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f256849b.hashCode() + (this.f256848a.hashCode() * 31)) * 31;
        i3 i3Var = this.f256850c;
        return Boolean.hashCode(this.d) + ((iHashCode + (i3Var == null ? 0 : i3Var.hashCode())) * 31);
    }
}
