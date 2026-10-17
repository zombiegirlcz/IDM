package e4b;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.cfd.impl.screens.overnight_fee.CfdOvernightFeeBreakdownController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CfdOvernightFeeBreakdownController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CfdOvernightFeeBreakdownController cfdOvernightFeeBreakdownController, Continuation continuation) {
        super(2, continuation);
        this.v = cfdOvernightFeeBreakdownController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        d dVar = (d) this.v.Q.getValue();
        Intrinsics.h(model);
        q qVar = (q) dVar;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.k instanceof j) {
            qVar.n2(new p(qVar, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
