package ivk;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.invest.smart_notifications.api.domain.AllInsightsNotificationsDestination;
import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsFilter;
import com.revolut.retail.feature.marketnews.api.navigation.destination.WealthAllNewsDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.StockDetailsFeedController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.StockDetailsFeedControllerContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StockDetailsFeedController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(StockDetailsFeedController stockDetailsFeedController, Continuation continuation) {
        super(2, continuation);
        this.v = stockDetailsFeedController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVar = (f) this.v.N.getValue();
        Intrinsics.h(model);
        com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a aVar2 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a) fVar;
        StockDetailsFeedControllerContract$InputData stockDetailsFeedControllerContract$InputData = aVar2.u;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f52715m;
        if (obj3 instanceof i) {
            aVar2.C1(new AllInsightsNotificationsDestination(new FeedFilter.ByRef(stockDetailsFeedControllerContract$InputData.f103949a)));
        } else if (obj3 instanceof h) {
            aVar2.C1(new WealthAllNewsDestination(new WealthNewsFilter.ByRef(stockDetailsFeedControllerContract$InputData.f103949a)));
        } else {
            Unit unit = Unit.f186387a;
        }
        return Unit.f186387a;
    }
}
