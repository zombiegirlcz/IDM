package com.revolut.feature.rev_points.impl.ui.earn;

import aii.q;
import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.DetailGridItemDelegate;
import com.revolut.core.ui_kit.delegates.DetailGridItemLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.earn.RevPointsEarnScreen;
import com.revolut.feature.rev_points.impl.ui.earn.RevPointsEarnScreenContract$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$BridgeDestination;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import hp2.d;
import hwi.l0;
import hzb.k;
import hzb.l;
import hzb.m;
import hzb.n;
import hzb.p;
import hzb.r;
import ihm.f;
import koi.h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import wxb.c;
import xki.e;
import zhm.u;
import zhm.v;
import zxb.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/earn/RevPointsEarnScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lhzb/v;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsEarnScreen extends ViewController<q> implements dli.a {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f83790a0 = {o0.f186429a.j(new h0(RevPointsEarnScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsEarnBinding;", 0))};
    public final RevPointsEarnScreenContract$InputData K;
    public final int L;
    public final h M;
    public final FullScreenStateDelegate N;
    public final RowDelegate O;
    public final HeroBannerDelegate P;
    public final ActionWidgetDelegate Q;
    public final DetailGridItemDelegate R;
    public final ListSubheaderDelegate S;
    public final ScrollerDelegate T;
    public final GridBoxDelegate U;
    public final Object V;
    public final f W;
    public final ao.h X;
    public final Object Y;
    public final Object Z;

    public RevPointsEarnScreen(RevPointsEarnScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_rev_points_earn;
        final int i = 0;
        final int i2 = 1;
        this.M = new h(null, false, true, 3);
        this.N = new FullScreenStateDelegate();
        this.O = new RowDelegate(null, null, 7);
        this.P = new HeroBannerDelegate(0);
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.Q = actionWidgetDelegate;
        DetailGridItemDelegate detailGridItemDelegate = new DetailGridItemDelegate();
        this.R = detailGridItemDelegate;
        this.S = new ListSubheaderDelegate();
        this.T = new ScrollerDelegate(u.c(actionWidgetDelegate), false);
        final int i3 = 2;
        this.U = new GridBoxDelegate(v.k(new DetailGridItemLoadingDelegate(), detailGridItemDelegate), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
        this.V = w.y0(new Function0(this) { // from class: hzb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsEarnScreen f157115b;

            {
                this.f157115b = this;
            }

            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                RevPointsEarnScreen revPointsEarnScreen = this.f157115b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsEarnScreen.f83790a0;
                        RevPointsEarnScreen revPointsEarnScreen2 = this.f157115b;
                        return dli.f.a(revPointsEarnScreen2, revPointsEarnScreen2.d(), zhm.d0.E0(((fd6.a) ((zxb.j) revPointsEarnScreen2.Y.getValue()).e.get()).e, zhm.v.k(revPointsEarnScreen2.N, revPointsEarnScreen2.P, revPointsEarnScreen2.O, revPointsEarnScreen2.T, revPointsEarnScreen2.Q, revPointsEarnScreen2.U, new RowLoadingDelegate(), new HeroBannerLoadingDelegate(), revPointsEarnScreen2.S, new ListSubheaderLoadingDelegate())), R$id.revPointsEarnScreen_recyclerView, null, revPointsEarnScreen2.M, null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsEarnScreen.f83790a0;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsEarnScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        RevPointsEarnScreenContract$InputData revPointsEarnScreenContract$InputData = revPointsEarnScreen.K;
                        revPointsEarnScreenContract$InputData.getClass();
                        return new zxb.j(eVar, revPointsEarnScreenContract$InputData, new c0c.t(revPointsEarnScreen.W, revPointsEarnScreen.T, revPointsEarnScreen.M.f, 1));
                    default:
                        KProperty[] kPropertyArr3 = RevPointsEarnScreen.f83790a0;
                        return (u) ((zxb.j) revPointsEarnScreen.Y.getValue()).f326182w.get();
                }
            }
        });
        this.W = v0.a.d("create(...)");
        this.X = s.t(this, k.f);
        this.Y = w.y0(new Function0(this) { // from class: hzb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsEarnScreen f157115b;

            {
                this.f157115b = this;
            }

            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                RevPointsEarnScreen revPointsEarnScreen = this.f157115b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsEarnScreen.f83790a0;
                        RevPointsEarnScreen revPointsEarnScreen2 = this.f157115b;
                        return dli.f.a(revPointsEarnScreen2, revPointsEarnScreen2.d(), zhm.d0.E0(((fd6.a) ((zxb.j) revPointsEarnScreen2.Y.getValue()).e.get()).e, zhm.v.k(revPointsEarnScreen2.N, revPointsEarnScreen2.P, revPointsEarnScreen2.O, revPointsEarnScreen2.T, revPointsEarnScreen2.Q, revPointsEarnScreen2.U, new RowLoadingDelegate(), new HeroBannerLoadingDelegate(), revPointsEarnScreen2.S, new ListSubheaderLoadingDelegate())), R$id.revPointsEarnScreen_recyclerView, null, revPointsEarnScreen2.M, null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsEarnScreen.f83790a0;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsEarnScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        RevPointsEarnScreenContract$InputData revPointsEarnScreenContract$InputData = revPointsEarnScreen.K;
                        revPointsEarnScreenContract$InputData.getClass();
                        return new zxb.j(eVar, revPointsEarnScreenContract$InputData, new c0c.t(revPointsEarnScreen.W, revPointsEarnScreen.T, revPointsEarnScreen.M.f, 1));
                    default:
                        KProperty[] kPropertyArr3 = RevPointsEarnScreen.f83790a0;
                        return (u) ((zxb.j) revPointsEarnScreen.Y.getValue()).f326182w.get();
                }
            }
        });
        this.Z = w.y0(new Function0(this) { // from class: hzb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsEarnScreen f157115b;

            {
                this.f157115b = this;
            }

            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                RevPointsEarnScreen revPointsEarnScreen = this.f157115b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsEarnScreen.f83790a0;
                        RevPointsEarnScreen revPointsEarnScreen2 = this.f157115b;
                        return dli.f.a(revPointsEarnScreen2, revPointsEarnScreen2.d(), zhm.d0.E0(((fd6.a) ((zxb.j) revPointsEarnScreen2.Y.getValue()).e.get()).e, zhm.v.k(revPointsEarnScreen2.N, revPointsEarnScreen2.P, revPointsEarnScreen2.O, revPointsEarnScreen2.T, revPointsEarnScreen2.Q, revPointsEarnScreen2.U, new RowLoadingDelegate(), new HeroBannerLoadingDelegate(), revPointsEarnScreen2.S, new ListSubheaderLoadingDelegate())), R$id.revPointsEarnScreen_recyclerView, null, revPointsEarnScreen2.M, null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsEarnScreen.f83790a0;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsEarnScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        RevPointsEarnScreenContract$InputData revPointsEarnScreenContract$InputData = revPointsEarnScreen.K;
                        revPointsEarnScreenContract$InputData.getClass();
                        return new zxb.j(eVar, revPointsEarnScreenContract$InputData, new c0c.t(revPointsEarnScreen.W, revPointsEarnScreen.T, revPointsEarnScreen.M.f, 1));
                    default:
                        KProperty[] kPropertyArr3 = RevPointsEarnScreen.f83790a0;
                        return (u) ((zxb.j) revPointsEarnScreen.Y.getValue()).f326182w.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        hzb.v uiState = (hzb.v) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f300813b.setMenuItems(uiState.f157134a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        b bVar = (b) d();
        bVar.getClass();
        if (i == 1005) {
            RevPointsSpareChangeControllerApi$BridgeDestination.INSTANCE.getClass();
            RevPointsSpareChangeControllerApi$Result revPointsSpareChangeControllerApi$Result = intent != null ? (RevPointsSpareChangeControllerApi$Result) intent.getParcelableExtra("REV_POINTS_SPARE_CHANGE_BRIDGE_ARGS") : null;
            if (revPointsSpareChangeControllerApi$Result != null) {
                bVar.J2(revPointsSpareChangeControllerApi$Result);
            }
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f300813b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.rev_points_earn_hub_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.rev_points_earn_hub_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        xv0.w wVar = new xv0.w(new hie.b(1, this.W, f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 21), null);
        ScreenContentRecyclerView revPointsEarnScreenRecyclerView = d3().f300814c;
        Intrinsics.checkNotNullExpressionValue(revPointsEarnScreenRecyclerView, "revPointsEarnScreenRecyclerView");
        wVar.b(revPointsEarnScreenRecyclerView);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f300813b.f59410q), new l0(this, continuation, 5), 3);
        ViewController.P2(this, rd0.e.b(d3().f300813b.o.f57403b), new d(this, continuation, 25), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new l(this, null), 3);
        HeroBannerDelegate heroBannerDelegate = this.P;
        ViewController.P2(this, rd0.e.b(heroBannerDelegate.e), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(heroBannerDelegate.d), new n(this, null), 3);
        RowDelegate rowDelegate = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new hzb.o(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53220l), null, new p(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52178c), new hzb.q(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52707c), new r(this, null), 3);
    }

    public final c d3() {
        ViewBinding value = this.X.getValue(this, f83790a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final hzb.u d() {
        return (hzb.u) this.Z.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
