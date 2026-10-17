package com.revolut.feature.revolut_shop.ui.screen.dashboard;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import az.i;
import b4c.c;
import b4c.f;
import b4c.g;
import b4c.j;
import b4c.l;
import b4c.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeVoucherLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeVoucherTileDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepHorizontalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepHorizontalV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.revolut_shop.ui.screen.dashboard.IppShopDashboardScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import m3c.d;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/screen/dashboard/IppShopDashboardScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lb4c/l;", "Ldli/a;", "Lb4c/o;", "<init>", "()V", "Companion", "a", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IppShopDashboardScreen extends ViewController<l> implements a {
    public final Object M;
    public final Object N;
    public final FullScreenStateDelegate Q;
    public final ProgressStepVerticalV2Delegate R;
    public final RowDelegate S;
    public final LabelButtonDelegate T;
    public final ProgressStepHorizontalLoadingV2Delegate U;
    public final ScrollerDelegate V;
    public final Object W;
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(IppShopDashboardScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, b.f);
    public final LargeVoucherTileDelegate O = new LargeVoucherTileDelegate();
    public final VoucherSmallTileDelegate P = new VoucherSmallTileDelegate();

    /* JADX INFO: renamed from: com.revolut.feature.revolut_shop.ui.screen.dashboard.IppShopDashboardScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public IppShopDashboardScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: b4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IppShopDashboardScreen f12263b;

            {
                this.f12263b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IppShopDashboardScreen ippShopDashboardScreen = this.f12263b;
                switch (i2) {
                    case 0:
                        IppShopDashboardScreen.Companion companion = IppShopDashboardScreen.INSTANCE;
                        qji.b bVarU2 = ippShopDashboardScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.dashboard.di.IppShopDashboardScreenInjector");
                        m3c.e eVar = (m3c.e) bVarU2;
                        return new m3c.d(eVar.f202332b, eVar.f202333c);
                    case 1:
                        IppShopDashboardScreen.Companion companion2 = IppShopDashboardScreen.INSTANCE;
                        return (n) ((m3c.d) ippShopDashboardScreen.M.getValue()).e.get();
                    default:
                        IppShopDashboardScreen.Companion companion3 = IppShopDashboardScreen.INSTANCE;
                        IppShopDashboardScreen ippShopDashboardScreen2 = this.f12263b;
                        return dli.f.a(ippShopDashboardScreen2, ippShopDashboardScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), ippShopDashboardScreen2.O, new GridBoxDelegate(zhm.u.c(ippShopDashboardScreen2.P), 0, 8.0f, 8.0f, 2), new LargeVoucherLoadingDelegate(), ippShopDashboardScreen2.Q, new RowLoadingDelegate(), ippShopDashboardScreen2.U, ippShopDashboardScreen2.V), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: b4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IppShopDashboardScreen f12263b;

            {
                this.f12263b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IppShopDashboardScreen ippShopDashboardScreen = this.f12263b;
                switch (i22) {
                    case 0:
                        IppShopDashboardScreen.Companion companion = IppShopDashboardScreen.INSTANCE;
                        qji.b bVarU2 = ippShopDashboardScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.dashboard.di.IppShopDashboardScreenInjector");
                        m3c.e eVar = (m3c.e) bVarU2;
                        return new m3c.d(eVar.f202332b, eVar.f202333c);
                    case 1:
                        IppShopDashboardScreen.Companion companion2 = IppShopDashboardScreen.INSTANCE;
                        return (n) ((m3c.d) ippShopDashboardScreen.M.getValue()).e.get();
                    default:
                        IppShopDashboardScreen.Companion companion3 = IppShopDashboardScreen.INSTANCE;
                        IppShopDashboardScreen ippShopDashboardScreen2 = this.f12263b;
                        return dli.f.a(ippShopDashboardScreen2, ippShopDashboardScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), ippShopDashboardScreen2.O, new GridBoxDelegate(zhm.u.c(ippShopDashboardScreen2.P), 0, 8.0f, 8.0f, 2), new LargeVoucherLoadingDelegate(), ippShopDashboardScreen2.Q, new RowLoadingDelegate(), ippShopDashboardScreen2.U, ippShopDashboardScreen2.V), 0, null, null, null, 60);
                }
            }
        });
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Q = fullScreenStateDelegate;
        ProgressStepVerticalV2Delegate progressStepVerticalV2Delegate = new ProgressStepVerticalV2Delegate();
        this.R = progressStepVerticalV2Delegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.S = rowDelegate;
        LabelButtonDelegate labelButtonDelegate = new LabelButtonDelegate();
        this.T = labelButtonDelegate;
        ProgressStepHorizontalLoadingV2Delegate progressStepHorizontalLoadingV2Delegate = new ProgressStepHorizontalLoadingV2Delegate();
        this.U = progressStepHorizontalLoadingV2Delegate;
        final int i3 = 2;
        this.V = new ScrollerDelegate(u.c(new ContainerDelegate(v.k(new RowLoadingDelegate(), progressStepHorizontalLoadingV2Delegate, fullScreenStateDelegate, rowDelegate, labelButtonDelegate, progressStepVerticalV2Delegate, new ProgressStepHorizontalV2Delegate()), null, 6)), false);
        this.W = w.y0(new Function0(this) { // from class: b4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IppShopDashboardScreen f12263b;

            {
                this.f12263b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IppShopDashboardScreen ippShopDashboardScreen = this.f12263b;
                switch (i22) {
                    case 0:
                        IppShopDashboardScreen.Companion companion = IppShopDashboardScreen.INSTANCE;
                        qji.b bVarU2 = ippShopDashboardScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.dashboard.di.IppShopDashboardScreenInjector");
                        m3c.e eVar = (m3c.e) bVarU2;
                        return new m3c.d(eVar.f202332b, eVar.f202333c);
                    case 1:
                        IppShopDashboardScreen.Companion companion2 = IppShopDashboardScreen.INSTANCE;
                        return (n) ((m3c.d) ippShopDashboardScreen.M.getValue()).e.get();
                    default:
                        IppShopDashboardScreen.Companion companion3 = IppShopDashboardScreen.INSTANCE;
                        IppShopDashboardScreen ippShopDashboardScreen2 = this.f12263b;
                        return dli.f.a(ippShopDashboardScreen2, ippShopDashboardScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), ippShopDashboardScreen2.O, new GridBoxDelegate(zhm.u.c(ippShopDashboardScreen2.P), 0, 8.0f, 8.0f, 2), new LargeVoucherLoadingDelegate(), ippShopDashboardScreen2.Q, new RowLoadingDelegate(), ippShopDashboardScreen2.U, ippShopDashboardScreen2.V), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        b4c.o uiState = (b4c.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setMenuItems(uiState.f12273b);
        navBarWithToolbar.setFilters(uiState.f12274c);
        Clause clause = uiState.f12272a;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new i(this, null, 5), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new b4c.e(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.s0()), new f(this, null), 3);
        FullScreenStateDelegate fullScreenStateDelegate = this.Q;
        ViewController.P2(this, rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.d), new b4c.e(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.P.f53608c), new b4c.h(this, null), 3);
        ProgressStepVerticalV2Delegate progressStepVerticalV2Delegate = this.R;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(progressStepVerticalV2Delegate.f.f121375b), null, new b4c.i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(progressStepVerticalV2Delegate.e), null, new b4c.e(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), null, new j(this, null), 3);
        RowDelegate rowDelegate = this.S;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new b4c.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.k), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.d.f121375b), null, new b4c.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.q()), null, new b4c.e(this, null, 0), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n R2() {
        return (n) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }
}
