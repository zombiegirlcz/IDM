package jt1;

import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BizumTransferAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(BizumTransferAmountScreen bizumTransferAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = bizumTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.v, continuation, 0);
            case 1:
                return new l(this.v, continuation, 1);
            default:
                return new l(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        BizumTransferAmountScreen bizumTransferAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bizumTransferAmountScreen.F2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVar = (z) bizumTransferAmountScreen.T2();
                yji.l.j2(zVar, zVar.e1(new c12.w(((a) zVar.t2()).f178273a)), null, null, 3);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVar2 = (z) bizumTransferAmountScreen.T2();
                zVar2.f178310w.Q();
                zVar2.l2(new x(zVar2, continuation, 2), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
