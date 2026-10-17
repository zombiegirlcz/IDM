package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.screen.PlanManagementScreen;
import java.util.List;
import jii.x;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p73.d;
import pmk.f;
import pmk.g;
import pmk.l;
import pmk.p;
import pmk.q;
import qgk.p0;
import qgk.q0;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_management/screen/PlanManagementScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lpmk/q;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lpmk/l;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanManagementScreen extends BaseRecyclerViewScreen<q, IOData$EmptyInput, l> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(PlanManagementScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final TextDelegate f103584a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final LargeActionButtonDelegate f103585b0;
    public final CellDetailsChevronDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final HeroBannerDelegate f103586d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f103587e0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, x.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return x.a(p0);
        }
    }

    public PlanManagementScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_recycler_navbar_two_buttons;
        this.V = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
        this.W = s.t(this, a.f);
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: pmk.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanManagementScreen f237612b;

            {
                this.f237612b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanManagementScreen planManagementScreen = this.f237612b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanManagementScreen.f0;
                        qji.b bVarQ2 = planManagementScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.screen.di.PlanManagementScreenInjector");
                        p0 p0Var = (p0) bVarQ2;
                        return new q0(p0Var.f246187a, p0Var.f246188b, planManagementScreen);
                    default:
                        KProperty[] kPropertyArr2 = PlanManagementScreen.f0;
                        return (p) ((q0) ((qmk.a) planManagementScreen.X.getValue())).k.get();
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: pmk.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanManagementScreen f237612b;

            {
                this.f237612b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanManagementScreen planManagementScreen = this.f237612b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanManagementScreen.f0;
                        qji.b bVarQ2 = planManagementScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.screen.di.PlanManagementScreenInjector");
                        p0 p0Var = (p0) bVarQ2;
                        return new q0(p0Var.f246187a, p0Var.f246188b, planManagementScreen);
                    default:
                        KProperty[] kPropertyArr2 = PlanManagementScreen.f0;
                        return (p) ((q0) ((qmk.a) planManagementScreen.X.getValue())).k.get();
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.f103584a0 = textDelegate;
        this.f103585b0 = new LargeActionButtonDelegate();
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.c0 = cellDetailsChevronDelegate;
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        this.f103586d0 = heroBannerDelegate;
        this.f103587e0 = v.k(rowDelegate, textDelegate, new RowLoadingDelegate(), cellDetailsChevronDelegate, heroBannerDelegate);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        q uiState = (q) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = g3().f174574c;
        TextLocalisedClause textLocalisedClause = uiState.f237627a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (qmk.a) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (p) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174574c.f59410q), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f103584a0.d), null, new f(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f103585b0.d.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.f53226s), null, new pmk.h(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(new d(e.b(this.c0.f51821c), 18), new d(e.b(this.f103586d0.d), 19)), null, new pmk.h(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        g3().f174574c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((q0) ((qmk.a) this.X.getValue())).d.get()).d(u.c(this.f103585b0));
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = g3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        screenRecyclerNavbarTwoButtonsFirstButton.setVisibility(8);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        q uiState = (q) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = g3().f174574c;
        TextLocalisedClause textLocalisedClause = uiState.f237627a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF103587e0() {
        return this.f103587e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final x g3() {
        ViewBinding value = this.W.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.U;
    }
}
