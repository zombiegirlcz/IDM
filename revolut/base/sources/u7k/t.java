package u7k;

import com.revolut.feature.payments.social.api.navigation.PeerToPeerChatDestination;
import com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PaymentLinkDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(PaymentLinkDetailsScreen paymentLinkDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = paymentLinkDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.v, continuation, 0);
            default:
                return new t(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((t) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((t) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PaymentLinkDetailsScreen paymentLinkDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar = (com.revolut.retail.feature.payments.payment_links.impl.ui.details.b) paymentLinkDetailsScreen.R2();
                Object content = ((a) ((j2) bVar.v.f22677a).getValue()).f277943a.getContent();
                if (content == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                zm3.a aVar2 = ((b) content).f277947c;
                if (aVar2 == null) {
                    throw new IllegalStateException("Owner contact cannot be null");
                }
                bVar.C1(new PeerToPeerChatDestination(aVar2, null, false));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                paymentLinkDetailsScreen.m2().onBackPressed();
                return Unit.f186387a;
        }
    }
}
