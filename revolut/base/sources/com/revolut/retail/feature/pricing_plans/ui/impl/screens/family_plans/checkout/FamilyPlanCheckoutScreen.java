package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.checkout;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.checkout.FamilyPlanCheckoutScreen;
import hkk.b;
import hkk.c;
import hkk.d;
import hkk.g;
import hkk.i;
import java.util.List;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import prk.k0;
import qgk.i0;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/checkout/FamilyPlanCheckoutScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhkk/g;", "Ldli/a;", "Lhkk/i;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FamilyPlanCheckoutScreen extends ViewController<g> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(FamilyPlanCheckoutScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final Object N;
    public final Object P;
    public final Object Q;
    public final int K = R$layout.screen_recycler_navbar_action_footer;
    public final FullScreenStateDelegate L = new FullScreenStateDelegate();
    public final CellDetailsDelegate M = new CellDetailsDelegate();
    public final h O = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, k.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return k.a(p0);
        }
    }

    public FamilyPlanCheckoutScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: hkk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FamilyPlanCheckoutScreen f152940b;

            {
                this.f152940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                FamilyPlanCheckoutScreen familyPlanCheckoutScreen = this.f152940b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FamilyPlanCheckoutScreen.R;
                        FamilyPlanCheckoutScreen familyPlanCheckoutScreen2 = this.f152940b;
                        return dli.f.a(familyPlanCheckoutScreen2, familyPlanCheckoutScreen2.d(), v.k(familyPlanCheckoutScreen2.M, new RowDelegate(null, null, 7), familyPlanCheckoutScreen2.L, new ListSubheaderDelegate(), new RowLoadingDelegate(), new CellDetailsNoteDelegate(), new CellDetailsPriceDelegate(), new CellDetailsLoadingDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FamilyPlanCheckoutScreen.R;
                        qji.b bVarU2 = familyPlanCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.checkout.di.FamilyPlanCheckoutScreenInjector");
                        i0 i0Var = ((qgk.j) ((ygk.a) bVarU2)).d;
                        qgk.h hVar = new qgk.h();
                        int i6 = 26;
                        hVar.f245993a = e4m.b.b(new k0(i0Var, hVar, i5, i6));
                        hVar.f245994b = e4m.b.b(new k0(i0Var, hVar, i3, i6));
                        return hVar;
                    default:
                        KProperty[] kPropertyArr3 = FamilyPlanCheckoutScreen.R;
                        return (h) ((qgk.h) familyPlanCheckoutScreen.P.getValue()).f245994b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: hkk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FamilyPlanCheckoutScreen f152940b;

            {
                this.f152940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                FamilyPlanCheckoutScreen familyPlanCheckoutScreen = this.f152940b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FamilyPlanCheckoutScreen.R;
                        FamilyPlanCheckoutScreen familyPlanCheckoutScreen2 = this.f152940b;
                        return dli.f.a(familyPlanCheckoutScreen2, familyPlanCheckoutScreen2.d(), v.k(familyPlanCheckoutScreen2.M, new RowDelegate(null, null, 7), familyPlanCheckoutScreen2.L, new ListSubheaderDelegate(), new RowLoadingDelegate(), new CellDetailsNoteDelegate(), new CellDetailsPriceDelegate(), new CellDetailsLoadingDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FamilyPlanCheckoutScreen.R;
                        qji.b bVarU2 = familyPlanCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.checkout.di.FamilyPlanCheckoutScreenInjector");
                        i0 i0Var = ((qgk.j) ((ygk.a) bVarU2)).d;
                        qgk.h hVar = new qgk.h();
                        int i6 = 26;
                        hVar.f245993a = e4m.b.b(new k0(i0Var, hVar, i5, i6));
                        hVar.f245994b = e4m.b.b(new k0(i0Var, hVar, i3, i6));
                        return hVar;
                    default:
                        KProperty[] kPropertyArr3 = FamilyPlanCheckoutScreen.R;
                        return (h) ((qgk.h) familyPlanCheckoutScreen.P.getValue()).f245994b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: hkk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FamilyPlanCheckoutScreen f152940b;

            {
                this.f152940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 1;
                FamilyPlanCheckoutScreen familyPlanCheckoutScreen = this.f152940b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FamilyPlanCheckoutScreen.R;
                        FamilyPlanCheckoutScreen familyPlanCheckoutScreen2 = this.f152940b;
                        return dli.f.a(familyPlanCheckoutScreen2, familyPlanCheckoutScreen2.d(), v.k(familyPlanCheckoutScreen2.M, new RowDelegate(null, null, 7), familyPlanCheckoutScreen2.L, new ListSubheaderDelegate(), new RowLoadingDelegate(), new CellDetailsNoteDelegate(), new CellDetailsPriceDelegate(), new CellDetailsLoadingDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FamilyPlanCheckoutScreen.R;
                        qji.b bVarU2 = familyPlanCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.checkout.di.FamilyPlanCheckoutScreenInjector");
                        i0 i0Var = ((qgk.j) ((ygk.a) bVarU2)).d;
                        qgk.h hVar = new qgk.h();
                        int i6 = 26;
                        hVar.f245993a = e4m.b.b(new k0(i0Var, hVar, i5, i6));
                        hVar.f245994b = e4m.b.b(new k0(i0Var, hVar, i32, i6));
                        return hVar;
                    default:
                        KProperty[] kPropertyArr3 = FamilyPlanCheckoutScreen.R;
                        return (h) ((qgk.h) familyPlanCheckoutScreen.P.getValue()).f245994b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        aw0.i iVar = uiState.f152946b;
        if (iVar != null) {
            d3().f174533b.setModel(iVar);
        }
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        screenRecyclerNavbarActionFooterActionFooterView.setVisibility(iVar != null ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (qgk.h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.family_plans_checkout_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.family_plans_checkout_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.d), null, new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.e), new hba.k(this, (Continuation) null, 26), 3);
    }

    public final k d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final hkk.h d() {
        return (hkk.h) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
