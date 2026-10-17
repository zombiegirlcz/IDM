package vf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f288400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f288401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f288402c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f288403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f288404h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f288405j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f288406l;

    public b(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        this.f288400a = obj2;
        this.f288401b = obj3;
        this.f288402c = obj4;
        this.d = obj5;
        this.e = obj6;
        this.f = obj7;
        this.f288403g = obj8;
        this.f288404h = obj9;
        this.i = obj10;
        this.f288405j = obj11;
        this.k = obj12;
        this.f288406l = obj13;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f288400a, bVar.f288400a) && Intrinsics.f(this.f288401b, bVar.f288401b) && Intrinsics.f(this.f288402c, bVar.f288402c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f288403g, bVar.f288403g) && Intrinsics.f(this.f288404h, bVar.f288404h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f288405j, bVar.f288405j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f288406l, bVar.f288406l);
    }

    public final int hashCode() {
        Object obj2 = this.f288400a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f288401b;
        int iHashCode2 = (iHashCode + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f288402c;
        int iHashCode3 = (iHashCode2 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.d;
        int iHashCode4 = (iHashCode3 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.e;
        int iHashCode5 = (iHashCode4 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.f;
        int iHashCode6 = (iHashCode5 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.f288403g;
        int iHashCode7 = (iHashCode6 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.f288404h;
        int iHashCode8 = (iHashCode7 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        Object obj10 = this.i;
        int iHashCode9 = (iHashCode8 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        Object obj11 = this.f288405j;
        int iHashCode10 = (iHashCode9 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        Object obj12 = this.k;
        int iHashCode11 = (iHashCode10 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        Object obj13 = this.f288406l;
        return iHashCode11 + (obj13 != null ? obj13.hashCode() : 0);
    }
}
