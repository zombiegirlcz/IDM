package j7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardInfo;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardSectionInfo;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.CobrandedCardsPlanHubRewardsScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.CobrandedCardsPlanHubRewardsScreenContract$ModalStep;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.CobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsPlanHubRewardsScreen f171892w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CobrandedCardsPlanHubRewardsScreen cobrandedCardsPlanHubRewardsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f171892w = cobrandedCardsPlanHubRewardsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f171892w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f171892w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            case 2:
                h hVar3 = new h(this.f171892w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
            default:
                h hVar4 = new h(this.f171892w, continuation, 3);
                hVar4.v = obj2;
                return hVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((CobrandedCardsPlanHubInfoRewardSectionInfo) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((CobrandedCardsPlanHubInfoRewardInfo) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((h) create((CobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        CobrandedCardsPlanHubRewardsScreen cobrandedCardsPlanHubRewardsScreen = this.f171892w;
        switch (i) {
            case 0:
                CobrandedCardsPlanHubInfoRewardSectionInfo info = (CobrandedCardsPlanHubInfoRewardSectionInfo) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a aVar2 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a) cobrandedCardsPlanHubRewardsScreen.R2();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(info, "info");
                oki.h.v2(aVar2.f82599r, new CobrandedCardsPlanHubRewardsScreenContract$ModalStep.SectionInfo(info), bottom_dialog);
                break;
            case 1:
                CobrandedCardsPlanHubInfoRewardInfo rewardInfo = (CobrandedCardsPlanHubInfoRewardInfo) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a aVar4 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a) cobrandedCardsPlanHubRewardsScreen.R2();
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(rewardInfo, "rewardInfo");
                oki.h.v2(aVar4.f82599r, new CobrandedCardsPlanHubRewardsScreenContract$ModalStep.RewardInfo(rewardInfo), bottom_dialog);
                break;
            case 2:
                CobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel cobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel = (CobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarD3 = cobrandedCardsPlanHubRewardsScreen.R2();
                String milestoneRewardCode = cobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel.f82596a;
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a aVar6 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a) jVarD3;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(milestoneRewardCode, "milestoneRewardCode");
                oki.h.v2(aVar6.f82599r, new CobrandedCardsPlanHubRewardsScreenContract$ModalStep.RewardSelection(milestoneRewardCode), bottom_dialog);
                break;
            default:
                String sectionTitle = (String) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a aVar8 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a) cobrandedCardsPlanHubRewardsScreen.R2();
                aVar8.getClass();
                Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
                aVar8.H2(aVar8.f82598q, new ik3.a(sectionTitle, 26));
                break;
        }
        return Unit.f186387a;
    }
}
