package vf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f288491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f288492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f288493c;
    public final Object d;
    public final Object e;
    public final Object f;

    public y(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f288491a = obj2;
        this.f288492b = obj3;
        this.f288493c = obj4;
        this.d = obj5;
        this.e = obj6;
        this.f = obj7;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f288491a, yVar.f288491a) && Intrinsics.f(this.f288492b, yVar.f288492b) && Intrinsics.f(this.f288493c, yVar.f288493c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f);
    }

    public final int hashCode() {
        Object obj2 = this.f288491a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f288492b;
        int iHashCode2 = (iHashCode + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f288493c;
        int iHashCode3 = (iHashCode2 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.d;
        int iHashCode4 = (iHashCode3 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.e;
        int iHashCode5 = (iHashCode4 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.f;
        return iHashCode5 + (obj7 != null ? obj7.hashCode() : 0);
    }
}
