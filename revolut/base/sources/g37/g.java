package g37;

import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.TaxHubScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TaxHubScreen taxHubScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CalendarRowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CalendarRowDelegate.Model model = (CalendarRowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.R2();
        Object obj3 = model.u;
        com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e eVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e) rVarE3;
        eVar.getClass();
        if (obj3 instanceof TaxHubCalendarEvent) {
            eVar.C2(new m((TaxHubCalendarEvent) obj3));
        }
        return Unit.f186387a;
    }
}
