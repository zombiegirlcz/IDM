package wr1;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount.TapiTransferAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ TapiTransferAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TapiTransferAmountScreen tapiTransferAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = tapiTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVar = (u) this.u.R2();
        uVar.getClass();
        uVar.l2(new t(uVar, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
