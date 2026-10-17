package o4h;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.InvestmentsController;
import com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.InvestmentsControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvestmentsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InvestmentsController investmentsController, Continuation continuation) {
        super(2, continuation);
        this.v = investmentsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.Q.getValue();
        Intrinsics.h(model);
        com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.a aVar2 = (com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.a) dVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.o;
        f fVar = obj3 instanceof f ? (f) obj3 : null;
        if (Intrinsics.f(fVar, f.f222275a)) {
            oki.h.v2(aVar2.f95424t, InvestmentsControllerContract$ModalStep.InvestmentsAvgPriceStep.f95415a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else if (fVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
