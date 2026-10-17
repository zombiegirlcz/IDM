package ny5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nw5.a f220671a;

    public g(nw5.a cryptoCommodityRateInteractor) {
        Intrinsics.checkNotNullParameter(cryptoCommodityRateInteractor, "cryptoCommodityRateInteractor");
        this.f220671a = cryptoCommodityRateInteractor;
    }

    public final efm.r a(List sortedCurrencies) {
        Intrinsics.checkNotNullParameter(sortedCurrencies, "sortedCurrencies");
        return this.f220671a.a(sortedCurrencies, n9l.b.SEC_3);
    }

    public final efm.r b(List sortedCurrencies, tzg.j timeFrame) {
        Intrinsics.checkNotNullParameter(sortedCurrencies, "sortedCurrencies");
        Intrinsics.checkNotNullParameter(timeFrame, "timeFrame");
        return this.f220671a.b(sortedCurrencies, timeFrame);
    }
}
