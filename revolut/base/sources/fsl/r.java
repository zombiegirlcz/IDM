package fsl;

import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Destination;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends gim.i implements Function1 {
    public InvestOrdersParams u;
    public InvestOrdersListFeatureContract$InputData.PendingOrders.Context v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f137732w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f137733x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f137734y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(l lVar, s sVar, Continuation continuation) {
        super(1, continuation);
        this.f137733x = lVar;
        this.f137734y = sVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.f137733x, this.f137734y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InvestOrdersListFeatureContract$InputData.PendingOrders.Context commodity;
        InvestOrdersParams investOrdersParams;
        InvestOrdersListFeatureContract$InputData.PendingOrders.Context context;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f137732w;
        s sVar = this.f137734y;
        if (i == 0) {
            yhm.o.b(obj2);
            l lVar = this.f137733x;
            g gVar = lVar.f137729a;
            if (Intrinsics.f(gVar, e.f137725a)) {
                commodity = null;
            } else if (gVar instanceof f) {
                commodity = new InvestOrdersListFeatureContract$InputData.PendingOrders.Context.Security(((f) gVar).f137726a);
            } else {
                if (!(gVar instanceof d)) {
                    throw new NoWhenBranchMatchedException();
                }
                commodity = new InvestOrdersListFeatureContract$InputData.PendingOrders.Context.Commodity(((d) gVar).f137724a);
            }
            investOrdersParams = lVar.f137730b;
            c cVar = sVar.f137735l;
            this.u = investOrdersParams;
            this.v = commodity;
            this.f137732w = 1;
            obj2 = cVar.a(this);
            if (obj2 == aVar) {
                return aVar;
            }
            context = commodity;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = this.v;
            investOrdersParams = this.u;
            yhm.o.b(obj2);
        }
        return sVar.A2(new InvestOrdersListFeatureContract$Destination(new InvestOrdersListFeatureContract$InputData.PendingOrders(investOrdersParams, context, (InvestOrdersListFeatureContract$InputData.PendingOrders.DisplayOptions) obj2)));
    }
}
