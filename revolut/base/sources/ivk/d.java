package ivk;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.StackDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.StockDetailsFeedController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.StockDetailsFeedControllerContract$ModalStep;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StockDetailsFeedController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(StockDetailsFeedController stockDetailsFeedController, Continuation continuation) {
        super(2, continuation);
        this.v = stockDetailsFeedController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((NewsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NewsDelegate.Model model = (NewsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVar = (f) this.v.N.getValue();
        Intrinsics.h(model);
        com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a aVar2 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a) fVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        if (obj3 instanceof x08.f) {
            x08.f fVar2 = (x08.f) obj3;
            InstrumentTicker instrumentTicker = fVar2.f.f301531c;
            if (instrumentTicker != null) {
                oki.h.v2(aVar2.f103958w, new StockDetailsFeedControllerContract$ModalStep.ShowInsight(instrumentTicker, new TextClause(fVar2.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(fVar2.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        } else {
            StackDestination stackDestinationA = aVar2.f103955r.a(obj3);
            if (stackDestinationA != null) {
                aVar2.C1(stackDestinationA);
            }
        }
        return Unit.f186387a;
    }
}
