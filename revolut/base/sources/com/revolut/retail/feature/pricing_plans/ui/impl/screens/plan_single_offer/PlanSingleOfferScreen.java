package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AvatarGroupDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.PlanSingleOfferScreen;
import efm.r;
import igk.q0;
import knk.b;
import knk.c;
import knk.d;
import knk.g;
import knk.i;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ngk.m;
import qgk.i0;
import qgk.i1;
import te0.w;
import vc.s;
import w01.k;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_single_offer/PlanSingleOfferScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ligk/q0;", "Ldli/a;", "Lknk/i;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanSingleOfferScreen extends ViewController<q0> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(PlanSingleOfferScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPlanSingleOfferBinding;", 0))};
    public final PlanSingleOfferScreenContract$InputData K;
    public final int L;
    public final SplitColumnCellDelegate M;
    public final LabelButtonDelegate N;
    public final ListingTileDelegate O;
    public final FullScreenStateDelegate P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public PlanSingleOfferScreen(PlanSingleOfferScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_plan_single_offer;
        this.M = new SplitColumnCellDelegate();
        this.N = new LabelButtonDelegate();
        this.O = new ListingTileDelegate();
        this.P = new FullScreenStateDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: knk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanSingleOfferScreen f186172b;

            {
                this.f186172b = this;
            }

            /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanSingleOfferScreen planSingleOfferScreen = this.f186172b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanSingleOfferScreen.U;
                        PlanSingleOfferScreen planSingleOfferScreen2 = this.f186172b;
                        return dli.f.a(planSingleOfferScreen2, planSingleOfferScreen2.d(), v.k(new TabsLoadingDelegate(), new PlanTileLoadingDelegate(), new PlanTileDelegate(0), new ListingTileLoadingDelegate(), planSingleOfferScreen2.O, new RowLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), planSingleOfferScreen2.M, new SplitColumnCellLoadingDelegate(), planSingleOfferScreen2.P, new HighlightTileDelegate(), new ToDoItemDelegate(), planSingleOfferScreen2.N, new AvatarGroupDelegate(), new SimpleMediaDelegate()), R$id.planSingleOfferScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanSingleOfferScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(planSingleOfferScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        planSingleOfferScreen.K.getClass();
                        return new i1(i0Var);
                    default:
                        KProperty[] kPropertyArr3 = PlanSingleOfferScreen.U;
                        return (h) ((i1) planSingleOfferScreen.S.getValue()).d.get();
                }
            }
        });
        this.R = s.t(this, b.f);
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: knk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanSingleOfferScreen f186172b;

            {
                this.f186172b = this;
            }

            /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanSingleOfferScreen planSingleOfferScreen = this.f186172b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanSingleOfferScreen.U;
                        PlanSingleOfferScreen planSingleOfferScreen2 = this.f186172b;
                        return dli.f.a(planSingleOfferScreen2, planSingleOfferScreen2.d(), v.k(new TabsLoadingDelegate(), new PlanTileLoadingDelegate(), new PlanTileDelegate(0), new ListingTileLoadingDelegate(), planSingleOfferScreen2.O, new RowLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), planSingleOfferScreen2.M, new SplitColumnCellLoadingDelegate(), planSingleOfferScreen2.P, new HighlightTileDelegate(), new ToDoItemDelegate(), planSingleOfferScreen2.N, new AvatarGroupDelegate(), new SimpleMediaDelegate()), R$id.planSingleOfferScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanSingleOfferScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(planSingleOfferScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        planSingleOfferScreen.K.getClass();
                        return new i1(i0Var);
                    default:
                        KProperty[] kPropertyArr3 = PlanSingleOfferScreen.U;
                        return (h) ((i1) planSingleOfferScreen.S.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: knk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanSingleOfferScreen f186172b;

            {
                this.f186172b = this;
            }

            /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanSingleOfferScreen planSingleOfferScreen = this.f186172b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanSingleOfferScreen.U;
                        PlanSingleOfferScreen planSingleOfferScreen2 = this.f186172b;
                        return dli.f.a(planSingleOfferScreen2, planSingleOfferScreen2.d(), v.k(new TabsLoadingDelegate(), new PlanTileLoadingDelegate(), new PlanTileDelegate(0), new ListingTileLoadingDelegate(), planSingleOfferScreen2.O, new RowLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), planSingleOfferScreen2.M, new SplitColumnCellLoadingDelegate(), planSingleOfferScreen2.P, new HighlightTileDelegate(), new ToDoItemDelegate(), planSingleOfferScreen2.N, new AvatarGroupDelegate(), new SimpleMediaDelegate()), R$id.planSingleOfferScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanSingleOfferScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(planSingleOfferScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        planSingleOfferScreen.K.getClass();
                        return new i1(i0Var);
                    default:
                        KProperty[] kPropertyArr3 = PlanSingleOfferScreen.U;
                        return (h) ((i1) planSingleOfferScreen.S.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f215218c;
        g gVar = uiState.f186179a;
        aw0.i iVar = uiState.f186181c;
        if (gVar != null) {
            TextClause textClause = gVar.f186177b;
            navBarWithToolbar.setToolbarTitle(gVar.f186178c);
            navBarWithToolbar.setTitle(gVar.f186176a, null);
            navBarWithToolbar.setSecondDescriptionText(textClause);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setMenuItems(v.l(gVar.d));
        }
        ActionFooterView actionFooterView = d3().f215217b;
        k.e(actionFooterView, iVar != null);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i1) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f215217b.f), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f215217b.f58955g), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f215217b.e), new c(this, continuation, 2), 3);
        r rVarFilter = d3().f215218c.o.f57403b.filter(new km2.b(5, new knd.a(11)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new k22.c(this, continuation, 29), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.d), new knk.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final knk.h d() {
        return (knk.h) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
