package com.revolut.feature.salary_switch.impl.ui.screen.share_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.salary_switch.impl.ui.screen.share_details.ShareSalaryDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dli.c;
import efm.r;
import jii.x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mkd.g;
import rk9.d;
import rnb.u;
import rrc.f0;
import rrc.t;
import te0.w;
import tx0.j0;
import vc.s;
import wpc.f;
import wpc.j;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/screen/share_details/ShareSalaryDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwpc/j;", "Ldli/a;", "Lrrc/w;", "Lmkd/g;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShareSalaryDetailsScreen extends ViewController<j> implements a, g {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(ShareSalaryDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final f K;
    public final CellDetailsAccountDelegate L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final ihm.f P;
    public final int Q;
    public final SmallActionButtonDelegate R;
    public final FullScreenStateDelegate S;
    public final Object T;
    public final h U;
    public final Object V;
    public final Object W;

    public ShareSalaryDetailsScreen(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new CellDetailsAccountDelegate();
        this.M = w.y0(new rr4.a(1));
        this.N = w.y0(new rr4.a(2));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: rrc.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShareSalaryDetailsScreen f256799b;

            {
                this.f256799b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ShareSalaryDetailsScreen shareSalaryDetailsScreen = this.f256799b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ShareSalaryDetailsScreen.X;
                        return new ScrollerDelegate(zhm.v.k((ActionWidgetDelegate) shareSalaryDetailsScreen.N.getValue(), (HeroBannerDelegate) shareSalaryDetailsScreen.M.getValue()), false);
                    case 1:
                        KProperty[] kPropertyArr2 = ShareSalaryDetailsScreen.X;
                        ShareSalaryDetailsScreen shareSalaryDetailsScreen2 = this.f256799b;
                        return dli.f.a(shareSalaryDetailsScreen2, shareSalaryDetailsScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new CellDetailsLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderDelegate(), shareSalaryDetailsScreen2.L, (ScrollerDelegate) shareSalaryDetailsScreen2.O.getValue(), (ActionWidgetDelegate) shareSalaryDetailsScreen2.N.getValue(), new ActionWidgetLoadingDelegate(), shareSalaryDetailsScreen2.R, shareSalaryDetailsScreen2.S), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = ShareSalaryDetailsScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(shareSalaryDetailsScreen.m2()).a().get(zpc.k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zpc.k.class, " is not found"));
                        }
                        zpc.k kVar = ((zpc.k) aVar2.b()).u;
                        wpc.f fVar = shareSalaryDetailsScreen.K;
                        fVar.getClass();
                        return new zpc.q(kVar, fVar, shareSalaryDetailsScreen);
                    default:
                        KProperty[] kPropertyArr4 = ShareSalaryDetailsScreen.X;
                        return (f0) ((zpc.q) shareSalaryDetailsScreen.V.getValue()).e.get();
                }
            }
        });
        this.P = v0.a.d("create(...)");
        this.Q = R$layout.screen_recycler_navbar_two_buttons;
        this.R = new SmallActionButtonDelegate();
        this.S = new FullScreenStateDelegate();
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: rrc.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShareSalaryDetailsScreen f256799b;

            {
                this.f256799b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ShareSalaryDetailsScreen shareSalaryDetailsScreen = this.f256799b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShareSalaryDetailsScreen.X;
                        return new ScrollerDelegate(zhm.v.k((ActionWidgetDelegate) shareSalaryDetailsScreen.N.getValue(), (HeroBannerDelegate) shareSalaryDetailsScreen.M.getValue()), false);
                    case 1:
                        KProperty[] kPropertyArr2 = ShareSalaryDetailsScreen.X;
                        ShareSalaryDetailsScreen shareSalaryDetailsScreen2 = this.f256799b;
                        return dli.f.a(shareSalaryDetailsScreen2, shareSalaryDetailsScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new CellDetailsLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderDelegate(), shareSalaryDetailsScreen2.L, (ScrollerDelegate) shareSalaryDetailsScreen2.O.getValue(), (ActionWidgetDelegate) shareSalaryDetailsScreen2.N.getValue(), new ActionWidgetLoadingDelegate(), shareSalaryDetailsScreen2.R, shareSalaryDetailsScreen2.S), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = ShareSalaryDetailsScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(shareSalaryDetailsScreen.m2()).a().get(zpc.k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zpc.k.class, " is not found"));
                        }
                        zpc.k kVar = ((zpc.k) aVar2.b()).u;
                        wpc.f fVar = shareSalaryDetailsScreen.K;
                        fVar.getClass();
                        return new zpc.q(kVar, fVar, shareSalaryDetailsScreen);
                    default:
                        KProperty[] kPropertyArr4 = ShareSalaryDetailsScreen.X;
                        return (f0) ((zpc.q) shareSalaryDetailsScreen.V.getValue()).e.get();
                }
            }
        });
        this.U = s.t(this, rrc.s.f);
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: rrc.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShareSalaryDetailsScreen f256799b;

            {
                this.f256799b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ShareSalaryDetailsScreen shareSalaryDetailsScreen = this.f256799b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShareSalaryDetailsScreen.X;
                        return new ScrollerDelegate(zhm.v.k((ActionWidgetDelegate) shareSalaryDetailsScreen.N.getValue(), (HeroBannerDelegate) shareSalaryDetailsScreen.M.getValue()), false);
                    case 1:
                        KProperty[] kPropertyArr2 = ShareSalaryDetailsScreen.X;
                        ShareSalaryDetailsScreen shareSalaryDetailsScreen2 = this.f256799b;
                        return dli.f.a(shareSalaryDetailsScreen2, shareSalaryDetailsScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new CellDetailsLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderDelegate(), shareSalaryDetailsScreen2.L, (ScrollerDelegate) shareSalaryDetailsScreen2.O.getValue(), (ActionWidgetDelegate) shareSalaryDetailsScreen2.N.getValue(), new ActionWidgetLoadingDelegate(), shareSalaryDetailsScreen2.R, shareSalaryDetailsScreen2.S), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = ShareSalaryDetailsScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(shareSalaryDetailsScreen.m2()).a().get(zpc.k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zpc.k.class, " is not found"));
                        }
                        zpc.k kVar = ((zpc.k) aVar2.b()).u;
                        wpc.f fVar = shareSalaryDetailsScreen.K;
                        fVar.getClass();
                        return new zpc.q(kVar, fVar, shareSalaryDetailsScreen);
                    default:
                        KProperty[] kPropertyArr4 = ShareSalaryDetailsScreen.X;
                        return (f0) ((zpc.q) shareSalaryDetailsScreen.V.getValue()).e.get();
                }
            }
        });
        final int i5 = 3;
        this.W = w.y0(new Function0(this) { // from class: rrc.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShareSalaryDetailsScreen f256799b;

            {
                this.f256799b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ShareSalaryDetailsScreen shareSalaryDetailsScreen = this.f256799b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShareSalaryDetailsScreen.X;
                        return new ScrollerDelegate(zhm.v.k((ActionWidgetDelegate) shareSalaryDetailsScreen.N.getValue(), (HeroBannerDelegate) shareSalaryDetailsScreen.M.getValue()), false);
                    case 1:
                        KProperty[] kPropertyArr2 = ShareSalaryDetailsScreen.X;
                        ShareSalaryDetailsScreen shareSalaryDetailsScreen2 = this.f256799b;
                        return dli.f.a(shareSalaryDetailsScreen2, shareSalaryDetailsScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new CellDetailsLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderDelegate(), shareSalaryDetailsScreen2.L, (ScrollerDelegate) shareSalaryDetailsScreen2.O.getValue(), (ActionWidgetDelegate) shareSalaryDetailsScreen2.N.getValue(), new ActionWidgetLoadingDelegate(), shareSalaryDetailsScreen2.R, shareSalaryDetailsScreen2.S), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = ShareSalaryDetailsScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(shareSalaryDetailsScreen.m2()).a().get(zpc.k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zpc.k.class, " is not found"));
                        }
                        zpc.k kVar = ((zpc.k) aVar2.b()).u;
                        wpc.f fVar = shareSalaryDetailsScreen.K;
                        fVar.getClass();
                        return new zpc.q(kVar, fVar, shareSalaryDetailsScreen);
                    default:
                        KProperty[] kPropertyArr4 = ShareSalaryDetailsScreen.X;
                        return (f0) ((zpc.q) shareSalaryDetailsScreen.V.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        rrc.w uiState = (rrc.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        x xVarD3 = d3();
        NavBarWithToolbar screenRecyclerNavbarTwoButtonsNavBarWithToolbar = xVarD3.f174574c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsNavBarWithToolbar, "screenRecyclerNavbarTwoButtonsNavBarWithToolbar");
        Clause clause = uiState.f256805c;
        boolean z = uiState.f256804b;
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setTitle(clause, null);
        NavBarWithToolbar navBarWithToolbar = xVarD3.f174574c;
        Clause clause2 = uiState.d;
        navBarWithToolbar.setSecondDescriptionText(clause2);
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        d3().f174573b.setEnabled(z);
        d3().f174573b.setText(uiState.e);
        d3().e.setEnabled(z);
        LargeActionButton largeActionButton = d3().e;
        Clause clause3 = uiState.f;
        largeActionButton.setText(clause3);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.setVisibility(clause3 == null ? 8 : 0);
        navBarWithToolbar.setNavigationButtonImage(uiState.f256806g);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final r F1() {
        return ((ScrollerDelegate) this.O.getValue()).i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (zpc.q) this.V.getValue();
    }

    @Override // jkd.b
    public final r X1() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174574c.setHeaderTitleMode(j0.MULTILINE_LARGE);
        d3().e.o(LargeActionButton.ButtonStyle.f58726b);
        xv0.w wVar = new xv0.w(new u(1, this.P, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 7), null);
        ScreenContentRecyclerView screenRecyclerNavbarTwoButtonsRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsRecyclerView, "screenRecyclerNavbarTwoButtonsRecyclerView");
        wVar.b(screenRecyclerNavbarTwoButtonsRecyclerView);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        x xVarD3 = d3();
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(xVarD3.f174574c.f59410q), new t(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(xVarD3.f174573b.o), new t(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(xVarD3.e.o), new t(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.L.d), new d(this, continuation, 23), 3);
        r rVarFilter = this.S.f52371h.f121375b.filter(new rpi.d(new rpi.e(11), 8));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new rrc.u(this, null), 3);
    }

    public final x d3() {
        ViewBinding value = this.U.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f0 R2() {
        return (f0) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((c) this.T.getValue()).w().f;
    }
}
