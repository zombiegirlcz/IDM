package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f173485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f173486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f173487c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f173488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f173489h;
    public final Long i;

    public j1(dj0.d dVar, Double d, Double d5, dj0.d dVar2, dj0.d dVar3, dj0.d dVar4, Double d6, Double d10, Long l2) {
        this.f173485a = dVar;
        this.f173486b = d;
        this.f173487c = d5;
        this.d = dVar2;
        this.e = dVar3;
        this.f = dVar4;
        this.f173488g = d6;
        this.f173489h = d10;
        this.i = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.f173485a, j1Var.f173485a) && Intrinsics.f(this.f173486b, j1Var.f173486b) && Intrinsics.f(this.f173487c, j1Var.f173487c) && Intrinsics.f(this.d, j1Var.d) && Intrinsics.f(this.e, j1Var.e) && Intrinsics.f(this.f, j1Var.f) && Intrinsics.f(this.f173488g, j1Var.f173488g) && Intrinsics.f(this.f173489h, j1Var.f173489h) && Intrinsics.f(this.i, j1Var.i);
    }

    public final int hashCode() {
        dj0.d dVar = this.f173485a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Double d = this.f173486b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.f173487c;
        int iHashCode3 = (iHashCode2 + (d5 == null ? 0 : d5.hashCode())) * 31;
        dj0.d dVar2 = this.d;
        int iHashCode4 = (iHashCode3 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.e;
        int iHashCode5 = (iHashCode4 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        dj0.d dVar4 = this.f;
        int iHashCode6 = (iHashCode5 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        Double d6 = this.f173488g;
        int iHashCode7 = (iHashCode6 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d10 = this.f173489h;
        int iHashCode8 = (iHashCode7 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Long l2 = this.i;
        return iHashCode8 + (l2 != null ? l2.hashCode() : 0);
    }
}
