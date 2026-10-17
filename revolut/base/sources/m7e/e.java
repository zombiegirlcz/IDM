package m7e;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ f u;
    public final /* synthetic */ HomeFeedWidgetContext.GroupPocket v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BaseDraggableWidgetDelegate.a f203402w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, HomeFeedWidgetContext.GroupPocket groupPocket, BaseDraggableWidgetDelegate.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = fVar;
        this.v = groupPocket;
        this.f203402w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, this.v, this.f203402w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.u.f203403a.b(new fc7.c("GroupPocketMembersList", this.v, this.f203402w));
        return Unit.f186387a;
    }
}
