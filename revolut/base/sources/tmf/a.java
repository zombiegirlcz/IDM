package tmf;

import ael.l0;
import blf.e;
import blf.i;
import cmf.p;
import go.g;
import hmf.k0;
import kkf.l8;
import kkf.o1;
import kkf.y0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends hmf.a {
    public final h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.c f272186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f272187h;
    public final l8 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f272188j;
    public final kkf.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o1 f272189l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0 f272190m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final clf.a f272191n;

    public a(h0 commonDataSource, jt0.b commonHeaderProvider, amf.c hideTransactionMenuOptionProvider, i statusWithNoticeBlockProvider, l8 toAccountBlockProvider, e savingsInterestBreakdownBlockProvider, kkf.e analyticsBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        Intrinsics.checkNotNullParameter(savingsInterestBreakdownBlockProvider, "savingsInterestBreakdownBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f272186g = hideTransactionMenuOptionProvider;
        this.f272187h = statusWithNoticeBlockProvider;
        this.i = toAccountBlockProvider;
        this.f272188j = savingsInterestBreakdownBlockProvider;
        this.k = analyticsBlockProvider;
        this.f272189l = getHelpBlockProvider;
        this.f272190m = equivalentBlockProvider;
        this.f272191n = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.f272191n.Z2();
        p pVarA = this.f272190m.a();
        p pVarA2 = k0.a(this.f272187h.a());
        p pVarA3 = k0.a(this.i.Z2());
        e eVar = this.f272188j;
        return h(v.k(pVarZ2, pVarA, pVarA2, pVarA3, new p(new t38.e(eVar.f16620a.d(), 24, (SharedFlow) eVar.f16621b.f.getValue(), new l0(3, eVar, e.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/shared/savings/models/SavingsAccountDetails;)Ljava/util/List;", 4, 3)), new bkd.a(9), u.c(eVar.f16622c), "SavingsInterestBreakdown"), this.k.Z2(), this.f272189l.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return new g(f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(u.c(this.f272186g.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
