package u7k;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentLinkDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(PaymentLinkDetailsScreen paymentLinkDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = paymentLinkDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u uVar = new u(this.v, continuation);
        uVar.u = obj2;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52373a;
        boolean zF = Intrinsics.f(str, "ID_WIDGET_SHARE");
        PaymentLinkDetailsScreen paymentLinkDetailsScreen = this.v;
        if (zF) {
            g gVarE3 = paymentLinkDetailsScreen.R2();
            Object obj3 = model.k;
            Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
            String link = (String) obj3;
            com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar = (com.revolut.retail.feature.payments.payment_links.impl.ui.details.b) gVarE3;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(link, "link");
            bVar.l2(new f0(bVar, link, null, 0), new yi5.b(26));
        } else if (Intrinsics.f(str, "ERROR_STATE_ID")) {
            ((com.revolut.retail.feature.payments.payment_links.impl.ui.details.b) paymentLinkDetailsScreen.R2()).f102193x.a();
        }
        return Unit.f186387a;
    }
}
