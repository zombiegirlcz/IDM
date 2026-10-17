package kn6;

import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.payment_initiation_service.PaymentInitiationServiceScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PaymentInitiationServiceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PaymentInitiationServiceScreen paymentInitiationServiceScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = paymentInitiationServiceScreen;
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

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PaymentInitiationServiceScreen paymentInitiationServiceScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n) paymentInitiationServiceScreen.M.getValue()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar = (n) paymentInitiationServiceScreen.M.getValue();
                f fVar = nVar.o;
                if (fVar.f186017b.f66111h.contains(ho3.c.REMITTER_IBAN)) {
                    nVar.C2(g.f186019a);
                } else {
                    nVar.f186026p.d3(fVar.f186017b, fVar.f186018c, null, new m(nVar, 0), new m(nVar, 1), new m(nVar, 2));
                }
                break;
        }
        return Unit.f186387a;
    }
}
