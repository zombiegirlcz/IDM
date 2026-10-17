package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation;

import afj.r0;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$id;
import com.revolut.retail.feature.esim.impl.R$layout;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.EsimMobilePlanCancellationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.EsimMobilePlanCancellationScreenContract$InputData;
import efm.r;
import ibg.g;
import ijj.c;
import ijj.d;
import ijj.e;
import ijj.i;
import ijj.j;
import ijj.k;
import ijj.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_cancellation/EsimMobilePlanCancellationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_cancellation/a;", "Ldli/a;", "Lijj/l;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanCancellationScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(EsimMobilePlanCancellationScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/esim/impl/databinding/ScreenEsimMobilePlanCancellationBinding;", 0))};
    public final EsimMobilePlanCancellationScreenContract$InputData K;
    public final int L;
    public final int M;
    public final FullScreenStateDelegate N;
    public final CellDetailsDelegate O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;

    public EsimMobilePlanCancellationScreen(EsimMobilePlanCancellationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_esim_mobile_plan_cancellation;
        this.M = R$style.UiKitTheme_Mono;
        this.N = new FullScreenStateDelegate();
        this.O = new CellDetailsDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: ijj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanCancellationScreen f161804b;

            {
                this.f161804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanCancellationScreen esimMobilePlanCancellationScreen = this.f161804b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanCancellationScreen.T;
                        EsimMobilePlanCancellationScreen esimMobilePlanCancellationScreen2 = this.f161804b;
                        return dli.f.a(esimMobilePlanCancellationScreen2, esimMobilePlanCancellationScreen2.d(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate(), esimMobilePlanCancellationScreen2.N, new PlainTextLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), esimMobilePlanCancellationScreen2.O), R$id.esimPlanCancellationScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanCancellationScreen.T;
                        qji.b bVarU2 = esimMobilePlanCancellationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.di.EsimPlanCancellationScreenInjector");
                        afj.p pVar = (afj.p) bVarU2;
                        afj.b bVar = pVar.f4382b;
                        afj.p pVar2 = pVar.f4383c;
                        EsimMobilePlanCancellationScreenContract$InputData esimMobilePlanCancellationScreenContract$InputData = esimMobilePlanCancellationScreen.K;
                        esimMobilePlanCancellationScreenContract$InputData.getClass();
                        return new r0(bVar, pVar2, esimMobilePlanCancellationScreen, esimMobilePlanCancellationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanCancellationScreen.T;
                        return (g) ((r0) esimMobilePlanCancellationScreen.R.getValue()).e.get();
                }
            }
        });
        this.Q = s.t(this, ijj.b.f);
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: ijj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanCancellationScreen f161804b;

            {
                this.f161804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanCancellationScreen esimMobilePlanCancellationScreen = this.f161804b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanCancellationScreen.T;
                        EsimMobilePlanCancellationScreen esimMobilePlanCancellationScreen2 = this.f161804b;
                        return dli.f.a(esimMobilePlanCancellationScreen2, esimMobilePlanCancellationScreen2.d(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate(), esimMobilePlanCancellationScreen2.N, new PlainTextLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), esimMobilePlanCancellationScreen2.O), R$id.esimPlanCancellationScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanCancellationScreen.T;
                        qji.b bVarU2 = esimMobilePlanCancellationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.di.EsimPlanCancellationScreenInjector");
                        afj.p pVar = (afj.p) bVarU2;
                        afj.b bVar = pVar.f4382b;
                        afj.p pVar2 = pVar.f4383c;
                        EsimMobilePlanCancellationScreenContract$InputData esimMobilePlanCancellationScreenContract$InputData = esimMobilePlanCancellationScreen.K;
                        esimMobilePlanCancellationScreenContract$InputData.getClass();
                        return new r0(bVar, pVar2, esimMobilePlanCancellationScreen, esimMobilePlanCancellationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanCancellationScreen.T;
                        return (g) ((r0) esimMobilePlanCancellationScreen.R.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ijj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanCancellationScreen f161804b;

            {
                this.f161804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanCancellationScreen esimMobilePlanCancellationScreen = this.f161804b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanCancellationScreen.T;
                        EsimMobilePlanCancellationScreen esimMobilePlanCancellationScreen2 = this.f161804b;
                        return dli.f.a(esimMobilePlanCancellationScreen2, esimMobilePlanCancellationScreen2.d(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate(), esimMobilePlanCancellationScreen2.N, new PlainTextLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), esimMobilePlanCancellationScreen2.O), R$id.esimPlanCancellationScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanCancellationScreen.T;
                        qji.b bVarU2 = esimMobilePlanCancellationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.di.EsimPlanCancellationScreenInjector");
                        afj.p pVar = (afj.p) bVarU2;
                        afj.b bVar = pVar.f4382b;
                        afj.p pVar2 = pVar.f4383c;
                        EsimMobilePlanCancellationScreenContract$InputData esimMobilePlanCancellationScreenContract$InputData = esimMobilePlanCancellationScreen.K;
                        esimMobilePlanCancellationScreenContract$InputData.getClass();
                        return new r0(bVar, pVar2, esimMobilePlanCancellationScreen, esimMobilePlanCancellationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanCancellationScreen.T;
                        return (g) ((r0) esimMobilePlanCancellationScreen.R.getValue()).e.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getL() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        j jVar = uiState.d;
        if (jVar instanceof ijj.h) {
            TwinVerticalButton esimPlanCancellationScreenTwinVerticalButton = d3().d;
            Intrinsics.checkNotNullExpressionValue(esimPlanCancellationScreenTwinVerticalButton, "esimPlanCancellationScreenTwinVerticalButton");
            esimPlanCancellationScreenTwinVerticalButton.setVisibility(8);
        } else {
            if (!(jVar instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            TwinVerticalButton twinVerticalButton = d3().d;
            twinVerticalButton.setVisibility(0);
            i iVar = (i) jVar;
            e eVar = iVar.f161810b;
            e eVar2 = iVar.f161809a;
            twinVerticalButton.setMainButtonText(eVar2.f161805a);
            twinVerticalButton.setMainButtonStyle(eVar2.f161806b);
            twinVerticalButton.setSecondaryButtonText(eVar.f161805a);
            twinVerticalButton.setSecondaryButtonStyle(eVar.f161806b);
            TwinVerticalButton.setDescription$default(twinVerticalButton, iVar.f161811c, null, null, 6, null);
        }
        NavBarWithToolbar navBarWithToolbar = d3().f296804c;
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        k kVar = uiState.f161815b;
        navBarWithToolbar.setTitle(kVar != null ? kVar.f161812a : null, null);
        if (kVar != null) {
            navBarWithToolbar.setToolbarTitle(kVar.f161812a);
        }
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionText(kVar != null ? kVar.f161813b : null);
        navBarWithToolbar.setSecondDescriptionVisible((kVar != null ? kVar.f161813b : null) != null);
        d3().f296804c.setMenuItems(uiState.f161816c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r0) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f296803b.setBackgroundType(AnimatedBackgroundType.PLAN_PREMIUM.f51481a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f296804c.f59410q), new c(this, null, 0), 3);
        r rVarFilter = d3().f296804c.o.f57403b.filter(new ihd.c(2, new igh.k(29)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().d.o0()), new c(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().d.p0()), new c(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new d(this, null), 3);
        r rVarMergeWith = d3().d.f59017j.mergeWith(d3().f296804c.x0());
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        ViewController.P2(this, rd0.e.b(rVarMergeWith), new g(this, null, 12), 3);
    }

    public final wej.c d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wej.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ijj.g d() {
        return (ijj.g) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
