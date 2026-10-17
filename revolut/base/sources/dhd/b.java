package dhd;

import cli.g;
import cli.y;
import com.revolut.feature.shared_separate_favourites.api.multiple_watchlists.MultipleWatchlistsCustomisationScreen;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.widget_watchlist_selector.WidgetSelectorScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import l3d.r;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements d {
    public final WidgetSelectorScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f114778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f114779q;

    public b(WidgetSelectorScreenContract$InputData inputData, r multipleWatchlistsInteractor, e stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(multipleWatchlistsInteractor, "multipleWatchlistsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f114778p = multipleWatchlistsInteractor;
        this.f114779q = mra.d.b(this, new MultipleWatchlistsCustomisationScreen.a(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, this.f114778p.f(this.o.f86938b), null, new a(this, null), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f114779q;
    }
}
