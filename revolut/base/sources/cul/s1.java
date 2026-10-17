package cul;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class s1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s1(this.v, continuation, 0);
            default:
                return new s1(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s1) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s1) create((rp0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.B2();
                break;
        }
        return Unit.f186387a;
    }
}
