package com.revolut.feature.junior_settings.impl.ui_kompot.app_access;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessController;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dcf.v0;
import do8.f;
import do8.g;
import do8.j;
import do8.k;
import do8.l;
import do8.n;
import grl.k9;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/app_access/JuniorAppAccessController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/app_access/a;", "Ldli/a;", "Ldo8/n;", "Lno/m;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorAppAccessController extends ViewController<a> implements dli.a, m {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(JuniorAppAccessController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final JuniorAppAccessControllerContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final boolean N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final FullScreenStateDelegate R;
    public final LargeActionButtonDelegate S;
    public final TwinHorizontalButtonDelegate T;
    public final Object U;

    public JuniorAppAccessController(JuniorAppAccessControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.i;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.M = R$layout.screen_recycler_navbar_action_footer;
        this.N = true;
        this.O = s.t(this, do8.b.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: do8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAppAccessController f116449b;

            {
                this.f116449b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorAppAccessController juniorAppAccessController = this.f116449b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAppAccessController.V;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAppAccessController.m2()).a().get(mn8.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mn8.o.class, " is not found"));
                        }
                        mn8.o oVar = ((mn8.o) ((eo8.a) aVar2.b())).f207476w;
                        JuniorAppAccessControllerContract$InputData juniorAppAccessControllerContract$InputData = juniorAppAccessController.K;
                        juniorAppAccessControllerContract$InputData.getClass();
                        return new mn8.h(oVar, juniorAppAccessController, juniorAppAccessControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAppAccessController.V;
                        return (h) ((mn8.h) juniorAppAccessController.P.getValue()).f207437j.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorAppAccessController.V;
                        JuniorAppAccessController juniorAppAccessController2 = this.f116449b;
                        return dli.f.a(juniorAppAccessController2, juniorAppAccessController2.d(), zhm.v.k(juniorAppAccessController2.R, new FullScreenStateLoadingDelegate(), juniorAppAccessController2.S), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: do8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAppAccessController f116449b;

            {
                this.f116449b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorAppAccessController juniorAppAccessController = this.f116449b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAppAccessController.V;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAppAccessController.m2()).a().get(mn8.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mn8.o.class, " is not found"));
                        }
                        mn8.o oVar = ((mn8.o) ((eo8.a) aVar2.b())).f207476w;
                        JuniorAppAccessControllerContract$InputData juniorAppAccessControllerContract$InputData = juniorAppAccessController.K;
                        juniorAppAccessControllerContract$InputData.getClass();
                        return new mn8.h(oVar, juniorAppAccessController, juniorAppAccessControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAppAccessController.V;
                        return (h) ((mn8.h) juniorAppAccessController.P.getValue()).f207437j.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorAppAccessController.V;
                        JuniorAppAccessController juniorAppAccessController2 = this.f116449b;
                        return dli.f.a(juniorAppAccessController2, juniorAppAccessController2.d(), zhm.v.k(juniorAppAccessController2.R, new FullScreenStateLoadingDelegate(), juniorAppAccessController2.S), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = new FullScreenStateDelegate();
        this.S = new LargeActionButtonDelegate();
        this.T = new TwinHorizontalButtonDelegate();
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: do8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAppAccessController f116449b;

            {
                this.f116449b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorAppAccessController juniorAppAccessController = this.f116449b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAppAccessController.V;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAppAccessController.m2()).a().get(mn8.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mn8.o.class, " is not found"));
                        }
                        mn8.o oVar = ((mn8.o) ((eo8.a) aVar2.b())).f207476w;
                        JuniorAppAccessControllerContract$InputData juniorAppAccessControllerContract$InputData = juniorAppAccessController.K;
                        juniorAppAccessControllerContract$InputData.getClass();
                        return new mn8.h(oVar, juniorAppAccessController, juniorAppAccessControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAppAccessController.V;
                        return (h) ((mn8.h) juniorAppAccessController.P.getValue()).f207437j.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorAppAccessController.V;
                        JuniorAppAccessController juniorAppAccessController2 = this.f116449b;
                        return dli.f.a(juniorAppAccessController2, juniorAppAccessController2.d(), zhm.v.k(juniorAppAccessController2.R, new FullScreenStateLoadingDelegate(), juniorAppAccessController2.S), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        do8.m mVar = uiState.f116458a;
        if (mVar instanceof j) {
            NavBarWithToolbar navBarWithToolbar = d3().f174534c;
            j jVar = (j) mVar;
            TextLocalisedClause textLocalisedClause = jVar.f116454a;
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setMenuItems(jVar.f116455b);
            navBarWithToolbar.l0();
        } else {
            if (!(mVar instanceof k) && !(mVar instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            d3().f174534c.setMenuItems(mVar.a());
            NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
            screenRecyclerNavbarActionFooterNavBar.I0(t3.DEFAULT, false);
        }
        if (uiState.f116460c == null) {
            ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
            screenRecyclerNavbarActionFooterActionFooterView.setVisibility(8);
        } else {
            d3().f174533b.setModel(new e(false, null, null, uiState.f116460c, null, null, 55));
            ActionFooterView screenRecyclerNavbarActionFooterActionFooterView2 = d3().f174533b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView2, "screenRecyclerNavbarActionFooterActionFooterView");
            screenRecyclerNavbarActionFooterActionFooterView2.setVisibility(0);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (mn8.h) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((mn8.h) this.P.getValue()).e.get()).d(u.c(this.T));
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174534c.setSecondDescriptionVisible(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new v0(this, continuation, 10), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.o.f57403b), null, new do8.c(this, continuation, 0), 3);
        FullScreenStateDelegate fullScreenStateDelegate = this.R;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), null, new do8.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fullScreenStateDelegate.f.f121375b), null, new do8.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fullScreenStateDelegate.f52370g.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.d.f121375b), null, new g(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.T;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new do8.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new do8.c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new do8.c(this, continuation, 3), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final do8.h d() {
        return (do8.h) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
