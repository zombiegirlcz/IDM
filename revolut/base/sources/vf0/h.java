package vf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f288433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f288434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f288435c;
    public final Object d;

    public h(Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f288433a = obj2;
        this.f288434b = obj3;
        this.f288435c = obj4;
        this.d = obj5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f288433a, hVar.f288433a) && Intrinsics.f(this.f288434b, hVar.f288434b) && Intrinsics.f(this.f288435c, hVar.f288435c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        Object obj2 = this.f288433a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f288434b;
        int iHashCode2 = (iHashCode + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f288435c;
        int iHashCode3 = (iHashCode2 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.d;
        return iHashCode3 + (obj5 != null ? obj5.hashCode() : 0);
    }
}
