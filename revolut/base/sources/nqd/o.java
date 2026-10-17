package nqd;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends oki.h implements d {
    public final wzi.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.n f218422p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final whf.b f218423q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final prl.e f218424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final rqd.h f218425s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f218426t;
    public final z1 u;

    public o(q stateMapper, wzi.a incomeSorterInteractor, wsg.n walletInteractor, whf.b transactionsContentProvider, prl.e selectIncomeTransactionFilterProvider, rqd.h incomeSorterRatesInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(selectIncomeTransactionFilterProvider, "selectIncomeTransactionFilterProvider");
        Intrinsics.checkNotNullParameter(incomeSorterRatesInteractor, "incomeSorterRatesInteractor");
        this.o = incomeSorterInteractor;
        this.f218422p = walletInteractor;
        this.f218423q = transactionsContentProvider;
        this.f218424r = selectIncomeTransactionFilterProvider;
        this.f218425s = incomeSorterRatesInteractor;
        this.f218426t = mra.d.b(this, new a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.u = z1VarB;
    }

    public final void I2() {
        CategorisationFilter categorisationFilter;
        c cVar;
        y yVar = this.f218426t;
        c cVar2 = (c) ((a) ((j2) yVar.f22677a).getValue()).f218404a.getContent();
        if (cVar2 == null || (categorisationFilter = cVar2.f218410c) == null || (cVar = (c) ((a) ((j2) yVar.f22677a).getValue()).f218404a.getContent()) == null) {
            return;
        }
        l1().M0(new kqd.g(categorisationFilter, cVar.d));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.u, new mk0.f(continuation, this, 27)), null, new nn7.d(this, continuation, 9), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f218426t;
    }
}
