package com.revolut.feature.wealth_discovery.impl.collection.popular_first_buy;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.wealth.resources.R$string;
import d8e.a;
import dcf.v0;
import doh.b;
import doh.d;
import doh.f;
import doh.g;
import java.util.List;
import jii.m;
import joh.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/collection/popular_first_buy/PopularFirstBuyScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ldoh/g;", "Lcom/revolut/feature/wealth_discovery/impl/collection/popular_first_buy/PopularFirstBuyScreenContract$Input;", "Laii/q;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PopularFirstBuyScreen extends BaseRecyclerViewScreen<g, PopularFirstBuyScreenContract$Input, q> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(PopularFirstBuyScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final TextDelegate X;
    public final RowDelegate Y;
    public final FixedTabsDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f96134a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f96135b0;
    public final FullScreenStateDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f96136d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final j f96137e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopularFirstBuyScreen(PopularFirstBuyScreenContract$Input inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = s.t(this, b.f);
        TextDelegate textDelegate = new TextDelegate();
        this.X = textDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Y = rowDelegate;
        FixedTabsDelegate fixedTabsDelegate = new FixedTabsDelegate();
        this.Z = fixedTabsDelegate;
        this.f96134a0 = w.y0(new dgg.b(this, inputData, 9));
        this.f96135b0 = w.y0(new a(this, 11));
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.c0 = fullScreenStateDelegate;
        this.f96136d0 = v.k(textDelegate, rowDelegate, fixedTabsDelegate, new RowLoadingDelegate(), new PlainTextDelegate(), fullScreenStateDelegate);
        this.f96137e0 = new j(this, 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (c) this.f96134a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.f96135b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.W.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(((m) value).f174539b.f59410q), null, new v0(this, continuation, 12), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.f52371h.f121375b), null, new doh.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Y.f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.f52339c.f121375b), null, new dob.c(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.wealth_trading_popular_first_buy_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_trading_popular_first_buy_header_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.wealth_trading_popular_first_buy_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF96136d0() {
        return this.f96136d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
