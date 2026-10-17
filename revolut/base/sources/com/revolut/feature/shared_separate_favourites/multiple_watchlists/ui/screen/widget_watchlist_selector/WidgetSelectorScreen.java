package com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.widget_watchlist_selector;

import android.view.View;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.shared_separate_favourites.api.multiple_watchlists.MultipleWatchlistsCustomisationScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import d8e.a;
import dgg.b;
import dhd.c;
import dhd.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import vgd.h;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/screen/widget_watchlist_selector/WidgetSelectorScreen;", "Lcom/revolut/feature/shared_separate_favourites/api/multiple_watchlists/MultipleWatchlistsCustomisationScreen;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetSelectorScreen extends MultipleWatchlistsCustomisationScreen {
    public static final /* synthetic */ int T = 0;
    public final SingleChoiceDelegate Q;
    public final Object R;
    public final Object S;

    public WidgetSelectorScreen(WidgetSelectorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = new SingleChoiceDelegate();
        this.R = w.y0(new b(this, inputData, 2));
        this.S = w.y0(new a(this, 4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.Q.p()), new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getW() {
        return v.k(this.Q, new RowLoadingDelegate(), new FullScreenStateDelegate());
    }
}
