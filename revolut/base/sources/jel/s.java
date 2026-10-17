package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f173561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f173562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f173563c;
    public final Double d;
    public final Double e;
    public final Double f;

    public s(dj0.d dVar, dj0.d dVar2, Double d, Double d5, Double d6, Double d10) {
        this.f173561a = dVar;
        this.f173562b = dVar2;
        this.f173563c = d;
        this.d = d5;
        this.e = d6;
        this.f = d10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f173561a, sVar.f173561a) && Intrinsics.f(this.f173562b, sVar.f173562b) && Intrinsics.f(this.f173563c, sVar.f173563c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f);
    }

    public final int hashCode() {
        dj0.d dVar = this.f173561a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f173562b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        Double d = this.f173563c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.d;
        int iHashCode4 = (iHashCode3 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.e;
        int iHashCode5 = (iHashCode4 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d10 = this.f;
        return iHashCode5 + (d10 != null ? d10.hashCode() : 0);
    }
}
