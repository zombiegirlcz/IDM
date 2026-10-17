package vrl;

import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface g {

    @NotNull
    public static final f Companion = f.f291628a;

    static Flow a(g gVar, InvestOrdersParams params, int i) {
        Companion.getClass();
        m mVar = (m) gVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        vq0.g filter = f.f291629b;
        Intrinsics.checkNotNullParameter(filter, "filter");
        akg.n ordersFlow = nim.a.v(mVar.g(params, 3L), new vq0.g(18));
        Intrinsics.checkNotNullParameter(ordersFlow, "ordersFlow");
        return xam.a.h(new l(mVar, null), ordersFlow);
    }
}
