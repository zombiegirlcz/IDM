package com.revolut.feature.credit.application.plugins.impl.ui.valuators.list;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import aw3.m;
import cli.o;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.list.ValuatorsListScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import dw3.c1;
import dw3.d7;
import dw3.i5;
import efm.r;
import igh.k;
import ij4.d;
import ij4.f;
import ij4.h;
import ij4.i;
import ij4.j;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import t60.b;
import t60.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/list/ValuatorsListScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lij4/h;", "Ldli/a;", "Lij4/i;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ValuatorsListScreen extends PluginScreenController<h> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ValuatorsListScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditTabsBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object T;
    public final int L = R$layout.screen_credit_tabs;
    public final db.a P = new db.a(this, 1);
    public final ao.h Q = s.t(this, a.f);
    public final RowDelegate R = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate S = new FullScreenStateDelegate();

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditTabsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.screenCreditTabs_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.screenCreditTabs_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    i = R$id.screenCreditTabs_sectionTabs;
                    Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i);
                    if (tabs != null) {
                        i = R$id.screenCreditTabs_slidingContainer;
                        SlidingFromTopViewContainer slidingFromTopViewContainer = (SlidingFromTopViewContainer) ViewBindings.findChildViewById(p0, i);
                        if (slidingFromTopViewContainer != null) {
                            return new m(tabs, navBarWithToolbar, slidingFromTopViewContainer, (ControllerContainerCoordinatorLayout) p0, screenContentRecyclerView);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public ValuatorsListScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ij4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ValuatorsListScreen f161696b;

            {
                this.f161696b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ValuatorsListScreen valuatorsListScreen = this.f161696b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ValuatorsListScreen.U;
                        qji.b bVarU2 = valuatorsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.valuators.list.di.ValuatorsListScreenInjector");
                        i5 i5Var = (i5) bVarU2;
                        c1 c1Var = i5Var.f118978a;
                        i5 i5Var2 = i5Var.f118979b;
                        ScreenContentRecyclerView screenCreditTabsRecyclerView = valuatorsListScreen.d3().f10705c;
                        Intrinsics.checkNotNullExpressionValue(screenCreditTabsRecyclerView, "screenCreditTabsRecyclerView");
                        return new d7(c1Var, i5Var2, screenCreditTabsRecyclerView);
                    case 1:
                        KProperty[] kPropertyArr2 = ValuatorsListScreen.U;
                        return (j) ((d7) valuatorsListScreen.M.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ValuatorsListScreen.U;
                        return (t60.b) ((d7) valuatorsListScreen.M.getValue()).f118592b.get();
                    default:
                        KProperty[] kPropertyArr4 = ValuatorsListScreen.U;
                        int i3 = R$id.screenCreditTabs_recyclerView;
                        ValuatorsListScreen valuatorsListScreen2 = this.f161696b;
                        return dli.f.a(valuatorsListScreen2, valuatorsListScreen2.R2(), v.k(valuatorsListScreen2.R, valuatorsListScreen2.S, new ListSubheaderDelegate(), new RowLoadingDelegate()), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ij4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ValuatorsListScreen f161696b;

            {
                this.f161696b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ValuatorsListScreen valuatorsListScreen = this.f161696b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ValuatorsListScreen.U;
                        qji.b bVarU2 = valuatorsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.valuators.list.di.ValuatorsListScreenInjector");
                        i5 i5Var = (i5) bVarU2;
                        c1 c1Var = i5Var.f118978a;
                        i5 i5Var2 = i5Var.f118979b;
                        ScreenContentRecyclerView screenCreditTabsRecyclerView = valuatorsListScreen.d3().f10705c;
                        Intrinsics.checkNotNullExpressionValue(screenCreditTabsRecyclerView, "screenCreditTabsRecyclerView");
                        return new d7(c1Var, i5Var2, screenCreditTabsRecyclerView);
                    case 1:
                        KProperty[] kPropertyArr2 = ValuatorsListScreen.U;
                        return (j) ((d7) valuatorsListScreen.M.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ValuatorsListScreen.U;
                        return (t60.b) ((d7) valuatorsListScreen.M.getValue()).f118592b.get();
                    default:
                        KProperty[] kPropertyArr4 = ValuatorsListScreen.U;
                        int i3 = R$id.screenCreditTabs_recyclerView;
                        ValuatorsListScreen valuatorsListScreen2 = this.f161696b;
                        return dli.f.a(valuatorsListScreen2, valuatorsListScreen2.R2(), v.k(valuatorsListScreen2.R, valuatorsListScreen2.S, new ListSubheaderDelegate(), new RowLoadingDelegate()), i3, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: ij4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ValuatorsListScreen f161696b;

            {
                this.f161696b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ValuatorsListScreen valuatorsListScreen = this.f161696b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ValuatorsListScreen.U;
                        qji.b bVarU2 = valuatorsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.valuators.list.di.ValuatorsListScreenInjector");
                        i5 i5Var = (i5) bVarU2;
                        c1 c1Var = i5Var.f118978a;
                        i5 i5Var2 = i5Var.f118979b;
                        ScreenContentRecyclerView screenCreditTabsRecyclerView = valuatorsListScreen.d3().f10705c;
                        Intrinsics.checkNotNullExpressionValue(screenCreditTabsRecyclerView, "screenCreditTabsRecyclerView");
                        return new d7(c1Var, i5Var2, screenCreditTabsRecyclerView);
                    case 1:
                        KProperty[] kPropertyArr2 = ValuatorsListScreen.U;
                        return (j) ((d7) valuatorsListScreen.M.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ValuatorsListScreen.U;
                        return (t60.b) ((d7) valuatorsListScreen.M.getValue()).f118592b.get();
                    default:
                        KProperty[] kPropertyArr4 = ValuatorsListScreen.U;
                        int i32 = R$id.screenCreditTabs_recyclerView;
                        ValuatorsListScreen valuatorsListScreen2 = this.f161696b;
                        return dli.f.a(valuatorsListScreen2, valuatorsListScreen2.R2(), v.k(valuatorsListScreen2.R, valuatorsListScreen2.S, new ListSubheaderDelegate(), new RowLoadingDelegate()), i32, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: ij4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ValuatorsListScreen f161696b;

            {
                this.f161696b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ValuatorsListScreen valuatorsListScreen = this.f161696b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ValuatorsListScreen.U;
                        qji.b bVarU2 = valuatorsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.valuators.list.di.ValuatorsListScreenInjector");
                        i5 i5Var = (i5) bVarU2;
                        c1 c1Var = i5Var.f118978a;
                        i5 i5Var2 = i5Var.f118979b;
                        ScreenContentRecyclerView screenCreditTabsRecyclerView = valuatorsListScreen.d3().f10705c;
                        Intrinsics.checkNotNullExpressionValue(screenCreditTabsRecyclerView, "screenCreditTabsRecyclerView");
                        return new d7(c1Var, i5Var2, screenCreditTabsRecyclerView);
                    case 1:
                        KProperty[] kPropertyArr2 = ValuatorsListScreen.U;
                        return (j) ((d7) valuatorsListScreen.M.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ValuatorsListScreen.U;
                        return (t60.b) ((d7) valuatorsListScreen.M.getValue()).f118592b.get();
                    default:
                        KProperty[] kPropertyArr4 = ValuatorsListScreen.U;
                        int i32 = R$id.screenCreditTabs_recyclerView;
                        ValuatorsListScreen valuatorsListScreen2 = this.f161696b;
                        return dli.f.a(valuatorsListScreen2, valuatorsListScreen2.R2(), v.k(valuatorsListScreen2.R, valuatorsListScreen2.S, new ListSubheaderDelegate(), new RowLoadingDelegate()), i32, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().d.setItems(uiState.f161705b, uiState.f161706c);
        Integer num = uiState.d;
        if (num != null) {
            int iIntValue = num.intValue();
            RecyclerView.LayoutManager layoutManagerB2 = ((c) this.T.getValue()).b2();
            Intrinsics.i(layoutManagerB2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManagerB2).scrollToPositionWithOffset(iIntValue, d3().e.getHeight());
            j jVarR2 = R2();
            jVarR2.H2(jVarR2.f161707p, new k(24));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d7) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f10704b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.recommended_valuators_list_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.recommended_valuators_list_title, null, null, 14), null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        d3().f10704b.removeOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this.P);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        r rVarR = ((g) ((b) this.O.getValue())).R();
        d dVar = d.f;
        r rVarThrottleLast = rVarR.filter(new h35.c(20)).throttleLast(200L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarThrottleLast, "throttleLast(...)");
        int i = 1;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, new ie7.h(rd0.e.b(rVarThrottleLast), this, i), null, new ij4.e(this, continuation, 0), 3);
        d3().f10704b.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this.P);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f10704b.f59410q), null, new iaf.d(this, continuation, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f58882b), null, new ij4.e(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, new i5b.d(rd0.e.b(this.R.f53218h), 25), null, new ij4.e(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f52371h.f121375b), null, new f(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.Q.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }
}
