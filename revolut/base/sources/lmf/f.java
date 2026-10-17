package lmf;

import ael.l0;
import amf.o;
import cmf.p;
import hmf.k0;
import kkf.d0;
import kkf.i9;
import kkf.o6;
import kkf.y0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pkf.j1;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends hmf.a {
    public final h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f197009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.c f197010h;
    public final o6 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f197011j;
    public final j1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kkf.e f197012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i9 f197013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y0 f197014n;
    public final clf.a o;

    public f(h0 commonDataSource, jt0.b commonHeaderProvider, o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, o6 simpleStatusBlockProvider, d0 confirmationBlockProvider, j1 cryptoReferralRewardAmountBlockProvider, kkf.e analyticsBlockProvider, i9 userCommentBlockProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(simpleStatusBlockProvider, "simpleStatusBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoReferralRewardAmountBlockProvider, "cryptoReferralRewardAmountBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f197009g = userCommentMenuOptionProvider;
        this.f197010h = hideTransactionMenuOptionProvider;
        this.i = simpleStatusBlockProvider;
        this.f197011j = confirmationBlockProvider;
        this.k = cryptoReferralRewardAmountBlockProvider;
        this.f197012l = analyticsBlockProvider;
        this.f197013m = userCommentBlockProvider;
        this.f197014n = equivalentBlockProvider;
        this.o = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.o.Z2();
        p pVarA = this.f197014n.a();
        p pVarA2 = k0.a(this.i.a(), this.f197011j.a());
        j1 j1Var = this.k;
        h0 h0Var = j1Var.f237079l;
        return h(v.k(pVarZ2, pVarA, pVarA2, new p(new t38.e(h0Var.d(), 24, h0Var.c(), new l0(3, j1Var, j1.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;)Ljava/util/List;", 4, 28)), new pka.c(11), f0.f322471a, "CryptoReferralRewardAmount"), this.f197012l.Z2(), this.f197013m.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return new go.g(f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f197009g.a(new ah1.p(29)), this.f197010h.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
