package vf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f288454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f288455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f288456c;
    public final Object d;
    public final Object e;

    public k(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f288454a = obj2;
        this.f288455b = obj3;
        this.f288456c = obj4;
        this.d = obj5;
        this.e = obj6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f288454a, kVar.f288454a) && Intrinsics.f(this.f288455b, kVar.f288455b) && Intrinsics.f(this.f288456c, kVar.f288456c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        Object obj2 = this.f288454a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f288455b;
        int iHashCode2 = (iHashCode + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f288456c;
        int iHashCode3 = (iHashCode2 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.d;
        int iHashCode4 = (iHashCode3 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.e;
        return iHashCode4 + (obj6 != null ? obj6.hashCode() : 0);
    }
}
