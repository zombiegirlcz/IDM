package v88;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ BaseDraggableWidgetDelegate.a u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ HomeFeedWidgetContext.Junior f286727w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BaseDraggableWidgetDelegate.a aVar, f fVar, HomeFeedWidgetContext.Junior junior, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
        this.v = fVar;
        this.f286727w = junior;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, this.v, this.f286727w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        BaseDraggableWidgetDelegate.a aVar2 = this.u;
        this.v.f286728a.b(new fc7.c(((com.revolut.core.ui_kit.delegates.widgets.i) aVar2).f55375c instanceof RowsWidgetDelegate.Model ? "TotalWealthList" : "TotalWealthListSmall", this.f286727w, aVar2));
        return Unit.f186387a;
    }
}
