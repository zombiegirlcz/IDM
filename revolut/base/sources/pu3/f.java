package pu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f239811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239812c;
    public final dj0.d d;

    public f(String id10, d debtType, String creditProvider, dj0.d creditLimit) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(debtType, "debtType");
        Intrinsics.checkNotNullParameter(creditProvider, "creditProvider");
        Intrinsics.checkNotNullParameter(creditLimit, "creditLimit");
        this.f239810a = id10;
        this.f239811b = debtType;
        this.f239812c = creditProvider;
        this.d = creditLimit;
    }

    @Override // pu3.b
    public final String P5() {
        return this.f239812c;
    }

    @Override // pu3.b
    public final d c4() {
        return this.f239811b;
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
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f239810a, fVar.f239810a) && this.f239811b == fVar.f239811b && Intrinsics.f(this.f239812c, fVar.f239812c) && Intrinsics.f(this.d, fVar.d);
    }

    @Override // pu3.b
    public final String getId() {
        return this.f239810a;
    }

    @Override // pu3.b
    public final dj0.d getValue() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c((this.f239811b.hashCode() + (this.f239810a.hashCode() * 31)) * 31, 31, this.f239812c);
    }
}
