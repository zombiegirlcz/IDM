package ptf;

import com.revolut.feature.transfer_reasons.impl.ui.transactions.TransferReasonsTransactionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransferReasonsTransactionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TransferReasonsTransactionsScreen transferReasonsTransactionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transferReasonsTransactionsScreen;
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
        TransferReasonsTransactionsScreen transferReasonsTransactionsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l) transferReasonsTransactionsScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) transferReasonsTransactionsScreen.e3();
                String str = ((e) ((j2) lVar.f239671s.f22677a).getValue()).f239660b;
                if (str != null) {
                    lVar.l2(new pnf.f(lVar, str, null, 16), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
