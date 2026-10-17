package nk4;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.credit.autopay.models.repayment.RepresentationFromStyle;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$ModalStep;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayScreen;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.a;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ConfirmAutopayScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ConfirmAutopayScreen confirmAutopayScreen, Continuation continuation) {
        super(2, continuation);
        this.v = confirmAutopayScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVarD = this.v.d();
        yx4.a aVar2 = yx4.b.Companion;
        Intrinsics.h(model);
        aVar2.getClass();
        yx4.b event = yx4.a.a(model);
        com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b bVar = (com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b) bVarD;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.f317545b instanceof RepresentationFromStyle) {
            bVar.C2(a.b.f68638a);
        } else {
            String str = event.f317544a;
            if (Intrinsics.f(str, "id_repayment_day")) {
                oki.h.v2(bVar.f68644t, ConfirmAutopayContract$ModalStep.RepaymentDayInfoDialog.f68629a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            } else if (Intrinsics.f(str, "id_add_backup_card")) {
                bVar.C2(a.c.f68639a);
            }
        }
        return Unit.f186387a;
    }
}
