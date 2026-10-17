package mrb;

import com.revolut.feature.retail.trading.advanced.charts.impl.service.TradingAdvancedChartService;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import nj0.d;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f208095a;

    public a(b bVar) {
        this.f208095a = bVar;
    }

    @Override // phm.a
    public final Object get() {
        nj0.a aVar = this.f208095a.f208096a;
        ik0.b retrofitFactory = ((d) aVar).m();
        s.j(retrofitFactory);
        ek.a converterFactory = ((d) aVar).d();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(TradingAdvancedChartService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TradingAdvancedChartService tradingAdvancedChartService = (TradingAdvancedChartService) objCreate;
        s.k(tradingAdvancedChartService);
        return tradingAdvancedChartService;
    }
}
