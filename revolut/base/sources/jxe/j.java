package jxe;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cxe.d f179182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f179183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f179184c;
    public final dj0.d d;
    public final dj0.d e;
    public final cxe.d f;

    public j(cxe.d totalAmount, dj0.d requiredTopUpAmount, dj0.d topUpMethodFee, dj0.d takenFromBalance, dj0.d leftToPay, cxe.d dVar) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(requiredTopUpAmount, "requiredTopUpAmount");
        Intrinsics.checkNotNullParameter(topUpMethodFee, "topUpMethodFee");
        Intrinsics.checkNotNullParameter(takenFromBalance, "takenFromBalance");
        Intrinsics.checkNotNullParameter(leftToPay, "leftToPay");
        this.f179182a = totalAmount;
        this.f179183b = requiredTopUpAmount;
        this.f179184c = topUpMethodFee;
        this.d = takenFromBalance;
        this.e = leftToPay;
        this.f = dVar;
    }

    @Override // jxe.l
    public final dj0.d a() {
        return this.f179183b;
    }

    @Override // jxe.l
    public final cxe.d b() {
        return this.f179182a;
    }

    @Override // jxe.l
    public final cxe.d c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f179182a, jVar.f179182a) && Intrinsics.f(this.f179183b, jVar.f179183b) && Intrinsics.f(this.f179184c, jVar.f179184c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(v7.c(v7.c(this.f179182a.hashCode() * 31, 31, this.f179183b), 31, this.f179184c), 31, this.d), 31, this.e);
        cxe.d dVar = this.f;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
