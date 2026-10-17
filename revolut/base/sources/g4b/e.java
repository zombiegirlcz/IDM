package g4b;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.retail.cfd.impl.screens.positions.CfdPositionsController;
import com.revolut.feature.retail.cfd.impl.screens.positions.CfdPositionsControllerContract$Modal;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CfdPositionsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CfdPositionsController cfdPositionsController, Continuation continuation) {
        super(2, continuation);
        this.v = cfdPositionsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y49.b bVar;
        y49.e eVar;
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.kompot.navigable.vc.modal.a aVar2 = ((com.revolut.feature.retail.cfd.impl.screens.positions.a) hVarR2).u;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f51787l;
        boolean z = obj3 instanceof m;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            m mVar = (m) obj3;
            oki.h.v2(aVar2, new CfdPositionsControllerContract$Modal.ExposureBreakdown(mVar.f140449a, mVar.f140450b, mVar.f140451c), bottom_dialog);
        } else if (obj3 instanceof o) {
            k kVar = ((o) obj3).f140455a;
            String str = null;
            j jVar = kVar instanceof j ? (j) kVar : null;
            if (jVar != null && (bVar = jVar.f140441a) != null && (eVar = bVar.f310833b) != null) {
                str = eVar.f310837a;
            }
            oki.h.v2(aVar2, new CfdPositionsControllerContract$Modal.MarginBreakdown(str, kVar.u(), kVar.b()), bottom_dialog);
        }
        return Unit.f186387a;
    }
}
