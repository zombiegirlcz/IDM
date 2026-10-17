package y6b;

import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.hyper_text.ui.HyperTextClickData;
import com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.billing.CobrandedCardsBillingScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y20.a1;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsBillingScreen f311250w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CobrandedCardsBillingScreen cobrandedCardsBillingScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f311250w = cobrandedCardsBillingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f311250w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f311250w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((r5b.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((HyperTextClickData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CobrandedCardsBillingScreen cobrandedCardsBillingScreen = this.f311250w;
        switch (i) {
            case 0:
                r5b.c actionType = (r5b.c) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) cobrandedCardsBillingScreen.R2();
                kVar.getClass();
                Intrinsics.checkNotNullParameter(actionType, "actionType");
                if (i.f311254a[actionType.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                kVar.C1(CobrandedCardsFeatureConfig.PlanSwitchDestination.f82505a);
                return Unit.f186387a;
            default:
                HyperTextClickData clickData = (HyperTextClickData) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar2 = (k) cobrandedCardsBillingScreen.R2();
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                HyperTextTarget hyperTextTarget = clickData.f74762a;
                if (hyperTextTarget instanceof HyperTextTarget.Link) {
                    kVar2.l2(new a1(kVar2, hyperTextTarget, null, 8), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }
}
