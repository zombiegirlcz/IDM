package vf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f288428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f288429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f288430c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f288431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f288432h;

    public g(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        this.f288428a = obj2;
        this.f288429b = obj3;
        this.f288430c = obj4;
        this.d = obj5;
        this.e = obj6;
        this.f = obj7;
        this.f288431g = obj8;
        this.f288432h = obj9;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f288428a, gVar.f288428a) && Intrinsics.f(this.f288429b, gVar.f288429b) && Intrinsics.f(this.f288430c, gVar.f288430c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f288431g, gVar.f288431g) && Intrinsics.f(this.f288432h, gVar.f288432h);
    }

    public final int hashCode() {
        Object obj2 = this.f288428a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f288429b;
        int iHashCode2 = (iHashCode + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f288430c;
        int iHashCode3 = (iHashCode2 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.d;
        int iHashCode4 = (iHashCode3 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.e;
        int iHashCode5 = (iHashCode4 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.f;
        int iHashCode6 = (iHashCode5 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.f288431g;
        int iHashCode7 = (iHashCode6 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.f288432h;
        return iHashCode7 + (obj9 != null ? obj9.hashCode() : 0);
    }
}
