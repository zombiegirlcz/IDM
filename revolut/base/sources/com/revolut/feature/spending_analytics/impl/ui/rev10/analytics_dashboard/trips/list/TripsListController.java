package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list;

import aii.q;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.feature.spending_analytics.impl.R$layout;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController;
import com.revolut.kompot.navigable.vc.ViewController;
import cr0.g;
import h30.l;
import java.util.List;
import kli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.p5;
import oa2.b;
import ok7.c;
import om4.m1;
import ood.a0;
import ood.b0;
import ood.c0;
import ood.d0;
import ood.e0;
import ood.f0;
import ood.k;
import ood.p;
import ood.q0;
import ood.r;
import ood.y;
import ood.z;
import org.jetbrains.annotations.NotNull;
import ppd.d1;
import rp0.l0;
import vc.s;
import w01.i;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/list/TripsListController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lood/j;", "Companion", "ood/p", "a", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TripsListController extends ViewController<q> implements w {
    public final int K;
    public final Handler L;
    public final h M;
    public final RowDelegate N;
    public final ActionWidgetDelegate O;
    public final Object P;
    public final Object Q;
    public final FullScreenStateDelegate R;
    public final SmallActionButtonDelegate S;
    public final GridBoxDelegate T;
    public final LargeActionButtonDelegate U;
    public final ListSubheaderDelegate V;
    public l0 W;
    public final Object X;
    public List Y;
    public String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Boolean f87633a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f87634b0;
    public boolean c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f87635d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f87636e0;
    public cr0.h f0;
    public p g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public g f87637h0;
    public RecyclerView.ItemAnimator i0;
    public int j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f87632k0 = {o0.f186429a.j(new h0(TripsListController.class, "binding", "getBinding()Lcom/revolut/feature/spending_analytics/impl/databinding/ScreenTripsListBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final cr0.h l0 = cr0.h.ANCHORED;

    /* JADX INFO: renamed from: com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public TripsListController(TripsListContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_trips_list;
        this.L = new Handler(Looper.getMainLooper());
        this.M = s.t(this, r.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new ActionWidgetDelegate();
        this.P = te0.w.y0(new b(this, inputData, 22));
        final int i = 0;
        this.Q = te0.w.y0(new Function0(this) { // from class: ood.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripsListController f227057b;

            {
                this.f227057b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TripsListController tripsListController = this.f227057b;
                switch (i2) {
                    case 0:
                        TripsListController.Companion companion = TripsListController.INSTANCE;
                        return (c) ((d1) tripsListController.P.getValue()).e.get();
                    default:
                        TripsListController.Companion companion2 = TripsListController.INSTANCE;
                        return n14.e.a(tripsListController, tripsListController.R2());
                }
            }
        });
        this.R = new FullScreenStateDelegate();
        this.S = new SmallActionButtonDelegate();
        this.T = new GridBoxDelegate(u.c(new CounterTextDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
        this.U = new LargeActionButtonDelegate();
        this.V = new ListSubheaderDelegate();
        final int i2 = 1;
        this.X = te0.w.y0(new Function0(this) { // from class: ood.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripsListController f227057b;

            {
                this.f227057b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TripsListController tripsListController = this.f227057b;
                switch (i22) {
                    case 0:
                        TripsListController.Companion companion = TripsListController.INSTANCE;
                        return (c) ((d1) tripsListController.P.getValue()).e.get();
                    default:
                        TripsListController.Companion companion2 = TripsListController.INSTANCE;
                        return n14.e.a(tripsListController, tripsListController.R2());
                }
            }
        });
        this.f87636e0 = -1;
        this.f0 = l0;
    }

    public static final int d3(TripsListController tripsListController) {
        Context context = tripsListController.e3().f.getContext();
        Intrinsics.h(context);
        int iA = i.a(context);
        int height = tripsListController.e3().f153695b.getHeight();
        return (int) a.z((int) ((((((int) (0.5f * r1)) + height) + height) / 2.0f) - (iA / 2.0f)), context);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    @Override // cli.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(cli.o r24, cli.q r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController.B(cli.o, cli.q):void");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (this.c0) {
            return false;
        }
        this.c0 = true;
        q0 q0Var = (q0) R2();
        if (!q0Var.f227070q.a(null)) {
            q0Var.B2();
        }
        this.c0 = false;
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d1) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.W = new l0(m2());
        e3().f153695b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        WebView webView = e3().f;
        Intrinsics.checkNotNullParameter(webView, "<this>");
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        int i = 0;
        settings.setAllowContentAccess(false);
        Intrinsics.checkNotNullExpressionValue(settings, "apply(...)");
        webView.addJavascriptInterface(new qod.e(this.L, new c(this, 15), new m1(1, this, TripsListController.class, "onSelectCountryFromMap", "onSelectCountryFromMap(Ljava/lang/String;)V", 0, 3), new ol6.b(29)), "Android");
        webView.setWebViewClient(new c9i.b(new k(this, webView, i)));
        BottomExpandableDialogView bottomExpandableDialogView = e3().e;
        int i2 = 7;
        p5 p5Var = null;
        BottomExpandableDialogView.setupRecyclerView$default(bottomExpandableDialogView, v.k(this.R, new ListSubheaderLoadingDelegate(), this.V, this.N, new RowLoadingDelegate(), this.S, this.T, this.U, this.O), (RecyclerView.ItemAnimator) null, 2, (Object) null);
        if (this.i0 == null) {
            this.i0 = bottomExpandableDialogView.getRecyclerView().getItemAnimator();
        }
        BottomExpandableDialogView bottomExpandableDialogView2 = e3().e;
        bottomExpandableDialogView2.setupDialog(new BottomExpandableDialogView.b.a(i, p5Var, i2));
        bottomExpandableDialogView2.setHideable(false);
        bottomExpandableDialogView2.setHasCollapsedState(false);
        bottomExpandableDialogView2.setHasExpandedState(true);
        bottomExpandableDialogView2.setCloseAutomaticallyByChevron(false);
        bottomExpandableDialogView2.setHideAnchorInExpandedState(true);
        bottomExpandableDialogView2.setNeedDrawToolbarShadow(false);
        bottomExpandableDialogView2.setSupportBackButtonHideDialog(false);
        bottomExpandableDialogView2.setNestedScrollingEnabled(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BottomExpandableDialogView bottomExpandableDialogView = e3().e;
        Intrinsics.checkNotNullExpressionValue(bottomExpandableDialogView.getContext(), "getContext(...)");
        bottomExpandableDialogView.setAnchoredStateOffset((int) (i.a(r0) * 0.5f));
        if (bottomExpandableDialogView.getState() == cr0.h.HIDDEN) {
            bottomExpandableDialogView.r0(l0, false);
        }
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(bottomExpandableDialogView.getStateChangeEvents()), null, new ood.s(this, continuation, 0), 3);
        RowDelegate rowDelegate = this.N;
        com.revolut.kompot.navigable.a.g2(this, new oi3.g(rd0.e.b(rowDelegate.f53218h), this, 11), null, new b0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53220l), null, new c0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().f153695b.f59211b), null, new d0(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().f153695b.f59210a.f57403b), null, new ood.s(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f51589c.f121375b), null, new d0(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new o9a.e(rd0.e.b(this.R.f52371h.f121375b), 10), null, new e0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.d.f121375b), null, new f0(this, null), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.V;
        com.revolut.kompot.navigable.a.g2(this, new o9a.e(l.y(listSubheaderDelegate.d, listSubheaderDelegate.e, "merge(...)"), 11), null, new y(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(listSubheaderDelegate.f52707c), null, new z(this, null), 3);
        l0 l0Var = this.W;
        if (l0Var == null) {
            Intrinsics.r("popupMenuDialogDisplayer");
            throw null;
        }
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(l0Var.f256113c), null, new ood.s(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new o9a.e(rd0.e.b(this.S.f53336c.f121375b), 12), null, new a0(this, null), 3);
    }

    public final hmd.h e3() {
        ViewBinding value = this.M.getValue(this, f87632k0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (hmd.h) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final ood.c R2() {
        return (ood.c) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (cli.a0) this.X.getValue();
    }
}
