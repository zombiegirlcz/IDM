package lnj;

import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.EsimRefundScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EsimRefundScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EsimRefundScreen esimRefundScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = esimRefundScreen;
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
        EsimRefundScreen esimRefundScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c) esimRefundScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c) esimRefundScreen.d();
                cVar.getClass();
                cVar.l2(new la8.h(cVar, null, 26), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
