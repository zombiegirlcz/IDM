package bti;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f18602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f18603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f18604c;
    public final dj0.d d;
    public final dj0.d e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f18605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f18606h;
    public final Integer i;

    public h(dj0.d pricePerPassenger, dj0.d finalPrice, g gVar, dj0.d dVar, dj0.d dVar2, String str, dj0.d dVar3, dj0.d dVar4, Integer num) {
        Intrinsics.checkNotNullParameter(pricePerPassenger, "pricePerPassenger");
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        this.f18602a = pricePerPassenger;
        this.f18603b = finalPrice;
        this.f18604c = gVar;
        this.d = dVar;
        this.e = dVar2;
        this.f = str;
        this.f18605g = dVar3;
        this.f18606h = dVar4;
        this.i = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f18602a, hVar.f18602a) && Intrinsics.f(this.f18603b, hVar.f18603b) && Intrinsics.f(this.f18604c, hVar.f18604c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f18605g, hVar.f18605g) && Intrinsics.f(this.f18606h, hVar.f18606h) && Intrinsics.f(this.i, hVar.i);
    }

    public final int hashCode() {
        int iC = v7.c(this.f18602a.hashCode() * 31, 31, this.f18603b);
        g gVar = this.f18604c;
        int iHashCode = (iC + (gVar == null ? 0 : gVar.hashCode())) * 31;
        dj0.d dVar = this.d;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.e;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        String str = this.f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        dj0.d dVar3 = this.f18605g;
        int iHashCode5 = (iHashCode4 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        dj0.d dVar4 = this.f18606h;
        int iHashCode6 = (iHashCode5 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        Integer num = this.i;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }
}
