package kn6;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.payment_initiation_service.PaymentInitiationServiceScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ PaymentInitiationServiceScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PaymentInitiationServiceScreen paymentInitiationServiceScreen, Continuation continuation) {
        super(2, continuation);
        this.u = paymentInitiationServiceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        KProperty[] kPropertyArr = PaymentInitiationServiceScreen.Q;
        PaymentInitiationServiceScreen paymentInitiationServiceScreen = this.u;
        paymentInitiationServiceScreen.d3().f174552c.setExpanded(false);
        RecyclerView.Adapter adapter = paymentInitiationServiceScreen.d3().d.getAdapter();
        if (adapter != null) {
            paymentInitiationServiceScreen.d3().d.smoothScrollToPosition(adapter.getItemCount());
        }
        return Unit.f186387a;
    }
}
