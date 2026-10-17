package sqd;

import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewController;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IncomeSorterReviewController f265054w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(IncomeSorterReviewController incomeSorterReviewController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f265054w = incomeSorterReviewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d0 d0Var = new d0(this.f265054w, continuation, 0);
                d0Var.v = obj2;
                return d0Var;
            default:
                d0 d0Var2 = new d0(this.f265054w, continuation, 1);
                d0Var2.v = obj2;
                return d0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d0) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        IncomeSorterReviewController incomeSorterReviewController = this.f265054w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj3 = aVar.d;
                Continuation continuation = null;
                dqd.o disclaimer = obj3 instanceof dqd.o ? (dqd.o) obj3 : null;
                if (disclaimer != null) {
                    com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i iVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) incomeSorterReviewController.d();
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
                    if (disclaimer instanceof dqd.n) {
                        iVar.C1(u0.c(new WebViewFeatureConfig(((dqd.n) disclaimer).f116952a, null, 0, false, false, false, 130958)));
                    } else if (disclaimer instanceof dqd.m) {
                        iVar.n2(new sbb.w(iVar, (dqd.m) disclaimer, continuation, 23), new whi.b(6));
                    } else {
                        if (!(disclaimer instanceof dqd.l)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.v2(iVar.A, IncomeSorterReviewContract$ModalStep.CryptoLearnMoreDialog.f87841a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        Unit unit = Unit.f186387a;
                    }
                }
                return Unit.f186387a;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarE3 = incomeSorterReviewController.d();
                Intrinsics.h(clickData);
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i iVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) eVarE3;
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) iVar2.f87870w).d(clickData);
                if (cryptoFcaRisksDestinationD != null) {
                    iVar2.C1(cryptoFcaRisksDestinationD);
                }
                return Unit.f186387a;
        }
    }
}
