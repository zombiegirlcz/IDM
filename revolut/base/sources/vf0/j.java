package vf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f288445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f288446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f288447c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f288448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f288449h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f288450j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f288451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f288452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f288453n;
    public final Object o;

    public j(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        this.f288445a = obj2;
        this.f288446b = obj3;
        this.f288447c = obj4;
        this.d = obj5;
        this.e = obj6;
        this.f = obj7;
        this.f288448g = obj8;
        this.f288449h = obj9;
        this.i = obj10;
        this.f288450j = obj11;
        this.k = obj12;
        this.f288451l = obj13;
        this.f288452m = obj14;
        this.f288453n = obj15;
        this.o = obj16;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f288445a, jVar.f288445a) && Intrinsics.f(this.f288446b, jVar.f288446b) && Intrinsics.f(this.f288447c, jVar.f288447c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f288448g, jVar.f288448g) && Intrinsics.f(this.f288449h, jVar.f288449h) && Intrinsics.f(this.i, jVar.i) && Intrinsics.f(this.f288450j, jVar.f288450j) && Intrinsics.f(this.k, jVar.k) && Intrinsics.f(this.f288451l, jVar.f288451l) && Intrinsics.f(this.f288452m, jVar.f288452m) && Intrinsics.f(this.f288453n, jVar.f288453n) && Intrinsics.f(this.o, jVar.o);
    }

    public final int hashCode() {
        Object obj2 = this.f288445a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f288446b;
        int iHashCode2 = (iHashCode + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f288447c;
        int iHashCode3 = (iHashCode2 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.d;
        int iHashCode4 = (iHashCode3 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.e;
        int iHashCode5 = (iHashCode4 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.f;
        int iHashCode6 = (iHashCode5 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.f288448g;
        int iHashCode7 = (iHashCode6 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.f288449h;
        int iHashCode8 = (iHashCode7 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        Object obj10 = this.i;
        int iHashCode9 = (iHashCode8 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        Object obj11 = this.f288450j;
        int iHashCode10 = (iHashCode9 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        Object obj12 = this.k;
        int iHashCode11 = (iHashCode10 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        Object obj13 = this.f288451l;
        int iHashCode12 = (iHashCode11 + (obj13 == null ? 0 : obj13.hashCode())) * 31;
        Object obj14 = this.f288452m;
        int iHashCode13 = (iHashCode12 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
        Object obj15 = this.f288453n;
        int iHashCode14 = (iHashCode13 + (obj15 == null ? 0 : obj15.hashCode())) * 31;
        Object obj16 = this.o;
        return iHashCode14 + (obj16 != null ? obj16.hashCode() : 0);
    }
}
