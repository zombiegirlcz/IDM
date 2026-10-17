package hk9;

import com.revolut.feature.pay_later.impl.ui.purchasecalculator.PurchaseCalculatorController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zh9.k1;
import zh9.t1;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PurchaseCalculatorController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(PurchaseCalculatorController purchaseCalculatorController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = purchaseCalculatorController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PurchaseCalculatorController purchaseCalculatorController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0m.e.c(purchaseCalculatorController.m2());
                ((q) purchaseCalculatorController.R2()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar = (q) purchaseCalculatorController.R2();
                k1 k1Var = (k1) zi0.c.I(((j) ((j2) qVar.f152892y.f22677a).getValue()).f152877b);
                t1 t1Var = k1Var.f322297b;
                int i2 = t1Var == null ? -1 : n.f152881a[t1Var.ordinal()];
                int i3 = 4;
                if (i2 == -1) {
                    qVar.l2(new cam.q(k1Var.f322296a, i3, qVar, null), new hie.b(1, qVar.f152886q, di9.c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 2));
                } else {
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException(("Button shouldn't be clickable in state = " + t1Var).toString());
                    }
                    qVar.I2();
                }
                return Unit.f186387a;
        }
    }
}
