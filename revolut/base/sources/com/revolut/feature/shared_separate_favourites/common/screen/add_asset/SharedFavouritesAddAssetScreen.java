package com.revolut.feature.shared_separate_favourites.common.screen.add_asset;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.R$id;
import com.revolut.feature.shared_separate_favourites.R$layout;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import fgd.i;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import y20.a1;
import y83.d;
import yfd.c;
import yfd.f;
import yfd.g;
import yfd.j;
import yfd.k;
import yfd.l;
import yfd.p;
import yfd.q;
import yfd.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/common/screen/add_asset/SharedFavouritesAddAssetScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lyfd/s;", "Lcom/revolut/feature/shared_separate_favourites/common/screen/add_asset/SharedFavouritesAddAssetScreenContract$InputData;", "Lyfd/p;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharedFavouritesAddAssetScreen extends BaseRecyclerViewScreen<s, SharedFavouritesAddAssetScreenContract$InputData, p> {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f86802h0 = {o0.f186429a.j(new h0(SharedFavouritesAddAssetScreen.class, "binding", "getBinding()Lcom/revolut/feature/shared_separate_favourites/databinding/ScreenRecyclerNavbarNextbuttonsdisabledBinding;", 0))};
    public final boolean U;
    public final int V;
    public final int W;
    public final h X;
    public final l Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f86803a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f86804b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f86805d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f86806e0;
    public final Object f0;
    public final Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedFavouritesAddAssetScreen(SharedFavouritesAddAssetScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = true;
        this.V = R$layout.screen_recycler_navbar_nextbuttonsdisabled;
        this.W = R$id.recyclerNavbarNextButton_recyclerView;
        this.X = vc.s.t(this, f.f);
        this.Y = new l();
        this.Z = w.y0(new y7k.h(27));
        this.f86803a0 = w.y0(new y7k.h(28));
        this.f86804b0 = w.y0(new y7k.h(29));
        this.c0 = w.y0(new c(0));
        this.f86805d0 = w.y0(new c(1));
        final int i = 0;
        this.f86806e0 = w.y0(new Function0(this) { // from class: yfd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedFavouritesAddAssetScreen f313215b;

            {
                this.f313215b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SharedFavouritesAddAssetScreen sharedFavouritesAddAssetScreen = this.f313215b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SharedFavouritesAddAssetScreen.f86802h0;
                        return zhm.v.k((RowDelegate) sharedFavouritesAddAssetScreen.Z.getValue(), (RowLoadingDelegate) sharedFavouritesAddAssetScreen.f86803a0.getValue(), (SelectableDelegate) sharedFavouritesAddAssetScreen.f86804b0.getValue(), (TextDelegate) sharedFavouritesAddAssetScreen.c0.getValue(), (FullScreenStateDelegate) sharedFavouritesAddAssetScreen.f86805d0.getValue());
                    default:
                        KProperty[] kPropertyArr2 = SharedFavouritesAddAssetScreen.f86802h0;
                        fgd.i iVar = (fgd.i) sharedFavouritesAddAssetScreen.f0.getValue();
                        switch (iVar.f135057a) {
                            case 0:
                                return (q) iVar.d.get();
                            default:
                                return (q) iVar.d.get();
                        }
                }
            }
        });
        this.f0 = w.y0(new y1a.a(this, inputData, 29));
        final int i2 = 1;
        this.g0 = w.y0(new Function0(this) { // from class: yfd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedFavouritesAddAssetScreen f313215b;

            {
                this.f313215b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SharedFavouritesAddAssetScreen sharedFavouritesAddAssetScreen = this.f313215b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SharedFavouritesAddAssetScreen.f86802h0;
                        return zhm.v.k((RowDelegate) sharedFavouritesAddAssetScreen.Z.getValue(), (RowLoadingDelegate) sharedFavouritesAddAssetScreen.f86803a0.getValue(), (SelectableDelegate) sharedFavouritesAddAssetScreen.f86804b0.getValue(), (TextDelegate) sharedFavouritesAddAssetScreen.c0.getValue(), (FullScreenStateDelegate) sharedFavouritesAddAssetScreen.f86805d0.getValue());
                    default:
                        KProperty[] kPropertyArr2 = SharedFavouritesAddAssetScreen.f86802h0;
                        fgd.i iVar = (fgd.i) sharedFavouritesAddAssetScreen.f0.getValue();
                        switch (iVar.f135057a) {
                            case 0:
                                return (q) iVar.d.get();
                            default:
                                return (q) iVar.d.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (i) this.f0.getValue();
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(((SelectableDelegate) this.f86804b0.getValue()).r()), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) this.Z.getValue()).f53218h), null, new yfd.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((TextDelegate) this.c0.getValue()).d), null, new a1(this, null, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.f86805d0.getValue()).f52371h.f121375b), null, new yfd.i(this, null), 3);
        NavBarWithToolbar navBarWithToolbar = h3().f183954c;
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.f59410q), null, new j(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.o.f57403b), null, new k(this, null, 0), 3);
        SearchView searchView = navBarWithToolbar.f59409p;
        com.revolut.kompot.navigable.a.g2(this, e.b(searchView.f57336l), null, new d(navBarWithToolbar, this, null, 21), 3);
        r rVarDebounce = searchView.f57337m.debounce(300L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarDebounce), null, new k(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f183953b.o0()), null, new j(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f183954c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.shared_watchlist_common_search_placeholder, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.post(new cgd.e(navBarWithToolbar, 6));
        TwinVerticalButton twinVerticalButton = h3().f183953b;
        int i2 = yfd.e.f313216a[((SharedFavouritesAddAssetScreenContract$InputData) this.G).f86811c.ordinal()];
        if (i2 == 1) {
            i = 8;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        }
        twinVerticalButton.setVisibility(i);
        TwinVerticalButton twinVerticalButton2 = h3().f183953b;
        twinVerticalButton2.setCollapsible(false);
        twinVerticalButton2.setMainButtonVisible(true);
        twinVerticalButton2.setMainButtonEnabled(false);
        twinVerticalButton2.setSecondaryButtonVisible(false);
        twinVerticalButton2.setSecondaryButtonEnabled(false);
        twinVerticalButton2.setMainButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        twinVerticalButton2.setFabEnabled(false);
        h3().d.addOnScrollListener(this.Y);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void X2() {
        h3().d.removeOnScrollListener(this.Y);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF78883b0() {
        return (List) this.f86806e0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(s uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        TwinVerticalButton twinVerticalButton = h3().f183953b;
        a aVar = uiState.f313226c;
        Clause clause = uiState.f313224a;
        if (aVar.equals(a.C0543a.f86813a)) {
            twinVerticalButton.setMainButtonVisible(false);
        } else {
            if (!(aVar instanceof yfd.r)) {
                throw new NoWhenBranchMatchedException();
            }
            twinVerticalButton.setMainButtonVisible(true);
            yfd.r rVar = (yfd.r) aVar;
            twinVerticalButton.setMainButtonEnabled(rVar.f313222a);
            twinVerticalButton.setMainButtonText(rVar.f313223b);
        }
        Clause clause2 = uiState.d;
        if (clause2 == null) {
            twinVerticalButton.setGradientBackgroundEnabled(false);
            TwinVerticalButton.setDescription$default(twinVerticalButton, null, null, null, 6, null);
        } else {
            twinVerticalButton.setGradientBackgroundEnabled(true);
            TwinVerticalButton.setDescription$default(twinVerticalButton, clause2, null, null, 6, null);
        }
        NavBarWithToolbar navBarWithToolbar = h3().f183954c;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setMenuItems(uiState.f313225b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.V;
    }

    public final kgd.b h3() {
        ViewBinding value = this.X.getValue(this, f86802h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (kgd.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final q T2() {
        return (q) this.g0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
