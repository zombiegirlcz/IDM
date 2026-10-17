package com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser;

import a26.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import c65.i;
import cbh.b;
import cf6.a;
import cgd.f;
import cgd.g;
import cgd.j;
import cgd.m;
import cgd.n;
import cgd.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.R$id;
import com.revolut.feature.shared_separate_favourites.R$layout;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ned.k;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/common/screen/counterpart_chooser/SharedFavouritesCounterpartChooserScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lcgd/o;", "Lcom/revolut/feature/shared_separate_favourites/common/screen/counterpart_chooser/SharedFavouritesCounterpartChooserScreenContract$InputData;", "Lcgd/m;", "Companion", "a", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharedFavouritesCounterpartChooserScreen extends BaseRecyclerViewScreen<o, SharedFavouritesCounterpartChooserScreenContract$InputData, m> {
    public final boolean U;
    public final int V;
    public final int W;
    public final h X;
    public final j Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f86832a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f86833b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f86834d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f86835e0;
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(SharedFavouritesCounterpartChooserScreen.class, "binding", "getBinding()Lcom/revolut/feature/shared_separate_favourites/databinding/SharedFavouritesCounterpartChooserScreenBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final String g0 = "SEARCH_MENU_ITEM_ID";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final IconNavBarMenuItem f86831h0 = IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "SEARCH_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124);

    /* JADX INFO: renamed from: com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedFavouritesCounterpartChooserScreen(SharedFavouritesCounterpartChooserScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = true;
        this.V = R$layout.shared_favourites_counterpart_chooser_screen;
        this.W = R$id.sharedFavouritesCounterpartChooserScreen_recyclerView;
        this.X = s.t(this, f.f);
        this.Y = new j(this);
        this.Z = w.y0(new b(19));
        this.f86832a0 = w.y0(new b(20));
        this.f86833b0 = w.y0(new b(21));
        final int i = 0;
        this.c0 = w.y0(new Function0(this) { // from class: cgd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedFavouritesCounterpartChooserScreen f23934b;

            {
                this.f23934b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SharedFavouritesCounterpartChooserScreen sharedFavouritesCounterpartChooserScreen = this.f23934b;
                switch (i2) {
                    case 0:
                        return v.k((RowLoadingDelegate) sharedFavouritesCounterpartChooserScreen.Z.getValue(), (RowDelegate) sharedFavouritesCounterpartChooserScreen.f86832a0.getValue(), (FullScreenStateDelegate) sharedFavouritesCounterpartChooserScreen.f86833b0.getValue());
                    default:
                        SharedFavouritesCounterpartChooserScreen.Companion companion = SharedFavouritesCounterpartChooserScreen.INSTANCE;
                        return (n) ((ned.k) sharedFavouritesCounterpartChooserScreen.f86834d0.getValue()).f.get();
                }
            }
        });
        this.f86834d0 = w.y0(new a(this, inputData, 3));
        final int i2 = 1;
        this.f86835e0 = w.y0(new Function0(this) { // from class: cgd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedFavouritesCounterpartChooserScreen f23934b;

            {
                this.f23934b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SharedFavouritesCounterpartChooserScreen sharedFavouritesCounterpartChooserScreen = this.f23934b;
                switch (i22) {
                    case 0:
                        return v.k((RowLoadingDelegate) sharedFavouritesCounterpartChooserScreen.Z.getValue(), (RowDelegate) sharedFavouritesCounterpartChooserScreen.f86832a0.getValue(), (FullScreenStateDelegate) sharedFavouritesCounterpartChooserScreen.f86833b0.getValue());
                    default:
                        SharedFavouritesCounterpartChooserScreen.Companion companion = SharedFavouritesCounterpartChooserScreen.INSTANCE;
                        return (n) ((ned.k) sharedFavouritesCounterpartChooserScreen.f86834d0.getValue()).f.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (k) this.f86834d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (n) this.f86835e0.getValue();
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) this.f86832a0.getValue()).f53218h), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.f86833b0.getValue()).f52371h.f121375b), null, new cgd.h(this, null), 3);
        NavBarWithToolbar navBarWithToolbar = h3().f183967b;
        r rVarHide = navBarWithToolbar.f59422y.f275218a.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarHide), null, new cbh.g(navBarWithToolbar, continuation, 10), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.o.f57403b), null, new q(navBarWithToolbar, this, continuation, 29), 3);
        SearchView searchView = navBarWithToolbar.f59409p;
        com.revolut.kompot.navigable.a.g2(this, e.b(searchView.f57336l), null, new cbh.g(navBarWithToolbar, this, continuation, 11), 3);
        r rVarDebounce = searchView.f57337m.debounce(300L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarDebounce), null, new cbh.g(this, continuation, 12), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.f59410q), null, new i(this, continuation, 13), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f183967b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(((SharedFavouritesCounterpartChooserScreenContract$InputData) this.G).f86838c ? R$drawable.uikit_icn_24_cross : R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.shared_watchlist_common_search_placeholder, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.post(new cgd.e(navBarWithToolbar, 0));
        h3().f183968c.addOnScrollListener(this.Y);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void X2() {
        h3().f183968c.removeOnScrollListener(this.Y);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return (List) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(o uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f183967b;
        Clause clause = uiState.f23943a;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setDescriptionVisible(false);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final kgd.g h3() {
        ViewBinding value = this.X.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (kgd.g) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
