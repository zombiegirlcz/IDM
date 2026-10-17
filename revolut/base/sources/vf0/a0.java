package vf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f288394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f288395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f288396c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f288397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f288398h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f288399j;
    public final Object k;

    public a0(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        this.f288394a = obj2;
        this.f288395b = obj3;
        this.f288396c = obj4;
        this.d = obj5;
        this.e = obj6;
        this.f = obj7;
        this.f288397g = obj8;
        this.f288398h = obj9;
        this.i = obj10;
        this.f288399j = obj11;
        this.k = obj12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f288394a, a0Var.f288394a) && Intrinsics.f(this.f288395b, a0Var.f288395b) && Intrinsics.f(this.f288396c, a0Var.f288396c) && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e) && Intrinsics.f(this.f, a0Var.f) && Intrinsics.f(this.f288397g, a0Var.f288397g) && Intrinsics.f(this.f288398h, a0Var.f288398h) && Intrinsics.f(this.i, a0Var.i) && Intrinsics.f(this.f288399j, a0Var.f288399j) && Intrinsics.f(this.k, a0Var.k);
    }

    public final int hashCode() {
        Object obj2 = this.f288394a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f288395b;
        int iHashCode2 = (iHashCode + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f288396c;
        int iHashCode3 = (iHashCode2 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.d;
        int iHashCode4 = (iHashCode3 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.e;
        int iHashCode5 = (iHashCode4 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.f;
        int iHashCode6 = (iHashCode5 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.f288397g;
        int iHashCode7 = (iHashCode6 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.f288398h;
        int iHashCode8 = (iHashCode7 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        Object obj10 = this.i;
        int iHashCode9 = (iHashCode8 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        Object obj11 = this.f288399j;
        int iHashCode10 = (iHashCode9 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        Object obj12 = this.k;
        return iHashCode10 + (obj12 != null ? obj12.hashCode() : 0);
    }
}
