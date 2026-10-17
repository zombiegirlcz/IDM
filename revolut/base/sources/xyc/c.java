package xyc;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SotFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SotFlow sotFlow, Continuation continuation) {
        super(2, continuation);
        this.v = sotFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.O.getValue();
        Intrinsics.h(model);
        com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar = (com.revolut.feature.selfserve.sot.impl.ui.flow.e) dVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        j60.a.v(eVar.f85944s, false, null, 3);
        return Unit.f186387a;
    }
}
