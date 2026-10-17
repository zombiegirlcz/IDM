package v2e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreen;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreBrandDetailRedeemScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(StoreBrandDetailRedeemScreen storeBrandDetailRedeemScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeBrandDetailRedeemScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.d();
        Intrinsics.h(model);
        i0 i0Var = (i0) vVarE3;
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "STORE_BRAND_DETAIL_GIFT_CARDS_BANNER_ID")) {
            Object obj3 = model.u;
            m2e.b bVar = obj3 instanceof m2e.b ? (m2e.b) obj3 : null;
            if (bVar != null) {
                Object obj4 = bVar.f201957a;
                String str = obj4 instanceof String ? (String) obj4 : null;
                if (str != null) {
                    i0Var.z.Z2(bVar);
                    i0Var.C1(new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails(str, null, null, RevPointsGiftcardsDestination.PostPurchaseBackBehavior.RETURN_TO_PREVIOUS, 6), com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE)));
                }
            }
        }
        return Unit.f186387a;
    }
}
