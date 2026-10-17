package v88;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import sf8.m;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ BaseDraggableWidgetDelegate.a u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ HomeFeedWidgetContext.Junior f286726w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BaseDraggableWidgetDelegate.a aVar, f fVar, HomeFeedWidgetContext.Junior junior, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
        this.v = fVar;
        this.f286726w = junior;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, this.v, this.f286726w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        BaseDraggableWidgetDelegate.a aVar2 = this.u;
        boolean zF = Intrinsics.f(((i3) aVar2).f55382c.f53228a, "MAIN_POCKET_LIST_ID");
        HomeFeedWidgetContext.Junior junior = this.f286726w;
        f fVar = this.v;
        if (!zF || (((i3) aVar2).f55382c.u instanceof m)) {
            fVar.f286728a.b(new fc7.c("TotalWealthList", junior, aVar2));
        } else {
            fVar.f286728a.b(fc7.e.f133653a);
        }
        return Unit.f186387a;
    }
}
