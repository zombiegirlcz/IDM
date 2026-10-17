package vf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f288388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f288389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f288390c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f288391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f288392h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f288393j;

    public a(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        this.f288388a = obj2;
        this.f288389b = obj3;
        this.f288390c = obj4;
        this.d = obj5;
        this.e = obj6;
        this.f = obj7;
        this.f288391g = obj8;
        this.f288392h = obj9;
        this.i = obj10;
        this.f288393j = obj11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f288388a, aVar.f288388a) && Intrinsics.f(this.f288389b, aVar.f288389b) && Intrinsics.f(this.f288390c, aVar.f288390c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f288391g, aVar.f288391g) && Intrinsics.f(this.f288392h, aVar.f288392h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f288393j, aVar.f288393j);
    }

    public final int hashCode() {
        Object obj2 = this.f288388a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f288389b;
        int iHashCode2 = (iHashCode + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f288390c;
        int iHashCode3 = (iHashCode2 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.d;
        int iHashCode4 = (iHashCode3 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.e;
        int iHashCode5 = (iHashCode4 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.f;
        int iHashCode6 = (iHashCode5 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.f288391g;
        int iHashCode7 = (iHashCode6 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.f288392h;
        int iHashCode8 = (iHashCode7 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        Object obj10 = this.i;
        int iHashCode9 = (iHashCode8 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        Object obj11 = this.f288393j;
        return iHashCode9 + (obj11 != null ? obj11.hashCode() : 0);
    }
}
