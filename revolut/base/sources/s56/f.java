package s56;

import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeFiSendAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DeFiSendAmountScreen deFiSendAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = deFiSendAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((nqi.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        nqi.a amountInputData = (nqi.a) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar = (com.revolut.feature.defi.remittances.impl.ui.send.amount.b) this.v.d();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(amountInputData, "amountInputData");
        bVar.H2(bVar.z, new ryd.i(amountInputData, 25));
        return Unit.f186387a;
    }
}
