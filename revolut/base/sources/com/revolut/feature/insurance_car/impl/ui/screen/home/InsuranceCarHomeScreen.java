package com.revolut.feature.insurance_car.impl.ui.screen.home;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ShortHeaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.feature.insurance_car.impl.R$layout;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.home.InsuranceCarHomeScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import nl7.k;
import no.m;
import ql7.k0;
import ql7.l0;
import ql7.m0;
import rd0.e;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import wn7.c;
import wn7.d;
import wn7.i;
import wn7.j;
import wn7.l;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/home/InsuranceCarHomeScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lwn7/j;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lwn7/i;", "Lno/m;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsuranceCarHomeScreen extends BaseRecyclerViewScreen<j, IOData$EmptyInput, i> implements m {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75523e0 = {o0.f186429a.j(new h0(InsuranceCarHomeScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenInsuranceCarHomeBinding;", 0))};
    public final /* synthetic */ zl7.a U;
    public final int V;
    public final int W;
    public final h X;
    public final boolean Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f75524a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ProductSelectionDelegate f75525b0;
    public final BigTileDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f75526d0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, k.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/insurance_car/impl/databinding/ScreenInsuranceCarHomeBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.insuranceCarHome_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.insuranceCarHome_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new k((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public InsuranceCarHomeScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = zl7.a.f323190a;
        this.V = R$layout.screen_insurance_car_home;
        this.W = R$id.insuranceCarHome_recyclerView;
        this.X = s.t(this, a.f);
        final int i = 1;
        this.Y = true;
        final int i2 = 0;
        this.Z = w.y0(new Function0(this) { // from class: wn7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceCarHomeScreen f298714b;

            {
                this.f298714b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                InsuranceCarHomeScreen insuranceCarHomeScreen = this.f298714b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceCarHomeScreen.f75523e0;
                        qji.b bVarQ2 = insuranceCarHomeScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.home.di.InsuranceCarHomeScreenInjector");
                        k0 k0Var = ((l0) bVarQ2).f247374a;
                        m0 m0Var = new m0();
                        m0Var.f247382a = e4m.b.b(new ql7.l(k0Var, m0Var, 1, 13));
                        m0Var.f247383b = e4m.b.b(new ql7.l(k0Var, m0Var, 0, 13));
                        return m0Var;
                    default:
                        KProperty[] kPropertyArr2 = InsuranceCarHomeScreen.f75523e0;
                        return (l) ((m0) insuranceCarHomeScreen.Z.getValue()).f247383b.get();
                }
            }
        });
        this.f75524a0 = w.y0(new Function0(this) { // from class: wn7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceCarHomeScreen f298714b;

            {
                this.f298714b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                InsuranceCarHomeScreen insuranceCarHomeScreen = this.f298714b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceCarHomeScreen.f75523e0;
                        qji.b bVarQ2 = insuranceCarHomeScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.home.di.InsuranceCarHomeScreenInjector");
                        k0 k0Var = ((l0) bVarQ2).f247374a;
                        m0 m0Var = new m0();
                        m0Var.f247382a = e4m.b.b(new ql7.l(k0Var, m0Var, 1, 13));
                        m0Var.f247383b = e4m.b.b(new ql7.l(k0Var, m0Var, 0, 13));
                        return m0Var;
                    default:
                        KProperty[] kPropertyArr2 = InsuranceCarHomeScreen.f75523e0;
                        return (l) ((m0) insuranceCarHomeScreen.Z.getValue()).f247383b.get();
                }
            }
        });
        ProductSelectionDelegate productSelectionDelegate = new ProductSelectionDelegate();
        this.f75525b0 = productSelectionDelegate;
        BigTileDelegate bigTileDelegate = new BigTileDelegate();
        this.c0 = bigTileDelegate;
        this.f75526d0 = v.k(bigTileDelegate, new ShortHeaderDelegate(), productSelectionDelegate, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new ProductSelectionLoadingDelegate(), new FullScreenStateDelegate());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        j uiState = (j) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f217075b.setMenuItems(uiState.f298720b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        this.U.getClass();
        return new AnalyticsProduct.Retail(zl7.a.f323191b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (m0) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (l) this.f75524a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f217075b.f59410q), null, new wkg.e(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f217075b.o.f57403b), null, new wka.e(this, continuation, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75525b0.p()), null, new c(this, null), 3);
        BigTileDelegate bigTileDelegate = this.c0;
        com.revolut.kompot.navigable.a.g2(this, e.b(bigTileDelegate.d), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(bigTileDelegate.f), null, new wn7.e(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f217075b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_home_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        j uiState = (j) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f217075b.setMenuItems(uiState.f298720b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF86733d0() {
        return this.f75526d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getY() {
        return this.W;
    }

    public final k g3() {
        ViewBinding value = this.X.getValue(this, f75523e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Y);
    }
}
