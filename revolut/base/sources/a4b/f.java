package a4b;

import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy;
import java.util.List;
import k4l.m0;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements t2b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f1239a = vkm.q.c(new TradingOrderExitStrategies((TradingOrderExitStrategy) null, (TradingOrderExitStrategy) null, (m0) null, (List) null, 28));

    @Override // t2b.a
    public final Flow a() {
        return new a35.d(this.f1239a, 1);
    }
}
