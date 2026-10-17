package j4c;

import com.revolut.feature.revolut_shop.ui.screen.orderconfirmation.OrderConfirmationScreen;
import d3c.f0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ OrderConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(OrderConfirmationScreen orderConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = orderConfirmationScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        k kVar = k.f171344a;
        OrderConfirmationScreen orderConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) orderConfirmationScreen.R2()).C2(kVar);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final u uVar = (u) orderConfirmationScreen.R2();
                f0 f0Var = (f0) ((g) ((j2) uVar.f171367x.f22677a).getValue()).f171337b.getContent();
                if (f0Var != null) {
                    int i2 = p.f171352a[f0Var.ordinal()];
                    final int i3 = 1;
                    if (i2 == 1) {
                        final int i5 = 0;
                        uVar.v.Z2(new Function0() { // from class: j4c.o
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i5) {
                                    case 0:
                                        u uVar2 = uVar;
                                        vii.c cVar = uVar2.f171368y;
                                        Unit unit = Unit.f186387a;
                                        cVar.b(unit);
                                        uVar2.z.b(unit);
                                        return unit;
                                    default:
                                        u uVar3 = uVar;
                                        vii.c cVar2 = uVar3.f171368y;
                                        Unit unit2 = Unit.f186387a;
                                        cVar2.b(unit2);
                                        uVar3.z.b(unit2);
                                        return unit2;
                                }
                            }
                        }, new Function0() { // from class: j4c.o
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i3) {
                                    case 0:
                                        u uVar2 = uVar;
                                        vii.c cVar = uVar2.f171368y;
                                        Unit unit = Unit.f186387a;
                                        cVar.b(unit);
                                        uVar2.z.b(unit);
                                        return unit;
                                    default:
                                        u uVar3 = uVar;
                                        vii.c cVar2 = uVar3.f171368y;
                                        Unit unit2 = Unit.f186387a;
                                        cVar2.b(unit2);
                                        uVar3.z.b(unit2);
                                        return unit2;
                                }
                            }
                        });
                    } else {
                        if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        uVar.C2(kVar);
                    }
                }
                return Unit.f186387a;
        }
    }
}
