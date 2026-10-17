package ihd;

import a83.c0;
import com.revolut.feature.shared_separate_favourites.api.watchlist.home_widget_customisation.WatchlistWidgetCustomisationScreen$InputData;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlow;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$LaunchMode;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.home_widget_customisation.b;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import l3d.h0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends jki.g implements q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h0 f161394p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WatchlistWidgetCustomisationScreen$InputData f161395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.c f161396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f161397s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p stateMapper, h0 watchlistInteractor, WatchlistWidgetCustomisationScreen$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(watchlistInteractor, "watchlistInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f161394p = watchlistInteractor;
        this.f161395q = inputData;
        this.f161396r = new vii.c();
        int i = inputData.f86794a;
        m70.a.c(t0.f186434a);
        this.f161397s = new o(null, null, i, "", false);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, vkm.q.Q(this.f161396r.a(Unit.f186387a, w4l.h.f294642c), new hcj.o((Continuation) null, this, 24)), null, null, new ibg.g(this, null, 9), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f161397s;
    }

    public final void y2(com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.home_widget_customisation.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof b.a;
        WatchlistWidgetCustomisationScreen$InputData watchlistWidgetCustomisationScreen$InputData = this.f161395q;
        if (z) {
            f2(new WatchlistAddAssetFlow(new WatchlistAddAssetFlowContract$InputData(watchlistWidgetCustomisationScreen$InputData.d, (WatchlistAddAssetFlowContract$LaunchMode) null, 6)), ModalDestination.Style.FULLSCREEN_FADE.f98307a, new i9e.a(this, 28));
            return;
        }
        if (event instanceof b.C0545b) {
            v2(new qfd.b(watchlistWidgetCustomisationScreen$InputData.f86795b, ((o) t2()).f161385b));
            return;
        }
        if (event instanceof r) {
            WatchlistItem watchlistItem = ((r) event).f161387a;
            Collection collection = ((o) t2()).f161385b;
            if (collection == null) {
                collection = f0.f322471a;
            }
            ArrayList arrayListF1 = d0.f1(collection);
            if (arrayListF1.contains(watchlistItem.getId())) {
                arrayListF1.remove(watchlistItem.getId());
            } else {
                arrayListF1.add(watchlistItem.getId());
            }
            x2(new c0(28, arrayListF1));
            return;
        }
        if (event instanceof s) {
            s sVar = (s) event;
            int i = sVar.f161388a;
            int i2 = sVar.f161389b;
            List list = ((o) t2()).f161385b;
            if (list == null) {
                return;
            }
            ArrayList arrayListF12 = d0.f1(list);
            if (i < 0 || i >= arrayListF12.size() || i2 < 0 || i2 >= arrayListF12.size()) {
                return;
            }
            arrayListF12.add(i2, (String) arrayListF12.remove(i));
            x2(new c0(27, arrayListF12));
            return;
        }
        if (event instanceof b.d) {
            u2();
            return;
        }
        if (event instanceof b.f) {
            x2(new igh.k(10));
            return;
        }
        if (event instanceof t) {
            x2(new ho6.n(((t) event).f161390a, 27));
        } else if (event instanceof b.c) {
            this.f161396r.b(Unit.f186387a);
        } else {
            if (!(event instanceof b.e)) {
                throw new NoWhenBranchMatchedException();
            }
            x2(new igh.k(11));
        }
    }
}
