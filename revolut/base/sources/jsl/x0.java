package jsl;

import com.revolut.trading.orders.ui.details.InvestOrderDetailsScreenRedesigned;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InvestOrderDetailsScreenRedesigned v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(InvestOrderDetailsScreenRedesigned investOrderDetailsScreenRedesigned, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = investOrderDetailsScreenRedesigned;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x0(this.v, continuation, 0);
            default:
                return new x0(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x0) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InvestOrderDetailsScreenRedesigned investOrderDetailsScreenRedesigned = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u0) investOrderDetailsScreenRedesigned.R2()).I2(k0.f178220a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u0 u0Var = (u0) investOrderDetailsScreenRedesigned.R2();
                u0Var.getClass();
                u event = u.f178238a;
                Intrinsics.checkNotNullParameter(event, "event");
                u0Var.n2(new s0(u0Var, null, 1), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
