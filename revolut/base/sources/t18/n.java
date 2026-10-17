package t18;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreen;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.StackDestination;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AllInsightsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(AllInsightsScreen allInsightsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = allInsightsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((NewsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        NewsDelegate.Model model = (NewsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b bVar = (com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b) pVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        if ((bVar.o.f76427a instanceof FeedFilter.ByRef) && (obj3 instanceof x08.f)) {
            x08.f fVar = (x08.f) obj3;
            InstrumentTicker instrumentTicker = fVar.f.f301531c;
            if (instrumentTicker == null) {
                hx7.e.n(new IllegalStateException(p.a.p("Smart notification ", fVar.f301532a, " missing InstrumentTicker information")));
            } else {
                oki.h.v2(bVar.f76438w, new AllInsightsScreenContract$ModalStep.ShowInsight(instrumentTicker, new TextClause(fVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(fVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        } else {
            StackDestination stackDestinationA = bVar.f76435r.a(obj3);
            if (stackDestinationA != null) {
                bVar.C1(stackDestinationA);
            }
        }
        return Unit.f186387a;
    }
}
