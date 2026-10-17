package eh9;

import com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PaymentAmountScreen f125790w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(PaymentAmountScreen paymentAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f125790w = paymentAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f125790w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            default:
                o oVar2 = new o(this.f125790w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((yof.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PaymentAmountScreen paymentAmountScreen = this.f125790w;
        switch (i) {
            case 0:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE3 = paymentAmountScreen.d();
                String amount = charSequence.toString();
                z zVar = (z) iVarE3;
                zVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                zVar.H2(zVar.A, new eed.j(new eed.j(zVar, amount, 3), zVar, 4));
                break;
            default:
                yof.b payload = (yof.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE32 = paymentAmountScreen.d();
                Intrinsics.h(payload);
                z zVar2 = (z) iVarE32;
                zVar2.getClass();
                Intrinsics.checkNotNullParameter(payload, "payload");
                zVar2.l2(new e8e.w(zVar2, payload, null, 19), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
