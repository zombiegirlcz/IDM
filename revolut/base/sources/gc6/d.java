package gc6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.spare_change.SpareChangeContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.spare_change.SpareChangeScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.overview.tab.contributions.ContributionsTabScreen;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import gc6.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ContributionsTabScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ContributionsTabScreen contributionsTabScreen, Continuation continuation) {
        super(2, continuation);
        this.v = contributionsTabScreen;
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

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVar = (l) this.v.Z.getValue();
        Intrinsics.h(model);
        o oVar = (o) lVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof a3) {
            oVar.C1(new BridgeDestination(oVar.f142362r.a(ofm.q.P((a3) obj3))));
        } else if (obj3 instanceof RevPointsTransaction) {
            oVar.C1(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenRevPointsTransactionDetails((RevPointsTransaction) obj3, null, false, null, true, 14)));
        } else if (obj3 instanceof i) {
            oVar.C1(new BridgeDestination(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(((i) obj3).f142355b.f249314a.f160150a, false, null, 6))));
        } else if (obj3 instanceof g) {
            g gVar = (g) obj3;
            ba6.l lVar2 = gVar.f142349a;
            yji.l.j2(oVar, new SpareChangeScreen(new SpareChangeContract$InputData(lVar2.f13938a, gVar.f142350b)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        } else if (Intrinsics.f(model.f53228a, "MAKE_YOUR_FIRST_DONATION_ITEM_ID")) {
            oVar.v2(j.a.f142356a);
        }
        return Unit.f186387a;
    }
}
