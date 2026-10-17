package jb1;

import com.revolut.feature.acquiring.card_reader.order.api.model.CardReaderOrderProductDetails;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.checkout.CheckoutScreen;
import com.revolut.kompot.common.ExternalDestination;
import ip0.u8;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CheckoutScreen checkoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = checkoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            case 2:
                return new d(this.v, continuation, 2);
            case 3:
                return new d(this.v, continuation, 3);
            default:
                return new d(this.v, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        CheckoutScreen checkoutScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                checkoutScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar = (x) checkoutScreen.T2();
                xVar.getClass();
                xVar.l2(new v(xVar, null), new p(xVar, 2));
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar2 = (x) checkoutScreen.T2();
                CardReaderOrderProductDetails cardReaderOrderProductDetails = (CardReaderOrderProductDetails) ((g) xVar2.t2()).f172550a.getContent();
                if (cardReaderOrderProductDetails != null && (str = cardReaderOrderProductDetails.e) != null) {
                    xVar2.C1(new ExternalDestination.Browser(str, null));
                }
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar3 = (x) checkoutScreen.T2();
                int i2 = ((g) xVar3.t2()).f - 1;
                int i3 = i2 >= 1 ? i2 : 1;
                if (i3 != ((g) xVar3.t2()).f) {
                    xVar3.x2(new a5g.i(i3, 25));
                    xVar3.A2();
                }
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar4 = (x) checkoutScreen.T2();
                int i5 = ((g) xVar4.t2()).f + 1;
                CardReaderOrderProductDetails cardReaderOrderProductDetails2 = (CardReaderOrderProductDetails) ((g) xVar4.t2()).f172550a.getContent();
                if (cardReaderOrderProductDetails2 != null) {
                    int i6 = cardReaderOrderProductDetails2.f60577c;
                    if (i5 > i6) {
                        i5 = i6;
                    }
                    if (i5 != ((g) xVar4.t2()).f) {
                        xVar4.x2(new a5g.i(i5, 24));
                        xVar4.A2();
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
