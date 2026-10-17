package j2f;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.voucher.TradeRevPointsAgentAllVouchersScreen;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TradeRevPointsAgentAllVouchersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TradeRevPointsAgentAllVouchersScreen tradeRevPointsAgentAllVouchersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tradeRevPointsAgentAllVouchersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVar = (k) this.v.Q.getValue();
        Intrinsics.h(model);
        o oVar = (o) kVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (d0.J(str, "AVAILABLE_VOUCHERS_PREFIX_LIST_ID", false) || d0.J(str, "USED_VOUCHERS_PREFIX_LIST_ID", false)) {
            Object obj3 = model.u;
            if (obj3 instanceof String) {
                oVar.C1(new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails(null, (String) obj3, null, null, 13), TransitionAnimation.SLIDE_END_TO_START.f98395a));
            }
        }
        return Unit.f186387a;
    }
}
