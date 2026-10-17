package pu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f239815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239816c;
    public final dj0.d d;

    public h(String id10, d debtType, String creditProvider, dj0.d monthlyRepaymentAmount) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(debtType, "debtType");
        Intrinsics.checkNotNullParameter(creditProvider, "creditProvider");
        Intrinsics.checkNotNullParameter(monthlyRepaymentAmount, "monthlyRepaymentAmount");
        this.f239814a = id10;
        this.f239815b = debtType;
        this.f239816c = creditProvider;
        this.d = monthlyRepaymentAmount;
    }

    @Override // pu3.b
    public final String P5() {
        return this.f239816c;
    }

    @Override // pu3.b
    public final d c4() {
        return this.f239815b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        b other = (b) obj2;
        Intrinsics.checkNotNullParameter(other, "other");
        d dVarC4 = other.c4();
        d[] dVarArrValues = d.values();
        return kotlin.collections.d.Y(dVarArrValues, c4()) - kotlin.collections.d.Y(dVarArrValues, dVarC4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f239814a, hVar.f239814a) && this.f239815b == hVar.f239815b && Intrinsics.f(this.f239816c, hVar.f239816c) && Intrinsics.f(this.d, hVar.d);
    }

    @Override // pu3.b
    public final String getId() {
        return this.f239814a;
    }

    @Override // pu3.b
    public final dj0.d getValue() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c((this.f239815b.hashCode() + (this.f239814a.hashCode() * 31)) * 31, 31, this.f239816c);
    }
}
