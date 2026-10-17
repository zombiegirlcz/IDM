package z6k;

import com.revolut.core.ui_kit.delegates.d2;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MoneyRequestDetailsScreen f319780w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(MoneyRequestDetailsScreen moneyRequestDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f319780w = moneyRequestDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(this.f319780w, continuation, 0);
                a0Var.v = obj2;
                return a0Var;
            default:
                a0 a0Var2 = new a0(this.f319780w, continuation, 1);
                a0Var2.v = obj2;
                return a0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a0) create((ip0.y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a0) create((d2) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        MoneyRequestDetailsScreen moneyRequestDetailsScreen = this.f319780w;
        switch (i) {
            case 0:
                ip0.y data = (ip0.y) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE3 = moneyRequestDetailsScreen.d();
                Intrinsics.h(data);
                com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b bVar = (com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b) gVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                bVar.J2(data.f167226b);
                break;
            default:
                d2 d2Var = (d2) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE32 = moneyRequestDetailsScreen.d();
                Intrinsics.h(d2Var);
                ((com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b) gVarE32).K2(d2Var);
                break;
        }
        return Unit.f186387a;
    }
}
