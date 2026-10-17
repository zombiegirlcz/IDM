package ugd;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.declaration.MultipleWatchlistsDestination;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.declaration.WatchlistsSelectorDestination;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.MultipleWatchlistsFlow;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.MultipleWatchlistsFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.WatchlistsSelectorScreen;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.WatchlistsSelectorScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof d)) {
            return null;
        }
        d dVar = (d) descriptor;
        return dVar.a(new WatchlistsSelectorScreen(new WatchlistsSelectorScreenContract$InputData(dVar.f280025b, dVar.f280024a)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof MultipleWatchlistsDestination) {
            MultipleWatchlistsDestination multipleWatchlistsDestination = (MultipleWatchlistsDestination) destination;
            return new MultipleWatchlistsFlow(new MultipleWatchlistsFlowContract$InputData(multipleWatchlistsDestination.f86903a, multipleWatchlistsDestination.f86904b));
        }
        if (!(destination instanceof WatchlistsSelectorDestination)) {
            return null;
        }
        WatchlistsSelectorDestination watchlistsSelectorDestination = (WatchlistsSelectorDestination) destination;
        return new WatchlistsSelectorScreen(new WatchlistsSelectorScreenContract$InputData(watchlistsSelectorDestination.f86906b, watchlistsSelectorDestination.f86905a));
    }
}
