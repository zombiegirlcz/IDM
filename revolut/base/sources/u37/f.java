package u37;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubCreateProfileScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TaxHubCreateProfileScreen taxHubCreateProfileScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubCreateProfileScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        String listId = model.f52580a;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = ((com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a) kVarE3).f74352y;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (iHashCode != -880194376) {
            if (iHashCode != -349384944) {
                if (iHashCode == 96832403 && listId.equals("LIST_ID_CLOSING_MONTH")) {
                    oki.h.v2(aVar2, TaxHubCreateProfileScreenContract$ModalStep.ClosingMonthPicker.f74341a, bottom_dialog);
                }
            } else if (listId.equals("LIST_ID_NEXT_PAYMENT_DATE")) {
                oki.h.v2(aVar2, TaxHubCreateProfileScreenContract$ModalStep.NextPaymentDatePicker.f74342a, bottom_dialog);
            }
        } else if (listId.equals("LIST_ID_TAX_PERIOD")) {
            oki.h.v2(aVar2, TaxHubCreateProfileScreenContract$ModalStep.TaxPeriodPicker.f74344a, bottom_dialog);
        }
        return Unit.f186387a;
    }
}
