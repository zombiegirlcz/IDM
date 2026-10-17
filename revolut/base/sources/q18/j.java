package q18;

import com.revolut.feature.shared_separate_favourites.api.combined_watchlist.SelectAssetsDescriptor;
import com.revolut.feature.shared_separate_favourites.api.combined_watchlist.SelectAssetsInputData;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import java.util.Set;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class j {
    private j() {
    }

    public static SelectAssetsDescriptor a() {
        y1d.b.Companion.getClass();
        Set setB = y0.b(y1d.a.f);
        return new SelectAssetsDescriptor(new SelectAssetsInputData(new CombinedWatchlistContext("COMBINED_WATCHLIST_ORDERING_SECURITIES", setB, setB), SelectAssetsInputData.SelectionMode.DefaultWatchlistSelection.f86784a));
    }
}
