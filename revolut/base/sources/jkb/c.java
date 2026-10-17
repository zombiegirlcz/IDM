package jkb;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ d u;
    public final /* synthetic */ HomeFeedWidgetContext.Savings v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BaseDraggableWidgetDelegate.a f175144w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, HomeFeedWidgetContext.Savings savings, BaseDraggableWidgetDelegate.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = dVar;
        this.v = savings;
        this.f175144w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, this.v, this.f175144w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.u.f175145a.b(new fc7.c("SavingsChallengeGoal", this.v, this.f175144w));
        return Unit.f186387a;
    }
}
