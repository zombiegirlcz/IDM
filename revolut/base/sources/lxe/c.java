package lxe;

import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreen;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreenContract$ValidationResult;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CheckoutCustomAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CheckoutCustomAmountScreen checkoutCustomAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = checkoutCustomAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CheckoutCustomAmountScreen checkoutCustomAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.a) ((f) checkoutCustomAmountScreen.Q.getValue())).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.a aVar3 = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.a) ((f) checkoutCustomAmountScreen.Q.getValue());
                if (Intrinsics.f(((d) ((j2) aVar3.f90772r.f22677a).getValue()).f200560b, CheckoutCustomAmountScreenContract$ValidationResult.Valid.f90768a)) {
                    aVar3.l2(new lpl.c(aVar3, null, 9), new yi5.b(26));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("CheckoutCustomAmount save button was enabled when the amount was invalid");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
        }
        return Unit.f186387a;
    }
}
