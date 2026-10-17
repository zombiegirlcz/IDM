package bvb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.feature.rev_points.buying.impl.ui.screen.main.RevPointsBuyingControllerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsBuyingControllerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RevPointsBuyingControllerScreen revPointsBuyingControllerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsBuyingControllerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarM3 = this.v.d();
        Intrinsics.h(model);
        r rVar = (r) kVarM3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        RowDelegate.Model.c cVar = model.k;
        Intrinsics.i(cVar, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.RowDelegate.Model.Value.Switch");
        rVar.H2(rVar.f19008x, new a6j.a((rub.j) model.u, !((vf) cVar).f54880a, 10));
        return Unit.f186387a;
    }
}
