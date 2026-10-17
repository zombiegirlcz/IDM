package cdh;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.d2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import te0.r;
import xzg.n0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ m u;
    public final /* synthetic */ BaseDraggableWidgetDelegate.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, BaseDraggableWidgetDelegate.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = mVar;
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        m mVar = this.u;
        n nVar = mVar.d;
        w0h.d assetType = mVar.f23262b.h();
        d2 d2Var = (d2) this.v;
        String widgetId = d2Var.f55326b;
        n0 selectedFilter = Intrinsics.f(d2Var.f55327c, "top_movers.tab_top_losers") ? n0.LOSERS : n0.GAINERS;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
        ne0.d dVar = nVar.f23264a;
        r rVar = (r) dVar.get(n.a(assetType, widgetId));
        if (rVar != null) {
            rVar.set(selectedFilter);
        } else {
            dVar.f(n.a(assetType, widgetId), new r(selectedFilter));
        }
        return Unit.f186387a;
    }
}
