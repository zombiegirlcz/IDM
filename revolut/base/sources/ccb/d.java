package ccb;

import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreen;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ MoneyBoxAmountInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(MoneyBoxAmountInputScreen moneyBoxAmountInputScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = moneyBoxAmountInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            case 2:
                return new d(this.v, continuation, 2);
            default:
                return new d(this.v, continuation, 3);
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        MoneyBoxAmountInputScreen moneyBoxAmountInputScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0 c0Var = (c0) moneyBoxAmountInputScreen.T2();
                c0Var.getClass();
                c0Var.l2(new b0(1, c0Var, null), new c69.v(c0Var, 22));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0 c0Var2 = (c0) moneyBoxAmountInputScreen.T2();
                j jVar = c0Var2.f22976r;
                MoneyBoxAmountInputScreenContract$InputData moneyBoxAmountInputScreenContract$InputData = c0Var2.f22974p;
                String id10 = moneyBoxAmountInputScreenContract$InputData.f82766a;
                String currencyCode = moneyBoxAmountInputScreenContract$InputData.f82767b;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                moneyBoxAmountInputScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((c0) moneyBoxAmountInputScreen.T2()).f22976r.getClass();
                break;
        }
        return Unit.f186387a;
    }
}
