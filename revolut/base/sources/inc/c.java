package inc;

import com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.PortfolioStrategyInformationScreen;
import com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.PortfolioStrategyInformationScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import g7b.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import poc.d;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PortfolioStrategyInformationScreen f162773w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PortfolioStrategyInformationScreen portfolioStrategyInformationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f162773w = portfolioStrategyInformationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f162773w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f162773w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f162773w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((poc.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((poc.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PortfolioStrategyInformationScreen portfolioStrategyInformationScreen = this.f162773w;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarE3 = portfolioStrategyInformationScreen.e3();
                Intrinsics.h(bool);
                com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.a aVar2 = (com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.a) gVarE3;
                aVar2.H2(aVar2.u, new q(bool.booleanValue(), 25));
                return Unit.f186387a;
            case 1:
                poc.d parcel = (poc.d) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarE32 = portfolioStrategyInformationScreen.e3();
                Intrinsics.h(parcel);
                poc.b bVar = ((com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.a) gVarE32).f85176s;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel instanceof poc.c) {
                    bVar.a((poc.c) parcel);
                } else {
                    if (!(parcel instanceof d.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter((d.a) parcel, "parcel");
                    j60.a.v(bVar.f237958a, false, null, 3);
                }
                return Unit.f186387a;
            default:
                poc.c parcel2 = (poc.c) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarE33 = portfolioStrategyInformationScreen.e3();
                Intrinsics.h(parcel2);
                com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.a aVar5 = (com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.a) gVarE33;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                oki.h.v2(aVar5.v, new PortfolioStrategyInformationScreenContract$ModalStep.RiskMetricsStep(parcel2.f237959a), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                return Unit.f186387a;
        }
    }
}
