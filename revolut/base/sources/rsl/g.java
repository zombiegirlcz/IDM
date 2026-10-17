package rsl;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_market_data_api.navigation.HistoricFeeBreakdownFeatureConfig;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import rd3.x;
import rnd.d0;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        h hVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            jhi.b bVarH = mo3.a.h(hVar.d3(), new x(10), new d0(24), 2);
            this.u = 1;
            obj2 = vkm.q.x(bVarH, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return hVar.A2(u0.c(new HistoricFeeBreakdownFeatureConfig((ChargeBreakdown) null, (String) obj2, (z3i.b) null, (xi0.b) null, false, false, c4i.a.TRADING_ORDER, (AnalyticsProduct.Retail) null, OnfidoActivity.RESULT_EXIT_INVALID_CERTIFICATE)));
    }
}
