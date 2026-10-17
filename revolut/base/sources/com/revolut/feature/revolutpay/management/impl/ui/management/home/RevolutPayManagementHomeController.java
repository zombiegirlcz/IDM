package com.revolut.feature.revolutpay.management.impl.ui.management.home;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bac.i;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.revolutpay.management.impl.ui.management.home.RevolutPayManagementHomeController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dze.n;
import eac.b;
import eac.c;
import eac.d;
import eac.f;
import eac.g;
import eac.p;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Leac/q;", "<init>", "()V", "feature_revolut_pay_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutPayManagementHomeController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(RevolutPayManagementHomeController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object V;
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final RowDelegate O = new RowDelegate(null, null, 7);
    public final ListSubheaderDelegate P = new ListSubheaderDelegate();
    public final RewardsGridDelegate Q = new RewardsGridDelegate();
    public final RewardsGridLoadingDelegate R = new RewardsGridLoadingDelegate();
    public final HeroBannerDelegate S = new HeroBannerDelegate(0);
    public final ActionWidgetDelegate T = new ActionWidgetDelegate();
    public final FullScreenStateDelegate U = new FullScreenStateDelegate();

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
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

    public RevolutPayManagementHomeController() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: eac.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutPayManagementHomeController f124163b;

            {
                this.f124163b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevolutPayManagementHomeController revolutPayManagementHomeController = this.f124163b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevolutPayManagementHomeController.W;
                        phm.a aVar = (phm.a) ue0.e.j(revolutPayManagementHomeController.m2()).a().get(bac.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (bac.i) ((fac.a) ((fac.b) aVar2.b()).b().mo3808a(revolutPayManagementHomeController)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", bac.b.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = RevolutPayManagementHomeController.W;
                        bac.i iVar = (bac.i) revolutPayManagementHomeController.M.getValue();
                        switch (iVar.f14038a) {
                            case 0:
                                return (i) iVar.d.get();
                            default:
                                return (i) iVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = RevolutPayManagementHomeController.W;
                        RevolutPayManagementHomeController revolutPayManagementHomeController2 = this.f124163b;
                        return dli.f.a(revolutPayManagementHomeController2, revolutPayManagementHomeController2.d(), zhm.v.k(new RowLoadingDelegate(), new HeroBannerLoadingDelegate(), revolutPayManagementHomeController2.O, revolutPayManagementHomeController2.P, revolutPayManagementHomeController2.Q, revolutPayManagementHomeController2.R, revolutPayManagementHomeController2.S, revolutPayManagementHomeController2.T, revolutPayManagementHomeController2.U), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: eac.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutPayManagementHomeController f124163b;

            {
                this.f124163b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevolutPayManagementHomeController revolutPayManagementHomeController = this.f124163b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevolutPayManagementHomeController.W;
                        phm.a aVar = (phm.a) ue0.e.j(revolutPayManagementHomeController.m2()).a().get(bac.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (bac.i) ((fac.a) ((fac.b) aVar2.b()).b().mo3808a(revolutPayManagementHomeController)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", bac.b.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = RevolutPayManagementHomeController.W;
                        bac.i iVar = (bac.i) revolutPayManagementHomeController.M.getValue();
                        switch (iVar.f14038a) {
                            case 0:
                                return (i) iVar.d.get();
                            default:
                                return (i) iVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = RevolutPayManagementHomeController.W;
                        RevolutPayManagementHomeController revolutPayManagementHomeController2 = this.f124163b;
                        return dli.f.a(revolutPayManagementHomeController2, revolutPayManagementHomeController2.d(), zhm.v.k(new RowLoadingDelegate(), new HeroBannerLoadingDelegate(), revolutPayManagementHomeController2.O, revolutPayManagementHomeController2.P, revolutPayManagementHomeController2.Q, revolutPayManagementHomeController2.R, revolutPayManagementHomeController2.S, revolutPayManagementHomeController2.T, revolutPayManagementHomeController2.U), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: eac.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutPayManagementHomeController f124163b;

            {
                this.f124163b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevolutPayManagementHomeController revolutPayManagementHomeController = this.f124163b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevolutPayManagementHomeController.W;
                        phm.a aVar = (phm.a) ue0.e.j(revolutPayManagementHomeController.m2()).a().get(bac.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (bac.i) ((fac.a) ((fac.b) aVar2.b()).b().mo3808a(revolutPayManagementHomeController)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", bac.b.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = RevolutPayManagementHomeController.W;
                        bac.i iVar = (bac.i) revolutPayManagementHomeController.M.getValue();
                        switch (iVar.f14038a) {
                            case 0:
                                return (i) iVar.d.get();
                            default:
                                return (i) iVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = RevolutPayManagementHomeController.W;
                        RevolutPayManagementHomeController revolutPayManagementHomeController2 = this.f124163b;
                        return dli.f.a(revolutPayManagementHomeController2, revolutPayManagementHomeController2.d(), zhm.v.k(new RowLoadingDelegate(), new HeroBannerLoadingDelegate(), revolutPayManagementHomeController2.O, revolutPayManagementHomeController2.P, revolutPayManagementHomeController2.Q, revolutPayManagementHomeController2.R, revolutPayManagementHomeController2.S, revolutPayManagementHomeController2.T, revolutPayManagementHomeController2.U), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        eac.q uiState = (eac.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        p pVar = uiState.f124175a;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = pVar.f124173a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setMenuItems(pVar.f124174b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new n(this, continuation, 24), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new b(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53218h), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53209c.d), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52707c), new eac.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.d), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.f51589c.f121375b), new b(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.U.f52371h.f121375b), new g(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final eac.i d() {
        return (eac.i) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
