package wb3;

import com.revolut.feature.cash_topup.impl.ui.entry.CashTopUpEntryScreen;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.q0;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CashTopUpEntryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(CashTopUpEntryScreen cashTopUpEntryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cashTopUpEntryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CashTopUpEntryScreen cashTopUpEntryScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cashTopUpEntryScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVar = (m) ((e) cashTopUpEntryScreen.X.getValue());
                yji.l.i2(mVar, new PermissionsFlow(q0.c(new Pair("android.permission.ACCESS_FINE_LOCATION", mVar.f296012s.a()))), null, new w3c.n(mVar, 20), 1);
                break;
        }
        return Unit.f186387a;
    }
}
