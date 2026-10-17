package n2d;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        m1d.a aVar = this.v.d;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.u;
        if (obj3 instanceof AlertItem) {
            aVar.c3((AlertItem) obj3);
        } else if ((obj3 instanceof AlertsWidgetContext) && Intrinsics.f(model.f53228a, "ALERTS_WIDGET_ERROR_STATE")) {
            aVar.d3((AlertsWidgetContext) obj3);
        }
        return Unit.f186387a;
    }
}
