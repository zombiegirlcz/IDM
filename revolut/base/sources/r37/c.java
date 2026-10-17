package r37;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.TaxHubPaymentTypePickerScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.TaxHubPaymentTypePickerScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubPaymentTypePickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TaxHubPaymentTypePickerScreen taxHubPaymentTypePickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubPaymentTypePickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.P.getValue();
        Object obj3 = model.u;
        com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.a aVar2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.a) gVar;
        aVar2.getClass();
        if (obj3 instanceof ds6.j) {
            aVar2.C2(new f((ds6.j) obj3));
        } else if (obj3 instanceof k) {
            oki.h.v2(aVar2.f74337t, TaxHubPaymentTypePickerScreenContract$ModalStep.CannotFindTaxType.f74332a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
