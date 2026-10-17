package ypb;

import aii.u;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import rpb.m;
import rpb.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f315808w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, o oVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f315808w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f315808w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            rpb.d dVar = eVar.f315810b;
            ZoomTransitionAnimation.Widgets widgetsB = com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE);
            this.u = 1;
            ((rpb.a) dVar).getClass();
            o.Companion.getClass();
            AnalyticsFeatureConfig.SavingsAnalyticsDetails.Destination destination = new AnalyticsFeatureConfig.SavingsAnalyticsDetails.Destination(yld.d.NET_BALANCE, m.a(this.f315808w), widgetsB);
            if (destination == aVar) {
                return aVar;
            }
            obj2 = destination;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        eVar.f315811c.b(new fc7.d((u) obj2));
        return Unit.f186387a;
    }
}
