package g4b;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.retail.cfd.impl.screens.positions.CfdPositionsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CfdPositionsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CfdPositionsController cfdPositionsController, Continuation continuation) {
        super(2, continuation);
        this.v = cfdPositionsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.retail.cfd.impl.screens.positions.a aVar2 = (com.revolut.feature.retail.cfd.impl.screens.positions.a) hVarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        if (obj3 instanceof p) {
            aVar2.H2(aVar2.f82270t, new av8.o(obj3, 20));
        }
        return Unit.f186387a;
    }
}
