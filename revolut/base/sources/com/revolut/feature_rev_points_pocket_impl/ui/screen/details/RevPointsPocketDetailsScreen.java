package com.revolut.feature_rev_points_pocket_impl.ui.screen.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_rev_points_pocket_api.R$string;
import com.revolut.feature_rev_points_pocket_impl.R$id;
import com.revolut.feature_rev_points_pocket_impl.R$layout;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.details.RevPointsPocketDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import jdi.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u7k.f0;
import udi.f;
import udi.g;
import udi.k;
import udi.l;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_impl/ui/screen/details/RevPointsPocketDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ludi/l;", "<init>", "()V", "feature_rev_points_pocket_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsPocketDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(RevPointsPocketDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature_rev_points_pocket_impl/databinding/ScreenRevPointsPocketDetailsBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final int L = R$layout.screen_rev_points_pocket_details;
    public final ActionWidgetDelegate M = new ActionWidgetDelegate();
    public final TwinHorizontalButtonDelegate N = new TwinHorizontalButtonDelegate();
    public final CellDetailsDelegate O = new CellDetailsDelegate();
    public final CellDetailsChevronDelegate P = new CellDetailsChevronDelegate();
    public final FullScreenStateDelegate Q = new FullScreenStateDelegate();
    public final LargeActionButtonDelegate R = new LargeActionButtonDelegate();
    public final Object S;
    public final Object T;
    public final Object U;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, gdi.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature_rev_points_pocket_impl/databinding/ScreenRevPointsPocketDetailsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i = R$id.revPointsPocketDetailsScreen_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.revPointsPocketDetailsScreen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new gdi.a(controllerContainerCoordinatorLayout, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public RevPointsPocketDetailsScreen() {
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: udi.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPocketDetailsScreen f279209b;

            {
                this.f279209b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 5;
                int i5 = 3;
                int i6 = 4;
                int i21 = 0;
                int i22 = 1;
                int i32 = 2;
                RevPointsPocketDetailsScreen revPointsPocketDetailsScreen = this.f279209b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsPocketDetailsScreen.V;
                        RevPointsPocketDetailsScreen revPointsPocketDetailsScreen2 = this.f279209b;
                        return dli.f.a(revPointsPocketDetailsScreen2, revPointsPocketDetailsScreen2.R2(), v.k(revPointsPocketDetailsScreen2.P, revPointsPocketDetailsScreen2.O, new CellDetailsLoadingDelegate(), revPointsPocketDetailsScreen2.Q, revPointsPocketDetailsScreen2.M), R$id.revPointsPocketDetailsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsPocketDetailsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsPocketDetailsScreen.m2()).a().get(jdi.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jdi.c.class, " is not found"));
                        }
                        jdi.c cVar = ((jdi.c) aVar2.b()).i;
                        jdi.d dVar = new jdi.d();
                        dVar.f173085a = e4m.b.b(e4m.c.a(revPointsPocketDetailsScreen));
                        int i33 = 29;
                        dVar.f173086b = e4m.b.b(new iwb.b(cVar, dVar, i32, i33));
                        dVar.f173087c = e4m.b.b(new iwb.b(cVar, dVar, i22, i33));
                        dVar.d = e4m.b.b(new iwb.b(cVar, dVar, i21, i33));
                        dVar.e = e4m.b.b(new iwb.b(cVar, dVar, i6, i33));
                        dVar.f = e4m.b.b(new iwb.b(cVar, dVar, i5, i33));
                        dVar.f173088g = e4m.b.b(new iwb.b(cVar, dVar, 6, i33));
                        dVar.f173089h = e4m.b.b(new iwb.b(cVar, dVar, 7, i33));
                        dVar.i = e4m.b.b(new iwb.b(cVar, dVar, i3, i33));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr3 = RevPointsPocketDetailsScreen.V;
                        return (k) ((jdi.d) revPointsPocketDetailsScreen.T.getValue()).i.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: udi.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPocketDetailsScreen f279209b;

            {
                this.f279209b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 5;
                int i5 = 3;
                int i6 = 4;
                int i21 = 0;
                int i222 = 1;
                int i32 = 2;
                RevPointsPocketDetailsScreen revPointsPocketDetailsScreen = this.f279209b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsPocketDetailsScreen.V;
                        RevPointsPocketDetailsScreen revPointsPocketDetailsScreen2 = this.f279209b;
                        return dli.f.a(revPointsPocketDetailsScreen2, revPointsPocketDetailsScreen2.R2(), v.k(revPointsPocketDetailsScreen2.P, revPointsPocketDetailsScreen2.O, new CellDetailsLoadingDelegate(), revPointsPocketDetailsScreen2.Q, revPointsPocketDetailsScreen2.M), R$id.revPointsPocketDetailsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsPocketDetailsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsPocketDetailsScreen.m2()).a().get(jdi.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jdi.c.class, " is not found"));
                        }
                        jdi.c cVar = ((jdi.c) aVar2.b()).i;
                        jdi.d dVar = new jdi.d();
                        dVar.f173085a = e4m.b.b(e4m.c.a(revPointsPocketDetailsScreen));
                        int i33 = 29;
                        dVar.f173086b = e4m.b.b(new iwb.b(cVar, dVar, i32, i33));
                        dVar.f173087c = e4m.b.b(new iwb.b(cVar, dVar, i222, i33));
                        dVar.d = e4m.b.b(new iwb.b(cVar, dVar, i21, i33));
                        dVar.e = e4m.b.b(new iwb.b(cVar, dVar, i6, i33));
                        dVar.f = e4m.b.b(new iwb.b(cVar, dVar, i5, i33));
                        dVar.f173088g = e4m.b.b(new iwb.b(cVar, dVar, 6, i33));
                        dVar.f173089h = e4m.b.b(new iwb.b(cVar, dVar, 7, i33));
                        dVar.i = e4m.b.b(new iwb.b(cVar, dVar, i3, i33));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr3 = RevPointsPocketDetailsScreen.V;
                        return (k) ((jdi.d) revPointsPocketDetailsScreen.T.getValue()).i.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: udi.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPocketDetailsScreen f279209b;

            {
                this.f279209b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 5;
                int i5 = 3;
                int i6 = 4;
                int i21 = 0;
                int i222 = 1;
                int i322 = 2;
                RevPointsPocketDetailsScreen revPointsPocketDetailsScreen = this.f279209b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsPocketDetailsScreen.V;
                        RevPointsPocketDetailsScreen revPointsPocketDetailsScreen2 = this.f279209b;
                        return dli.f.a(revPointsPocketDetailsScreen2, revPointsPocketDetailsScreen2.R2(), v.k(revPointsPocketDetailsScreen2.P, revPointsPocketDetailsScreen2.O, new CellDetailsLoadingDelegate(), revPointsPocketDetailsScreen2.Q, revPointsPocketDetailsScreen2.M), R$id.revPointsPocketDetailsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsPocketDetailsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsPocketDetailsScreen.m2()).a().get(jdi.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jdi.c.class, " is not found"));
                        }
                        jdi.c cVar = ((jdi.c) aVar2.b()).i;
                        jdi.d dVar = new jdi.d();
                        dVar.f173085a = e4m.b.b(e4m.c.a(revPointsPocketDetailsScreen));
                        int i33 = 29;
                        dVar.f173086b = e4m.b.b(new iwb.b(cVar, dVar, i322, i33));
                        dVar.f173087c = e4m.b.b(new iwb.b(cVar, dVar, i222, i33));
                        dVar.d = e4m.b.b(new iwb.b(cVar, dVar, i21, i33));
                        dVar.e = e4m.b.b(new iwb.b(cVar, dVar, i6, i33));
                        dVar.f = e4m.b.b(new iwb.b(cVar, dVar, i5, i33));
                        dVar.f173088g = e4m.b.b(new iwb.b(cVar, dVar, 6, i33));
                        dVar.f173089h = e4m.b.b(new iwb.b(cVar, dVar, 7, i33));
                        dVar.i = e4m.b.b(new iwb.b(cVar, dVar, i32, i33));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr3 = RevPointsPocketDetailsScreen.V;
                        return (k) ((jdi.d) revPointsPocketDetailsScreen.T.getValue()).i.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f143184b;
        Clause clause = uiState.f279215b;
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
            navBarWithToolbar.setTitle(clause, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f143184b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setEndIconImage(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_rev_points_mono, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue));
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.rev_points_pocket_details_main_subtitle, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        ((j60.a) ((d) this.T.getValue()).f173087c.get()).d(v.k(this.O, this.N, this.R));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f143184b.f59410q), null, new udi.d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.e), new udi.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.d.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f51589c.f121375b), new f0(this, continuation, 23), 3);
        ViewController.P2(this, rd0.e.b(this.P.f51821c), new g(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.N;
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), new udi.d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), new udi.d(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new udi.h(this, null), 3);
    }

    public final gdi.a d3() {
        ViewBinding value = this.K.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (gdi.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
