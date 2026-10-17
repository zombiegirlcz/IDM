package zj9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pay_later.api.models.PayLaterPaymentOption;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.options.PaymentOptionsController;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.options.PaymentOptionsControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentOptionsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PaymentOptionsController paymentOptionsController, Continuation continuation) {
        super(2, continuation);
        this.v = paymentOptionsController;
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

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model option = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.R.getValue();
        Intrinsics.h(option);
        com.revolut.feature.pay_later.impl.ui.paymentoptions.options.a aVar2 = (com.revolut.feature.pay_later.impl.ui.paymentoptions.options.a) gVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(option, "option");
        Object obj3 = option.u;
        PayLaterPaymentOption payLaterPaymentOption = obj3 instanceof PayLaterPaymentOption ? (PayLaterPaymentOption) obj3 : null;
        if (payLaterPaymentOption != null) {
            oki.h.v2(aVar2.f78889q, new PaymentOptionsControllerContract$ModalStep.SelectSchedule(payLaterPaymentOption), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
