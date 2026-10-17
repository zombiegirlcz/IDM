package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.BannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$InputData;
import fmk.c;
import fmk.d;
import fmk.g;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qgk.d1;
import qgk.i0;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/bottom_sheet/PlanRevPointsCardsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lfmk/h;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanRevPointsCardsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PlanRevPointsCardsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final PlanRevPointsCardsScreenContract$InputData K;
    public final int L;
    public final int M;
    public final RowDelegate N;
    public final LargeActionButtonDelegate O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;

    public PlanRevPointsCardsScreen(PlanRevPointsCardsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = R$style.UiKitTheme_Mono;
        this.N = new RowDelegate(null, null, 7);
        this.O = new LargeActionButtonDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: fmk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanRevPointsCardsScreen f136464b;

            {
                this.f136464b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanRevPointsCardsScreen planRevPointsCardsScreen = this.f136464b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanRevPointsCardsScreen.T;
                        PlanRevPointsCardsScreen planRevPointsCardsScreen2 = this.f136464b;
                        return dli.f.a(planRevPointsCardsScreen2, (g) planRevPointsCardsScreen2.S.getValue(), v.k(planRevPointsCardsScreen2.N, planRevPointsCardsScreen2.O, new BannerLoadingDelegate(), new FullScreenStateDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanRevPointsCardsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(planRevPointsCardsScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanRevPointsCardsScreenContract$InputData planRevPointsCardsScreenContract$InputData = planRevPointsCardsScreen.K;
                        planRevPointsCardsScreenContract$InputData.getClass();
                        return new d1(i0Var, planRevPointsCardsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanRevPointsCardsScreen.T;
                        return (g) ((d1) planRevPointsCardsScreen.R.getValue()).f245917c.get();
                }
            }
        });
        this.Q = s.t(this, c.f);
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: fmk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanRevPointsCardsScreen f136464b;

            {
                this.f136464b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanRevPointsCardsScreen planRevPointsCardsScreen = this.f136464b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanRevPointsCardsScreen.T;
                        PlanRevPointsCardsScreen planRevPointsCardsScreen2 = this.f136464b;
                        return dli.f.a(planRevPointsCardsScreen2, (g) planRevPointsCardsScreen2.S.getValue(), v.k(planRevPointsCardsScreen2.N, planRevPointsCardsScreen2.O, new BannerLoadingDelegate(), new FullScreenStateDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanRevPointsCardsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(planRevPointsCardsScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanRevPointsCardsScreenContract$InputData planRevPointsCardsScreenContract$InputData = planRevPointsCardsScreen.K;
                        planRevPointsCardsScreenContract$InputData.getClass();
                        return new d1(i0Var, planRevPointsCardsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanRevPointsCardsScreen.T;
                        return (g) ((d1) planRevPointsCardsScreen.R.getValue()).f245917c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: fmk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanRevPointsCardsScreen f136464b;

            {
                this.f136464b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanRevPointsCardsScreen planRevPointsCardsScreen = this.f136464b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanRevPointsCardsScreen.T;
                        PlanRevPointsCardsScreen planRevPointsCardsScreen2 = this.f136464b;
                        return dli.f.a(planRevPointsCardsScreen2, (g) planRevPointsCardsScreen2.S.getValue(), v.k(planRevPointsCardsScreen2.N, planRevPointsCardsScreen2.O, new BannerLoadingDelegate(), new FullScreenStateDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanRevPointsCardsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(planRevPointsCardsScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanRevPointsCardsScreenContract$InputData planRevPointsCardsScreenContract$InputData = planRevPointsCardsScreen.K;
                        planRevPointsCardsScreenContract$InputData.getClass();
                        return new d1(i0Var, planRevPointsCardsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanRevPointsCardsScreen.T;
                        return (g) ((d1) planRevPointsCardsScreen.R.getValue()).f245917c.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getS() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        fmk.h uiState = (fmk.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        lw0.a aVar = uiState.f136469b;
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d1) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.d.f121375b), new fmk.e(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
