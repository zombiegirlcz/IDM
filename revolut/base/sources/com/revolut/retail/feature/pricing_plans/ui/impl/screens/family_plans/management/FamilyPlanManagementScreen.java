package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.FamilyPlanManagementScreen;
import efm.r;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import m9d.y0;
import mkk.d;
import mkk.i;
import mkk.j;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/a;", "Ldli/a;", "Lmkk/j;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FamilyPlanManagementScreen extends ViewController<com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.a> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(FamilyPlanManagementScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object P;
    public final Object S;
    public final Object T;
    public final RowDelegate K = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate L = new FullScreenStateDelegate();
    public final CellDetailsChevronDelegate M = new CellDetailsChevronDelegate();
    public final ListSubheaderDelegate N = new ListSubheaderDelegate();
    public final PlainTextWarningDelegate O = new PlainTextWarningDelegate();
    public final int Q = R$layout.screen_recycler_navbar;
    public final h R = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public FamilyPlanManagementScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: mkk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FamilyPlanManagementScreen f206477b;

            {
                this.f206477b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FamilyPlanManagementScreen familyPlanManagementScreen = this.f206477b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FamilyPlanManagementScreen.U;
                        FamilyPlanManagementScreen familyPlanManagementScreen2 = this.f206477b;
                        return dli.f.a(familyPlanManagementScreen2, familyPlanManagementScreen2.d(), v.k(familyPlanManagementScreen2.K, new RowLoadingDelegate(), familyPlanManagementScreen2.L, familyPlanManagementScreen2.M, familyPlanManagementScreen2.N, familyPlanManagementScreen2.O), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = FamilyPlanManagementScreen.U;
                        qji.b bVarU2 = familyPlanManagementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.di.FamilyPlanManagementScreenInjector");
                        qgk.j jVar = (qgk.j) ((ygk.a) bVarU2);
                        return new qgk.o(jVar.d, jVar.e, familyPlanManagementScreen);
                    default:
                        KProperty[] kPropertyArr3 = FamilyPlanManagementScreen.U;
                        return (i) ((qgk.o) familyPlanManagementScreen.S.getValue()).f246171g.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: mkk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FamilyPlanManagementScreen f206477b;

            {
                this.f206477b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FamilyPlanManagementScreen familyPlanManagementScreen = this.f206477b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FamilyPlanManagementScreen.U;
                        FamilyPlanManagementScreen familyPlanManagementScreen2 = this.f206477b;
                        return dli.f.a(familyPlanManagementScreen2, familyPlanManagementScreen2.d(), v.k(familyPlanManagementScreen2.K, new RowLoadingDelegate(), familyPlanManagementScreen2.L, familyPlanManagementScreen2.M, familyPlanManagementScreen2.N, familyPlanManagementScreen2.O), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = FamilyPlanManagementScreen.U;
                        qji.b bVarU2 = familyPlanManagementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.di.FamilyPlanManagementScreenInjector");
                        qgk.j jVar = (qgk.j) ((ygk.a) bVarU2);
                        return new qgk.o(jVar.d, jVar.e, familyPlanManagementScreen);
                    default:
                        KProperty[] kPropertyArr3 = FamilyPlanManagementScreen.U;
                        return (i) ((qgk.o) familyPlanManagementScreen.S.getValue()).f246171g.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: mkk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FamilyPlanManagementScreen f206477b;

            {
                this.f206477b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FamilyPlanManagementScreen familyPlanManagementScreen = this.f206477b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FamilyPlanManagementScreen.U;
                        FamilyPlanManagementScreen familyPlanManagementScreen2 = this.f206477b;
                        return dli.f.a(familyPlanManagementScreen2, familyPlanManagementScreen2.d(), v.k(familyPlanManagementScreen2.K, new RowLoadingDelegate(), familyPlanManagementScreen2.L, familyPlanManagementScreen2.M, familyPlanManagementScreen2.N, familyPlanManagementScreen2.O), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = FamilyPlanManagementScreen.U;
                        qji.b bVarU2 = familyPlanManagementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.di.FamilyPlanManagementScreenInjector");
                        qgk.j jVar = (qgk.j) ((ygk.a) bVarU2);
                        return new qgk.o(jVar.d, jVar.e, familyPlanManagementScreen);
                    default:
                        KProperty[] kPropertyArr3 = FamilyPlanManagementScreen.U;
                        return (i) ((qgk.o) familyPlanManagementScreen.S.getValue()).f246171g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174539b.setSecondDescriptionText(uiState.f206486b.f206482a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (qgk.o) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.family_plans_management_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.family_plans_management_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new y0(this, null, 18), 3);
        RowDelegate rowDelegate = this.K;
        r rVarMerge = r.merge(w.a0(rowDelegate.f53218h, new mk3.c(10)), w.a0(rowDelegate.f53220l, new mk3.c(11)), w.a0(this.M.f51821c, new mk3.c(12)), w.a0(this.N.f52707c, new mk3.c(13)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new mkk.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.O.d.f121375b, new mk3.c(14))), null, new mkk.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
