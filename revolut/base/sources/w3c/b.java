package w3c;

import com.revolut.feature.revolut_shop.ui.screen.checkout.CheckoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(CheckoutScreen checkoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = checkoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CheckoutScreen checkoutScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zji.d dVar = ((oki.h) checkoutScreen.d()).f226129n;
                Unit unit = Unit.f186387a;
                dVar.a(unit);
                return unit;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar3 = (com.revolut.feature.revolut_shop.ui.screen.checkout.a) checkoutScreen.d();
                aVar3.getClass();
                aVar3.n2(new vmf.k(aVar3, null, 23), new whi.b(6));
                return Unit.f186387a;
        }
    }
}
