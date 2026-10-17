package wr1;

import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount.TapiTransferAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TapiTransferAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TapiTransferAmountScreen tapiTransferAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = tapiTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
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
        TapiTransferAmountScreen tapiTransferAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tapiTransferAmountScreen.F2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) tapiTransferAmountScreen.e3();
                g gVar = (g) ((j2) uVar.f299511t.f22677a).getValue();
                dj0.d dVar = gVar.f299486a;
                ur1.a aVar3 = gVar.f;
                uVar.C2(new i(dVar, aVar3.f282230a, aVar3.f282231b.f163145a, gVar.f299489g));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) tapiTransferAmountScreen.e3()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
