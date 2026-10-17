package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.delegates.CenteredContentTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreen;
import dli.a;
import dli.c;
import igk.f;
import jii.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mlk.i;
import mlk.j;
import mlk.k;
import mlk.l;
import mlk.m;
import mlk.n;
import mlk.p;
import mlk.z;
import nlk.b;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/features/PlanCancelFeaturesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ligk/f;", "Ldli/a;", "Lmlk/z;", "Lkji/f;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanCancelFeaturesScreen extends ViewController<f> implements a, kji.f {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f103507a0 = {o0.f186429a.j(new h0(PlanCancelFeaturesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final PlanCancelFeaturesScreenContract$InputData K;
    public final int L;
    public final int M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public AnimatedBackgroundView V;
    public final LargeActionButtonDelegate W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    public PlanCancelFeaturesScreen(PlanCancelFeaturesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_two_buttons;
        this.M = z92.f.m(inputData.f103510b);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: mlk.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanCancelFeaturesScreen f207008b;

            {
                this.f207008b = this;
            }

            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanCancelFeaturesScreen planCancelFeaturesScreen = this.f207008b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanCancelFeaturesScreen.f103507a0;
                        PlanCancelFeaturesScreen planCancelFeaturesScreen2 = this.f207008b;
                        return dli.f.a(planCancelFeaturesScreen2, planCancelFeaturesScreen2.d(), zhm.v.k(new ListCellDelegate(), (RowDelegate) planCancelFeaturesScreen2.T.getValue(), new RowLoadingDelegate(), (ListSubheaderDelegate) planCancelFeaturesScreen2.P.getValue(), new ListSubheaderLoadingDelegate(), (ScrollerDelegate) planCancelFeaturesScreen2.X.getValue(), new FullScreenStateDelegate(), (SplitColumnCellDelegate) planCancelFeaturesScreen2.U.getValue(), new SplitColumnCellLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanCancelFeaturesScreen.f103507a0;
                        return new ScrollerDelegate(zhm.v.k(new SmallCardLoadingDelegate(null), (SmallCardDelegate) planCancelFeaturesScreen.Q.getValue(), (VoucherSmallTileDelegate) planCancelFeaturesScreen.R.getValue(), (CenteredContentTileDelegate) planCancelFeaturesScreen.S.getValue(), new CenteredContentTileLoadingDelegate()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanCancelFeaturesScreen.f103507a0;
                        phm.a aVar = (phm.a) ue0.e.j(planCancelFeaturesScreen.m2()).a().get(qgk.i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (nlk.b) ((nlk.a) ((nlk.c) aVar2.b()).q().r(planCancelFeaturesScreen.K).mo3808a(planCancelFeaturesScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", qgk.i0.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = PlanCancelFeaturesScreen.f103507a0;
                        return ((nlk.b) planCancelFeaturesScreen.Y.getValue()).a();
                }
            }
        });
        this.O = s.t(this, mlk.h.f);
        this.P = w.y0(new mkf.s(10));
        this.Q = w.y0(new mkf.s(11));
        this.R = w.y0(new mkf.s(12));
        this.S = w.y0(new mkf.s(13));
        this.T = w.y0(new mkf.s(14));
        this.U = w.y0(new mkf.s(15));
        this.W = new LargeActionButtonDelegate();
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: mlk.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanCancelFeaturesScreen f207008b;

            {
                this.f207008b = this;
            }

            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanCancelFeaturesScreen planCancelFeaturesScreen = this.f207008b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanCancelFeaturesScreen.f103507a0;
                        PlanCancelFeaturesScreen planCancelFeaturesScreen2 = this.f207008b;
                        return dli.f.a(planCancelFeaturesScreen2, planCancelFeaturesScreen2.d(), zhm.v.k(new ListCellDelegate(), (RowDelegate) planCancelFeaturesScreen2.T.getValue(), new RowLoadingDelegate(), (ListSubheaderDelegate) planCancelFeaturesScreen2.P.getValue(), new ListSubheaderLoadingDelegate(), (ScrollerDelegate) planCancelFeaturesScreen2.X.getValue(), new FullScreenStateDelegate(), (SplitColumnCellDelegate) planCancelFeaturesScreen2.U.getValue(), new SplitColumnCellLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanCancelFeaturesScreen.f103507a0;
                        return new ScrollerDelegate(zhm.v.k(new SmallCardLoadingDelegate(null), (SmallCardDelegate) planCancelFeaturesScreen.Q.getValue(), (VoucherSmallTileDelegate) planCancelFeaturesScreen.R.getValue(), (CenteredContentTileDelegate) planCancelFeaturesScreen.S.getValue(), new CenteredContentTileLoadingDelegate()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanCancelFeaturesScreen.f103507a0;
                        phm.a aVar = (phm.a) ue0.e.j(planCancelFeaturesScreen.m2()).a().get(qgk.i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (nlk.b) ((nlk.a) ((nlk.c) aVar2.b()).q().r(planCancelFeaturesScreen.K).mo3808a(planCancelFeaturesScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", qgk.i0.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = PlanCancelFeaturesScreen.f103507a0;
                        return ((nlk.b) planCancelFeaturesScreen.Y.getValue()).a();
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: mlk.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanCancelFeaturesScreen f207008b;

            {
                this.f207008b = this;
            }

            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanCancelFeaturesScreen planCancelFeaturesScreen = this.f207008b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanCancelFeaturesScreen.f103507a0;
                        PlanCancelFeaturesScreen planCancelFeaturesScreen2 = this.f207008b;
                        return dli.f.a(planCancelFeaturesScreen2, planCancelFeaturesScreen2.d(), zhm.v.k(new ListCellDelegate(), (RowDelegate) planCancelFeaturesScreen2.T.getValue(), new RowLoadingDelegate(), (ListSubheaderDelegate) planCancelFeaturesScreen2.P.getValue(), new ListSubheaderLoadingDelegate(), (ScrollerDelegate) planCancelFeaturesScreen2.X.getValue(), new FullScreenStateDelegate(), (SplitColumnCellDelegate) planCancelFeaturesScreen2.U.getValue(), new SplitColumnCellLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanCancelFeaturesScreen.f103507a0;
                        return new ScrollerDelegate(zhm.v.k(new SmallCardLoadingDelegate(null), (SmallCardDelegate) planCancelFeaturesScreen.Q.getValue(), (VoucherSmallTileDelegate) planCancelFeaturesScreen.R.getValue(), (CenteredContentTileDelegate) planCancelFeaturesScreen.S.getValue(), new CenteredContentTileLoadingDelegate()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanCancelFeaturesScreen.f103507a0;
                        phm.a aVar = (phm.a) ue0.e.j(planCancelFeaturesScreen.m2()).a().get(qgk.i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (nlk.b) ((nlk.a) ((nlk.c) aVar2.b()).q().r(planCancelFeaturesScreen.K).mo3808a(planCancelFeaturesScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", qgk.i0.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = PlanCancelFeaturesScreen.f103507a0;
                        return ((nlk.b) planCancelFeaturesScreen.Y.getValue()).a();
                }
            }
        });
        final int i5 = 3;
        this.Z = w.y0(new Function0(this) { // from class: mlk.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanCancelFeaturesScreen f207008b;

            {
                this.f207008b = this;
            }

            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PlanCancelFeaturesScreen planCancelFeaturesScreen = this.f207008b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanCancelFeaturesScreen.f103507a0;
                        PlanCancelFeaturesScreen planCancelFeaturesScreen2 = this.f207008b;
                        return dli.f.a(planCancelFeaturesScreen2, planCancelFeaturesScreen2.d(), zhm.v.k(new ListCellDelegate(), (RowDelegate) planCancelFeaturesScreen2.T.getValue(), new RowLoadingDelegate(), (ListSubheaderDelegate) planCancelFeaturesScreen2.P.getValue(), new ListSubheaderLoadingDelegate(), (ScrollerDelegate) planCancelFeaturesScreen2.X.getValue(), new FullScreenStateDelegate(), (SplitColumnCellDelegate) planCancelFeaturesScreen2.U.getValue(), new SplitColumnCellLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanCancelFeaturesScreen.f103507a0;
                        return new ScrollerDelegate(zhm.v.k(new SmallCardLoadingDelegate(null), (SmallCardDelegate) planCancelFeaturesScreen.Q.getValue(), (VoucherSmallTileDelegate) planCancelFeaturesScreen.R.getValue(), (CenteredContentTileDelegate) planCancelFeaturesScreen.S.getValue(), new CenteredContentTileLoadingDelegate()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanCancelFeaturesScreen.f103507a0;
                        phm.a aVar = (phm.a) ue0.e.j(planCancelFeaturesScreen.m2()).a().get(qgk.i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (nlk.b) ((nlk.a) ((nlk.c) aVar2.b()).q().r(planCancelFeaturesScreen.K).mo3808a(planCancelFeaturesScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", qgk.i0.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = PlanCancelFeaturesScreen.f103507a0;
                        return ((nlk.b) planCancelFeaturesScreen.Y.getValue()).a();
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
        z uiState = (z) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174573b.setText(uiState.f207036b);
        d3().e.setText(uiState.f207037c);
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        Clause clause = uiState.d;
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setSecondDescriptionText(uiState.e);
        AnimatedBackgroundView animatedBackgroundView = this.V;
        if (animatedBackgroundView != null) {
            animatedBackgroundView.setBackgroundType(uiState.f);
        } else {
            Intrinsics.r("animatedBackgroundView");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().e.o(LargeActionButton.ButtonStyle.f58726b);
        ((b) this.Y.getValue()).k().d(u.c(this.W));
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AnimatedBackgroundView animatedBackgroundView = new AnimatedBackgroundView(context, null, 6, 0);
        this.V = animatedBackgroundView;
        animatedBackgroundView.setBackgroundType(AnimatedBackgroundType.DEFAULT.f51471a);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            AnimatedBackgroundView animatedBackgroundView2 = this.V;
            if (animatedBackgroundView2 != null) {
                viewGroup.addView(animatedBackgroundView2, 0, new ViewGroup.LayoutParams(-1, -1));
            } else {
                Intrinsics.r("animatedBackgroundView");
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new i(this, null, 2), 3);
        ?? r62 = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) r62.getValue()).f52707c), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) r62.getValue()).d), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((VoucherSmallTileDelegate) this.R.getValue()).f53608c), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredContentTileDelegate) this.S.getValue()).e), null, new n(this, null), 3);
        ?? r64 = this.U;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SplitColumnCellDelegate) r64.getValue()).d), null, new mlk.o(this, null), 3);
        ?? r06 = this.T;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r06.getValue()).f53218h), null, new p(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SplitColumnCellDelegate) r64.getValue()).e), null, new mlk.q(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r06.getValue()).f53226s), null, new mkk.q(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new i(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new i(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.W.d.f121375b), null, new j(this, null), 3);
    }

    public final x d3() {
        ViewBinding value = this.O.getValue(this, f103507a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final mlk.x R2() {
        return (mlk.x) this.Z.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
