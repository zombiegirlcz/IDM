package com.revolut.feature.trading.managed_portfolios.impl.ui.compare;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import com.revolut.feature.trading.managed_portfolios.impl.ui.compare.ManagedPortfoliosCompareController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.f;
import f6f.c;
import g6f.d;
import java.util.List;
import jii.b0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import w5f.m;
import w5f.n;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/compare/ManagedPortfoliosCompareController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lg6f/d;", "Ldli/a;", "Lf6f/c;", "<init>", "()V", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManagedPortfoliosCompareController extends ViewController<q> implements d, dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ManagedPortfoliosCompareController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithavatarNextbuttonBinding;", 0))};
    public final Object L;
    public final Object N;
    public final Object R;
    public final int K = R$layout.screen_recycler_navbarwithavatar_nextbutton;
    public final h M = s.t(this, a.f);
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();
    public final FixedTabsDelegate P = new FixedTabsDelegate();
    public final TrendViewDelegate Q = new TrendViewDelegate(200);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, b0.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithavatarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return b0.a(p0);
        }
    }

    public ManagedPortfoliosCompareController() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: f6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfoliosCompareController f132420b;

            {
                this.f132420b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ManagedPortfoliosCompareController managedPortfoliosCompareController = this.f132420b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfoliosCompareController.S;
                        return (d) ((n) managedPortfoliosCompareController.N.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfoliosCompareController.S;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfoliosCompareController.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new n(((m) aVar2.b()).f295201s, managedPortfoliosCompareController);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfoliosCompareController.S;
                        ManagedPortfoliosCompareController managedPortfoliosCompareController2 = this.f132420b;
                        return f.a(managedPortfoliosCompareController2, (d) managedPortfoliosCompareController2.L.getValue(), v.k(managedPortfoliosCompareController2.P, managedPortfoliosCompareController2.Q, managedPortfoliosCompareController2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: f6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfoliosCompareController f132420b;

            {
                this.f132420b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ManagedPortfoliosCompareController managedPortfoliosCompareController = this.f132420b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfoliosCompareController.S;
                        return (d) ((n) managedPortfoliosCompareController.N.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfoliosCompareController.S;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfoliosCompareController.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new n(((m) aVar2.b()).f295201s, managedPortfoliosCompareController);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfoliosCompareController.S;
                        ManagedPortfoliosCompareController managedPortfoliosCompareController2 = this.f132420b;
                        return f.a(managedPortfoliosCompareController2, (d) managedPortfoliosCompareController2.L.getValue(), v.k(managedPortfoliosCompareController2.P, managedPortfoliosCompareController2.Q, managedPortfoliosCompareController2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: f6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfoliosCompareController f132420b;

            {
                this.f132420b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ManagedPortfoliosCompareController managedPortfoliosCompareController = this.f132420b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfoliosCompareController.S;
                        return (d) ((n) managedPortfoliosCompareController.N.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfoliosCompareController.S;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfoliosCompareController.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new n(((m) aVar2.b()).f295201s, managedPortfoliosCompareController);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfoliosCompareController.S;
                        ManagedPortfoliosCompareController managedPortfoliosCompareController2 = this.f132420b;
                        return f.a(managedPortfoliosCompareController2, (d) managedPortfoliosCompareController2.L.getValue(), v.k(managedPortfoliosCompareController2.P, managedPortfoliosCompareController2.Q, managedPortfoliosCompareController2.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f6f.d) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithAvatar navBarWithAvatar = d3().f174500c;
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithAvatar.setToolbarTitle(new TextLocalisedClause(R$string.managed_portfolios_compare_title, null, null, 14));
        navBarWithAvatar.setAvatarImage(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        LargeActionButton goToButton = d3().f174499b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174500c.f59338a), new ev7.b(this, null, 15), 3);
    }

    public final b0 d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b0) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
