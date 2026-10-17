package m88;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ BaseDraggableWidgetDelegate.a u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ HomeFeedWidgetContext.Junior f203453w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BaseDraggableWidgetDelegate.a aVar, h hVar, HomeFeedWidgetContext.Junior junior, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
        this.v = hVar;
        this.f203453w = junior;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, this.v, this.f203453w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        BaseDraggableWidgetDelegate.a aVar2 = this.u;
        if (Intrinsics.f(((i3) aVar2).f55382c.f53228a, "WIDGET_ITEM_ID_ALLOWANCE")) {
            this.v.f203454a.b(new fc7.c("AutomationsList", this.f203453w, aVar2));
        }
        return Unit.f186387a;
    }
}
