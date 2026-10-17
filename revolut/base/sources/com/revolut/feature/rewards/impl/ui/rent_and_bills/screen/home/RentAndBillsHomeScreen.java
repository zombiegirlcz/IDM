package com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.home;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import au0.c1;
import au0.m0;
import au0.s0;
import au0.u0;
import au0.z0;
import aw0.d0;
import aw0.s8;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rewards.impl.R$id;
import com.revolut.feature.rewards.impl.R$layout;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.home.RentAndBillsHomeScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import efm.r;
import i7d.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import mga.i0;
import org.jetbrains.annotations.NotNull;
import te0.w;
import thc.c;
import tx0.o2;
import vc.s;
import whc.z;
import xki.e;
import y5g.d;
import yic.f;
import yic.g;
import yic.n;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\nB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/screen/home/RentAndBillsHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyic/n;", "Ldli/a;", "Lyic/s;", "Li7d/i;", "Lmga/i0;", "<init>", "()V", "Companion", "a", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RentAndBillsHomeScreen extends ViewController<n> implements dli.a, i, i0 {
    public final Object L;
    public final Object P;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(RentAndBillsHomeScreen.class, "binding", "getBinding()Lcom/revolut/feature/rewards/impl/databinding/ScreenRentAndBillsHomeBinding;", 0))};

    @NotNull
    private static final a Companion = new a();
    public static final d0 T = new d0(375, 274);
    public final int K = R$layout.screen_rent_and_bills_home;
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final HighlightTileDelegate N = new HighlightTileDelegate();
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();
    public final h Q = s.t(this, b.f);

    public static final class a {
        private a() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/rewards/impl/databinding/ScreenRentAndBillsHomeBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.rentAndBillsHomeScreen_background;
            if (((AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.rentAndBillsHomeScreen_navBar;
                NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i);
                if (navBarWithBigTile != null) {
                    i = R$id.rentAndBillsHomeScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new c((ControllerContainerCoordinatorLayout) p0, navBarWithBigTile);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public RentAndBillsHomeScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: yic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsHomeScreen f314276b;

            {
                this.f314276b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RentAndBillsHomeScreen rentAndBillsHomeScreen = this.f314276b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RentAndBillsHomeScreen.S;
                        return (r) ((whc.u) rentAndBillsHomeScreen.R.getValue()).f297594m.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RentAndBillsHomeScreen.S;
                        RentAndBillsHomeScreen rentAndBillsHomeScreen2 = this.f314276b;
                        return dli.f.a(rentAndBillsHomeScreen2, rentAndBillsHomeScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), rentAndBillsHomeScreen2.M, new RowLoadingDelegate(), rentAndBillsHomeScreen2.N, new HighlightTileLoadingDelegate(), new ScrollerDelegate(zhm.u.c(new VoucherSmallTileDelegate()), false), rentAndBillsHomeScreen2.O), R$id.rentAndBillsHomeScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = RentAndBillsHomeScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsHomeScreen.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new whc.u(((z) aVar2.b()).f297622n, rentAndBillsHomeScreen, rentAndBillsHomeScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: yic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsHomeScreen f314276b;

            {
                this.f314276b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RentAndBillsHomeScreen rentAndBillsHomeScreen = this.f314276b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RentAndBillsHomeScreen.S;
                        return (r) ((whc.u) rentAndBillsHomeScreen.R.getValue()).f297594m.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RentAndBillsHomeScreen.S;
                        RentAndBillsHomeScreen rentAndBillsHomeScreen2 = this.f314276b;
                        return dli.f.a(rentAndBillsHomeScreen2, rentAndBillsHomeScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), rentAndBillsHomeScreen2.M, new RowLoadingDelegate(), rentAndBillsHomeScreen2.N, new HighlightTileLoadingDelegate(), new ScrollerDelegate(zhm.u.c(new VoucherSmallTileDelegate()), false), rentAndBillsHomeScreen2.O), R$id.rentAndBillsHomeScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = RentAndBillsHomeScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsHomeScreen.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new whc.u(((z) aVar2.b()).f297622n, rentAndBillsHomeScreen, rentAndBillsHomeScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: yic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsHomeScreen f314276b;

            {
                this.f314276b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RentAndBillsHomeScreen rentAndBillsHomeScreen = this.f314276b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RentAndBillsHomeScreen.S;
                        return (r) ((whc.u) rentAndBillsHomeScreen.R.getValue()).f297594m.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RentAndBillsHomeScreen.S;
                        RentAndBillsHomeScreen rentAndBillsHomeScreen2 = this.f314276b;
                        return dli.f.a(rentAndBillsHomeScreen2, rentAndBillsHomeScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), rentAndBillsHomeScreen2.M, new RowLoadingDelegate(), rentAndBillsHomeScreen2.N, new HighlightTileLoadingDelegate(), new ScrollerDelegate(zhm.u.c(new VoucherSmallTileDelegate()), false), rentAndBillsHomeScreen2.O), R$id.rentAndBillsHomeScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = RentAndBillsHomeScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsHomeScreen.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new whc.u(((z) aVar2.b()).f297622n, rentAndBillsHomeScreen, rentAndBillsHomeScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        yic.s uiState = (yic.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f271363b;
        yic.i iVar = uiState.f314293a;
        if (!(iVar instanceof f)) {
            if (iVar instanceof g) {
                navBarWithBigTile.setLoadingState(false);
                return;
            } else {
                if (!(iVar instanceof yic.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                navBarWithBigTile.setLoadingState(true);
                return;
            }
        }
        f fVar = (f) iVar;
        NavBarWithBigTile navBarWithBigTile2 = d3().f271363b;
        navBarWithBigTile2.setLoadingState(false);
        navBarWithBigTile2.setMenuItems(v.l(fVar.e));
        navBarWithBigTile2.setActionStatusLabel(fVar.f314282a);
        navBarWithBigTile2.setTitleStyle(fVar.f314284c);
        TextLocalisedClause textLocalisedClause = fVar.f314283b;
        navBarWithBigTile2.setToolbarTitle(textLocalisedClause);
        NavBarWithContainerBackground.ImageBackground imageBackground = new NavBarWithContainerBackground.ImageBackground(fVar.f, (s8) null, (Color.SolidRes) null, 14);
        z0 z0Var = new z0(textLocalisedClause, false);
        Clause clause = fVar.d;
        c1.S(navBarWithBigTile2, u.c(new u0(imageBackground, z0Var, clause != null ? new au0.o0(clause) : null, null)), null, null, 6);
        navBarWithBigTile2.setHeightMode(new o2(T));
    }

    @Override // mga.i0
    public final r N0() {
        return this.N.f52437c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (whc.u) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f271363b;
        navBarWithBigTile.setLayoutType(s0.LEFT_ALIGNED);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.BOTTOM_BLUR);
    }

    @Override // mga.i0
    public final r a2() {
        return this.M.f53218h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // i7d.i
    public final koi.a b1() {
        return ((dli.c) this.P.getValue()).w();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f271363b.f59357t), new d(this, continuation, 26), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new yic.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f271363b.b()), new y83.d(this, continuation, 28), 3);
        RowDelegate rowDelegate = this.M;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new yic.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53220l), new yic.d(this, null), 3);
    }

    public final c d3() {
        ViewBinding value = this.Q.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final yic.r R2() {
        return (yic.r) this.L.getValue();
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f271362a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return controllerContainerCoordinatorLayout;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getG0() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
