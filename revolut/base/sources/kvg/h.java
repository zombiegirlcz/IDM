package kvg;

import aii.r;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.analytics.benchmark.ui.PerformanceBenchmarkSelectionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PerformanceBenchmarkSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PerformanceBenchmarkSelectionController performanceBenchmarkSelectionController, Continuation continuation) {
        super(2, continuation);
        this.v = performanceBenchmarkSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        a aVar2 = (a) this.v.T.getValue();
        Intrinsics.h(model);
        i iVar = (i) aVar2;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        r eVar = obj3 instanceof lwg.a ? new e((lwg.a) obj3) : obj3 instanceof c ? d.f190116a : null;
        if (eVar != null) {
            iVar.C2(eVar);
        }
        return Unit.f186387a;
    }
}
