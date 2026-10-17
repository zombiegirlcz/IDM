package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LightPromptDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetScreen;
import dli.a;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import qgk.i0;
import qgk.t0;
import te0.w;
import vc.s;
import z92.f;
import zhm.v;
import zmk.c;
import zmk.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_page/bottom_sheet/PlanPageBottomSheetScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzmk/c;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanPageBottomSheetScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PlanPageBottomSheetScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final PlanPageBottomSheetContract$InputData K;
    public final int L;
    public final int M;
    public final RowDelegate N;
    public final TextDelegate O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;

    public PlanPageBottomSheetScreen(PlanPageBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = f.m(inputData.f103617b);
        this.N = new RowDelegate(null, null, 7);
        this.O = new TextDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: zmk.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPageBottomSheetScreen f323605b;

            {
                this.f323605b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanPageBottomSheetScreen planPageBottomSheetScreen = this.f323605b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPageBottomSheetScreen.T;
                        PlanPageBottomSheetScreen planPageBottomSheetScreen2 = this.f323605b;
                        return dli.f.a(planPageBottomSheetScreen2, (b) planPageBottomSheetScreen2.S.getValue(), v.k(new CellDetailsDelegate(), new LightPromptDelegate(null), planPageBottomSheetScreen2.N, planPageBottomSheetScreen2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPageBottomSheetScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(planPageBottomSheetScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanPageBottomSheetContract$InputData planPageBottomSheetContract$InputData = planPageBottomSheetScreen.K;
                        planPageBottomSheetContract$InputData.getClass();
                        return new t0(i0Var, planPageBottomSheetContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanPageBottomSheetScreen.T;
                        return (b) ((t0) planPageBottomSheetScreen.R.getValue()).e.get();
                }
            }
        });
        this.Q = s.t(this, e.f);
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: zmk.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPageBottomSheetScreen f323605b;

            {
                this.f323605b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanPageBottomSheetScreen planPageBottomSheetScreen = this.f323605b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPageBottomSheetScreen.T;
                        PlanPageBottomSheetScreen planPageBottomSheetScreen2 = this.f323605b;
                        return dli.f.a(planPageBottomSheetScreen2, (b) planPageBottomSheetScreen2.S.getValue(), v.k(new CellDetailsDelegate(), new LightPromptDelegate(null), planPageBottomSheetScreen2.N, planPageBottomSheetScreen2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPageBottomSheetScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(planPageBottomSheetScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanPageBottomSheetContract$InputData planPageBottomSheetContract$InputData = planPageBottomSheetScreen.K;
                        planPageBottomSheetContract$InputData.getClass();
                        return new t0(i0Var, planPageBottomSheetContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanPageBottomSheetScreen.T;
                        return (b) ((t0) planPageBottomSheetScreen.R.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: zmk.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPageBottomSheetScreen f323605b;

            {
                this.f323605b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanPageBottomSheetScreen planPageBottomSheetScreen = this.f323605b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPageBottomSheetScreen.T;
                        PlanPageBottomSheetScreen planPageBottomSheetScreen2 = this.f323605b;
                        return dli.f.a(planPageBottomSheetScreen2, (b) planPageBottomSheetScreen2.S.getValue(), v.k(new CellDetailsDelegate(), new LightPromptDelegate(null), planPageBottomSheetScreen2.N, planPageBottomSheetScreen2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPageBottomSheetScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(planPageBottomSheetScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanPageBottomSheetContract$InputData planPageBottomSheetContract$InputData = planPageBottomSheetScreen.K;
                        planPageBottomSheetContract$InputData.getClass();
                        return new t0(i0Var, planPageBottomSheetContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanPageBottomSheetScreen.T;
                        return (b) ((t0) planPageBottomSheetScreen.R.getValue()).e.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        lw0.a aVar = uiState.f323603b;
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t0) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (zmk.b) this.S.getValue();
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
        ViewController.P2(this, rd0.e.b(this.O.d), new zmk.f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53226s), new zmk.f(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
