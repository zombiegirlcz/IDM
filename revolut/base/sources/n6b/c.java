package n6b;

import c7b.j;
import c7b.k;
import c7b.l;
import c7b.m;
import c7b.n;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.CobrandedCardsPostActivationFlowContract$Step;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.b f212757b;

    public /* synthetic */ c(com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.b bVar, int i) {
        this.f212756a = i;
        this.f212757b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        int i = this.f212756a;
        com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.b bVar = this.f212757b;
        switch (i) {
            case 0:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Set setB = y0.b(new Pair("CobrandedCardsPostActivationFlowModel", "Error while cobrandedCardsPlansInteractor.observeProductArticleId"));
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, setB);
                oki.h.u2(bVar, bVar.f82548s, CobrandedCardsPostActivationFlowContract$Step.CardSelectionDashboard.f82540a, null, 6);
                return Boolean.TRUE;
            default:
                k result = (k) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof m) {
                    IllegalStateException illegalStateException = new IllegalStateException("NeedToSelectCardType cannot be output of CobrandedCardsTypeSelectionScreen");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else if (result instanceof n) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("OpenAdditionalValue cannot be output of CobrandedCardsTypeSelectionScreen");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                } else if (result instanceof j) {
                    j jVar = (j) result;
                    bVar.J2(jVar.f21896a, jVar.f21897b);
                } else if (Intrinsics.f(result, k.a.f21898a)) {
                    bVar.I2();
                } else {
                    if (!(result instanceof l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hx7.e.n(new IllegalStateException("Downgrade must not be available in Post-Activation flow for CobrandedCards"));
                    bVar.I2();
                }
                return Unit.f186387a;
        }
    }
}
