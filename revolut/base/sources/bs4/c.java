package bs4;

import com.revolut.feature.credit.card.impl.ui.instalment.details.pre_purchase.CreditCardPrePurchaseDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditCardPrePurchaseDetailsScreen f18044w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CreditCardPrePurchaseDetailsScreen creditCardPrePurchaseDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f18044w = creditCardPrePurchaseDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f18044w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f18044w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f18044w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(obj2, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditCardPrePurchaseDetailsScreen creditCardPrePurchaseDetailsScreen = this.f18044w;
        switch (i) {
            case 0:
                Object obj3 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarD3 = creditCardPrePurchaseDetailsScreen.d3();
                yx4.b.Companion.getClass();
                tVarD3.I2(yx4.a.a(obj3));
                break;
            case 1:
                Object obj4 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarD32 = creditCardPrePurchaseDetailsScreen.d3();
                yx4.a aVar3 = yx4.b.Companion;
                Intrinsics.h(obj4);
                aVar3.getClass();
                tVarD32.I2(yx4.a.a(obj4));
                break;
            default:
                Object obj5 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarD33 = creditCardPrePurchaseDetailsScreen.d3();
                yx4.a aVar5 = yx4.b.Companion;
                Intrinsics.h(obj5);
                aVar5.getClass();
                tVarD33.I2(yx4.a.a(obj5));
                break;
        }
        return Unit.f186387a;
    }
}
