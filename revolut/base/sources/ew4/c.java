package ew4;

import com.revolut.feature.credit.card.impl.ui.statement_financing.details.CreditCardStatementFinancingDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditCardStatementFinancingDetailsScreen f130073w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CreditCardStatementFinancingDetailsScreen creditCardStatementFinancingDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f130073w = creditCardStatementFinancingDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f130073w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f130073w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
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
        CreditCardStatementFinancingDetailsScreen creditCardStatementFinancingDetailsScreen = this.f130073w;
        switch (i) {
            case 0:
                Object obj3 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarD3 = creditCardStatementFinancingDetailsScreen.d3();
                yx4.b.Companion.getClass();
                ((com.revolut.feature.credit.card.impl.ui.statement_financing.details.a) jVarD3).I2(yx4.a.a(obj3));
                break;
            default:
                Object obj4 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarD32 = creditCardStatementFinancingDetailsScreen.d3();
                yx4.a aVar3 = yx4.b.Companion;
                Intrinsics.h(obj4);
                aVar3.getClass();
                ((com.revolut.feature.credit.card.impl.ui.statement_financing.details.a) jVarD32).I2(yx4.a.a(obj4));
                break;
        }
        return Unit.f186387a;
    }
}
