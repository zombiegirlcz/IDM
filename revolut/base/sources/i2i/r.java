package i2i;

import com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.MarketOrderPresenterV2$HintDialogReason;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MarketOrderPresenterV2$HintDialogReason f157972a;

    public r(MarketOrderPresenterV2$HintDialogReason marketOrderPresenterV2$HintDialogReason) {
        this.f157972a = marketOrderPresenterV2$HintDialogReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f157972a, ((r) obj2).f157972a);
    }

    public final int hashCode() {
        MarketOrderPresenterV2$HintDialogReason marketOrderPresenterV2$HintDialogReason = this.f157972a;
        if (marketOrderPresenterV2$HintDialogReason == null) {
            return 0;
        }
        return marketOrderPresenterV2$HintDialogReason.hashCode();
    }
}
