package dhd;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.api.multiple_watchlists.MultipleWatchlistsCustomisationScreen;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.widget_watchlist_selector.WidgetSelectorScreenContract$InputData;
import dee.a0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetSelectorScreenContract$InputData f114780a;

    public e(WidgetSelectorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f114780a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        MultipleWatchlistsCustomisationScreen.a domainState = (MultipleWatchlistsCustomisationScreen.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(null, (List) iii.c.f(domainState.f86793a, new dg3.d(4), new a0(9), new dbg.b(this, 1)), new lw0.a(new TextLocalisedClause(R$string.watchlists_widget_select_watchlist, null, null, 14), null, null, null, false, 30));
    }
}
