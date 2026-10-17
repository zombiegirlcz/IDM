package hmf;

import kkf.o1;
import kkf.u1;
import kkf.v1;
import kkf.w1;
import kkf.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends a {
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.c f153887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f153888h;
    public final o1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u1 f153889j;
    public final y0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final clf.a f153890l;

    public p(klf.h0 commonDataSource, jt0.b commonHeaderProvider, amf.c hideTransactionMenuOptionProvider, w1 indianMcyTopUpBlockProvider, o1 getHelpBlockProvider, u1 getGstInvoiceBlockProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(indianMcyTopUpBlockProvider, "indianMcyTopUpBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(getGstInvoiceBlockProvider, "getGstInvoiceBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153887g = hideTransactionMenuOptionProvider;
        this.f153888h = indianMcyTopUpBlockProvider;
        this.i = getHelpBlockProvider;
        this.f153889j = getGstInvoiceBlockProvider;
        this.k = equivalentBlockProvider;
        this.f153890l = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.f153890l.Z2();
        cmf.p pVarA = this.k.a();
        w1 w1Var = this.f153888h;
        klf.h0 h0Var = w1Var.f184992a;
        return h(zhm.v.k(pVarZ2, pVarA, new cmf.p(ta6.a.g(h0Var.d(), h0Var.c(), h0Var.j(), nim.a.v(rd0.e.b(z71.a.b(w1Var.e, false, null, null, 7)), new kjk.x(9)), new v1(5, 0, w1.class, w1Var, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;Lcom/revolut/feature/core/model/domain/user/User;Lcom/revolut/data/model/Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;")), new k98.a(w1Var, 8), zhm.v.k(w1Var.f, w1Var.f184995g), "IndianMcyTopUp"), this.i.a(), this.f153889j.Z2()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return vkm.i.f290039a;
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.u.c(this.f153887g.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}
