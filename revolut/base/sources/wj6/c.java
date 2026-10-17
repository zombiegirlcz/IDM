package wj6;

import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreenContract$OutputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BrPaymentLimitsUpdateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(BrPaymentLimitsUpdateScreen brPaymentLimitsUpdateScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = brPaymentLimitsUpdateScreen;
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
        BrPaymentLimitsUpdateScreen brPaymentLimitsUpdateScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.a) brPaymentLimitsUpdateScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.a aVar3 = (com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.a) brPaymentLimitsUpdateScreen.e3();
                dj0.d dVar = ((d) ((j2) aVar3.o.f22677a).getValue()).f297960a;
                if (dVar.f115082a == 0) {
                    dVar = null;
                }
                aVar3.C2(new BrPaymentLimitsUpdateScreenContract$OutputData.LimitUpdated(dVar));
                break;
        }
        return Unit.f186387a;
    }
}
