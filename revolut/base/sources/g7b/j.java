package g7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBenefitsSectionAction;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoCard;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardInfo;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsPlanHubScreen f141151w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(CobrandedCardsPlanHubScreen cobrandedCardsPlanHubScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f141151w = cobrandedCardsPlanHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f141151w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(this.f141151w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            case 2:
                j jVar3 = new j(this.f141151w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
            default:
                j jVar4 = new j(this.f141151w, continuation, 3);
                jVar4.v = obj2;
                return jVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((CobrandedCardsPlanHubInfoCard) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((CobrandedCardsPlanHubInfoRewardInfo) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((CobrandedCardsPlanHubInfoBenefitsSectionAction) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CobrandedCardsPlanHubScreen cobrandedCardsPlanHubScreen = this.f141151w;
        switch (i) {
            case 0:
                CobrandedCardsPlanHubInfoCard cardInfo = (CobrandedCardsPlanHubInfoCard) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e eVar = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) cobrandedCardsPlanHubScreen.d3();
                eVar.getClass();
                Intrinsics.checkNotNullParameter(cardInfo, "cardInfo");
                eVar.I2(cardInfo.f82369c);
                return Unit.f186387a;
            case 1:
                CobrandedCardsPlanHubInfoRewardInfo rewardInfo = (CobrandedCardsPlanHubInfoRewardInfo) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e eVar2 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) cobrandedCardsPlanHubScreen.d3();
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(rewardInfo, "rewardInfo");
                oki.h.v2(eVar2.f82591x, new CobrandedCardsPlanHubScreenContract$ModalStep.RewardInfo(rewardInfo), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            case 2:
                String deeplink = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e eVar3 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) cobrandedCardsPlanHubScreen.d3();
                eVar3.getClass();
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                eVar3.I2(deeplink);
                return Unit.f186387a;
            default:
                CobrandedCardsPlanHubInfoBenefitsSectionAction action = (CobrandedCardsPlanHubInfoBenefitsSectionAction) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e eVar4 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) cobrandedCardsPlanHubScreen.d3();
                eVar4.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                if (!(action instanceof CobrandedCardsPlanHubInfoBenefitsSectionAction.Url)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar4.I2(((CobrandedCardsPlanHubInfoBenefitsSectionAction.Url) action).f82363c);
                return Unit.f186387a;
        }
    }
}
