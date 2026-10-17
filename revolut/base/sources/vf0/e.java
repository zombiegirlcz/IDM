package vf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f288410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f288411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f288412c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f288413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f288414h;
    public final Object i;

    public e(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        this.f288410a = obj2;
        this.f288411b = obj3;
        this.f288412c = obj4;
        this.d = obj5;
        this.e = obj6;
        this.f = obj7;
        this.f288413g = obj8;
        this.f288414h = obj9;
        this.i = obj10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f288410a, eVar.f288410a) && Intrinsics.f(this.f288411b, eVar.f288411b) && Intrinsics.f(this.f288412c, eVar.f288412c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f288413g, eVar.f288413g) && Intrinsics.f(this.f288414h, eVar.f288414h) && Intrinsics.f(this.i, eVar.i);
    }

    public final int hashCode() {
        Object obj2 = this.f288410a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f288411b;
        int iHashCode2 = (iHashCode + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f288412c;
        int iHashCode3 = (iHashCode2 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.d;
        int iHashCode4 = (iHashCode3 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.e;
        int iHashCode5 = (iHashCode4 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.f;
        int iHashCode6 = (iHashCode5 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.f288413g;
        int iHashCode7 = (iHashCode6 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.f288414h;
        int iHashCode8 = (iHashCode7 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        Object obj10 = this.i;
        return iHashCode8 + (obj10 != null ? obj10.hashCode() : 0);
    }
}
