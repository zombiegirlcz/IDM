package com.revolut.feature.credit.health.impl.ui.dashboard;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.PhotoHeaderView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.credit.health.impl.R$id;
import com.revolut.feature.credit.health.impl.R$layout;
import com.revolut.feature.credit.health.impl.ui.dashboard.DashboardScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import kw0.c;
import kw0.f;
import kw0.g;
import kw0.j;
import kw0.k;
import no.m;
import t05.l;
import t05.t;
import t05.u;
import t05.x;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/health/impl/ui/dashboard/DashboardScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lt05/t;", "Ldli/a;", "Lt05/u;", "Lno/m;", "<init>", "()V", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DashboardScreen extends ViewController<t> implements dli.a, m {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(DashboardScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/health/impl/databinding/ScreenCreditHealthDashboardBinding;", 0))};
    public final AnalyticsProduct.Retail K;
    public final int L;
    public final RowDelegate M;
    public final ActionWidgetDelegate N;
    public final LargeActionButtonDelegate O;
    public final FullScreenStateDelegate P;
    public final FooterTextDelegate Q;
    public final Object R;
    public final h S;
    public final Object T;
    public final Object U;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, o05.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/credit/health/impl/databinding/ScreenCreditHealthDashboardBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.dashboardScreen_photoHeader;
            PhotoHeaderView photoHeaderView = (PhotoHeaderView) ViewBindings.findChildViewById(p0, i);
            if (photoHeaderView != null) {
                i = R$id.dashboardScreen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new o05.a((ControllerContainerCoordinatorLayout) p0, photoHeaderView);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public DashboardScreen() {
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.K = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.L = R$layout.screen_credit_health_dashboard;
        this.M = new RowDelegate(null, null, 7);
        this.N = new ActionWidgetDelegate();
        this.O = new LargeActionButtonDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new FooterTextDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: t05.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardScreen f266911b;

            {
                this.f266911b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DashboardScreen dashboardScreen = this.f266911b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DashboardScreen.V;
                        DashboardScreen dashboardScreen2 = this.f266911b;
                        return dli.f.a(dashboardScreen2, dashboardScreen2.R2(), zhm.v.k(dashboardScreen2.P, new RowLoadingDelegate(), dashboardScreen2.M, dashboardScreen2.N, dashboardScreen2.O, new ListSubheaderDelegate(), dashboardScreen2.Q), R$id.dashboardScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DashboardScreen.V;
                        qji.b bVarU2 = dashboardScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.health.impl.ui.dashboard.di.DashboardScreenInjector");
                        q05.f fVar = (q05.f) bVarU2;
                        return new q05.g(fVar.f241152a, fVar.f241153b);
                    default:
                        KProperty[] kPropertyArr3 = DashboardScreen.V;
                        return (x) ((q05.g) dashboardScreen.T.getValue()).f241156b.get();
                }
            }
        });
        this.S = s.t(this, a.f);
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: t05.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardScreen f266911b;

            {
                this.f266911b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DashboardScreen dashboardScreen = this.f266911b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DashboardScreen.V;
                        DashboardScreen dashboardScreen2 = this.f266911b;
                        return dli.f.a(dashboardScreen2, dashboardScreen2.R2(), zhm.v.k(dashboardScreen2.P, new RowLoadingDelegate(), dashboardScreen2.M, dashboardScreen2.N, dashboardScreen2.O, new ListSubheaderDelegate(), dashboardScreen2.Q), R$id.dashboardScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DashboardScreen.V;
                        qji.b bVarU2 = dashboardScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.health.impl.ui.dashboard.di.DashboardScreenInjector");
                        q05.f fVar = (q05.f) bVarU2;
                        return new q05.g(fVar.f241152a, fVar.f241153b);
                    default:
                        KProperty[] kPropertyArr3 = DashboardScreen.V;
                        return (x) ((q05.g) dashboardScreen.T.getValue()).f241156b.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: t05.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardScreen f266911b;

            {
                this.f266911b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DashboardScreen dashboardScreen = this.f266911b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DashboardScreen.V;
                        DashboardScreen dashboardScreen2 = this.f266911b;
                        return dli.f.a(dashboardScreen2, dashboardScreen2.R2(), zhm.v.k(dashboardScreen2.P, new RowLoadingDelegate(), dashboardScreen2.M, dashboardScreen2.N, dashboardScreen2.O, new ListSubheaderDelegate(), dashboardScreen2.Q), R$id.dashboardScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DashboardScreen.V;
                        qji.b bVarU2 = dashboardScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.health.impl.ui.dashboard.di.DashboardScreenInjector");
                        q05.f fVar = (q05.f) bVarU2;
                        return new q05.g(fVar.f241152a, fVar.f241153b);
                    default:
                        KProperty[] kPropertyArr3 = DashboardScreen.V;
                        return (x) ((q05.g) dashboardScreen.T.getValue()).f241156b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        u uiState = (u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ResourceImage navigationIcon = new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        ViewBinding value = this.S.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        PhotoHeaderView photoHeaderView = ((o05.a) value).f221153b;
        g gVar = uiState.f266932b;
        k kVar = gVar.f190188a;
        List menuItems = kVar.f190196b;
        Clause clause = kVar.f190197c;
        Clause clause2 = kVar.d;
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        k toolbar = new k(navigationIcon, menuItems, clause, clause2);
        f fVar = gVar.f190189b;
        Clause clause3 = gVar.f190190c;
        j jVar = gVar.d;
        Clause clause4 = gVar.e;
        List actions = gVar.f;
        c heightMode = gVar.f190191g;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        photoHeaderView.setContent(new g(toolbar, fVar, clause3, jVar, clause4, actions, heightMode));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q05.g) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.S.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((o05.a) value).f221153b.Q), null, new t05.m(this, null, 0), 3);
        RowDelegate rowDelegate = this.M;
        com.revolut.kompot.navigable.a.g2(this, new t05.c(rd0.e.b(rowDelegate.f53218h), 2), null, new t05.j(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, new t05.c(rd0.e.b(rowDelegate.f53218h), 3), null, new t05.j(this, null, 3), 3);
        ActionWidgetDelegate actionWidgetDelegate = this.N;
        com.revolut.kompot.navigable.a.g2(this, new rv6.e(new t05.c(rd0.e.b(actionWidgetDelegate.f51589c.f121375b), 0), 8), null, new t05.j(this, null, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, new rv6.e(new t05.c(rd0.e.b(actionWidgetDelegate.f51589c.f121375b), 1), 9), null, new t05.j(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.d.f121375b), new t05.k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.e.f121375b), null, new t05.j(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final x R2() {
        return (x) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
