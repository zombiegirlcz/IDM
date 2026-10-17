package r7b;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsTransaction;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.details.CobrandedCardsPlanHubTransactionDetailsScreenContract$InputData;
import efm.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tof.r9;
import wli.x;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends oki.h implements i {
    public final CobrandedCardsPlanHubTransactionDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f252073p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sfk.a f252074q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final whf.b f252075r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f252076s;

    public l(n stateMapper, CobrandedCardsPlanHubTransactionDetailsScreenContract$InputData inputData, x deeplinkHandler, sfk.a pricingPlanChangeObservable, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(pricingPlanChangeObservable, "pricingPlanChangeObservable");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.o = inputData;
        this.f252073p = deeplinkHandler;
        this.f252074q = pricingPlanChangeObservable;
        this.f252075r = transactionsContentProvider;
        this.f252076s = mra.d.b(this, new h(new Data(null, null, true, 3, null), inputData.f82610a.f82427p), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l lVar;
        CobrandedCardsTransaction cobrandedCardsTransaction = this.o.f82610a;
        String str = cobrandedCardsTransaction.f82421g;
        Continuation continuation = null;
        if (cobrandedCardsTransaction.f == null || str == null) {
            lVar = this;
        } else {
            r rVarJust = r.just(new r9(str));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
            lVar = this;
            yji.l.a1(lVar, rd0.e.b(whf.b.a(this.f252075r, rVarJust, null, null, null, 14)), null, null, new r5e.e(this, null, 8), 3);
        }
        yji.l.a1(lVar, rd0.e.d(rd0.e.b(lVar.f252074q.a()), h0.f322473a), null, null, new r0e.c(this, continuation, 12), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f252076s;
    }
}
