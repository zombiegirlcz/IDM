package u95;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.credit.overdraft.impl.ui.details.OverdraftDetailsScreen;
import com.revolut.feature.credit.overdraft.impl.ui.details.OverdraftDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OverdraftDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(OverdraftDetailsScreen overdraftDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = overdraftDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.kompot.navigable.vc.modal.a aVar2 = ((com.revolut.feature.credit.overdraft.impl.ui.details.a) iVarD3).f70644s;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51832a;
        boolean zF = Intrinsics.f(str, "ID_APR");
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (zF) {
            oki.h.v2(aVar2, OverdraftDetailsScreenContract$ModalStep.AprInfo.f70638a, bottom_dialog);
        } else if (Intrinsics.f(str, "ID_CHARGES")) {
            oki.h.v2(aVar2, OverdraftDetailsScreenContract$ModalStep.MonthCharges.f70639a, bottom_dialog);
        }
        return Unit.f186387a;
    }
}
