package tv4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.CreditCardStatementTransactionsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.f4;
import om4.x2;
import vkm.q;
import vkm.t0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends oki.h implements k {
    public final CreditCardStatementTransactionsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final al4.n f274709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lal.a f274710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ssi.m f274711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f4 f274712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c9e.c f274713t;
    public final vii.b u;
    public final y v;

    public o(CreditCardStatementTransactionsScreenContract$InputData inputData, al4.n creditCardInteractor, lal.a creditCardStatementsInteractor, ssi.m transactionsWidgetActionExtension, f4 upcomingPaymentsInteractor, c9e.c subscriptionNavigationProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardStatementsInteractor, "creditCardStatementsInteractor");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        Intrinsics.checkNotNullParameter(upcomingPaymentsInteractor, "upcomingPaymentsInteractor");
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f274709p = creditCardInteractor;
        this.f274710q = creditCardStatementsInteractor;
        this.f274711r = transactionsWidgetActionExtension;
        this.f274712s = upcomingPaymentsInteractor;
        this.f274713t = subscriptionNavigationProvider;
        this.u = new vii.b();
        this.v = mra.d.b(this, new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        CreditCardStatementTransactionsScreenContract$InputData creditCardStatementTransactionsScreenContract$InputData = this.o;
        Flow flowE = boh.f.e(((x2) this.f274709p).r(creditCardStatementTransactionsScreenContract$InputData.f69709a, creditCardStatementTransactionsScreenContract$InputData.f69710b, w4l.h.f294642c), new tpl.o(this, 17));
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, rd0.e.n(flowE, h0Var), null, null, new n(this, null, 0), 3);
        yji.l.a1(this, rd0.e.n(q.Q(q.r(new tq0.j(21), new t0(this.v.B(new tsk.j(11)), 1)), new tik.b((Continuation) null, this, 10)), h0Var), null, null, new n(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
