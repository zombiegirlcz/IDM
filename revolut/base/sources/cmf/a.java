package cmf;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import tof.i2;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f25219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z3l.a f25220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2 f25221c;
    public final dj0.d d;
    public final dj0.d e;

    public a(dj0.d pocketFees, z3l.a aVar, i2 i2Var, dj0.d transferFee, dj0.d exchangeFee) {
        Intrinsics.checkNotNullParameter(pocketFees, "pocketFees");
        Intrinsics.checkNotNullParameter(transferFee, "transferFee");
        Intrinsics.checkNotNullParameter(exchangeFee, "exchangeFee");
        this.f25219a = pocketFees;
        this.f25220b = aVar;
        this.f25221c = i2Var;
        this.d = transferFee;
        this.e = exchangeFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f25219a, aVar.f25219a) && Intrinsics.f(this.f25220b, aVar.f25220b) && Intrinsics.f(this.f25221c, aVar.f25221c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f25219a.hashCode() * 31;
        z3l.a aVar = this.f25220b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        i2 i2Var = this.f25221c;
        return this.e.hashCode() + v7.c((iHashCode2 + (i2Var != null ? i2Var.hashCode() : 0)) * 31, 31, this.d);
    }
}
