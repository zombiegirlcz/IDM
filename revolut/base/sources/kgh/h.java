package kgh;

import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.FundPerformanceScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.FundPerformanceScreenContract$ActionParcel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FundPerformanceScreen f183991w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(FundPerformanceScreen fundPerformanceScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f183991w = fundPerformanceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f183991w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f183991w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            default:
                h hVar3 = new h(this.f183991w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FundPerformanceScreenContract$ActionParcel fundPerformanceScreenContract$ActionParcel = (FundPerformanceScreenContract$ActionParcel) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(fundPerformanceScreenContract$ActionParcel, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FundPerformanceScreen fundPerformanceScreen = this.f183991w;
        switch (i) {
            case 0:
                FundPerformanceScreenContract$ActionParcel fundPerformanceScreenContract$ActionParcel = (FundPerformanceScreenContract$ActionParcel) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a) fundPerformanceScreen.d3()).I2(fundPerformanceScreenContract$ActionParcel);
                break;
            case 1:
                FundPerformanceScreenContract$ActionParcel fundPerformanceScreenContract$ActionParcel2 = (FundPerformanceScreenContract$ActionParcel) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a) fundPerformanceScreen.d3()).I2(fundPerformanceScreenContract$ActionParcel2);
                break;
            default:
                FundPerformanceScreenContract$ActionParcel fundPerformanceScreenContract$ActionParcel3 = (FundPerformanceScreenContract$ActionParcel) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a) fundPerformanceScreen.d3()).I2(fundPerformanceScreenContract$ActionParcel3);
                break;
        }
        return Unit.f186387a;
    }
}
