package l5k;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transfer.core.models.FundingSource;
import h30.l;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import mga.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f192310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f192311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f192312c;
    public final c d;
    public final c e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f192313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f192314h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f192315j;
    public final AccountId k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final prf.g f192316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final FundingSource f192317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dj0.d f192318n;
    public final Clause o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0 f192319p;

    public /* synthetic */ d(b bVar, dj0.d dVar, dj0.d dVar2, c cVar, c cVar2, c cVar3, dj0.d dVar3, dj0.d dVar4, j jVar, prf.g gVar, FundingSource fundingSource, Clause clause, d0 d0Var, int i) {
        this(bVar, dVar, dVar2, cVar, cVar2, cVar3, null, dVar3, dVar4, jVar, AccountId.Personal.f51414a, (i & 2048) != 0 ? null : gVar, (i & 4096) != 0 ? null : fundingSource, null, (i & 16384) != 0 ? null : clause, d0Var);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f192310a, dVar.f192310a) && Intrinsics.f(this.f192311b, dVar.f192311b) && Intrinsics.f(this.f192312c, dVar.f192312c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f192313g, dVar.f192313g) && Intrinsics.f(this.f192314h, dVar.f192314h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f192315j, dVar.f192315j) && Intrinsics.f(this.k, dVar.k) && Intrinsics.f(this.f192316l, dVar.f192316l) && Intrinsics.f(this.f192317m, dVar.f192317m) && Intrinsics.f(this.f192318n, dVar.f192318n) && Intrinsics.f(this.o, dVar.o) && Intrinsics.f(this.f192319p, dVar.f192319p);
    }

    public final int hashCode() {
        b bVar = this.f192310a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        dj0.d dVar = this.f192311b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f192312c;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        c cVar = this.d;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.e;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        c cVar3 = this.f;
        int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        c cVar4 = this.f192313g;
        int iHashCode7 = (iHashCode6 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31;
        dj0.d dVar3 = this.f192314h;
        int iB = l.b(this.k, (this.f192315j.hashCode() + v7.c((iHashCode7 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31, 31, this.i)) * 31, 31);
        prf.g gVar = this.f192316l;
        int iHashCode8 = (iB + (gVar == null ? 0 : gVar.hashCode())) * 31;
        FundingSource fundingSource = this.f192317m;
        int iHashCode9 = (iHashCode8 + (fundingSource == null ? 0 : fundingSource.hashCode())) * 31;
        dj0.d dVar4 = this.f192318n;
        int iHashCode10 = (iHashCode9 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        Clause clause = this.o;
        int iHashCode11 = (iHashCode10 + (clause == null ? 0 : clause.hashCode())) * 31;
        d0 d0Var = this.f192319p;
        return iHashCode11 + (d0Var != null ? d0Var.hashCode() : 0);
    }

    public d(b bVar, dj0.d dVar, dj0.d dVar2, c cVar, c cVar2, c cVar3, c cVar4, dj0.d dVar3, dj0.d totalFee, j transferFeeType, AccountId accountId, prf.g gVar, FundingSource fundingSource, dj0.d dVar4, Clause clause, d0 d0Var) {
        Intrinsics.checkNotNullParameter(totalFee, "totalFee");
        Intrinsics.checkNotNullParameter(transferFeeType, "transferFeeType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f192310a = bVar;
        this.f192311b = dVar;
        this.f192312c = dVar2;
        this.d = cVar;
        this.e = cVar2;
        this.f = cVar3;
        this.f192313g = cVar4;
        this.f192314h = dVar3;
        this.i = totalFee;
        this.f192315j = transferFeeType;
        this.k = accountId;
        this.f192316l = gVar;
        this.f192317m = fundingSource;
        this.f192318n = dVar4;
        this.o = clause;
        this.f192319p = d0Var;
    }
}
