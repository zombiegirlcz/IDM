package xkf;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import tof.f3;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f306698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5k.v f306699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f306700c;
    public final dj0.d d;
    public final f3 e;
    public final prf.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z3l.a f306701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f306702h;
    public final z3l.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p5k.o f306703j;

    public f(dj0.d recipientAmount, p5k.v vVar, dj0.d exchangeAmount, dj0.d fees, f3 f3Var, prf.g gVar, z3l.a aVar, dj0.d dVar, z3l.a aVar2, p5k.o recipientValueTitleMode) {
        Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
        Intrinsics.checkNotNullParameter(exchangeAmount, "exchangeAmount");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(recipientValueTitleMode, "recipientValueTitleMode");
        this.f306698a = recipientAmount;
        this.f306699b = vVar;
        this.f306700c = exchangeAmount;
        this.d = fees;
        this.e = f3Var;
        this.f = gVar;
        this.f306701g = aVar;
        this.f306702h = dVar;
        this.i = aVar2;
        this.f306703j = recipientValueTitleMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f306698a, fVar.f306698a) && Intrinsics.f(this.f306699b, fVar.f306699b) && Intrinsics.f(this.f306700c, fVar.f306700c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f306701g, fVar.f306701g) && Intrinsics.f(this.f306702h, fVar.f306702h) && Intrinsics.f(this.i, fVar.i) && Intrinsics.f(this.f306703j, fVar.f306703j);
    }

    public final int hashCode() {
        int iHashCode = this.f306698a.hashCode() * 31;
        p5k.v vVar = this.f306699b;
        int iC = v7.c(v7.c((iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31, 31, this.f306700c), 31, this.d);
        f3 f3Var = this.e;
        int iHashCode2 = (iC + (f3Var == null ? 0 : f3Var.hashCode())) * 31;
        prf.g gVar = this.f;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        z3l.a aVar = this.f306701g;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        dj0.d dVar = this.f306702h;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        z3l.a aVar2 = this.i;
        return this.f306703j.hashCode() + ((iHashCode5 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
    }
}
