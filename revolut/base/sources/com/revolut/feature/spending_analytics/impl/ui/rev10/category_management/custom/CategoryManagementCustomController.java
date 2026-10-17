package com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import e58.d;
import ec8.c;
import efm.r;
import enb.f;
import epd.e;
import epd.g;
import epd.i;
import epd.j;
import epd.k;
import epd.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/category_management/custom/CategoryManagementCustomController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lepd/e;", "Ldli/a;", "Lepd/g;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CategoryManagementCustomController extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CategoryManagementCustomController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final InputTextDelegate O;
    public final IconSelectorDelegate P;
    public final LargeActionButtonDelegate Q;
    public final TwinHorizontalButtonDelegate R;
    public final Object S;

    public CategoryManagementCustomController(CategoryManagementCustomContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, i.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: epd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CategoryManagementCustomController f128171b;

            {
                this.f128171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CategoryManagementCustomController.T;
                        return (c) ((ppd.s) this.f128171b.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr2 = CategoryManagementCustomController.T;
                        CategoryManagementCustomController categoryManagementCustomController = this.f128171b;
                        return dli.f.a(categoryManagementCustomController, categoryManagementCustomController.R2(), v.k(new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), categoryManagementCustomController.O, categoryManagementCustomController.P), 0, null, null, null, 60);
                }
            }
        });
        this.N = w.y0(new d(this, inputData, 29));
        this.O = new InputTextDelegate(null);
        this.P = new IconSelectorDelegate();
        this.Q = new LargeActionButtonDelegate();
        this.R = new TwinHorizontalButtonDelegate();
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: epd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CategoryManagementCustomController f128171b;

            {
                this.f128171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CategoryManagementCustomController.T;
                        return (c) ((ppd.s) this.f128171b.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr2 = CategoryManagementCustomController.T;
                        CategoryManagementCustomController categoryManagementCustomController = this.f128171b;
                        return dli.f.a(categoryManagementCustomController, categoryManagementCustomController.R2(), v.k(new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), categoryManagementCustomController.O, categoryManagementCustomController.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f128168b);
        TextNavBarMenuItem textNavBarMenuItem = uiState.f128169c;
        if (textNavBarMenuItem != null) {
            d3().f174565c.setMenuItems(u.c(textNavBarMenuItem));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ppd.s) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((ppd.s) this.N.getValue()).d.get()).d(v.k(this.Q, this.R));
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.analytics_categories_custom_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.analytics_categories_custom_title, null, null, 14));
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_save, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.o.f57403b), null, new j(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.e.f121375b), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52489c.d), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new f(view, this, null, 10), 3);
        r map = this.Q.d.f121375b.map(new eli.k(new ep2.l(2), 3));
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.R;
        r rVarMerge = r.merge(map, w.a0(twinHorizontalButtonDelegate.f53572c.f121375b, new ep2.l(3)), w.a0(twinHorizontalButtonDelegate.d.f121375b, new ep2.l(4)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new j(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final epd.c R2() {
        return (epd.c) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
