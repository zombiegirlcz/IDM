package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.BannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.PlanSavingsAccountsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.PlanSavingsAccountsScreenContract$InputData;
import com.revolut.tracking.v3.IdContext;
import g85.f;
import gmk.c;
import gmk.d;
import gmk.i;
import kii.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import org.jetbrains.annotations.NotNull;
import qgk.e1;
import qgk.i0;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/bottom_sheet/savings_accounts/PlanSavingsAccountsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lgmk/i;", "Lno/k;", "Companion", "a", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanSavingsAccountsScreen extends ViewController<q> implements dli.a, k {
    public final PlanSavingsAccountsScreenContract$InputData K;
    public final int L;
    public final int M;
    public final h N;
    public final RowDelegate O;
    public final FullScreenStateDelegate P;
    public final Object Q;
    public AnalyticsContext R;
    public final Object S;
    public final Object T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(PlanSavingsAccountsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.PlanSavingsAccountsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public PlanSavingsAccountsScreen(PlanSavingsAccountsScreenContract$InputData inputData) {
        String str;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.M = R$style.UiKitTheme_Mono;
        this.N = s.t(this, c.f);
        this.O = new RowDelegate(null, null, 7);
        this.P = new FullScreenStateDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: gmk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanSavingsAccountsScreen f144876b;

            {
                this.f144876b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanSavingsAccountsScreen planSavingsAccountsScreen = this.f144876b;
                switch (i2) {
                    case 0:
                        PlanSavingsAccountsScreen.Companion companion = PlanSavingsAccountsScreen.INSTANCE;
                        PlanSavingsAccountsScreen planSavingsAccountsScreen2 = this.f144876b;
                        return dli.f.a(planSavingsAccountsScreen2, (h) planSavingsAccountsScreen2.T.getValue(), v.k(planSavingsAccountsScreen2.O, new BannerLoadingDelegate(), new RowLoadingDelegate(), planSavingsAccountsScreen2.P), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        PlanSavingsAccountsScreen.Companion companion2 = PlanSavingsAccountsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(planSavingsAccountsScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanSavingsAccountsScreenContract$InputData planSavingsAccountsScreenContract$InputData = planSavingsAccountsScreen.K;
                        planSavingsAccountsScreenContract$InputData.getClass();
                        return new e1(i0Var, planSavingsAccountsScreenContract$InputData);
                    default:
                        PlanSavingsAccountsScreen.Companion companion3 = PlanSavingsAccountsScreen.INSTANCE;
                        return (h) ((e1) planSavingsAccountsScreen.S.getValue()).f245938c.get();
                }
            }
        });
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        IdContext.a aVarNewBuilder = IdContext.newBuilder();
        int i2 = gmk.b.f144877a[inputData.f103545a.ordinal()];
        if (i2 == 1) {
            str = "plan.hub.bottom_sheet.savings_accounts.savings";
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "plan.hub.bottom_sheet.savings_accounts.mmf";
        }
        this.R = new AnalyticsContext(e.d(aVarNewBuilder, str, companion));
        final int i3 = 1;
        this.S = w.y0(new Function0(this) { // from class: gmk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanSavingsAccountsScreen f144876b;

            {
                this.f144876b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanSavingsAccountsScreen planSavingsAccountsScreen = this.f144876b;
                switch (i22) {
                    case 0:
                        PlanSavingsAccountsScreen.Companion companion2 = PlanSavingsAccountsScreen.INSTANCE;
                        PlanSavingsAccountsScreen planSavingsAccountsScreen2 = this.f144876b;
                        return dli.f.a(planSavingsAccountsScreen2, (h) planSavingsAccountsScreen2.T.getValue(), v.k(planSavingsAccountsScreen2.O, new BannerLoadingDelegate(), new RowLoadingDelegate(), planSavingsAccountsScreen2.P), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        PlanSavingsAccountsScreen.Companion companion22 = PlanSavingsAccountsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(planSavingsAccountsScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanSavingsAccountsScreenContract$InputData planSavingsAccountsScreenContract$InputData = planSavingsAccountsScreen.K;
                        planSavingsAccountsScreenContract$InputData.getClass();
                        return new e1(i0Var, planSavingsAccountsScreenContract$InputData);
                    default:
                        PlanSavingsAccountsScreen.Companion companion3 = PlanSavingsAccountsScreen.INSTANCE;
                        return (h) ((e1) planSavingsAccountsScreen.S.getValue()).f245938c.get();
                }
            }
        });
        final int i5 = 2;
        this.T = w.y0(new Function0(this) { // from class: gmk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanSavingsAccountsScreen f144876b;

            {
                this.f144876b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PlanSavingsAccountsScreen planSavingsAccountsScreen = this.f144876b;
                switch (i22) {
                    case 0:
                        PlanSavingsAccountsScreen.Companion companion2 = PlanSavingsAccountsScreen.INSTANCE;
                        PlanSavingsAccountsScreen planSavingsAccountsScreen2 = this.f144876b;
                        return dli.f.a(planSavingsAccountsScreen2, (h) planSavingsAccountsScreen2.T.getValue(), v.k(planSavingsAccountsScreen2.O, new BannerLoadingDelegate(), new RowLoadingDelegate(), planSavingsAccountsScreen2.P), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        PlanSavingsAccountsScreen.Companion companion22 = PlanSavingsAccountsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(planSavingsAccountsScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanSavingsAccountsScreenContract$InputData planSavingsAccountsScreenContract$InputData = planSavingsAccountsScreen.K;
                        planSavingsAccountsScreenContract$InputData.getClass();
                        return new e1(i0Var, planSavingsAccountsScreenContract$InputData);
                    default:
                        PlanSavingsAccountsScreen.Companion companion3 = PlanSavingsAccountsScreen.INSTANCE;
                        return (h) ((e1) planSavingsAccountsScreen.S.getValue()).f245938c.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174546c.setHeaderModel(new lw0.a(uiState.f144881b, null, null, null, false, 30));
        d3().f174545b.setText(uiState.f144882c);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.R = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (e1) this.S.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (gmk.h) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewD2 = D2();
        int i = gmk.b.f144877a[this.K.f103545a.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.plan_hub_sheet_savings_accounts_savings_title, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.plan_hub_sheet_savings_accounts_mmf_title, null, null, 14);
        }
        pd.b.p(viewD2, textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174545b.o), null, new f(this, null, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new gmk.e(this, null), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
