package com.revolut.retail.feature.ratedetails.impl.ui;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import aw0.q0;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SimpleActionHeaderDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.ButtonsActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.ratedetails.impl.R$id;
import com.revolut.retail.feature.ratedetails.impl.R$layout;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreen;
import efm.r;
import ihm.f;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import npk.d;
import rd0.e;
import te0.w;
import vc.s;
import xfj.a;
import xkf.c;
import xo8.i0;
import xo8.u;
import xpk.g;
import xpk.j;
import xpk.m;
import ypk.b;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/ratedetails/impl/ui/RateDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lxpk/j;", "Lcom/revolut/retail/feature/ratedetails/impl/ui/RateDetailsScreenContract$InputData;", "Laii/q;", "Lypk/b;", "feature_rate_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RateDetailsScreen extends BaseRecyclerViewScreen<j, RateDetailsScreenContract$InputData, q> implements b {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f103723e0 = {o0.f186429a.j(new h0(RateDetailsScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/ratedetails/impl/databinding/ScreenRateDetailsBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f103724a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f103725b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f103726d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateDetailsScreen(RateDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_rate_details;
        this.V = R$id.rateDetails_recycler;
        this.W = s.t(this, xpk.b.f);
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: xpk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RateDetailsScreen f307984b;

            {
                this.f307984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RateDetailsScreen rateDetailsScreen = this.f307984b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RateDetailsScreen.f103723e0;
                        return v.k((TrendViewDelegate) rateDetailsScreen.f103724a0.getValue(), (TabsDelegate) rateDetailsScreen.c0.getValue(), (FixedTabsDelegate) rateDetailsScreen.f103725b0.getValue(), (SimpleActionHeaderDelegate) rateDetailsScreen.f103726d0.getValue(), new PlainTextDelegate(), new HeaderLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new FixedTabsLoadingDelegate());
                    default:
                        KProperty[] kPropertyArr2 = RateDetailsScreen.f103723e0;
                        return (m) ((npk.d) rateDetailsScreen.Z.getValue()).f218267q.get();
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: xpk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RateDetailsScreen f307984b;

            {
                this.f307984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RateDetailsScreen rateDetailsScreen = this.f307984b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RateDetailsScreen.f103723e0;
                        return v.k((TrendViewDelegate) rateDetailsScreen.f103724a0.getValue(), (TabsDelegate) rateDetailsScreen.c0.getValue(), (FixedTabsDelegate) rateDetailsScreen.f103725b0.getValue(), (SimpleActionHeaderDelegate) rateDetailsScreen.f103726d0.getValue(), new PlainTextDelegate(), new HeaderLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new FixedTabsLoadingDelegate());
                    default:
                        KProperty[] kPropertyArr2 = RateDetailsScreen.f103723e0;
                        return (m) ((npk.d) rateDetailsScreen.Z.getValue()).f218267q.get();
                }
            }
        });
        this.Z = w.y0(new a(this, inputData, 10));
        this.f103724a0 = w.y0(new c(22));
        this.f103725b0 = w.y0(new c(23));
        this.c0 = w.y0(new c(24));
        this.f103726d0 = w.y0(new c(25));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f199147c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.f59410q), null, new xpk.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.o.f57403b), null, new xpk.d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b((f) navBarWithToolbar.f59406n.f258290b), null, new xpk.d(this, continuation, 1), 3);
        navBarWithToolbar.setCompactDescriptions(true);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f199146b.e.f121375b), null, new xpk.d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((SimpleActionHeaderDelegate) this.f103726d0.getValue()).f53321c.f121375b), null, new g(this, null), 3);
        r rVarFilter = ((TabsDelegate) this.c0.getValue()).f.f121375b.filter(new u(3, new i0(12)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter), null, new xpk.c(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF72103d0() {
        return (List) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getF91882h0() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Clause textClause;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        List<? extends NavBarMenuItem> list = uiState.f307992b;
        q0 q0Var = uiState.f307994g;
        if (!list.isEmpty()) {
            h3().f199147c.setMenuItems(list);
        }
        NavBarWithToolbar navBarWithToolbar = h3().f199147c;
        navBarWithToolbar.setTitleVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setThirdDescriptionVisible(true);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setTitleTopDescriptionVisible(true);
        navBarWithToolbar.H0(true);
        Clause clause = uiState.f307993c;
        Clause clause2 = uiState.d;
        if (clause2 == null) {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = clause2;
        }
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, clause, textClause, null, 4, null);
        navBarWithToolbar.setEndIconImage(uiState.e);
        navBarWithToolbar.setTitleTopDescription(uiState.f307993c);
        navBarWithToolbar.setHeaderDisclaimerSticky(uiState.f307995h);
        p9j.a aVar = (p9j.a) uiState.f.getContent();
        if (aVar != null) {
            navBarWithToolbar.setTitle(aVar.f234323a, null);
            navBarWithToolbar.setSecondDescriptionText(aVar.f234325c);
            navBarWithToolbar.setThirdDescriptionText(aVar.d);
        }
        ButtonsActionsView rateDetailsButtonsActions = h3().f199146b;
        Intrinsics.checkNotNullExpressionValue(rateDetailsButtonsActions, "rateDetailsButtonsActions");
        rateDetailsButtonsActions.setVisibility(q0Var == null ? 8 : 0);
        if (q0Var != null) {
            h3().f199146b.b(q0Var);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getS() {
        return this.U;
    }

    public final lpk.a h3() {
        ViewBinding value = this.W.getValue(this, f103723e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (lpk.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final m T2() {
        return (m) this.Y.getValue();
    }
}
