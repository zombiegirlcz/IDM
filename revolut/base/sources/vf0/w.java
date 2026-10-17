package vf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f288476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f288477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f288478c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f288479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f288480h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f288481j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f288482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f288483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f288484n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f288485p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f288486q;

    public w(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        this.f288476a = obj2;
        this.f288477b = obj3;
        this.f288478c = obj4;
        this.d = obj5;
        this.e = obj6;
        this.f = obj7;
        this.f288479g = obj8;
        this.f288480h = obj9;
        this.i = obj10;
        this.f288481j = obj11;
        this.k = obj12;
        this.f288482l = obj13;
        this.f288483m = obj14;
        this.f288484n = obj15;
        this.o = obj16;
        this.f288485p = obj17;
        this.f288486q = obj18;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f288476a, wVar.f288476a) && Intrinsics.f(this.f288477b, wVar.f288477b) && Intrinsics.f(this.f288478c, wVar.f288478c) && Intrinsics.f(this.d, wVar.d) && Intrinsics.f(this.e, wVar.e) && Intrinsics.f(this.f, wVar.f) && Intrinsics.f(this.f288479g, wVar.f288479g) && Intrinsics.f(this.f288480h, wVar.f288480h) && Intrinsics.f(this.i, wVar.i) && Intrinsics.f(this.f288481j, wVar.f288481j) && Intrinsics.f(this.k, wVar.k) && Intrinsics.f(this.f288482l, wVar.f288482l) && Intrinsics.f(this.f288483m, wVar.f288483m) && Intrinsics.f(this.f288484n, wVar.f288484n) && Intrinsics.f(this.o, wVar.o) && Intrinsics.f(this.f288485p, wVar.f288485p) && Intrinsics.f(this.f288486q, wVar.f288486q);
    }

    public final int hashCode() {
        Object obj2 = this.f288476a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f288477b;
        int iHashCode2 = (iHashCode + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f288478c;
        int iHashCode3 = (iHashCode2 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.d;
        int iHashCode4 = (iHashCode3 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.e;
        int iHashCode5 = (iHashCode4 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.f;
        int iHashCode6 = (iHashCode5 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.f288479g;
        int iHashCode7 = (iHashCode6 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.f288480h;
        int iHashCode8 = (iHashCode7 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        Object obj10 = this.i;
        int iHashCode9 = (iHashCode8 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        Object obj11 = this.f288481j;
        int iHashCode10 = (iHashCode9 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        Object obj12 = this.k;
        int iHashCode11 = (iHashCode10 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        Object obj13 = this.f288482l;
        int iHashCode12 = (iHashCode11 + (obj13 == null ? 0 : obj13.hashCode())) * 31;
        Object obj14 = this.f288483m;
        int iHashCode13 = (iHashCode12 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
        Object obj15 = this.f288484n;
        int iHashCode14 = (iHashCode13 + (obj15 == null ? 0 : obj15.hashCode())) * 31;
        Object obj16 = this.o;
        int iHashCode15 = (iHashCode14 + (obj16 == null ? 0 : obj16.hashCode())) * 31;
        Object obj17 = this.f288485p;
        int iHashCode16 = (iHashCode15 + (obj17 == null ? 0 : obj17.hashCode())) * 31;
        Object obj18 = this.f288486q;
        return iHashCode16 + (obj18 != null ? obj18.hashCode() : 0);
    }
}
