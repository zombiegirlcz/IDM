package i9c;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import com.revolut.feature.revolutpay.impl.ui.payment_schedule.PaymentScheduleScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentScheduleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PaymentScheduleScreen paymentScheduleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = paymentScheduleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = (k) this.v.R.getValue();
        Object obj3 = model.k;
        if (obj3 instanceof PaymentScheduleSelection) {
            kVar.H2(kVar.o, new av8.o(obj3, 29));
        } else {
            kVar.getClass();
        }
        return Unit.f186387a;
    }
}
