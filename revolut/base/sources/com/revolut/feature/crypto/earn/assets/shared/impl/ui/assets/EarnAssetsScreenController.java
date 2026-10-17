package com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets;

import aii.q;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ActionCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedGaugeChartDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedGaugeChartLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BackgroundContentView;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.earn.assets.shared.impl.R$id;
import com.revolut.feature.crypto.earn.assets.shared.impl.R$layout;
import com.revolut.feature.crypto.earn.assets.shared.impl.R$string;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.EarnAssetsScreenController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.youTransactor.uCube.rpc.Constants;
import ef5.f;
import ef5.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import ye5.b;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lef5/c;", "<init>", "()V", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EarnAssetsScreenController extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(EarnAssetsScreenController.class, "binding", "getBinding()Lcom/revolut/feature/crypto/earn/assets/shared/impl/databinding/EarnAssetsScreenBinding;", 0))};
    public final int K = R$layout.earn_assets_screen;
    public final h L = s.t(this, a.f);
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final ActionCardDelegate P;
    public final SegmentedGaugeChartDelegate Q;
    public final List R;
    public final Object S;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/crypto/earn/assets/shared/impl/databinding/EarnAssetsScreenBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.backgroundContentView;
            BackgroundContentView backgroundContentView = (BackgroundContentView) ViewBindings.findChildViewById(p0, i);
            if (backgroundContentView != null) {
                i = R$id.navBarWithContainer;
                NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(p0, i);
                if (navBarWithContainer != null) {
                    i = R$id.recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new b((ControllerContainerCoordinatorLayout) p0, backgroundContentView, navBarWithContainer);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public EarnAssetsScreenController() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ef5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EarnAssetsScreenController f125277b;

            {
                this.f125277b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EarnAssetsScreenController earnAssetsScreenController = this.f125277b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EarnAssetsScreenController.T;
                        phm.a aVar = (phm.a) ue0.e.j(earnAssetsScreenController.m2()).a().get(af5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", af5.d.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.crypto.earn.assets.shared.impl.di.EarnAssetsSharedComponent");
                        return new af5.c(((af5.d) objB).f3897j);
                    case 1:
                        KProperty[] kPropertyArr2 = EarnAssetsScreenController.T;
                        return (a) ((af5.c) earnAssetsScreenController.M.getValue()).f3891b.get();
                    default:
                        KProperty[] kPropertyArr3 = EarnAssetsScreenController.T;
                        EarnAssetsScreenController earnAssetsScreenController2 = this.f125277b;
                        return tki.g.a(earnAssetsScreenController2, earnAssetsScreenController2.d(), earnAssetsScreenController2.R, 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ef5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EarnAssetsScreenController f125277b;

            {
                this.f125277b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EarnAssetsScreenController earnAssetsScreenController = this.f125277b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EarnAssetsScreenController.T;
                        phm.a aVar = (phm.a) ue0.e.j(earnAssetsScreenController.m2()).a().get(af5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", af5.d.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.crypto.earn.assets.shared.impl.di.EarnAssetsSharedComponent");
                        return new af5.c(((af5.d) objB).f3897j);
                    case 1:
                        KProperty[] kPropertyArr2 = EarnAssetsScreenController.T;
                        return (a) ((af5.c) earnAssetsScreenController.M.getValue()).f3891b.get();
                    default:
                        KProperty[] kPropertyArr3 = EarnAssetsScreenController.T;
                        EarnAssetsScreenController earnAssetsScreenController2 = this.f125277b;
                        return tki.g.a(earnAssetsScreenController2, earnAssetsScreenController2.d(), earnAssetsScreenController2.R, 0, null, null, null, 60);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.O = rowDelegate;
        ActionCardDelegate actionCardDelegate = new ActionCardDelegate();
        this.P = actionCardDelegate;
        SegmentedGaugeChartDelegate segmentedGaugeChartDelegate = new SegmentedGaugeChartDelegate();
        this.Q = segmentedGaugeChartDelegate;
        final int i3 = 2;
        this.R = v.k(new GridBoxDelegate(v.k(new ActionCardLoadingDelegate(), actionCardDelegate), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), new FooterTextDelegate(), new FullScreenStateDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new SegmentedGaugeChartLoadingDelegate(), segmentedGaugeChartDelegate, rowDelegate);
        this.S = w.y0(new Function0(this) { // from class: ef5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EarnAssetsScreenController f125277b;

            {
                this.f125277b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EarnAssetsScreenController earnAssetsScreenController = this.f125277b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EarnAssetsScreenController.T;
                        phm.a aVar = (phm.a) ue0.e.j(earnAssetsScreenController.m2()).a().get(af5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", af5.d.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.crypto.earn.assets.shared.impl.di.EarnAssetsSharedComponent");
                        return new af5.c(((af5.d) objB).f3897j);
                    case 1:
                        KProperty[] kPropertyArr2 = EarnAssetsScreenController.T;
                        return (a) ((af5.c) earnAssetsScreenController.M.getValue()).f3891b.get();
                    default:
                        KProperty[] kPropertyArr3 = EarnAssetsScreenController.T;
                        EarnAssetsScreenController earnAssetsScreenController2 = this.f125277b;
                        return tki.g.a(earnAssetsScreenController2, earnAssetsScreenController2.d(), earnAssetsScreenController2.R, 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ef5.c uiState = (ef5.c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        Clause clause = uiState.f125274a;
        if (clause != null) {
            d3().f312773c.setHeaderDisclaimer(clause);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (af5.c) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithContainer navBarWithContainer = d3().f312773c;
        navBarWithContainer.setTitle(new TextLocalisedClause(R$string.crypto_staking_staking_overview_header_title, null, null, 14));
        navBarWithContainer.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithContainer.setMenuItems(u.c(new IconNavBarMenuItem("INFO_NAV_BAR_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.crypto_staking_staking_overview_info_button, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)));
        d3().f312772b.setBackground(NavBarWithContainerBackground.TransparentBackground.f57882a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f312773c.K()), new ec8.c(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(d3().f312773c.b()), new ef5.e(this, continuation, 0), 3);
        r10.v vVar = d3().f312773c.f59369w;
        vVar.c();
        ViewController.P2(this, kii.e.t(((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).S, "hide(...)"), new ef5.e(this, continuation, 1), 3);
        RowDelegate rowDelegate = this.O;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53220l), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f51572n), new ef5.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53302c.f121375b), new ef5.e(this, continuation, 2), 3);
    }

    public final b d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ef5.a d() {
        return (ef5.a) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
