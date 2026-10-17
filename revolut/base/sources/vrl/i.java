package vrl;

import com.revolut.trading.orders.domain.interactors.OrderCancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.i implements Function3 {
    public /* synthetic */ boolean u;
    public /* synthetic */ int v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int iIntValue = ((Number) obj3).intValue();
        i iVar = new i(3, (Continuation) obj4);
        iVar.u = zBooleanValue;
        iVar.v = iIntValue;
        return iVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws OrderCancellationException {
        boolean z = this.u;
        int i = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z3 = false;
        if (i < 3) {
            if (!z) {
                z3 = true;
            }
        } else if (!z) {
            throw new OrderCancellationException();
        }
        return Boolean.valueOf(z3);
    }
}
