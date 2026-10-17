package ht2;

import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import com.revolut.core.ui_kit.delegates.PromotionalMediumTileDelegate;
import com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.BaseReferralWithIncentiveOverviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BaseReferralWithIncentiveOverviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BaseReferralWithIncentiveOverviewScreen baseReferralWithIncentiveOverviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = baseReferralWithIncentiveOverviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((PromotionalMediumTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PromotionalMediumTileDelegate.Model model = (PromotionalMediumTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarD3 = this.v.R2();
        String listId = model.f53039a;
        Object obj3 = model.i;
        w wVar = (w) nVarD3;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj3 instanceof RewardTargetAccount) {
            wVar.C2(new m((RewardTargetAccount) obj3));
        }
        return Unit.f186387a;
    }
}
