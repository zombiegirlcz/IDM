package j94;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.DebtDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.DebtDetailsControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import my3.n;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DebtDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DebtDetailsController debtDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = debtDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarE3 = this.v.R2();
        String listId = model.f52580a;
        com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a aVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a) gVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Iterator it8 = ((f) ((j2) aVar2.f67509t.f22677a).getValue()).f172280a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((my3.o) next).getId(), listId)) {
                break;
            }
        }
        n nVar = next instanceof n ? (n) next : null;
        if (nVar != null) {
            oki.h.v2(aVar2.u, new DebtDetailsControllerContract$ModalStep.DropdownPicker(nVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
