package com.revolut.feature.wealth.assetdetails.ui.impl.ratings.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.details.RatingsDetailsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import y1a.a;
import y4h.b;
import y4h.c;
import y4h.e;
import y4h.f;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/assetdetails/ui/impl/ratings/details/RatingsDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ly4h/f;", "Lcom/revolut/feature/wealth/assetdetails/ui/impl/ratings/details/RatingsDetailsScreenContract$InputData;", "Laii/q;", "feature_wealth_asset_details_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RatingsDetailsScreen extends BaseRecyclerViewScreen<f, RatingsDetailsScreenContract$InputData, q> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f95432e0 = {o0.f186429a.j(new h0(RatingsDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final boolean U;
    public final int V;
    public final h W;
    public final ListSubheaderDelegate X;
    public final CellDetailsBadgeDelegate Y;
    public final CellDetailsDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final PlainTextDelegate f95433a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f95434b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f95435d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingsDetailsScreen(RatingsDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = true;
        this.V = R$layout.screen_recycler_navbar;
        this.W = s.t(this, b.f);
        this.X = new ListSubheaderDelegate();
        this.Y = new CellDetailsBadgeDelegate();
        this.Z = new CellDetailsDelegate();
        this.f95433a0 = new PlainTextDelegate();
        final int i = 0;
        this.f95434b0 = w.y0(new Function0(this) { // from class: y4h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RatingsDetailsScreen f310936b;

            {
                this.f310936b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RatingsDetailsScreen ratingsDetailsScreen = this.f310936b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RatingsDetailsScreen.f95432e0;
                        return v.k(new ListSubheaderLoadingDelegate(), ratingsDetailsScreen.X, new CellDetailsLoadingDelegate(), ratingsDetailsScreen.Y, ratingsDetailsScreen.Z, new PlainTextLoadingDelegate(), ratingsDetailsScreen.f95433a0, new TextDelegate());
                    default:
                        KProperty[] kPropertyArr2 = RatingsDetailsScreen.f95432e0;
                        return (e) ((z3h.f) ratingsDetailsScreen.c0.getValue()).f319278c.get();
                }
            }
        });
        this.c0 = w.y0(new a(this, inputData, 5));
        final int i2 = 1;
        this.f95435d0 = w.y0(new Function0(this) { // from class: y4h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RatingsDetailsScreen f310936b;

            {
                this.f310936b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RatingsDetailsScreen ratingsDetailsScreen = this.f310936b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RatingsDetailsScreen.f95432e0;
                        return v.k(new ListSubheaderLoadingDelegate(), ratingsDetailsScreen.X, new CellDetailsLoadingDelegate(), ratingsDetailsScreen.Y, ratingsDetailsScreen.Z, new PlainTextLoadingDelegate(), ratingsDetailsScreen.f95433a0, new TextDelegate());
                    default:
                        KProperty[] kPropertyArr2 = RatingsDetailsScreen.f95432e0;
                        return (e) ((z3h.f) ratingsDetailsScreen.c0.getValue()).f319278c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (z3h.f) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.f95435d0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174539b.f59410q), null, new xb4.e(this, null, 25), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Z.d), null, new c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF0() {
        return (List) this.f95434b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(f uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f310940a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        h3().f174539b.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final m h3() {
        ViewBinding value = this.W.getValue(this, f95432e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
