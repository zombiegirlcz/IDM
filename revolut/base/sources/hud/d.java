package hud;

import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.feature.staking.impl.confirmation.StakingConfirmationController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StakingConfirmationController f155623w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(StakingConfirmationController stakingConfirmationController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155623w = stakingConfirmationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f155623w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f155623w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f155623w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        StakingConfirmationController stakingConfirmationController = this.f155623w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE3 = stakingConfirmationController.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.staking.impl.confirmation.a aVar2 = (com.revolut.feature.staking.impl.confirmation.a) hVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) aVar2.f88122y).d(clickData);
                if (cryptoFcaRisksDestinationD != null) {
                    aVar2.C1(u0.b(u0.f(cryptoFcaRisksDestinationD)));
                }
                break;
            case 1:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(aVar3.f275445a, "CRYPTO_PRICE_EXPLANATION_TEXT_ID")) {
                    com.revolut.feature.staking.impl.confirmation.a aVar5 = (com.revolut.feature.staking.impl.confirmation.a) stakingConfirmationController.R2();
                    aVar5.getClass();
                    aVar5.n2(new k(aVar5, null), new whi.b(6));
                }
                break;
            default:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE32 = stakingConfirmationController.R2();
                Intrinsics.h(clickData2);
                com.revolut.feature.staking.impl.confirmation.a aVar7 = (com.revolut.feature.staking.impl.confirmation.a) hVarE32;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                aVar7.n2(new hg0.n(aVar7, clickData2, continuation, 28), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
