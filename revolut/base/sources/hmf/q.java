package hmf;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transactions.impl.R$string;
import ip0.c20;
import ip0.y10;
import java.util.List;
import kkf.e2;
import kkf.h2;
import kkf.k7;
import kkf.n7;
import kkf.o1;
import kkf.y0;
import kkf.y1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends a {
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.a f153891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.c f153892h;
    public final akf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kkf.d0 f153893j;
    public final o1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y1 f153894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e2 f153895m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h2 f153896n;
    public final k7 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n7 f153897p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y0 f153898q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final clf.a f153899r;

    public q(klf.h0 commonDataSource, jt0.b commonHeaderProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, akf.c adjustForAnalyticsActionProvider, kkf.d0 confirmationBlockProvider, o1 getHelpBlockProvider, y1 initiatorBlockProvider, e2 iofDescriptionBlockProvider, h2 iofOriginalTransactionBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(initiatorBlockProvider, "initiatorBlockProvider");
        Intrinsics.checkNotNullParameter(iofDescriptionBlockProvider, "iofDescriptionBlockProvider");
        Intrinsics.checkNotNullParameter(iofOriginalTransactionBlockProvider, "iofOriginalTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153891g = adjustForAnalyticsMenuOptionProvider;
        this.f153892h = hideTransactionMenuOptionProvider;
        this.i = adjustForAnalyticsActionProvider;
        this.f153893j = confirmationBlockProvider;
        this.k = getHelpBlockProvider;
        this.f153894l = initiatorBlockProvider;
        this.f153895m = iofDescriptionBlockProvider;
        this.f153896n = iofOriginalTransactionBlockProvider;
        this.o = statusBlockProvider;
        this.f153897p = statusWithNoticeBlockProvider;
        this.f153898q = equivalentBlockProvider;
        this.f153899r = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.f153899r.Z2();
        cmf.p pVarA = this.f153898q.a();
        cmf.p pVarA2 = this.f153897p.a(false);
        cmf.p pVarA3 = k0.a(this.o.a(), this.f153894l.a(), this.f153893j.a());
        h2 h2Var = this.f153896n;
        cmf.p pVar = new cmf.p(new t38.e(vkm.q.Q(h2Var.f184715l.d(), new jy6.l((Continuation) null, h2Var, 19)), 24, rd0.e.b(((njf.j) h2Var.f184716m).f()), new eki.f(3, h2Var, h2.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/domain/models/transactions/TransactionsExtraData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2)), new chc.c0(23), zhm.u.c(h2Var), "IofOriginalTransaction");
        this.f153895m.getClass();
        sa saVar = new sa("ID_IOF_DESCRIPTION", (Clause) new TextLocalisedClause(R$string.transactionUI_transaction_credit_card_iof_explain_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.transactionUI_transaction_credit_card_iof_explain_description, null, null, 14), (List) null, false, (c20) null, (y10) null, (Object) null, 232);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        return h(zhm.v.k(pVarZ2, pVarA, pVarA2, pVarA3, pVar, new cmf.p(new go.g(zhm.u.c(saVar), 2), new chc.c0(23), zhm.f0.f322471a, "IofDescription"), this.k.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(zhm.u.c(this.i.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.f153891g.a(), this.f153892h.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}
