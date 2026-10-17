package x18;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.SmartFeedScreen;
import com.revolut.feature.wealth.ui.api.navigation.account.WealthAccountsGetStartedOnboardingDestination;
import com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SmartFeedScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SmartFeedScreen smartFeedScreen, Continuation continuation) {
        super(2, continuation);
        this.v = smartFeedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b bVar = (com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b) pVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        u uVar = obj3 instanceof u ? (u) obj3 : null;
        if (Intrinsics.f(uVar, t.f302344a)) {
            bVar.C1(new WealthTradeRedesignDestination(null));
        } else if (Intrinsics.f(uVar, s.f302343a)) {
            bVar.C1(new WealthAccountsGetStartedOnboardingDestination(zhm.u.c(WealthAccountType.SECURITIES)));
        } else {
            Unit unit = Unit.f186387a;
        }
        return Unit.f186387a;
    }
}
