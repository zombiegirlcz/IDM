package b1b;

import com.revolut.feature.retail.advanced_charts.impl.screen.indicators.ChartsIndicatorScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChartsIndicatorScreen f11763w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ChartsIndicatorScreen chartsIndicatorScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f11763w = chartsIndicatorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f11763w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f11763w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((d1b.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ChartsIndicatorScreen chartsIndicatorScreen = this.f11763w;
        switch (i) {
            case 0:
                d1b.c indicator = (d1b.c) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) chartsIndicatorScreen.N.getValue();
                Intrinsics.h(indicator);
                kVar.getClass();
                Intrinsics.checkNotNullParameter(indicator, "indicator");
                kVar.H2(kVar.f11776s, new as9.a(kVar, indicator, 16));
                break;
            default:
                String query = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar2 = (k) chartsIndicatorScreen.N.getValue();
                Intrinsics.h(query);
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                ((MutableStateFlow) kVar2.f11773p.getValue()).setValue(query);
                break;
        }
        return Unit.f186387a;
    }
}
