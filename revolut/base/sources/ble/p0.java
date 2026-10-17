package ble;

import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$HeaderState;
import com.revolut.feature.wealth.api.domain.model.balance.WealthAccountsBalance;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TradingLegalEntityInformation f16590w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Continuation continuation, TradingLegalEntityInformation tradingLegalEntityInformation, int i) {
        super(2, continuation);
        this.u = i;
        this.f16590w = tradingLegalEntityInformation;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p0 p0Var = new p0(continuation, this.f16590w, 0);
                p0Var.v = obj2;
                return p0Var;
            default:
                p0 p0Var2 = new p0(continuation, this.f16590w, 1);
                p0Var2.v = obj2;
                return p0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Pair pair = (Pair) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p0) create(pair, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar = (yhm.r) pair.f186385a;
                Pair pair2 = (Pair) pair.f186386b;
                Object obj3 = rVar.f314201a;
                Object obj4 = rVar.f314202b;
                Object obj5 = rVar.f314203c;
                Object obj6 = pair2.f186385a;
                boolean zBooleanValue = ((Boolean) pair2.f186386b).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                TabInvestControllerContract$HeaderState.Onboarded.LineChart lineChart = (TabInvestControllerContract$HeaderState.Onboarded.LineChart) obj4;
                WealthAccountsBalance wealthAccountsBalance = (WealthAccountsBalance) obj3;
                return new TabInvestControllerContract$HeaderState.Onboarded(this.f16590w, wealthAccountsBalance, lineChart, (ChosenBackground) obj5, zBooleanValue, null, zBooleanValue2);
            default:
                Pair pair3 = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar2 = (yhm.r) pair3.f186385a;
                Object obj7 = pair3.f186386b;
                Object obj8 = rVar2.f314201a;
                Object obj9 = rVar2.f314202b;
                Object obj10 = rVar2.f314203c;
                boolean zBooleanValue3 = ((Boolean) obj7).booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                WealthAccountsBalance wealthAccountsBalance2 = (WealthAccountsBalance) obj8;
                return new TabInvestControllerContract$HeaderState.Pending(this.f16590w, wealthAccountsBalance2, (ChosenBackground) obj9, zBooleanValue3, null, zBooleanValue4);
        }
    }
}
