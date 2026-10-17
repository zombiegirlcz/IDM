package o9c;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.CardPaymentAvailability;
import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import com.revolut.feature.revolutpay.impl.ui.payment_schedule.PaymentScheduleContract$InputData;
import com.revolut.feature.revolutpay.impl.ui.payment_schedule.PaymentScheduleScreen;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreen;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$ModalStep;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.extension.SummaryAccountPickerExtension$AccountPickerConfiguration;
import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodControllerDescriptor$InputData;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevolutPaySummaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RevolutPaySummaryScreen revolutPaySummaryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revolutPaySummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        t6c.k kVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarE3 = this.v.R2();
        String listId = model.f53228a;
        com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) uVarE3;
        cli.y yVar = fVar.M;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        if (iHashCode != -1156254352) {
            if (iHashCode != -199295182) {
                if (iHashCode == 170732632 && listId.equals("PAY_LATER_HEADER_ITEM_LIST_ID")) {
                    q9c.b0 b0Var = (q9c.b0) fVar.C;
                    vki.a aVar2 = b0Var.o;
                    t6c.f fVar2 = ((q9c.s) ((j2) aVar2.f22677a).getValue()).f243877a;
                    List list = (fVar2 == null || (kVar = fVar2.f268293c) == null) ? null : kVar.f268301b;
                    PaymentScheduleSelection paymentScheduleSelectionB = fVar2 != null ? com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.a.b(fVar2, ((q9c.s) ((j2) aVar2.f22677a).getValue()).f243878b) : null;
                    List list2 = list;
                    if (list2 != null && !list2.isEmpty() && paymentScheduleSelectionB != null) {
                        b0Var.N2(new PaymentScheduleScreen(new PaymentScheduleContract$InputData(fVar2.f268291a, list, paymentScheduleSelectionB)), fullscreen_fade, new pvc.e(1, b0Var, q9c.b0.class, "handlePaymentScheduleSelection", "handlePaymentScheduleSelection(Lcom/revolut/feature/revolutpay/impl/ui/payment_schedule/PaymentScheduleContract$OutputData;)V", 0, 12));
                    }
                }
            } else if (listId.equals("USER_PROFILE_LIST_ID")) {
                Object content = ((s) ((j2) yVar.f22677a).getValue()).f223234p.getContent();
                if (content == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                oki.h.v2(fVar.P, new RevolutPaySummaryScreenContract$ModalStep.AccountPicker((SummaryAccountPickerExtension$AccountPickerConfiguration) content), ModalDestination.Style.POPUP.f98311a);
            }
        } else if (listId.equals("PAYMENT_METHOD_ADD_CARD_LIST_ID")) {
            s6c.l lVar = (s6c.l) ((s) ((j2) yVar.f22677a).getValue()).f.getContent();
            dj0.d dVarD = lVar != null ? lVar.d() : null;
            xi0.b orderCurrency = dVarD != null ? dVarD.f115083b : null;
            q6c.h hVar = (q6c.h) ((s) ((j2) yVar.f22677a).getValue()).f223227c.getContent();
            CardPaymentAvailability cardPaymentAvailability = hVar != null ? hVar.a(fVar.o.getF84526g()) : null;
            if (cardPaymentAvailability != null && orderCurrency != null) {
                tdc.r rVar = (tdc.r) fVar.z;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(orderCurrency, "orderCurrency");
                Intrinsics.checkNotNullParameter(cardPaymentAvailability, "cardPaymentAvailability");
                tdc.h hVarB = ((tdc.m) ((j2) rVar.f269966p.f22677a).getValue()).b();
                if (hVarB == null) {
                    throw new IllegalArgumentException("Order identifier accessed before order passed in observing payment method");
                }
                rVar.N2(rVar.o2(new gdc.c(new AddPaymentMethodControllerDescriptor$InputData(hVarB.f269953c, cardPaymentAvailability, (u6c.u) rVar.f269968r.getValue(), rVar.o.l(), orderCurrency, true))), fullscreen_fade, new su0.c(1, rVar, tdc.r.class, "handleAddPaymentMethodScreenResult", "handleAddPaymentMethodScreenResult(Lcom/revolut/feature/revolutpay/shared/ui/add_payment_method/AddPaymentMethodControllerDescriptor$OutputData;)V", 0, 17));
            }
        }
        return Unit.f186387a;
    }
}
