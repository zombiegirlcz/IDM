package vf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f288436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f288437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f288438c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f288439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f288440h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f288441j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f288442l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f288443m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f288444n;

    public i(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        this.f288436a = obj2;
        this.f288437b = obj3;
        this.f288438c = obj4;
        this.d = obj5;
        this.e = obj6;
        this.f = obj7;
        this.f288439g = obj8;
        this.f288440h = obj9;
        this.i = obj10;
        this.f288441j = obj11;
        this.k = obj12;
        this.f288442l = obj13;
        this.f288443m = obj14;
        this.f288444n = obj15;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f288436a, iVar.f288436a) && Intrinsics.f(this.f288437b, iVar.f288437b) && Intrinsics.f(this.f288438c, iVar.f288438c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f288439g, iVar.f288439g) && Intrinsics.f(this.f288440h, iVar.f288440h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f288441j, iVar.f288441j) && Intrinsics.f(this.k, iVar.k) && Intrinsics.f(this.f288442l, iVar.f288442l) && Intrinsics.f(this.f288443m, iVar.f288443m) && Intrinsics.f(this.f288444n, iVar.f288444n);
    }

    public final int hashCode() {
        Object obj2 = this.f288436a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f288437b;
        int iHashCode2 = (iHashCode + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f288438c;
        int iHashCode3 = (iHashCode2 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.d;
        int iHashCode4 = (iHashCode3 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.e;
        int iHashCode5 = (iHashCode4 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.f;
        int iHashCode6 = (iHashCode5 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.f288439g;
        int iHashCode7 = (iHashCode6 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.f288440h;
        int iHashCode8 = (iHashCode7 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        Object obj10 = this.i;
        int iHashCode9 = (iHashCode8 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        Object obj11 = this.f288441j;
        int iHashCode10 = (iHashCode9 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        Object obj12 = this.k;
        int iHashCode11 = (iHashCode10 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        Object obj13 = this.f288442l;
        int iHashCode12 = (iHashCode11 + (obj13 == null ? 0 : obj13.hashCode())) * 31;
        Object obj14 = this.f288443m;
        int iHashCode13 = (iHashCode12 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
        Object obj15 = this.f288444n;
        return iHashCode13 + (obj15 != null ? obj15.hashCode() : 0);
    }
}
