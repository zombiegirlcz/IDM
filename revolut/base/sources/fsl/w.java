package fsl;

import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f137741a;

    public w(fkg.a commonProvider) {
        Intrinsics.checkNotNullParameter(commonProvider, "commonProvider");
        this.f137741a = commonProvider;
    }

    public final akg.n a(InvestOrdersParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(params, "params");
        return nim.a.v(this.f137741a.r(params), new v(params, 0));
    }
}
