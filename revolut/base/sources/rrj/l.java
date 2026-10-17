package rrj;

import kotlin.jvm.internal.Intrinsics;
import tof.i3;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f256864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qzi.e f256865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i3 f256866c;
    public final qzi.a d;

    public l(dj0.d spentAmount, qzi.e budgetPeriod, i3 i3Var, qzi.a aVar) {
        Intrinsics.checkNotNullParameter(spentAmount, "spentAmount");
        Intrinsics.checkNotNullParameter(budgetPeriod, "budgetPeriod");
        this.f256864a = spentAmount;
        this.f256865b = budgetPeriod;
        this.f256866c = i3Var;
        this.d = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f256864a, lVar.f256864a) && this.f256865b == lVar.f256865b && Intrinsics.f(this.f256866c, lVar.f256866c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f256865b.hashCode() + (this.f256864a.hashCode() * 31)) * 31;
        i3 i3Var = this.f256866c;
        int iHashCode2 = (iHashCode + (i3Var == null ? 0 : i3Var.hashCode())) * 31;
        qzi.a aVar = this.d;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
