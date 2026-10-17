package osl;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_market_data_api.navigation.HistoricFeeBreakdownFeatureConfig;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.q;
import vkm.t0;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f229366w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f229366w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f229366w, continuation, 0);
            default:
                return new g(this.f229366w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                i iVar = this.f229366w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarH = mo3.a.h(new t0(iVar.f229374s.B(new os9.f(16)), 1), new ngh.i(27), new oq3.e(17), 2);
                    this.v = 1;
                    obj2 = q.x(bVarH, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return iVar.A2(new AssetDetailsDestination((String) obj2, null, false, null, null, null, 62));
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                i iVar2 = this.f229366w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarH2 = mo3.a.h(iVar2.d3(), new ngh.i(28), new oq3.e(18), 2);
                    this.v = 1;
                    obj2 = q.x(bVarH2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return iVar2.A2(u0.c(new HistoricFeeBreakdownFeatureConfig((ChargeBreakdown) null, (String) obj2, (z3i.b) null, (xi0.b) null, false, false, c4i.a.TRADING_ORDER, (AnalyticsProduct.Retail) null, OnfidoActivity.RESULT_EXIT_INVALID_CERTIFICATE)));
        }
    }
}
