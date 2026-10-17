package vsh;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.widgets.impl.ui.screen.catalgoue.WidgetCatalogueScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetCatalogueScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WidgetCatalogueScreen widgetCatalogueScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetCatalogueScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((BaseDraggableWidgetDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? r06 = this.v.X;
        BaseDraggableWidgetDelegate.a aVar = (BaseDraggableWidgetDelegate.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (aVar instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
            ((m) ((f) r06.getValue())).y2(((com.revolut.core.ui_kit.delegates.widgets.i) aVar).f55375c);
        } else if (aVar instanceof com.revolut.core.ui_kit.delegates.widgets.j) {
            ((m) ((f) r06.getValue())).y2(((com.revolut.core.ui_kit.delegates.widgets.j) aVar).f55386c);
        }
        return Unit.f186387a;
    }
}
