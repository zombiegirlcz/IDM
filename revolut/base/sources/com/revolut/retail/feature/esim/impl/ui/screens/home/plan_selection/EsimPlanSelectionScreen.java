package com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection;

import afj.k1;
import afj.l1;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.ComponentDelegate;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.internal.views.switcher_button.SwitcherButtonView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$layout;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.EsimPlanSelectionScreen;
import fij.b0;
import fij.w;
import fij.x;
import ix0.a2;
import jeg.g;
import jij.b;
import jij.d;
import jij.f;
import jij.i;
import jij.k;
import jij.l;
import jij.n;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oij.e;
import pu7.a;
import tx0.j0;
import unj.m;
import vc.s;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/plan_selection/EsimPlanSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfij/w;", "Lcli/w;", "Lfij/b0;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimPlanSelectionScreen extends ViewController<w> implements cli.w {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f101016d0 = {o0.f186429a.j(new h0(EsimPlanSelectionScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/esim/impl/databinding/ScreenEsimPlanSelectionBinding;", 0))};
    public final EsimGetPlanScreenContract$InputData K;
    public final int L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final FullScreenStateDelegate Q;
    public final CellDetailsDelegate R;
    public final SelectableDelegate S;
    public final PlanTileDelegate T;
    public final AttributeSelectorSmallDelegate U;
    public final CellDetailsStandaloneNoteDelegate V;
    public final ComponentDelegate W;
    public final ContainerDelegate X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final e f101017a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public a2 f101018b0;
    public boolean c0;

    public EsimPlanSelectionScreen(EsimGetPlanScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$style.UiKitTheme_Transparent;
        this.M = R$layout.screen_esim_plan_selection;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = te0.w.y0(new Function0(this) { // from class: jij.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimPlanSelectionScreen f174581b;

            {
                this.f174581b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimPlanSelectionScreen esimPlanSelectionScreen = this.f174581b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimPlanSelectionScreen.f101016d0;
                        qji.b bVarU2 = esimPlanSelectionScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.di.EsimPlanSelectionScreenInjector");
                        }
                        k1 k1Var = (k1) ((kij.a) bVarU2).R().mo3808a(esimPlanSelectionScreen);
                        EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData = esimPlanSelectionScreen.K;
                        switch (k1Var.f4312a) {
                            case 0:
                                esimGetPlanScreenContract$InputData.getClass();
                                k1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                            default:
                                esimGetPlanScreenContract$InputData.getClass();
                                k1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                        }
                        return (l1) k1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EsimPlanSelectionScreen.f101016d0;
                        l1 l1Var = (l1) esimPlanSelectionScreen.O.getValue();
                        switch (l1Var.f4327a) {
                            case 0:
                                return (x) l1Var.e.get();
                            default:
                                return (x) l1Var.e.get();
                        }
                    case 2:
                        return new z4l.j(7, u.c(esimPlanSelectionScreen.X), false);
                    default:
                        KProperty[] kPropertyArr3 = EsimPlanSelectionScreen.f101016d0;
                        return n14.e.a(esimPlanSelectionScreen, esimPlanSelectionScreen.d());
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: jij.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimPlanSelectionScreen f174581b;

            {
                this.f174581b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimPlanSelectionScreen esimPlanSelectionScreen = this.f174581b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimPlanSelectionScreen.f101016d0;
                        qji.b bVarU2 = esimPlanSelectionScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.di.EsimPlanSelectionScreenInjector");
                        }
                        k1 k1Var = (k1) ((kij.a) bVarU2).R().mo3808a(esimPlanSelectionScreen);
                        EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData = esimPlanSelectionScreen.K;
                        switch (k1Var.f4312a) {
                            case 0:
                                esimGetPlanScreenContract$InputData.getClass();
                                k1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                            default:
                                esimGetPlanScreenContract$InputData.getClass();
                                k1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                        }
                        return (l1) k1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EsimPlanSelectionScreen.f101016d0;
                        l1 l1Var = (l1) esimPlanSelectionScreen.O.getValue();
                        switch (l1Var.f4327a) {
                            case 0:
                                return (x) l1Var.e.get();
                            default:
                                return (x) l1Var.e.get();
                        }
                    case 2:
                        return new z4l.j(7, u.c(esimPlanSelectionScreen.X), false);
                    default:
                        KProperty[] kPropertyArr3 = EsimPlanSelectionScreen.f101016d0;
                        return n14.e.a(esimPlanSelectionScreen, esimPlanSelectionScreen.d());
                }
            }
        });
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Q = fullScreenStateDelegate;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.R = cellDetailsDelegate;
        SelectableDelegate selectableDelegate = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.S = selectableDelegate;
        PlanTileDelegate planTileDelegate = new PlanTileDelegate(0);
        this.T = planTileDelegate;
        AttributeSelectorSmallDelegate attributeSelectorSmallDelegate = new AttributeSelectorSmallDelegate();
        this.U = attributeSelectorSmallDelegate;
        CellDetailsStandaloneNoteDelegate cellDetailsStandaloneNoteDelegate = new CellDetailsStandaloneNoteDelegate();
        this.V = cellDetailsStandaloneNoteDelegate;
        ComponentDelegate.Companion companion = ComponentDelegate.INSTANCE;
        ComponentDelegate componentDelegate = new ComponentDelegate(o0.f186429a.b(SwitcherButtonView.class), n.f174587a);
        this.W = componentDelegate;
        final int i3 = 2;
        final int i5 = 3;
        this.X = new ContainerDelegate(v.k(new TabsLoadingDelegate(), new RowLoadingDelegate(), new TextDelegate(), new ScrollerDelegate(u.c(attributeSelectorSmallDelegate), false), fullScreenStateDelegate, cellDetailsDelegate, selectableDelegate, planTileDelegate, cellDetailsStandaloneNoteDelegate, componentDelegate), null, 6);
        this.Y = te0.w.y0(new Function0(this) { // from class: jij.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimPlanSelectionScreen f174581b;

            {
                this.f174581b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimPlanSelectionScreen esimPlanSelectionScreen = this.f174581b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimPlanSelectionScreen.f101016d0;
                        qji.b bVarU2 = esimPlanSelectionScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.di.EsimPlanSelectionScreenInjector");
                        }
                        k1 k1Var = (k1) ((kij.a) bVarU2).R().mo3808a(esimPlanSelectionScreen);
                        EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData = esimPlanSelectionScreen.K;
                        switch (k1Var.f4312a) {
                            case 0:
                                esimGetPlanScreenContract$InputData.getClass();
                                k1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                            default:
                                esimGetPlanScreenContract$InputData.getClass();
                                k1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                        }
                        return (l1) k1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EsimPlanSelectionScreen.f101016d0;
                        l1 l1Var = (l1) esimPlanSelectionScreen.O.getValue();
                        switch (l1Var.f4327a) {
                            case 0:
                                return (x) l1Var.e.get();
                            default:
                                return (x) l1Var.e.get();
                        }
                    case 2:
                        return new z4l.j(7, u.c(esimPlanSelectionScreen.X), false);
                    default:
                        KProperty[] kPropertyArr3 = EsimPlanSelectionScreen.f101016d0;
                        return n14.e.a(esimPlanSelectionScreen, esimPlanSelectionScreen.d());
                }
            }
        });
        this.Z = te0.w.y0(new Function0(this) { // from class: jij.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimPlanSelectionScreen f174581b;

            {
                this.f174581b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                EsimPlanSelectionScreen esimPlanSelectionScreen = this.f174581b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimPlanSelectionScreen.f101016d0;
                        qji.b bVarU2 = esimPlanSelectionScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.di.EsimPlanSelectionScreenInjector");
                        }
                        k1 k1Var = (k1) ((kij.a) bVarU2).R().mo3808a(esimPlanSelectionScreen);
                        EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData = esimPlanSelectionScreen.K;
                        switch (k1Var.f4312a) {
                            case 0:
                                esimGetPlanScreenContract$InputData.getClass();
                                k1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                            default:
                                esimGetPlanScreenContract$InputData.getClass();
                                k1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                        }
                        return (l1) k1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EsimPlanSelectionScreen.f101016d0;
                        l1 l1Var = (l1) esimPlanSelectionScreen.O.getValue();
                        switch (l1Var.f4327a) {
                            case 0:
                                return (x) l1Var.e.get();
                            default:
                                return (x) l1Var.e.get();
                        }
                    case 2:
                        return new z4l.j(7, u.c(esimPlanSelectionScreen.X), false);
                    default:
                        KProperty[] kPropertyArr3 = EsimPlanSelectionScreen.f101016d0;
                        return n14.e.a(esimPlanSelectionScreen, esimPlanSelectionScreen.d());
                }
            }
        });
        this.f101017a0 = new e(new g(this, 23));
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getR() {
        return Integer.valueOf(this.L);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        b0 uiState = (b0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ((j) this.Y.getValue()).c(uiState.f135436a);
        wej.e eVarD3 = d3();
        Tabs screenEsimPlanSelectionTabs = eVarD3.e;
        ViewPager2 viewPager2 = eVarD3.f;
        Intrinsics.checkNotNullExpressionValue(screenEsimPlanSelectionTabs, "screenEsimPlanSelectionTabs");
        a.N(screenEsimPlanSelectionTabs, uiState.f135438c);
        NavBarWithToolbar screenEsimPlanSelectionNavBarWithToolbar = eVarD3.d;
        Intrinsics.checkNotNullExpressionValue(screenEsimPlanSelectionNavBarWithToolbar, "screenEsimPlanSelectionNavBarWithToolbar");
        a.P(screenEsimPlanSelectionNavBarWithToolbar, uiState.d);
        TwinVerticalButton screenEsimPlanSelectionButton = eVarD3.f296810c;
        Intrinsics.checkNotNullExpressionValue(screenEsimPlanSelectionButton, "screenEsimPlanSelectionButton");
        a.O(screenEsimPlanSelectionButton, uiState.e);
        eVarD3.f296809b.setBackgroundType(uiState.f);
        Integer num = uiState.f135437b;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue != viewPager2.getCurrentItem()) {
                viewPager2.setCurrentItem(iIntValue, this.c0);
            }
            this.c0 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l1) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        e eVar = this.f101017a0;
        eVar.f225700b = true;
        wej.e eVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = eVarD3.d;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        TwinVerticalButton screenEsimPlanSelectionButton = eVarD3.f296810c;
        screenEsimPlanSelectionButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        eVarD3.f296809b.setForeground(new ColorDrawable(io0.a.d(0.2f, kli.a.s(R$attr.uikit_colorBackground, m2()))));
        ViewPager2 viewPager2 = eVarD3.f;
        viewPager2.setAdapter((j) this.Y.getValue());
        viewPager2.registerOnPageChangeCallback(eVar);
        Intrinsics.checkNotNullExpressionValue(screenEsimPlanSelectionButton, "screenEsimPlanSelectionButton");
        this.f101018b0 = m.a(viewPager2, screenEsimPlanSelectionButton);
        this.c0 = false;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        a2 a2Var = this.f101018b0;
        if (a2Var != null) {
            a2Var.cancel();
        }
        d3().f.unregisterOnPageChangeCallback(this.f101017a0);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59410q), null, new jij.g(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f58882b), null, new jij.h(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f296810c.o0()), null, new jij.g(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f296810c.p0()), null, new jij.g(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52371h.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.r()), null, new jij.j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(this.R.f), 0), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f52942c), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.p()), null, new jij.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.d), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new i5b.d(rd0.e.b(this.W.e.f121375b), 28), null, new jij.g(this, continuation, 0), 3);
    }

    public final wej.e d3() {
        ViewBinding value = this.N.getValue(this, f101016d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wej.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final x d() {
        return (x) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
