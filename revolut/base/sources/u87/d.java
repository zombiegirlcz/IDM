package u87;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IndexOverviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(IndexOverviewScreen indexOverviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = indexOverviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((TrendViewDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TrendViewDelegate.a trendViewState = (TrendViewDelegate.a) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVar = (f) this.v.V.getValue();
        Intrinsics.h(trendViewState);
        q qVar = (q) fVar;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(trendViewState, "trendViewState");
        qVar.H2(qVar.f278142x, new g6f.k(trendViewState, 3));
        return Unit.f186387a;
    }
}
