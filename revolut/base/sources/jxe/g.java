package jxe;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cxe.d f179173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f179174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f179175c;
    public final cxe.d d;

    public g(cxe.d totalAmount, dj0.d requiredTopUpAmount, dj0.d topUpMethodFee, cxe.d dVar) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(requiredTopUpAmount, "requiredTopUpAmount");
        Intrinsics.checkNotNullParameter(topUpMethodFee, "topUpMethodFee");
        this.f179173a = totalAmount;
        this.f179174b = requiredTopUpAmount;
        this.f179175c = topUpMethodFee;
        this.d = dVar;
    }

    @Override // jxe.l
    public final dj0.d a() {
        return this.f179174b;
    }

    @Override // jxe.l
    public final cxe.d b() {
        return this.f179173a;
    }

    @Override // jxe.l
    public final cxe.d c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f179173a, gVar.f179173a) && Intrinsics.f(this.f179174b, gVar.f179174b) && Intrinsics.f(this.f179175c, gVar.f179175c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f179173a.hashCode() * 31, 31, this.f179174b), 31, this.f179175c);
        cxe.d dVar = this.d;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
