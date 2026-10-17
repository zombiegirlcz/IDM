package t57;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.freelancer_widgets.api.FreelancerWidgetContext;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import fc7.c;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ b u;
    public final /* synthetic */ FreelancerWidgetContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BaseDraggableWidgetDelegate.a f268043w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, FreelancerWidgetContext freelancerWidgetContext, BaseDraggableWidgetDelegate.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = bVar;
        this.v = freelancerWidgetContext;
        this.f268043w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, this.v, this.f268043w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = this.u;
        uc7.a aVar2 = bVar.f268046c;
        String str = bVar.f268044a;
        HomeFeedWidgetContext.Pro.Companion companion = HomeFeedWidgetContext.Pro.INSTANCE;
        String accountId = this.v.getAccountId();
        companion.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        aVar2.b(new c(str, new HomeFeedWidgetContext.Pro(null, accountId, 1, null), this.f268043w));
        return Unit.f186387a;
    }
}
