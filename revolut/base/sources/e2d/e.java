package e2d;

import ael.t;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import go.g;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ybl.k;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f122050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f122051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f122052c;
    public final x8h.k d;

    public e(ybl.b instrumentTickerInteractor, t portfolioBalanceInteractor, k tradingAccountsInteractor, x8h.k displayCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        this.f122050a = instrumentTickerInteractor;
        this.f122051b = portfolioBalanceInteractor;
        this.f122052c = tradingAccountsInteractor;
        this.d = displayCurrencyInteractor;
    }

    public final Flow a(String query, int i, Set allowedInstrumentTypes, FavouritesAssetTypeKey typeKey) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(allowedInstrumentTypes, "allowedInstrumentTypes");
        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
        if (i > 0) {
            return new g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        return xam.a.h(new chf.a(this, query, null, 16), rd0.e.b(nim.a.w(ybl.b.c(this.f122050a), new e1.b(allowedInstrumentTypes, typeKey, 6))));
    }
}
