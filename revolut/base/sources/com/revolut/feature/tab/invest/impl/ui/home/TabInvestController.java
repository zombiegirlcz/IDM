package com.revolut.feature.tab.invest.impl.ui.home;

import aii.q;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ash.j;
import bih.i;
import bih.l;
import ble.m;
import ble.r;
import ble.t;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.BannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RateEmojiDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import com.revolut.feature.tab.invest.impl.R$id;
import com.revolut.feature.tab.invest.impl.R$layout;
import com.revolut.feature.tab.invest.impl.R$string;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import fnc.s;
import fsl.o;
import hx0.d0;
import java.util.List;
import jji.h;
import jji.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import no.k;
import te0.w;
import tw0.b0;
import tw0.l0;
import tw0.n;
import tx0.t2;
import vkm.z1;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u00132\u00020\u00142\u00020\u00152\u00020\u00162\u00020\u00172\u00020\u00182\u00020\u0019B\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lble/w;", "Lhx0/d0;", "Lkji/f;", "Ljji/h;", "Lno/k;", "Ltw0/b0;", "Lgfd/c;", "Lfsl/o;", "Lwhh/k;", "Lncf/a;", "Lcle/h;", "Lsxk/c;", "Lh1h/f;", "Lbih/l;", "Lmkd/g;", "Lgih/b;", "Lfih/b;", "Lsdf/c;", "Lash/j;", "Lrle/e;", "Ld1h/j;", "Ldtl/d;", "<init>", "()V", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TabInvestController extends ViewController<q> implements tki.c, d0, kji.f, h, k, b0, gfd.c, o, whh.k, ncf.a, cle.h, sxk.c, h1h.f, l, mkd.g, gih.b, fih.b, sdf.c, j, rle.e, d1h.j, dtl.d {
    public static final /* synthetic */ KProperty[] l0 = {o0.f186429a.j(new h0(TabInvestController.class, "binding", "getBinding()Lcom/revolut/feature/tab/invest/impl/databinding/ScreenTabInvestBinding;", 0))};
    public final s K = new s(new u(this));
    public final ao.h L = vc.s.t(this, a.f);
    public final int M = R$layout.screen_tab_invest;
    public final Object N;
    public final Object O;
    public final l0 P;
    public final RowDelegate Q;
    public final ListSubheaderDelegate R;
    public final LargeActionButtonDelegate S;
    public final FixedTabsDelegate T;
    public final FullScreenStateDelegate U;
    public final RateEmojiDelegate V;
    public final ActionWidgetDelegate W;
    public final BannerDelegate X;
    public final PlainTextWarningDelegate Y;
    public final FooterTextDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ItemTouchHelper f89829a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ScrollerDelegate f89830b0;
    public final SwipeToActionDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f89831d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final z1 f89832e0;
    public final ihm.f f0;
    public final o7.b g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final List f89833h0;
    public final z4l.j i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public AnalyticsContext f89834k0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, qke.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/tab/invest/impl/databinding/ScreenTabInvestBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i = R$id.tabInvest_lineChartView;
            AccountsNavBarContentView accountsNavBarContentView = (AccountsNavBarContentView) ViewBindings.findChildViewById(p0, i);
            if (accountsNavBarContentView != null) {
                i = R$id.tabInvest_navBar;
                NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(p0, i);
                if (navBarWithContainer != null) {
                    i = R$id.tabInvest_recyclerView;
                    ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                    if (screenContentRecyclerView != null) {
                        return new qke.a(controllerContainerCoordinatorLayout, accountsNavBarContentView, navBarWithContainer, screenContentRecyclerView);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public TabInvestController() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ble.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabInvestController f16565b;

            {
                this.f16565b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TabInvestController tabInvestController = this.f16565b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TabInvestController.l0;
                        phm.a aVar = (phm.a) ue0.e.j(tabInvestController.m2()).a().get(gke.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gke.a.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.tab.invest.impl.ui.home.di.TabInvestControllerComponentInjector");
                        lqb.g gVar = new lqb.g(((ske.c) objB).f263861a0);
                        gVar.f199296b = tabInvestController;
                        gVar.d = tabInvestController;
                        gVar.e = tabInvestController;
                        gVar.f = tabInvestController;
                        gVar.f199298g = tabInvestController;
                        gVar.f199297c = tabInvestController;
                        gVar.f199300j = tabInvestController;
                        gVar.k = tabInvestController;
                        gVar.f199301l = tabInvestController;
                        gVar.f199302m = tabInvestController;
                        gVar.f199303n = tabInvestController;
                        gVar.o = tabInvestController;
                        gVar.f199304p = tabInvestController;
                        gVar.f199305q = tabInvestController;
                        o7.b bVar = tabInvestController.g0;
                        bVar.getClass();
                        gVar.f199299h = bVar;
                        gVar.i = new o5d.b(tabInvestController.c0);
                        gVar.f199306r = tabInvestController;
                        return (fle.c) gVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TabInvestController.l0;
                        return (q) ((ske.d) ((fle.c) tabInvestController.N.getValue())).P0.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TabInvestController.l0;
                        return (rp0.l0) ((ske.d) ((fle.c) tabInvestController.N.getValue())).C.get();
                    default:
                        KProperty[] kPropertyArr4 = TabInvestController.l0;
                        TabInvestController tabInvestController2 = this.f16565b;
                        return tki.g.a(tabInvestController2, tabInvestController2.R2(), tabInvestController2.f89833h0, R$id.tabInvest_recyclerView, null, tabInvestController2.i0, null, 40);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ble.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabInvestController f16565b;

            {
                this.f16565b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TabInvestController tabInvestController = this.f16565b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TabInvestController.l0;
                        phm.a aVar = (phm.a) ue0.e.j(tabInvestController.m2()).a().get(gke.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gke.a.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.tab.invest.impl.ui.home.di.TabInvestControllerComponentInjector");
                        lqb.g gVar = new lqb.g(((ske.c) objB).f263861a0);
                        gVar.f199296b = tabInvestController;
                        gVar.d = tabInvestController;
                        gVar.e = tabInvestController;
                        gVar.f = tabInvestController;
                        gVar.f199298g = tabInvestController;
                        gVar.f199297c = tabInvestController;
                        gVar.f199300j = tabInvestController;
                        gVar.k = tabInvestController;
                        gVar.f199301l = tabInvestController;
                        gVar.f199302m = tabInvestController;
                        gVar.f199303n = tabInvestController;
                        gVar.o = tabInvestController;
                        gVar.f199304p = tabInvestController;
                        gVar.f199305q = tabInvestController;
                        o7.b bVar = tabInvestController.g0;
                        bVar.getClass();
                        gVar.f199299h = bVar;
                        gVar.i = new o5d.b(tabInvestController.c0);
                        gVar.f199306r = tabInvestController;
                        return (fle.c) gVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TabInvestController.l0;
                        return (q) ((ske.d) ((fle.c) tabInvestController.N.getValue())).P0.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TabInvestController.l0;
                        return (rp0.l0) ((ske.d) ((fle.c) tabInvestController.N.getValue())).C.get();
                    default:
                        KProperty[] kPropertyArr4 = TabInvestController.l0;
                        TabInvestController tabInvestController2 = this.f16565b;
                        return tki.g.a(tabInvestController2, tabInvestController2.R2(), tabInvestController2.f89833h0, R$id.tabInvest_recyclerView, null, tabInvestController2.i0, null, 40);
                }
            }
        });
        TextDelegate textDelegate = new TextDelegate();
        this.P = new l0();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.R = listSubheaderDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.S = largeActionButtonDelegate;
        ProgressStepVerticalDelegate progressStepVerticalDelegate = new ProgressStepVerticalDelegate();
        FixedTabsDelegate fixedTabsDelegate = new FixedTabsDelegate();
        this.T = fixedTabsDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.U = fullScreenStateDelegate;
        RateEmojiDelegate rateEmojiDelegate = new RateEmojiDelegate();
        this.V = rateEmojiDelegate;
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.W = actionWidgetDelegate;
        ActionWidgetLoadingDelegate actionWidgetLoadingDelegate = new ActionWidgetLoadingDelegate();
        SmallActionButtonDelegate smallActionButtonDelegate = new SmallActionButtonDelegate();
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        BannerDelegate bannerDelegate = new BannerDelegate();
        this.X = bannerDelegate;
        PlainTextWarningDelegate plainTextWarningDelegate = new PlainTextWarningDelegate();
        this.Y = plainTextWarningDelegate;
        final int i3 = 3;
        ExtraSmallCardDelegate extraSmallCardDelegate = new ExtraSmallCardDelegate(3);
        FooterTextDelegate footerTextDelegate = new FooterTextDelegate();
        this.Z = footerTextDelegate;
        this.f89829a0 = new ItemTouchHelper(new n(this));
        ScrollerDelegate scrollerDelegate = new ScrollerDelegate(v.k(bannerDelegate, heroBannerDelegate, actionWidgetLoadingDelegate, actionWidgetDelegate, extraSmallCardDelegate), false);
        this.f89830b0 = scrollerDelegate;
        SwipeToActionDelegate swipeToActionDelegate = new SwipeToActionDelegate(rowDelegate, false);
        this.c0 = swipeToActionDelegate;
        CalendarRowDelegate calendarRowDelegate = new CalendarRowDelegate();
        final int i5 = 2;
        this.f89831d0 = w.y0(new Function0(this) { // from class: ble.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabInvestController f16565b;

            {
                this.f16565b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TabInvestController tabInvestController = this.f16565b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TabInvestController.l0;
                        phm.a aVar = (phm.a) ue0.e.j(tabInvestController.m2()).a().get(gke.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gke.a.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.tab.invest.impl.ui.home.di.TabInvestControllerComponentInjector");
                        lqb.g gVar = new lqb.g(((ske.c) objB).f263861a0);
                        gVar.f199296b = tabInvestController;
                        gVar.d = tabInvestController;
                        gVar.e = tabInvestController;
                        gVar.f = tabInvestController;
                        gVar.f199298g = tabInvestController;
                        gVar.f199297c = tabInvestController;
                        gVar.f199300j = tabInvestController;
                        gVar.k = tabInvestController;
                        gVar.f199301l = tabInvestController;
                        gVar.f199302m = tabInvestController;
                        gVar.f199303n = tabInvestController;
                        gVar.o = tabInvestController;
                        gVar.f199304p = tabInvestController;
                        gVar.f199305q = tabInvestController;
                        o7.b bVar = tabInvestController.g0;
                        bVar.getClass();
                        gVar.f199299h = bVar;
                        gVar.i = new o5d.b(tabInvestController.c0);
                        gVar.f199306r = tabInvestController;
                        return (fle.c) gVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TabInvestController.l0;
                        return (q) ((ske.d) ((fle.c) tabInvestController.N.getValue())).P0.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TabInvestController.l0;
                        return (rp0.l0) ((ske.d) ((fle.c) tabInvestController.N.getValue())).C.get();
                    default:
                        KProperty[] kPropertyArr4 = TabInvestController.l0;
                        TabInvestController tabInvestController2 = this.f16565b;
                        return tki.g.a(tabInvestController2, tabInvestController2.R2(), tabInvestController2.f89833h0, R$id.tabInvest_recyclerView, null, tabInvestController2.i0, null, 40);
                }
            }
        });
        this.f89832e0 = vkm.q.b(2, 1, ukm.f.DROP_OLDEST);
        this.f0 = v0.a.d("create(...)");
        this.g0 = new o7.b(this);
        List listK = v.k(actionWidgetDelegate, extraSmallCardDelegate, rowDelegate, textDelegate, fixedTabsDelegate, rowLoadingDelegate, listSubheaderDelegate, new ListSubheaderLoadingDelegate(), largeActionButtonDelegate, progressStepVerticalDelegate, fullScreenStateDelegate, rateEmojiDelegate, scrollerDelegate, heroBannerDelegate, new ScrollerBoxDelegate(v.k(bannerDelegate, plainTextWarningDelegate)), new BannerLoadingDelegate(), bannerDelegate, actionWidgetLoadingDelegate, smallActionButtonDelegate, calendarRowDelegate, footerTextDelegate, new FooterTextLoadingDelegate(), swipeToActionDelegate);
        this.f89833h0 = listK;
        this.i0 = new z4l.j(listK, false, true, true);
        this.j0 = w.y0(new Function0(this) { // from class: ble.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabInvestController f16565b;

            {
                this.f16565b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TabInvestController tabInvestController = this.f16565b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TabInvestController.l0;
                        phm.a aVar = (phm.a) ue0.e.j(tabInvestController.m2()).a().get(gke.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gke.a.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.tab.invest.impl.ui.home.di.TabInvestControllerComponentInjector");
                        lqb.g gVar = new lqb.g(((ske.c) objB).f263861a0);
                        gVar.f199296b = tabInvestController;
                        gVar.d = tabInvestController;
                        gVar.e = tabInvestController;
                        gVar.f = tabInvestController;
                        gVar.f199298g = tabInvestController;
                        gVar.f199297c = tabInvestController;
                        gVar.f199300j = tabInvestController;
                        gVar.k = tabInvestController;
                        gVar.f199301l = tabInvestController;
                        gVar.f199302m = tabInvestController;
                        gVar.f199303n = tabInvestController;
                        gVar.o = tabInvestController;
                        gVar.f199304p = tabInvestController;
                        gVar.f199305q = tabInvestController;
                        o7.b bVar = tabInvestController.g0;
                        bVar.getClass();
                        gVar.f199299h = bVar;
                        gVar.i = new o5d.b(tabInvestController.c0);
                        gVar.f199306r = tabInvestController;
                        return (fle.c) gVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TabInvestController.l0;
                        return (q) ((ske.d) ((fle.c) tabInvestController.N.getValue())).P0.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TabInvestController.l0;
                        return (rp0.l0) ((ske.d) ((fle.c) tabInvestController.N.getValue())).C.get();
                    default:
                        KProperty[] kPropertyArr4 = TabInvestController.l0;
                        TabInvestController tabInvestController2 = this.f16565b;
                        return tki.g.a(tabInvestController2, tabInvestController2.R2(), tabInvestController2.f89833h0, R$id.tabInvest_recyclerView, null, tabInvestController2.i0, null, 40);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        koi.b bVarF;
        String str;
        koi.b bVarF2;
        ble.w uiState = (ble.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ble.u uVar = uiState.f16604a;
        NavBarWithContainer navBarWithContainer = d3().f246989c;
        navBarWithContainer.setAvatar(new t2(uVar.f16597a.f168357a, uVar.e));
        navBarWithContainer.setSearchButtonText(uVar.f16598b);
        List<? extends NavBarMenuItem> items = uVar.f16599c;
        navBarWithContainer.setMenuItems(items);
        navBarWithContainer.setMessage(uVar.f);
        vqi.a aVar = (vqi.a) ((ske.d) ((fle.c) this.N.getValue())).f263904r.f263863b0.get();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        aVar.f291403a = items;
        t tVar = uVar.d;
        if (tVar instanceof r) {
            d3().f246988b.setModel(((r) tVar).f16592a);
        } else {
            if (!(tVar instanceof ble.s)) {
                throw new NoWhenBranchMatchedException();
            }
            d3().f246988b.setModel(((ble.s) tVar).f16594a);
        }
        this.f89834k0 = uiState.d;
        if (qVar instanceof ble.v) {
            ScreenContentRecyclerView tabInvestRecyclerView = d3().d;
            Intrinsics.checkNotNullExpressionValue(tabInvestRecyclerView, "tabInvestRecyclerView");
            ble.v vVar = (ble.v) qVar;
            if (vVar.f16601b && (str = uiState.f16606c) != null && (bVarF2 = y.f(tabInvestRecyclerView, str)) != null) {
                this.f89829a0.startDrag(bVarF2);
            }
            String str2 = vVar.f16602c;
            if (str2 == null || (bVarF = y.f(tabInvestRecyclerView, str2)) == null) {
                return;
            }
            tabInvestRecyclerView.scrollToPosition(bVarF.getBindingAdapterPosition());
        }
    }

    @Override // dtl.d
    public final Flow B0() {
        return rd0.e.b(this.c0.f);
    }

    @Override // mkd.g
    public final efm.r F1() {
        return this.f89830b0.i;
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final FooterTextDelegate getF106939h0() {
        return this.Z;
    }

    @Override // tw0.b0
    public final void I1() {
        this.f89832e0.k(new bih.j(this.i0.f319395l));
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f89834k0 = analyticsContext;
    }

    @Override // htl.g
    public final vkm.d O1() {
        return rd0.e.b(this.Q.f53218h);
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final FullScreenStateDelegate getO() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (fle.c) this.N.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.f89834k0;
    }

    @Override // gfd.c
    public final efm.r T() {
        return this.Q.f53218h;
    }

    @Override // gfd.c, pt5.r
    public final efm.r U() {
        return this.R.f52707c;
    }

    @Override // jkd.b
    public final efm.r X1() {
        return this.f0;
    }

    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.wealth_invest_home_tab_portfolio, null, null, 14));
        ScreenContentRecyclerView tabInvestRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(tabInvestRecyclerView, "tabInvestRecyclerView");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        knm.b.v(boh.f.p(context), tabInvestRecyclerView);
        tabInvestRecyclerView.setClipToPadding(false);
        this.f89829a0.attachToRecyclerView(tabInvestRecyclerView);
        new xv0.w(new ax9.d(1, this.f0, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 22), null).b(tabInvestRecyclerView);
        l0.k(this.P, tabInvestRecyclerView, this.i0, (rp0.l0) this.f89831d0.getValue());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        AccountsNavBarContentView accountsNavBarContentView = d3().f246988b;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(accountsNavBarContentView.j()), new ble.j(this, null), 3);
        AccountSelectionNavBarContentView accountSelectionNavBarContentView = accountsNavBarContentView.e;
        int i = 0;
        ViewController.P2(this, rd0.e.b(accountSelectionNavBarContentView.f59177s), new ble.k(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(accountSelectionNavBarContentView.f59173n), new ble.l(this, continuation, i), 3);
        int i2 = 1;
        ViewController.P2(this, rd0.e.b(accountSelectionNavBarContentView.f59171l), new ble.l(this, continuation, i2), 3);
        ViewController.P2(this, rd0.e.b(accountSelectionNavBarContentView.f59175q), new ble.k(this, continuation, i2), 3);
        ViewController.P2(this, rd0.e.b(accountSelectionNavBarContentView.f59176r), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(accountsNavBarContentView.f283811r), new ble.n(this, continuation, 0), 3);
        NavBarWithContainer navBarWithContainer = d3().f246989c;
        ViewController.P2(this, rd0.e.b(navBarWithContainer.H()), new ble.n(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(navBarWithContainer.I()), new ble.n(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(navBarWithContainer.b()), new be7.s(this, continuation, 11), 3);
        ViewController.P2(this, rd0.e.b(navBarWithContainer.D()), new ble.l(this, continuation, 2), 3);
        int i3 = 3;
        ViewController.P2(this, rd0.e.b(navBarWithContainer.F()), new ble.l(this, continuation, i3), 3);
        ViewController.P2(this, rd0.e.b(navBarWithContainer.L()), new ble.k(this, continuation, 2), 3);
        RateEmojiDelegate rateEmojiDelegate = this.V;
        ViewController.P2(this, rd0.e.b(rateEmojiDelegate.f53143c), new ble.n(this, continuation, i3), 3);
        ViewController.P2(this, rd0.e.b(rateEmojiDelegate.e), new ble.n(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(rateEmojiDelegate.d), new ble.n(this, continuation, 5), 3);
        ViewController.P2(this, rd0.e.b(this.W.d.f121375b), new ble.o(this, null), 3);
    }

    @Override // f1h.f
    /* JADX INFO: renamed from: c, reason: from getter */
    public final RowDelegate getQ() {
        return this.Q;
    }

    public final qke.a d3() {
        ViewBinding value = this.L.getValue(this, l0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (qke.a) value;
    }

    @Override // ash.j
    /* JADX INFO: renamed from: e1, reason: from getter */
    public final l0 getQ() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ble.q R2() {
        return (ble.q) this.O.getValue();
    }

    @Override // jji.h
    public final NavBarWithContainer f() {
        NavBarWithContainer tabInvestNavBar = d3().f246989c;
        Intrinsics.checkNotNullExpressionValue(tabInvestNavBar, "tabInvestNavBar");
        return tabInvestNavBar;
    }

    public final GoalProgressWidgetDelegate f3() {
        koi.k kVarC = this.i0.f.c(GoalProgressWidgetDelegate.class);
        if (kVarC != null) {
            return (GoalProgressWidgetDelegate) kVarC;
        }
        throw new IllegalStateException(h30.l.r("No delegate found for class ", o0.f186429a.b(GoalProgressWidgetDelegate.class).e()));
    }

    @Override // jji.h
    public final View getContent() {
        ScreenContentRecyclerView tabInvestRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(tabInvestRecyclerView, "tabInvestRecyclerView");
        return tabInvestRecyclerView;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.M;
    }

    @Override // gfd.c, pt5.r
    public final efm.r h0() {
        return this.T.f52339c.f121375b;
    }

    @Override // gfd.c, pt5.r
    public final efm.r i0() {
        return this.U.f52371h.f121375b;
    }

    @Override // h1h.f
    /* JADX INFO: renamed from: j0, reason: from getter */
    public final ListSubheaderDelegate getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.j0.getValue();
    }

    @Override // fsl.o
    public final vkm.d k0() {
        return rd0.e.b(this.R.f52707c);
    }

    @Override // hx0.d0
    /* JADX INFO: renamed from: k1, reason: from getter */
    public final s getL() {
        return this.K;
    }

    @Override // tw0.b0
    public final void m1(int i, int i2) {
        this.f89832e0.k(new i(i, i2, this.i0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ash.j
    public final ihm.f t0() {
        return ((rp0.l0) this.f89831d0.getValue()).f256113c;
    }

    @Override // jji.h
    public final View v() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f246987a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return hx0.h.b(controllerContainerCoordinatorLayout);
    }

    @Override // mkd.g
    public final koi.c v0() {
        return this.i0.f;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ash.j
    public final void z1(String anchorItemId, mw0.a menu) {
        Intrinsics.checkNotNullParameter(anchorItemId, "anchorItemId");
        Intrinsics.checkNotNullParameter(menu, "menu");
        ((rp0.l0) this.f89831d0.getValue()).e(anchorItemId, menu, mw0.o.VIEW_BOUNDS, new mw0.l(false));
    }
}
