package zah;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature.wealth.api.ui.invest.transactions.details.pager.InvestTransactionDetailsPagerContract$InputData;
import com.revolut.feature.wealth.impl.ui.invest.transactions.details.pager.InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import md6.s;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import vkm.v1;
import vkm.z1;
import x8h.y;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends oki.h implements ali.h {

    @NotNull
    public static final e Companion = new e();
    public final InvestTransactionDetailsPagerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oc.f f320714p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f320715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f320716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cli.y f320717s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ali.b f320718t;

    public g(b initialState, i stateMapper, h saveStateDelegate, InvestTransactionDetailsPagerContract$InputData inputData, oc.f transactionsDependenciesProvider, y transactionsPagerInteractor) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsDependenciesProvider, "transactionsDependenciesProvider");
        Intrinsics.checkNotNullParameter(transactionsPagerInteractor, "transactionsPagerInteractor");
        this.o = inputData;
        this.f320714p = transactionsDependenciesProvider;
        this.f320715q = transactionsPagerInteractor;
        this.f320716r = ta6.a.a(0);
        this.f320717s = mra.d.b(this, initialState, stateMapper, saveStateDelegate, false, 8);
        this.f320718t = s.b(this, new yz4.b(this, 26));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f320718t;
    }

    @Override // yji.l
    public final void I1() {
        Flow v1Var;
        Continuation continuation = null;
        vkm.y paginationEvents = new vkm.y(new f(this, continuation, 0), this.f320716r);
        y yVar = this.f320715q;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(paginationEvents, "paginationEvents");
        if (((jte.d) yVar.f303403c).c(FeatureWealthApi$Toggles.InvestTransactionsFullHistory.f95162c)) {
            rul.e eVar = yVar.d;
            ahe.i paginationEvents2 = new ahe.i(paginationEvents, 19);
            Intrinsics.checkNotNullParameter(paginationEvents2, "paginationEvents");
            v1Var = q.Q(paginationEvents2, new x18.e(continuation, eVar, 5));
        } else {
            v1Var = new v1(new wih.c(paginationEvents, yVar, continuation, 24));
        }
        l.a1(this, q.q(v1Var), null, null, new yy6.f(this, continuation, 23), 3);
    }

    public final boolean I2(InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem investTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem) {
        Data data = ((b) ((j2) this.f320717s.f22677a).getValue()).f320708c;
        if (data == null || data.getLoading()) {
            return false;
        }
        return this.f320716r.k(new tzg.d(investTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem.f95576a, this.o.f95358b));
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f320717s;
    }
}
