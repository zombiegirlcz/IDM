package com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan;

import afj.i1;
import afj.j1;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AvatarGroupDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TabsLoadingDelegate;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$layout;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$InputData;
import eq8.g;
import fed.a0;
import fij.b0;
import fij.i;
import fij.k;
import fij.l;
import fij.w;
import fij.x;
import ix0.a2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import unj.m;
import vc.s;
import z4l.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfij/w;", "Lcli/w;", "Lfij/b0;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimGetPlanScreen extends ViewController<w> implements cli.w {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(EsimGetPlanScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/esim/impl/databinding/ScreenEsimGetPlanBinding;", 0))};
    public final EsimGetPlanScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final oij.e W;
    public a2 X;
    public boolean Y;

    public EsimGetPlanScreen(EsimGetPlanScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_esim_get_plan;
        this.M = true;
        this.N = s.t(this, fij.b.f);
        final int i = 0;
        this.O = te0.w.y0(new Function0(this) { // from class: fij.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimGetPlanScreen f135432b;

            {
                this.f135432b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimGetPlanScreen esimGetPlanScreen = this.f135432b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimGetPlanScreen.Z;
                        qji.b bVarU2 = esimGetPlanScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.di.EsimGetPlanScreenInjector");
                        }
                        i1 i1Var = (i1) ((gij.a) bVarU2).W().mo3808a(esimGetPlanScreen);
                        EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData = esimGetPlanScreen.K;
                        switch (i1Var.f4284a) {
                            case 0:
                                esimGetPlanScreenContract$InputData.getClass();
                                i1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                            default:
                                esimGetPlanScreenContract$InputData.getClass();
                                i1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                        }
                        return (j1) i1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EsimGetPlanScreen.Z;
                        j1 j1Var = (j1) esimGetPlanScreen.O.getValue();
                        switch (j1Var.f4299a) {
                            case 0:
                                return (x) j1Var.e.get();
                            default:
                                return (x) j1Var.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = EsimGetPlanScreen.Z;
                        return new SelectableDelegate((RowDelegate) esimGetPlanScreen.Q.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = EsimGetPlanScreen.Z;
                        return new z4l.j(7, zhm.u.c(new ContainerDelegate(zhm.v.k((RowDelegate) esimGetPlanScreen.Q.getValue(), (CellDetailsDelegate) esimGetPlanScreen.R.getValue(), (SelectableDelegate) esimGetPlanScreen.S.getValue(), new RowLoadingDelegate(), new TabsLoadingDelegate(), (ListSubheaderDelegate) esimGetPlanScreen.T.getValue(), new FullScreenStateDelegate(), new AvatarGroupDelegate()), null, 6)), false);
                    default:
                        KProperty[] kPropertyArr5 = EsimGetPlanScreen.Z;
                        return n14.e.a(esimGetPlanScreen, esimGetPlanScreen.R2());
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: fij.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimGetPlanScreen f135432b;

            {
                this.f135432b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimGetPlanScreen esimGetPlanScreen = this.f135432b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimGetPlanScreen.Z;
                        qji.b bVarU2 = esimGetPlanScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.di.EsimGetPlanScreenInjector");
                        }
                        i1 i1Var = (i1) ((gij.a) bVarU2).W().mo3808a(esimGetPlanScreen);
                        EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData = esimGetPlanScreen.K;
                        switch (i1Var.f4284a) {
                            case 0:
                                esimGetPlanScreenContract$InputData.getClass();
                                i1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                            default:
                                esimGetPlanScreenContract$InputData.getClass();
                                i1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                        }
                        return (j1) i1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EsimGetPlanScreen.Z;
                        j1 j1Var = (j1) esimGetPlanScreen.O.getValue();
                        switch (j1Var.f4299a) {
                            case 0:
                                return (x) j1Var.e.get();
                            default:
                                return (x) j1Var.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = EsimGetPlanScreen.Z;
                        return new SelectableDelegate((RowDelegate) esimGetPlanScreen.Q.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = EsimGetPlanScreen.Z;
                        return new z4l.j(7, zhm.u.c(new ContainerDelegate(zhm.v.k((RowDelegate) esimGetPlanScreen.Q.getValue(), (CellDetailsDelegate) esimGetPlanScreen.R.getValue(), (SelectableDelegate) esimGetPlanScreen.S.getValue(), new RowLoadingDelegate(), new TabsLoadingDelegate(), (ListSubheaderDelegate) esimGetPlanScreen.T.getValue(), new FullScreenStateDelegate(), new AvatarGroupDelegate()), null, 6)), false);
                    default:
                        KProperty[] kPropertyArr5 = EsimGetPlanScreen.Z;
                        return n14.e.a(esimGetPlanScreen, esimGetPlanScreen.R2());
                }
            }
        });
        this.Q = te0.w.y0(new a0(12));
        this.R = te0.w.y0(new a0(13));
        final int i3 = 2;
        this.S = te0.w.y0(new Function0(this) { // from class: fij.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimGetPlanScreen f135432b;

            {
                this.f135432b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimGetPlanScreen esimGetPlanScreen = this.f135432b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimGetPlanScreen.Z;
                        qji.b bVarU2 = esimGetPlanScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.di.EsimGetPlanScreenInjector");
                        }
                        i1 i1Var = (i1) ((gij.a) bVarU2).W().mo3808a(esimGetPlanScreen);
                        EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData = esimGetPlanScreen.K;
                        switch (i1Var.f4284a) {
                            case 0:
                                esimGetPlanScreenContract$InputData.getClass();
                                i1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                            default:
                                esimGetPlanScreenContract$InputData.getClass();
                                i1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                        }
                        return (j1) i1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EsimGetPlanScreen.Z;
                        j1 j1Var = (j1) esimGetPlanScreen.O.getValue();
                        switch (j1Var.f4299a) {
                            case 0:
                                return (x) j1Var.e.get();
                            default:
                                return (x) j1Var.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = EsimGetPlanScreen.Z;
                        return new SelectableDelegate((RowDelegate) esimGetPlanScreen.Q.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = EsimGetPlanScreen.Z;
                        return new z4l.j(7, zhm.u.c(new ContainerDelegate(zhm.v.k((RowDelegate) esimGetPlanScreen.Q.getValue(), (CellDetailsDelegate) esimGetPlanScreen.R.getValue(), (SelectableDelegate) esimGetPlanScreen.S.getValue(), new RowLoadingDelegate(), new TabsLoadingDelegate(), (ListSubheaderDelegate) esimGetPlanScreen.T.getValue(), new FullScreenStateDelegate(), new AvatarGroupDelegate()), null, 6)), false);
                    default:
                        KProperty[] kPropertyArr5 = EsimGetPlanScreen.Z;
                        return n14.e.a(esimGetPlanScreen, esimGetPlanScreen.R2());
                }
            }
        });
        this.T = te0.w.y0(new a0(14));
        final int i5 = 3;
        this.U = te0.w.y0(new Function0(this) { // from class: fij.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimGetPlanScreen f135432b;

            {
                this.f135432b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                EsimGetPlanScreen esimGetPlanScreen = this.f135432b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimGetPlanScreen.Z;
                        qji.b bVarU2 = esimGetPlanScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.di.EsimGetPlanScreenInjector");
                        }
                        i1 i1Var = (i1) ((gij.a) bVarU2).W().mo3808a(esimGetPlanScreen);
                        EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData = esimGetPlanScreen.K;
                        switch (i1Var.f4284a) {
                            case 0:
                                esimGetPlanScreenContract$InputData.getClass();
                                i1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                            default:
                                esimGetPlanScreenContract$InputData.getClass();
                                i1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                        }
                        return (j1) i1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EsimGetPlanScreen.Z;
                        j1 j1Var = (j1) esimGetPlanScreen.O.getValue();
                        switch (j1Var.f4299a) {
                            case 0:
                                return (x) j1Var.e.get();
                            default:
                                return (x) j1Var.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = EsimGetPlanScreen.Z;
                        return new SelectableDelegate((RowDelegate) esimGetPlanScreen.Q.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = EsimGetPlanScreen.Z;
                        return new z4l.j(7, zhm.u.c(new ContainerDelegate(zhm.v.k((RowDelegate) esimGetPlanScreen.Q.getValue(), (CellDetailsDelegate) esimGetPlanScreen.R.getValue(), (SelectableDelegate) esimGetPlanScreen.S.getValue(), new RowLoadingDelegate(), new TabsLoadingDelegate(), (ListSubheaderDelegate) esimGetPlanScreen.T.getValue(), new FullScreenStateDelegate(), new AvatarGroupDelegate()), null, 6)), false);
                    default:
                        KProperty[] kPropertyArr5 = EsimGetPlanScreen.Z;
                        return n14.e.a(esimGetPlanScreen, esimGetPlanScreen.R2());
                }
            }
        });
        final int i6 = 4;
        this.V = te0.w.y0(new Function0(this) { // from class: fij.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimGetPlanScreen f135432b;

            {
                this.f135432b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                EsimGetPlanScreen esimGetPlanScreen = this.f135432b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimGetPlanScreen.Z;
                        qji.b bVarU2 = esimGetPlanScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.di.EsimGetPlanScreenInjector");
                        }
                        i1 i1Var = (i1) ((gij.a) bVarU2).W().mo3808a(esimGetPlanScreen);
                        EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData = esimGetPlanScreen.K;
                        switch (i1Var.f4284a) {
                            case 0:
                                esimGetPlanScreenContract$InputData.getClass();
                                i1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                            default:
                                esimGetPlanScreenContract$InputData.getClass();
                                i1Var.d = esimGetPlanScreenContract$InputData;
                                break;
                        }
                        return (j1) i1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EsimGetPlanScreen.Z;
                        j1 j1Var = (j1) esimGetPlanScreen.O.getValue();
                        switch (j1Var.f4299a) {
                            case 0:
                                return (x) j1Var.e.get();
                            default:
                                return (x) j1Var.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = EsimGetPlanScreen.Z;
                        return new SelectableDelegate((RowDelegate) esimGetPlanScreen.Q.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = EsimGetPlanScreen.Z;
                        return new z4l.j(7, zhm.u.c(new ContainerDelegate(zhm.v.k((RowDelegate) esimGetPlanScreen.Q.getValue(), (CellDetailsDelegate) esimGetPlanScreen.R.getValue(), (SelectableDelegate) esimGetPlanScreen.S.getValue(), new RowLoadingDelegate(), new TabsLoadingDelegate(), (ListSubheaderDelegate) esimGetPlanScreen.T.getValue(), new FullScreenStateDelegate(), new AvatarGroupDelegate()), null, 6)), false);
                    default:
                        KProperty[] kPropertyArr5 = EsimGetPlanScreen.Z;
                        return n14.e.a(esimGetPlanScreen, esimGetPlanScreen.R2());
                }
            }
        });
        this.W = new oij.e(new fca.d(this, 24));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        b0 uiState = (b0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ((j) this.U.getValue()).c(uiState.f135436a);
        wej.b bVarD3 = d3();
        Tabs screenEsimGetPlanTabs = bVarD3.d;
        ViewPager2 viewPager2 = bVarD3.e;
        Intrinsics.checkNotNullExpressionValue(screenEsimGetPlanTabs, "screenEsimGetPlanTabs");
        pu7.a.N(screenEsimGetPlanTabs, uiState.f135438c);
        Integer num = uiState.f135437b;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue != viewPager2.getCurrentItem()) {
                viewPager2.setCurrentItem(iIntValue, this.Y);
            }
            this.Y = true;
        }
        NavBarWithToolbar screenEsimGetPlanNavBarWithToolbar = bVarD3.f296801c;
        Intrinsics.checkNotNullExpressionValue(screenEsimGetPlanNavBarWithToolbar, "screenEsimGetPlanNavBarWithToolbar");
        pu7.a.P(screenEsimGetPlanNavBarWithToolbar, uiState.d);
        TwinVerticalButton screenEsimGetPlanButton = d3().f296800b;
        Intrinsics.checkNotNullExpressionValue(screenEsimGetPlanButton, "screenEsimGetPlanButton");
        pu7.a.O(screenEsimGetPlanButton, uiState.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j1) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.Y = false;
        oij.e eVar = this.W;
        eVar.f225700b = true;
        wej.b bVarD3 = d3();
        bVarD3.f296801c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TwinVerticalButton screenEsimGetPlanButton = bVarD3.f296800b;
        screenEsimGetPlanButton.setSecondaryButtonVisible(false);
        ViewPager2 viewPager2 = bVarD3.e;
        viewPager2.setAdapter((j) this.U.getValue());
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        viewPager2.registerOnPageChangeCallback(eVar);
        Intrinsics.checkNotNullExpressionValue(screenEsimGetPlanButton, "screenEsimGetPlanButton");
        this.X = m.a(viewPager2, screenEsimGetPlanButton);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        d3().e.unregisterOnPageChangeCallback(this.W);
        a2 a2Var = this.X;
        if (a2Var != null) {
            a2Var.cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f296801c.f59410q), null, new i(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f58882b), null, new fij.h(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f296800b.o0()), null, new i(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SelectableDelegate) this.S.getValue()).r()), null, new fij.j(this, null), 3);
        ?? r62 = this.Q;
        com.revolut.kompot.navigable.a.g2(this, new g(rd0.e.b(((RowDelegate) r62.getValue()).f53220l), 22), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new g(rd0.e.b(((RowDelegate) r62.getValue()).f53218h), 23), null, new l(this, null), 3);
        ?? r64 = this.R;
        com.revolut.kompot.navigable.a.g2(this, new g(rd0.e.b(((CellDetailsDelegate) r64.getValue()).f), 24), null, new fij.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) r64.getValue()).e), null, new fij.g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(te0.w.a0(((ListSubheaderDelegate) this.T.getValue()).f52707c, new fg8.g(24))), null, new fij.h(this, null, 0), 3);
    }

    public final wej.b d3() {
        ViewBinding value = this.N.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wej.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final x R2() {
        return (x) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF91682d0() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (cli.a0) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
