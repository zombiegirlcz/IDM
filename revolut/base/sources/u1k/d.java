package u1k;

import com.revolut.retail.feature.payment_options.impl.ui.screens.vault.PaymentOptionsVaultWithdrawalScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tjf.p0;
import tx0.p4;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PaymentOptionsVaultWithdrawalScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(PaymentOptionsVaultWithdrawalScreen paymentOptionsVaultWithdrawalScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = paymentOptionsVaultWithdrawalScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PaymentOptionsVaultWithdrawalScreen paymentOptionsVaultWithdrawalScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                paymentOptionsVaultWithdrawalScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) ((g) paymentOptionsVaultWithdrawalScreen.c0.getValue());
                jVar.getClass();
                jVar.l2(new p0(jVar, null, 23), new p4(jVar, 12));
                break;
        }
        return Unit.f186387a;
    }
}
