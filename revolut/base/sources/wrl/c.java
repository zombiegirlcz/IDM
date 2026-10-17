package wrl;

import bfl.g;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.List;
import k4l.e0;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount f299634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f299635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f299636c;
    public final r0 d;
    public final Asset e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SourcePocketWrapper f299637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f299638h;

    public c(TradingAccount tradingAccount, n instrument, g tradeSide, r0 orderType, Asset selectedInputAsset, List availableInputAssets, SourcePocketWrapper sourcePocketWrapper, e0 orderLimits) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(selectedInputAsset, "selectedInputAsset");
        Intrinsics.checkNotNullParameter(availableInputAssets, "availableInputAssets");
        Intrinsics.checkNotNullParameter(sourcePocketWrapper, "sourcePocketWrapper");
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        this.f299634a = tradingAccount;
        this.f299635b = instrument;
        this.f299636c = tradeSide;
        this.d = orderType;
        this.e = selectedInputAsset;
        this.f = availableInputAssets;
        this.f299637g = sourcePocketWrapper;
        this.f299638h = orderLimits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f299634a, cVar.f299634a) && Intrinsics.f(this.f299635b, cVar.f299635b) && this.f299636c == cVar.f299636c && this.d == cVar.d && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f299637g, cVar.f299637g) && Intrinsics.f(this.f299638h, cVar.f299638h);
    }

    public final int hashCode() {
        return this.f299638h.hashCode() + ((this.f299637g.hashCode() + p.a.d((this.e.hashCode() + d.f(this.d, y.b(this.f299636c, a10.b.d(this.f299635b, this.f299634a.hashCode() * 31, 31), 31), 31)) * 31, 31, this.f)) * 31);
    }
}
