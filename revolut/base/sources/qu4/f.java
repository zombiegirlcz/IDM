package qu4;

import aw0.n6;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.CreditCardRepayPaymentAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditCardRepayPaymentAmountScreen f249222w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f249222w = creditCardRepayPaymentAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f249222w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f249222w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen = this.f249222w;
        switch (i) {
            case 0:
                n6 n6Var = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE3 = creditCardRepayPaymentAmountScreen.e3();
                Object obj3 = n6Var.k;
                u uVar = (u) mVarE3;
                uVar.getClass();
                if (Intrinsics.f(obj3, "credit_card_repay_payment_amount_autopay_action")) {
                    uVar.J2();
                } else {
                    uVar.K2();
                }
                break;
            default:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE32 = creditCardRepayPaymentAmountScreen.e3();
                String id10 = aVar2.f275445a;
                u uVar2 = (u) mVarE32;
                uVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "credit_card_repay_payment_amount_autopay_action")) {
                    uVar2.J2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
