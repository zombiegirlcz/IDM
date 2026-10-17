package l5k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transfer.core.models.FundingSource;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import mga.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f192320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9l.a f192321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f192322c;
    public final dj0.d d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f192323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final prf.g f192324h;
    public final z3l.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FundingSource f192325j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nrf.e f192326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dj0.d f192327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Clause f192328n;
    public final d0 o;

    public e(dj0.d recipientAmount, n9l.a exchangeRate, dj0.d exchangeAmount, dj0.d fees, boolean z, boolean z3, Clause clause, prf.g gVar, z3l.a aVar, FundingSource fundingSource, dj0.d dVar, nrf.e eVar, dj0.d dVar2, Clause clause2, d0 d0Var) {
        Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
        Intrinsics.checkNotNullParameter(exchangeAmount, "exchangeAmount");
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f192320a = recipientAmount;
        this.f192321b = exchangeRate;
        this.f192322c = exchangeAmount;
        this.d = fees;
        this.e = z;
        this.f = z3;
        this.f192323g = clause;
        this.f192324h = gVar;
        this.i = aVar;
        this.f192325j = fundingSource;
        this.k = dVar;
        this.f192326l = eVar;
        this.f192327m = dVar2;
        this.f192328n = clause2;
        this.o = d0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f192320a, eVar.f192320a) && Intrinsics.f(this.f192321b, eVar.f192321b) && Intrinsics.f(this.f192322c, eVar.f192322c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e && this.f == eVar.f && Intrinsics.f(this.f192323g, eVar.f192323g) && Intrinsics.f(this.f192324h, eVar.f192324h) && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f192325j, eVar.f192325j) && Intrinsics.f(this.k, eVar.k) && Intrinsics.f(this.f192326l, eVar.f192326l) && Intrinsics.f(this.f192327m, eVar.f192327m) && Intrinsics.f(this.f192328n, eVar.f192328n) && Intrinsics.f(this.o, eVar.o);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(v7.c(v7.c((this.f192321b.hashCode() + (this.f192320a.hashCode() * 31)) * 31, 31, this.f192322c), 31, this.d), 31, this.e), 31, this.f);
        Clause clause = this.f192323g;
        int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
        prf.g gVar = this.f192324h;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        z3l.a aVar = this.i;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        FundingSource fundingSource = this.f192325j;
        int iHashCode4 = (iHashCode3 + (fundingSource == null ? 0 : fundingSource.hashCode())) * 31;
        dj0.d dVar = this.k;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        nrf.e eVar = this.f192326l;
        int iHashCode6 = (iHashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        dj0.d dVar2 = this.f192327m;
        int iHashCode7 = (iHashCode6 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        Clause clause2 = this.f192328n;
        int iHashCode8 = (iHashCode7 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        d0 d0Var = this.o;
        return iHashCode8 + (d0Var != null ? d0Var.hashCode() : 0);
    }

    public /* synthetic */ e(dj0.d dVar, n9l.a aVar, dj0.d dVar2, dj0.d dVar3, boolean z, boolean z3, prf.g gVar, FundingSource fundingSource, nrf.e eVar, dj0.d dVar4, Clause clause, d0 d0Var, int i) {
        this(dVar, aVar, dVar2, dVar3, z, z3, null, (i & 128) != 0 ? null : gVar, null, (i & 512) != 0 ? null : fundingSource, null, (i & 2048) != 0 ? null : eVar, (i & 4096) != 0 ? null : dVar4, (i & 8192) != 0 ? null : clause, d0Var);
    }
}
