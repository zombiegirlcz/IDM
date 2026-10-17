package i4b;

import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreenContract$InputData;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements t2b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CfdOrderReviewScreenContract$InputData f158320a;

    public a(CfdOrderReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f158320a = inputData;
    }

    @Override // t2b.a
    public final Flow a() {
        TradingOrderExitStrategies tradingOrderExitStrategies = this.f158320a.f82282l;
        return zi0.c.i(new TradingOrderExitStrategies(tradingOrderExitStrategies != null ? tradingOrderExitStrategies.f104659a : null, tradingOrderExitStrategies != null ? tradingOrderExitStrategies.f104660b : null, (k4l.m0) null, (List) null, 28));
    }
}
