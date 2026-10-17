package qb3;

import com.revolut.feature.cash_topup.impl.ui.amount.CashTopUpAmountScreen;
import com.revolut.feature.cash_topup.impl.ui.amount.a;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CashTopUpAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CashTopUpAmountScreen cashTopUpAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cashTopUpAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CashTopUpAmountScreen cashTopUpAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cashTopUpAmountScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.cash_topup.impl.ui.amount.c cVar = (com.revolut.feature.cash_topup.impl.ui.amount.c) ((i) cashTopUpAmountScreen.Z.getValue());
                com.revolut.feature.cash_topup.impl.ui.amount.a aVar3 = (com.revolut.feature.cash_topup.impl.ui.amount.a) cVar.t2();
                Continuation continuation = null;
                if (aVar3 instanceof h) {
                    h hVar = (h) aVar3;
                    if (hVar.f != null) {
                        cVar.n2(new q03.m(cVar, hVar, continuation, 28), new whi.b(6));
                    }
                } else {
                    if (!(aVar3 instanceof a.C0468a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Button cannot be clicked when state is loading");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
        }
    }
}
