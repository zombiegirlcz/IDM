package b4b;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownTarget;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormController;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CfdOrderFormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CfdOrderFormController cfdOrderFormController, Continuation continuation) {
        super(2, continuation);
        this.v = cfdOrderFormController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarK3 = this.v.k3();
        Intrinsics.h(model);
        com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar2 = (com.revolut.feature.retail.cfd.impl.screens.order.v2.a) qVarK3;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.K;
        Intrinsics.checkNotNullParameter(model, "model");
        bw0.m mVar = model.f;
        Object obj3 = mVar != null ? mVar.e : null;
        boolean z = obj3 instanceof d4b.d;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            p pVar = aVar2.o;
            String str = pVar.f12237b.f214596b;
            cli.y yVar = aVar2.J;
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            oki.h.v2(aVar3, new CfdOrderFormControllerContract$ModalStep.ExposureBreakdown(str, ((n) j2Var.getValue()).f12227a.f82171c, pVar.f12236a, new CfdExposureBreakdownTarget.Order(u2b.c.a(((n) j2Var2.getValue()).f12227a.f82170b, new ej0.b(((n) j2Var2.getValue()).f12227a.e, pVar.f12237b.i)))), bottom_dialog);
        } else if (obj3 instanceof a4b.m) {
            oki.h.v2(aVar3, CfdOrderFormControllerContract$ModalStep.ReduceOnlyInfo.f82242a, bottom_dialog);
        }
        return Unit.f186387a;
    }
}
