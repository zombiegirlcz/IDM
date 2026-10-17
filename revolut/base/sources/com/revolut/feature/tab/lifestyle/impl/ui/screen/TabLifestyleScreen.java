package com.revolut.feature.tab.lifestyle.impl.ui.screen;

import ahe.m0;
import aii.q;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ash.j;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FeedCollectionDelegate;
import com.revolut.core.ui_kit.delegates.FeedPostDelegate;
import com.revolut.core.ui_kit.delegates.FeedPostLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HybridTileDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.IconLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.IconGridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TilePaginatedGridWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.feature.credit.card.api.navigation.CreditCardRevPointsLockedDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardTopupDestination;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$BridgeDestination;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.feature.tab.lifestyle.impl.R$id;
import com.revolut.feature.tab.lifestyle.impl.R$layout;
import com.revolut.feature.tab.lifestyle.impl.R$string;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreen;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import fnc.s;
import grl.k9;
import hx0.d0;
import java.util.List;
import jji.h;
import jji.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nb6.p;
import nme.a0;
import nme.b0;
import nme.g;
import nme.g0;
import nme.i;
import nme.k;
import nme.n;
import nme.r;
import nme.t;
import nme.v;
import nme.z;
import no.m;
import skm.p0;
import te0.w;
import tw0.l0;
import tx0.t2;
import xv0.x;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lnme/b0;", "Lno/m;", "Lhx0/d0;", "Lkji/f;", "Ljji/h;", "Lash/j;", "feature_tab_lifestyle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TabLifestyleScreen extends ViewController<q> implements tki.c, m, d0, kji.f, h, j {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f89903w0 = {o0.f186429a.j(new h0(TabLifestyleScreen.class, "binding", "getBinding()Lcom/revolut/feature/tab/lifestyle/impl/databinding/ScreenTabLifestyleBinding;", 0))};
    public final TabLifestyleScreenContract$InputData K;
    public final s L;
    public final ao.h M;
    public final int N;
    public final int O;
    public final z4l.j P;
    public final l0 Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f89904a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f89905b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f89906d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f89907e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f89908h0;
    public final Object i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f89909k0;
    public final Object l0;
    public final Object m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Object f89910n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Object f89911o0;
    public final ihm.f p0;
    public final Object q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Object f89912r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Object f89913s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f89914t0;
    public final Object u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final AnalyticsProduct.Retail f89915v0;

    public TabLifestyleScreen(TabLifestyleScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new s(new u(this));
        this.M = vc.s.t(this, nme.e.f);
        this.N = R$layout.screen_tab_lifestyle;
        this.O = R$style.TransparentNavigationBarMarkerTheme;
        this.P = new z4l.j((List) f0.f322471a, false, true, true);
        this.Q = new l0();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: nme.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabLifestyleScreen f217282b;

            {
                this.f217282b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TabLifestyleScreen tabLifestyleScreen = this.f217282b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TabLifestyleScreen.f89903w0;
                        return (rp0.l0) ((vle.c) tabLifestyleScreen.R1()).W.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TabLifestyleScreen.f89903w0;
                        return new ScrollerDelegate(zhm.v.k((VoucherSmallLoadingDelegate) tabLifestyleScreen.V.getValue(), (ChallengeMediumLoadingDelegate) tabLifestyleScreen.W.getValue(), (ChallengeMediumDelegate) tabLifestyleScreen.X.getValue(), (FeedPostDelegate) tabLifestyleScreen.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen.f89905b0.getValue(), (ActionWidgetDelegate) tabLifestyleScreen.Y.getValue(), (HeroBannerLoadingDelegate) tabLifestyleScreen.j0.getValue(), (HeroBannerDelegate) tabLifestyleScreen.f89909k0.getValue()), false);
                    case 2:
                        koi.k kVarC = tabLifestyleScreen.P.f.c(IconGridWidgetDelegate.class);
                        if (kVarC != null) {
                            return (IconGridWidgetDelegate) kVarC;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(IconGridWidgetDelegate.class).e()));
                    case 3:
                        koi.k kVarC2 = tabLifestyleScreen.P.f.c(TilePaginatedGridWidgetDelegate.class);
                        if (kVarC2 != null) {
                            return (TilePaginatedGridWidgetDelegate) kVarC2;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(TilePaginatedGridWidgetDelegate.class).e()));
                    case 4:
                        KProperty[] kPropertyArr3 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen2 = this.f217282b;
                        return tki.g.a(tabLifestyleScreen2, tabLifestyleScreen2.d(), zhm.d0.E0(((fd6.a) tabLifestyleScreen2.f89914t0.getValue()).e, zhm.v.k((FullScreenStateDelegate) tabLifestyleScreen2.U.getValue(), (ScrollerDelegate) tabLifestyleScreen2.m0.getValue(), (VoucherSmallLoadingDelegate) tabLifestyleScreen2.V.getValue(), (ActionWidgetDelegate) tabLifestyleScreen2.Y.getValue(), new ActionWidgetLoadingDelegate(), (FeedPostDelegate) tabLifestyleScreen2.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen2.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen2.f89905b0.getValue(), (FeedCollectionDelegate) tabLifestyleScreen2.c0.getValue(), (GridBoxDelegate) tabLifestyleScreen2.i0.getValue(), (IconDelegate) tabLifestyleScreen2.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen2.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen2.f0.getValue(), (RowDelegate) tabLifestyleScreen2.g0.getValue(), (RowLoadingDelegate) tabLifestyleScreen2.f89908h0.getValue(), (PlaceholderRowDelegate) tabLifestyleScreen2.T.getValue(), (ListSubheaderDelegate) tabLifestyleScreen2.S.getValue(), (RowsWidgetDelegate) tabLifestyleScreen2.l0.getValue())), R$id.tabLifestyle_recyclerView, null, tabLifestyleScreen2.P, null, 40);
                    case 5:
                        KProperty[] kPropertyArr4 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen3 = this.f217282b;
                        phm.a aVar = (phm.a) ue0.e.j(tabLifestyleScreen3.m2()).a().get(eei.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", eei.a.class, " is not found"));
                        }
                        vle.b bVar = ((vle.b) aVar2.b()).D;
                        TabLifestyleScreenContract$InputData tabLifestyleScreenContract$InputData = tabLifestyleScreen3.K;
                        tabLifestyleScreenContract$InputData.getClass();
                        return new vle.c(bVar, new g39.c(), tabLifestyleScreen3, tabLifestyleScreenContract$InputData, new c0c.t(tabLifestyleScreen3.p0, (ScrollerDelegate) tabLifestyleScreen3.m0.getValue(), tabLifestyleScreen3.P.f, 2), tabLifestyleScreen3);
                    case 6:
                        KProperty[] kPropertyArr5 = TabLifestyleScreen.f89903w0;
                        return (z) ((vle.c) tabLifestyleScreen.R1()).V.get();
                    case 7:
                        KProperty[] kPropertyArr6 = TabLifestyleScreen.f89903w0;
                        return (fd6.a) ((vle.c) tabLifestyleScreen.R1()).f290398j.get();
                    case 8:
                        KProperty[] kPropertyArr7 = TabLifestyleScreen.f89903w0;
                        return (on.a) ((vle.c) tabLifestyleScreen.R1()).X.get();
                    default:
                        KProperty[] kPropertyArr8 = TabLifestyleScreen.f89903w0;
                        return new GridBoxDelegate(zhm.v.k((IconDelegate) tabLifestyleScreen.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen.f0.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                }
            }
        });
        this.S = w.y0(new nk4.d(20));
        this.T = w.y0(new nk4.d(23));
        this.U = w.y0(new nk4.d(24));
        this.V = w.y0(new nk4.d(25));
        this.W = w.y0(new nk4.d(26));
        this.X = w.y0(new nk4.d(27));
        this.Y = w.y0(new nk4.d(28));
        this.Z = w.y0(new nk4.d(29));
        this.f89904a0 = w.y0(new nme.c(0));
        this.f89905b0 = w.y0(new nk4.d(22));
        this.c0 = w.y0(new nme.c(1));
        this.f89906d0 = w.y0(new nme.c(2));
        this.f89907e0 = w.y0(new nme.c(3));
        this.f0 = w.y0(new nme.c(4));
        this.g0 = w.y0(new nme.c(5));
        this.f89908h0 = w.y0(new nme.c(6));
        final int i2 = 9;
        this.i0 = w.y0(new Function0(this) { // from class: nme.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabLifestyleScreen f217282b;

            {
                this.f217282b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TabLifestyleScreen tabLifestyleScreen = this.f217282b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TabLifestyleScreen.f89903w0;
                        return (rp0.l0) ((vle.c) tabLifestyleScreen.R1()).W.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TabLifestyleScreen.f89903w0;
                        return new ScrollerDelegate(zhm.v.k((VoucherSmallLoadingDelegate) tabLifestyleScreen.V.getValue(), (ChallengeMediumLoadingDelegate) tabLifestyleScreen.W.getValue(), (ChallengeMediumDelegate) tabLifestyleScreen.X.getValue(), (FeedPostDelegate) tabLifestyleScreen.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen.f89905b0.getValue(), (ActionWidgetDelegate) tabLifestyleScreen.Y.getValue(), (HeroBannerLoadingDelegate) tabLifestyleScreen.j0.getValue(), (HeroBannerDelegate) tabLifestyleScreen.f89909k0.getValue()), false);
                    case 2:
                        koi.k kVarC = tabLifestyleScreen.P.f.c(IconGridWidgetDelegate.class);
                        if (kVarC != null) {
                            return (IconGridWidgetDelegate) kVarC;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(IconGridWidgetDelegate.class).e()));
                    case 3:
                        koi.k kVarC2 = tabLifestyleScreen.P.f.c(TilePaginatedGridWidgetDelegate.class);
                        if (kVarC2 != null) {
                            return (TilePaginatedGridWidgetDelegate) kVarC2;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(TilePaginatedGridWidgetDelegate.class).e()));
                    case 4:
                        KProperty[] kPropertyArr3 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen2 = this.f217282b;
                        return tki.g.a(tabLifestyleScreen2, tabLifestyleScreen2.d(), zhm.d0.E0(((fd6.a) tabLifestyleScreen2.f89914t0.getValue()).e, zhm.v.k((FullScreenStateDelegate) tabLifestyleScreen2.U.getValue(), (ScrollerDelegate) tabLifestyleScreen2.m0.getValue(), (VoucherSmallLoadingDelegate) tabLifestyleScreen2.V.getValue(), (ActionWidgetDelegate) tabLifestyleScreen2.Y.getValue(), new ActionWidgetLoadingDelegate(), (FeedPostDelegate) tabLifestyleScreen2.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen2.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen2.f89905b0.getValue(), (FeedCollectionDelegate) tabLifestyleScreen2.c0.getValue(), (GridBoxDelegate) tabLifestyleScreen2.i0.getValue(), (IconDelegate) tabLifestyleScreen2.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen2.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen2.f0.getValue(), (RowDelegate) tabLifestyleScreen2.g0.getValue(), (RowLoadingDelegate) tabLifestyleScreen2.f89908h0.getValue(), (PlaceholderRowDelegate) tabLifestyleScreen2.T.getValue(), (ListSubheaderDelegate) tabLifestyleScreen2.S.getValue(), (RowsWidgetDelegate) tabLifestyleScreen2.l0.getValue())), R$id.tabLifestyle_recyclerView, null, tabLifestyleScreen2.P, null, 40);
                    case 5:
                        KProperty[] kPropertyArr4 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen3 = this.f217282b;
                        phm.a aVar = (phm.a) ue0.e.j(tabLifestyleScreen3.m2()).a().get(eei.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", eei.a.class, " is not found"));
                        }
                        vle.b bVar = ((vle.b) aVar2.b()).D;
                        TabLifestyleScreenContract$InputData tabLifestyleScreenContract$InputData = tabLifestyleScreen3.K;
                        tabLifestyleScreenContract$InputData.getClass();
                        return new vle.c(bVar, new g39.c(), tabLifestyleScreen3, tabLifestyleScreenContract$InputData, new c0c.t(tabLifestyleScreen3.p0, (ScrollerDelegate) tabLifestyleScreen3.m0.getValue(), tabLifestyleScreen3.P.f, 2), tabLifestyleScreen3);
                    case 6:
                        KProperty[] kPropertyArr5 = TabLifestyleScreen.f89903w0;
                        return (z) ((vle.c) tabLifestyleScreen.R1()).V.get();
                    case 7:
                        KProperty[] kPropertyArr6 = TabLifestyleScreen.f89903w0;
                        return (fd6.a) ((vle.c) tabLifestyleScreen.R1()).f290398j.get();
                    case 8:
                        KProperty[] kPropertyArr7 = TabLifestyleScreen.f89903w0;
                        return (on.a) ((vle.c) tabLifestyleScreen.R1()).X.get();
                    default:
                        KProperty[] kPropertyArr8 = TabLifestyleScreen.f89903w0;
                        return new GridBoxDelegate(zhm.v.k((IconDelegate) tabLifestyleScreen.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen.f0.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                }
            }
        });
        this.j0 = w.y0(new nme.c(7));
        this.f89909k0 = w.y0(new nk4.d(19));
        this.l0 = w.y0(new nk4.d(21));
        final int i3 = 1;
        this.m0 = w.y0(new Function0(this) { // from class: nme.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabLifestyleScreen f217282b;

            {
                this.f217282b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TabLifestyleScreen tabLifestyleScreen = this.f217282b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TabLifestyleScreen.f89903w0;
                        return (rp0.l0) ((vle.c) tabLifestyleScreen.R1()).W.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TabLifestyleScreen.f89903w0;
                        return new ScrollerDelegate(zhm.v.k((VoucherSmallLoadingDelegate) tabLifestyleScreen.V.getValue(), (ChallengeMediumLoadingDelegate) tabLifestyleScreen.W.getValue(), (ChallengeMediumDelegate) tabLifestyleScreen.X.getValue(), (FeedPostDelegate) tabLifestyleScreen.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen.f89905b0.getValue(), (ActionWidgetDelegate) tabLifestyleScreen.Y.getValue(), (HeroBannerLoadingDelegate) tabLifestyleScreen.j0.getValue(), (HeroBannerDelegate) tabLifestyleScreen.f89909k0.getValue()), false);
                    case 2:
                        koi.k kVarC = tabLifestyleScreen.P.f.c(IconGridWidgetDelegate.class);
                        if (kVarC != null) {
                            return (IconGridWidgetDelegate) kVarC;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(IconGridWidgetDelegate.class).e()));
                    case 3:
                        koi.k kVarC2 = tabLifestyleScreen.P.f.c(TilePaginatedGridWidgetDelegate.class);
                        if (kVarC2 != null) {
                            return (TilePaginatedGridWidgetDelegate) kVarC2;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(TilePaginatedGridWidgetDelegate.class).e()));
                    case 4:
                        KProperty[] kPropertyArr3 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen2 = this.f217282b;
                        return tki.g.a(tabLifestyleScreen2, tabLifestyleScreen2.d(), zhm.d0.E0(((fd6.a) tabLifestyleScreen2.f89914t0.getValue()).e, zhm.v.k((FullScreenStateDelegate) tabLifestyleScreen2.U.getValue(), (ScrollerDelegate) tabLifestyleScreen2.m0.getValue(), (VoucherSmallLoadingDelegate) tabLifestyleScreen2.V.getValue(), (ActionWidgetDelegate) tabLifestyleScreen2.Y.getValue(), new ActionWidgetLoadingDelegate(), (FeedPostDelegate) tabLifestyleScreen2.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen2.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen2.f89905b0.getValue(), (FeedCollectionDelegate) tabLifestyleScreen2.c0.getValue(), (GridBoxDelegate) tabLifestyleScreen2.i0.getValue(), (IconDelegate) tabLifestyleScreen2.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen2.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen2.f0.getValue(), (RowDelegate) tabLifestyleScreen2.g0.getValue(), (RowLoadingDelegate) tabLifestyleScreen2.f89908h0.getValue(), (PlaceholderRowDelegate) tabLifestyleScreen2.T.getValue(), (ListSubheaderDelegate) tabLifestyleScreen2.S.getValue(), (RowsWidgetDelegate) tabLifestyleScreen2.l0.getValue())), R$id.tabLifestyle_recyclerView, null, tabLifestyleScreen2.P, null, 40);
                    case 5:
                        KProperty[] kPropertyArr4 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen3 = this.f217282b;
                        phm.a aVar = (phm.a) ue0.e.j(tabLifestyleScreen3.m2()).a().get(eei.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", eei.a.class, " is not found"));
                        }
                        vle.b bVar = ((vle.b) aVar2.b()).D;
                        TabLifestyleScreenContract$InputData tabLifestyleScreenContract$InputData = tabLifestyleScreen3.K;
                        tabLifestyleScreenContract$InputData.getClass();
                        return new vle.c(bVar, new g39.c(), tabLifestyleScreen3, tabLifestyleScreenContract$InputData, new c0c.t(tabLifestyleScreen3.p0, (ScrollerDelegate) tabLifestyleScreen3.m0.getValue(), tabLifestyleScreen3.P.f, 2), tabLifestyleScreen3);
                    case 6:
                        KProperty[] kPropertyArr5 = TabLifestyleScreen.f89903w0;
                        return (z) ((vle.c) tabLifestyleScreen.R1()).V.get();
                    case 7:
                        KProperty[] kPropertyArr6 = TabLifestyleScreen.f89903w0;
                        return (fd6.a) ((vle.c) tabLifestyleScreen.R1()).f290398j.get();
                    case 8:
                        KProperty[] kPropertyArr7 = TabLifestyleScreen.f89903w0;
                        return (on.a) ((vle.c) tabLifestyleScreen.R1()).X.get();
                    default:
                        KProperty[] kPropertyArr8 = TabLifestyleScreen.f89903w0;
                        return new GridBoxDelegate(zhm.v.k((IconDelegate) tabLifestyleScreen.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen.f0.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                }
            }
        });
        final int i5 = 2;
        this.f89910n0 = w.y0(new Function0(this) { // from class: nme.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabLifestyleScreen f217282b;

            {
                this.f217282b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TabLifestyleScreen tabLifestyleScreen = this.f217282b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TabLifestyleScreen.f89903w0;
                        return (rp0.l0) ((vle.c) tabLifestyleScreen.R1()).W.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TabLifestyleScreen.f89903w0;
                        return new ScrollerDelegate(zhm.v.k((VoucherSmallLoadingDelegate) tabLifestyleScreen.V.getValue(), (ChallengeMediumLoadingDelegate) tabLifestyleScreen.W.getValue(), (ChallengeMediumDelegate) tabLifestyleScreen.X.getValue(), (FeedPostDelegate) tabLifestyleScreen.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen.f89905b0.getValue(), (ActionWidgetDelegate) tabLifestyleScreen.Y.getValue(), (HeroBannerLoadingDelegate) tabLifestyleScreen.j0.getValue(), (HeroBannerDelegate) tabLifestyleScreen.f89909k0.getValue()), false);
                    case 2:
                        koi.k kVarC = tabLifestyleScreen.P.f.c(IconGridWidgetDelegate.class);
                        if (kVarC != null) {
                            return (IconGridWidgetDelegate) kVarC;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(IconGridWidgetDelegate.class).e()));
                    case 3:
                        koi.k kVarC2 = tabLifestyleScreen.P.f.c(TilePaginatedGridWidgetDelegate.class);
                        if (kVarC2 != null) {
                            return (TilePaginatedGridWidgetDelegate) kVarC2;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(TilePaginatedGridWidgetDelegate.class).e()));
                    case 4:
                        KProperty[] kPropertyArr3 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen2 = this.f217282b;
                        return tki.g.a(tabLifestyleScreen2, tabLifestyleScreen2.d(), zhm.d0.E0(((fd6.a) tabLifestyleScreen2.f89914t0.getValue()).e, zhm.v.k((FullScreenStateDelegate) tabLifestyleScreen2.U.getValue(), (ScrollerDelegate) tabLifestyleScreen2.m0.getValue(), (VoucherSmallLoadingDelegate) tabLifestyleScreen2.V.getValue(), (ActionWidgetDelegate) tabLifestyleScreen2.Y.getValue(), new ActionWidgetLoadingDelegate(), (FeedPostDelegate) tabLifestyleScreen2.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen2.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen2.f89905b0.getValue(), (FeedCollectionDelegate) tabLifestyleScreen2.c0.getValue(), (GridBoxDelegate) tabLifestyleScreen2.i0.getValue(), (IconDelegate) tabLifestyleScreen2.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen2.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen2.f0.getValue(), (RowDelegate) tabLifestyleScreen2.g0.getValue(), (RowLoadingDelegate) tabLifestyleScreen2.f89908h0.getValue(), (PlaceholderRowDelegate) tabLifestyleScreen2.T.getValue(), (ListSubheaderDelegate) tabLifestyleScreen2.S.getValue(), (RowsWidgetDelegate) tabLifestyleScreen2.l0.getValue())), R$id.tabLifestyle_recyclerView, null, tabLifestyleScreen2.P, null, 40);
                    case 5:
                        KProperty[] kPropertyArr4 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen3 = this.f217282b;
                        phm.a aVar = (phm.a) ue0.e.j(tabLifestyleScreen3.m2()).a().get(eei.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", eei.a.class, " is not found"));
                        }
                        vle.b bVar = ((vle.b) aVar2.b()).D;
                        TabLifestyleScreenContract$InputData tabLifestyleScreenContract$InputData = tabLifestyleScreen3.K;
                        tabLifestyleScreenContract$InputData.getClass();
                        return new vle.c(bVar, new g39.c(), tabLifestyleScreen3, tabLifestyleScreenContract$InputData, new c0c.t(tabLifestyleScreen3.p0, (ScrollerDelegate) tabLifestyleScreen3.m0.getValue(), tabLifestyleScreen3.P.f, 2), tabLifestyleScreen3);
                    case 6:
                        KProperty[] kPropertyArr5 = TabLifestyleScreen.f89903w0;
                        return (z) ((vle.c) tabLifestyleScreen.R1()).V.get();
                    case 7:
                        KProperty[] kPropertyArr6 = TabLifestyleScreen.f89903w0;
                        return (fd6.a) ((vle.c) tabLifestyleScreen.R1()).f290398j.get();
                    case 8:
                        KProperty[] kPropertyArr7 = TabLifestyleScreen.f89903w0;
                        return (on.a) ((vle.c) tabLifestyleScreen.R1()).X.get();
                    default:
                        KProperty[] kPropertyArr8 = TabLifestyleScreen.f89903w0;
                        return new GridBoxDelegate(zhm.v.k((IconDelegate) tabLifestyleScreen.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen.f0.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                }
            }
        });
        final int i6 = 3;
        this.f89911o0 = w.y0(new Function0(this) { // from class: nme.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabLifestyleScreen f217282b;

            {
                this.f217282b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                TabLifestyleScreen tabLifestyleScreen = this.f217282b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TabLifestyleScreen.f89903w0;
                        return (rp0.l0) ((vle.c) tabLifestyleScreen.R1()).W.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TabLifestyleScreen.f89903w0;
                        return new ScrollerDelegate(zhm.v.k((VoucherSmallLoadingDelegate) tabLifestyleScreen.V.getValue(), (ChallengeMediumLoadingDelegate) tabLifestyleScreen.W.getValue(), (ChallengeMediumDelegate) tabLifestyleScreen.X.getValue(), (FeedPostDelegate) tabLifestyleScreen.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen.f89905b0.getValue(), (ActionWidgetDelegate) tabLifestyleScreen.Y.getValue(), (HeroBannerLoadingDelegate) tabLifestyleScreen.j0.getValue(), (HeroBannerDelegate) tabLifestyleScreen.f89909k0.getValue()), false);
                    case 2:
                        koi.k kVarC = tabLifestyleScreen.P.f.c(IconGridWidgetDelegate.class);
                        if (kVarC != null) {
                            return (IconGridWidgetDelegate) kVarC;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(IconGridWidgetDelegate.class).e()));
                    case 3:
                        koi.k kVarC2 = tabLifestyleScreen.P.f.c(TilePaginatedGridWidgetDelegate.class);
                        if (kVarC2 != null) {
                            return (TilePaginatedGridWidgetDelegate) kVarC2;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(TilePaginatedGridWidgetDelegate.class).e()));
                    case 4:
                        KProperty[] kPropertyArr3 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen2 = this.f217282b;
                        return tki.g.a(tabLifestyleScreen2, tabLifestyleScreen2.d(), zhm.d0.E0(((fd6.a) tabLifestyleScreen2.f89914t0.getValue()).e, zhm.v.k((FullScreenStateDelegate) tabLifestyleScreen2.U.getValue(), (ScrollerDelegate) tabLifestyleScreen2.m0.getValue(), (VoucherSmallLoadingDelegate) tabLifestyleScreen2.V.getValue(), (ActionWidgetDelegate) tabLifestyleScreen2.Y.getValue(), new ActionWidgetLoadingDelegate(), (FeedPostDelegate) tabLifestyleScreen2.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen2.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen2.f89905b0.getValue(), (FeedCollectionDelegate) tabLifestyleScreen2.c0.getValue(), (GridBoxDelegate) tabLifestyleScreen2.i0.getValue(), (IconDelegate) tabLifestyleScreen2.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen2.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen2.f0.getValue(), (RowDelegate) tabLifestyleScreen2.g0.getValue(), (RowLoadingDelegate) tabLifestyleScreen2.f89908h0.getValue(), (PlaceholderRowDelegate) tabLifestyleScreen2.T.getValue(), (ListSubheaderDelegate) tabLifestyleScreen2.S.getValue(), (RowsWidgetDelegate) tabLifestyleScreen2.l0.getValue())), R$id.tabLifestyle_recyclerView, null, tabLifestyleScreen2.P, null, 40);
                    case 5:
                        KProperty[] kPropertyArr4 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen3 = this.f217282b;
                        phm.a aVar = (phm.a) ue0.e.j(tabLifestyleScreen3.m2()).a().get(eei.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", eei.a.class, " is not found"));
                        }
                        vle.b bVar = ((vle.b) aVar2.b()).D;
                        TabLifestyleScreenContract$InputData tabLifestyleScreenContract$InputData = tabLifestyleScreen3.K;
                        tabLifestyleScreenContract$InputData.getClass();
                        return new vle.c(bVar, new g39.c(), tabLifestyleScreen3, tabLifestyleScreenContract$InputData, new c0c.t(tabLifestyleScreen3.p0, (ScrollerDelegate) tabLifestyleScreen3.m0.getValue(), tabLifestyleScreen3.P.f, 2), tabLifestyleScreen3);
                    case 6:
                        KProperty[] kPropertyArr5 = TabLifestyleScreen.f89903w0;
                        return (z) ((vle.c) tabLifestyleScreen.R1()).V.get();
                    case 7:
                        KProperty[] kPropertyArr6 = TabLifestyleScreen.f89903w0;
                        return (fd6.a) ((vle.c) tabLifestyleScreen.R1()).f290398j.get();
                    case 8:
                        KProperty[] kPropertyArr7 = TabLifestyleScreen.f89903w0;
                        return (on.a) ((vle.c) tabLifestyleScreen.R1()).X.get();
                    default:
                        KProperty[] kPropertyArr8 = TabLifestyleScreen.f89903w0;
                        return new GridBoxDelegate(zhm.v.k((IconDelegate) tabLifestyleScreen.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen.f0.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                }
            }
        });
        this.p0 = v0.a.d("create(...)");
        final int i21 = 4;
        this.q0 = w.y0(new Function0(this) { // from class: nme.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabLifestyleScreen f217282b;

            {
                this.f217282b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                TabLifestyleScreen tabLifestyleScreen = this.f217282b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TabLifestyleScreen.f89903w0;
                        return (rp0.l0) ((vle.c) tabLifestyleScreen.R1()).W.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TabLifestyleScreen.f89903w0;
                        return new ScrollerDelegate(zhm.v.k((VoucherSmallLoadingDelegate) tabLifestyleScreen.V.getValue(), (ChallengeMediumLoadingDelegate) tabLifestyleScreen.W.getValue(), (ChallengeMediumDelegate) tabLifestyleScreen.X.getValue(), (FeedPostDelegate) tabLifestyleScreen.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen.f89905b0.getValue(), (ActionWidgetDelegate) tabLifestyleScreen.Y.getValue(), (HeroBannerLoadingDelegate) tabLifestyleScreen.j0.getValue(), (HeroBannerDelegate) tabLifestyleScreen.f89909k0.getValue()), false);
                    case 2:
                        koi.k kVarC = tabLifestyleScreen.P.f.c(IconGridWidgetDelegate.class);
                        if (kVarC != null) {
                            return (IconGridWidgetDelegate) kVarC;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(IconGridWidgetDelegate.class).e()));
                    case 3:
                        koi.k kVarC2 = tabLifestyleScreen.P.f.c(TilePaginatedGridWidgetDelegate.class);
                        if (kVarC2 != null) {
                            return (TilePaginatedGridWidgetDelegate) kVarC2;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(TilePaginatedGridWidgetDelegate.class).e()));
                    case 4:
                        KProperty[] kPropertyArr3 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen2 = this.f217282b;
                        return tki.g.a(tabLifestyleScreen2, tabLifestyleScreen2.d(), zhm.d0.E0(((fd6.a) tabLifestyleScreen2.f89914t0.getValue()).e, zhm.v.k((FullScreenStateDelegate) tabLifestyleScreen2.U.getValue(), (ScrollerDelegate) tabLifestyleScreen2.m0.getValue(), (VoucherSmallLoadingDelegate) tabLifestyleScreen2.V.getValue(), (ActionWidgetDelegate) tabLifestyleScreen2.Y.getValue(), new ActionWidgetLoadingDelegate(), (FeedPostDelegate) tabLifestyleScreen2.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen2.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen2.f89905b0.getValue(), (FeedCollectionDelegate) tabLifestyleScreen2.c0.getValue(), (GridBoxDelegate) tabLifestyleScreen2.i0.getValue(), (IconDelegate) tabLifestyleScreen2.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen2.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen2.f0.getValue(), (RowDelegate) tabLifestyleScreen2.g0.getValue(), (RowLoadingDelegate) tabLifestyleScreen2.f89908h0.getValue(), (PlaceholderRowDelegate) tabLifestyleScreen2.T.getValue(), (ListSubheaderDelegate) tabLifestyleScreen2.S.getValue(), (RowsWidgetDelegate) tabLifestyleScreen2.l0.getValue())), R$id.tabLifestyle_recyclerView, null, tabLifestyleScreen2.P, null, 40);
                    case 5:
                        KProperty[] kPropertyArr4 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen3 = this.f217282b;
                        phm.a aVar = (phm.a) ue0.e.j(tabLifestyleScreen3.m2()).a().get(eei.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", eei.a.class, " is not found"));
                        }
                        vle.b bVar = ((vle.b) aVar2.b()).D;
                        TabLifestyleScreenContract$InputData tabLifestyleScreenContract$InputData = tabLifestyleScreen3.K;
                        tabLifestyleScreenContract$InputData.getClass();
                        return new vle.c(bVar, new g39.c(), tabLifestyleScreen3, tabLifestyleScreenContract$InputData, new c0c.t(tabLifestyleScreen3.p0, (ScrollerDelegate) tabLifestyleScreen3.m0.getValue(), tabLifestyleScreen3.P.f, 2), tabLifestyleScreen3);
                    case 6:
                        KProperty[] kPropertyArr5 = TabLifestyleScreen.f89903w0;
                        return (z) ((vle.c) tabLifestyleScreen.R1()).V.get();
                    case 7:
                        KProperty[] kPropertyArr6 = TabLifestyleScreen.f89903w0;
                        return (fd6.a) ((vle.c) tabLifestyleScreen.R1()).f290398j.get();
                    case 8:
                        KProperty[] kPropertyArr7 = TabLifestyleScreen.f89903w0;
                        return (on.a) ((vle.c) tabLifestyleScreen.R1()).X.get();
                    default:
                        KProperty[] kPropertyArr8 = TabLifestyleScreen.f89903w0;
                        return new GridBoxDelegate(zhm.v.k((IconDelegate) tabLifestyleScreen.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen.f0.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                }
            }
        });
        final int i22 = 5;
        this.f89912r0 = w.y0(new Function0(this) { // from class: nme.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabLifestyleScreen f217282b;

            {
                this.f217282b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i22;
                TabLifestyleScreen tabLifestyleScreen = this.f217282b;
                switch (i222) {
                    case 0:
                        KProperty[] kPropertyArr = TabLifestyleScreen.f89903w0;
                        return (rp0.l0) ((vle.c) tabLifestyleScreen.R1()).W.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TabLifestyleScreen.f89903w0;
                        return new ScrollerDelegate(zhm.v.k((VoucherSmallLoadingDelegate) tabLifestyleScreen.V.getValue(), (ChallengeMediumLoadingDelegate) tabLifestyleScreen.W.getValue(), (ChallengeMediumDelegate) tabLifestyleScreen.X.getValue(), (FeedPostDelegate) tabLifestyleScreen.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen.f89905b0.getValue(), (ActionWidgetDelegate) tabLifestyleScreen.Y.getValue(), (HeroBannerLoadingDelegate) tabLifestyleScreen.j0.getValue(), (HeroBannerDelegate) tabLifestyleScreen.f89909k0.getValue()), false);
                    case 2:
                        koi.k kVarC = tabLifestyleScreen.P.f.c(IconGridWidgetDelegate.class);
                        if (kVarC != null) {
                            return (IconGridWidgetDelegate) kVarC;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(IconGridWidgetDelegate.class).e()));
                    case 3:
                        koi.k kVarC2 = tabLifestyleScreen.P.f.c(TilePaginatedGridWidgetDelegate.class);
                        if (kVarC2 != null) {
                            return (TilePaginatedGridWidgetDelegate) kVarC2;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(TilePaginatedGridWidgetDelegate.class).e()));
                    case 4:
                        KProperty[] kPropertyArr3 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen2 = this.f217282b;
                        return tki.g.a(tabLifestyleScreen2, tabLifestyleScreen2.d(), zhm.d0.E0(((fd6.a) tabLifestyleScreen2.f89914t0.getValue()).e, zhm.v.k((FullScreenStateDelegate) tabLifestyleScreen2.U.getValue(), (ScrollerDelegate) tabLifestyleScreen2.m0.getValue(), (VoucherSmallLoadingDelegate) tabLifestyleScreen2.V.getValue(), (ActionWidgetDelegate) tabLifestyleScreen2.Y.getValue(), new ActionWidgetLoadingDelegate(), (FeedPostDelegate) tabLifestyleScreen2.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen2.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen2.f89905b0.getValue(), (FeedCollectionDelegate) tabLifestyleScreen2.c0.getValue(), (GridBoxDelegate) tabLifestyleScreen2.i0.getValue(), (IconDelegate) tabLifestyleScreen2.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen2.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen2.f0.getValue(), (RowDelegate) tabLifestyleScreen2.g0.getValue(), (RowLoadingDelegate) tabLifestyleScreen2.f89908h0.getValue(), (PlaceholderRowDelegate) tabLifestyleScreen2.T.getValue(), (ListSubheaderDelegate) tabLifestyleScreen2.S.getValue(), (RowsWidgetDelegate) tabLifestyleScreen2.l0.getValue())), R$id.tabLifestyle_recyclerView, null, tabLifestyleScreen2.P, null, 40);
                    case 5:
                        KProperty[] kPropertyArr4 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen3 = this.f217282b;
                        phm.a aVar = (phm.a) ue0.e.j(tabLifestyleScreen3.m2()).a().get(eei.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", eei.a.class, " is not found"));
                        }
                        vle.b bVar = ((vle.b) aVar2.b()).D;
                        TabLifestyleScreenContract$InputData tabLifestyleScreenContract$InputData = tabLifestyleScreen3.K;
                        tabLifestyleScreenContract$InputData.getClass();
                        return new vle.c(bVar, new g39.c(), tabLifestyleScreen3, tabLifestyleScreenContract$InputData, new c0c.t(tabLifestyleScreen3.p0, (ScrollerDelegate) tabLifestyleScreen3.m0.getValue(), tabLifestyleScreen3.P.f, 2), tabLifestyleScreen3);
                    case 6:
                        KProperty[] kPropertyArr5 = TabLifestyleScreen.f89903w0;
                        return (z) ((vle.c) tabLifestyleScreen.R1()).V.get();
                    case 7:
                        KProperty[] kPropertyArr6 = TabLifestyleScreen.f89903w0;
                        return (fd6.a) ((vle.c) tabLifestyleScreen.R1()).f290398j.get();
                    case 8:
                        KProperty[] kPropertyArr7 = TabLifestyleScreen.f89903w0;
                        return (on.a) ((vle.c) tabLifestyleScreen.R1()).X.get();
                    default:
                        KProperty[] kPropertyArr8 = TabLifestyleScreen.f89903w0;
                        return new GridBoxDelegate(zhm.v.k((IconDelegate) tabLifestyleScreen.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen.f0.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                }
            }
        });
        final int i32 = 6;
        this.f89913s0 = w.y0(new Function0(this) { // from class: nme.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabLifestyleScreen f217282b;

            {
                this.f217282b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i32;
                TabLifestyleScreen tabLifestyleScreen = this.f217282b;
                switch (i222) {
                    case 0:
                        KProperty[] kPropertyArr = TabLifestyleScreen.f89903w0;
                        return (rp0.l0) ((vle.c) tabLifestyleScreen.R1()).W.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TabLifestyleScreen.f89903w0;
                        return new ScrollerDelegate(zhm.v.k((VoucherSmallLoadingDelegate) tabLifestyleScreen.V.getValue(), (ChallengeMediumLoadingDelegate) tabLifestyleScreen.W.getValue(), (ChallengeMediumDelegate) tabLifestyleScreen.X.getValue(), (FeedPostDelegate) tabLifestyleScreen.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen.f89905b0.getValue(), (ActionWidgetDelegate) tabLifestyleScreen.Y.getValue(), (HeroBannerLoadingDelegate) tabLifestyleScreen.j0.getValue(), (HeroBannerDelegate) tabLifestyleScreen.f89909k0.getValue()), false);
                    case 2:
                        koi.k kVarC = tabLifestyleScreen.P.f.c(IconGridWidgetDelegate.class);
                        if (kVarC != null) {
                            return (IconGridWidgetDelegate) kVarC;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(IconGridWidgetDelegate.class).e()));
                    case 3:
                        koi.k kVarC2 = tabLifestyleScreen.P.f.c(TilePaginatedGridWidgetDelegate.class);
                        if (kVarC2 != null) {
                            return (TilePaginatedGridWidgetDelegate) kVarC2;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(TilePaginatedGridWidgetDelegate.class).e()));
                    case 4:
                        KProperty[] kPropertyArr3 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen2 = this.f217282b;
                        return tki.g.a(tabLifestyleScreen2, tabLifestyleScreen2.d(), zhm.d0.E0(((fd6.a) tabLifestyleScreen2.f89914t0.getValue()).e, zhm.v.k((FullScreenStateDelegate) tabLifestyleScreen2.U.getValue(), (ScrollerDelegate) tabLifestyleScreen2.m0.getValue(), (VoucherSmallLoadingDelegate) tabLifestyleScreen2.V.getValue(), (ActionWidgetDelegate) tabLifestyleScreen2.Y.getValue(), new ActionWidgetLoadingDelegate(), (FeedPostDelegate) tabLifestyleScreen2.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen2.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen2.f89905b0.getValue(), (FeedCollectionDelegate) tabLifestyleScreen2.c0.getValue(), (GridBoxDelegate) tabLifestyleScreen2.i0.getValue(), (IconDelegate) tabLifestyleScreen2.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen2.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen2.f0.getValue(), (RowDelegate) tabLifestyleScreen2.g0.getValue(), (RowLoadingDelegate) tabLifestyleScreen2.f89908h0.getValue(), (PlaceholderRowDelegate) tabLifestyleScreen2.T.getValue(), (ListSubheaderDelegate) tabLifestyleScreen2.S.getValue(), (RowsWidgetDelegate) tabLifestyleScreen2.l0.getValue())), R$id.tabLifestyle_recyclerView, null, tabLifestyleScreen2.P, null, 40);
                    case 5:
                        KProperty[] kPropertyArr4 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen3 = this.f217282b;
                        phm.a aVar = (phm.a) ue0.e.j(tabLifestyleScreen3.m2()).a().get(eei.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", eei.a.class, " is not found"));
                        }
                        vle.b bVar = ((vle.b) aVar2.b()).D;
                        TabLifestyleScreenContract$InputData tabLifestyleScreenContract$InputData = tabLifestyleScreen3.K;
                        tabLifestyleScreenContract$InputData.getClass();
                        return new vle.c(bVar, new g39.c(), tabLifestyleScreen3, tabLifestyleScreenContract$InputData, new c0c.t(tabLifestyleScreen3.p0, (ScrollerDelegate) tabLifestyleScreen3.m0.getValue(), tabLifestyleScreen3.P.f, 2), tabLifestyleScreen3);
                    case 6:
                        KProperty[] kPropertyArr5 = TabLifestyleScreen.f89903w0;
                        return (z) ((vle.c) tabLifestyleScreen.R1()).V.get();
                    case 7:
                        KProperty[] kPropertyArr6 = TabLifestyleScreen.f89903w0;
                        return (fd6.a) ((vle.c) tabLifestyleScreen.R1()).f290398j.get();
                    case 8:
                        KProperty[] kPropertyArr7 = TabLifestyleScreen.f89903w0;
                        return (on.a) ((vle.c) tabLifestyleScreen.R1()).X.get();
                    default:
                        KProperty[] kPropertyArr8 = TabLifestyleScreen.f89903w0;
                        return new GridBoxDelegate(zhm.v.k((IconDelegate) tabLifestyleScreen.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen.f0.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                }
            }
        });
        final int i33 = 7;
        this.f89914t0 = w.y0(new Function0(this) { // from class: nme.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabLifestyleScreen f217282b;

            {
                this.f217282b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i33;
                TabLifestyleScreen tabLifestyleScreen = this.f217282b;
                switch (i222) {
                    case 0:
                        KProperty[] kPropertyArr = TabLifestyleScreen.f89903w0;
                        return (rp0.l0) ((vle.c) tabLifestyleScreen.R1()).W.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TabLifestyleScreen.f89903w0;
                        return new ScrollerDelegate(zhm.v.k((VoucherSmallLoadingDelegate) tabLifestyleScreen.V.getValue(), (ChallengeMediumLoadingDelegate) tabLifestyleScreen.W.getValue(), (ChallengeMediumDelegate) tabLifestyleScreen.X.getValue(), (FeedPostDelegate) tabLifestyleScreen.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen.f89905b0.getValue(), (ActionWidgetDelegate) tabLifestyleScreen.Y.getValue(), (HeroBannerLoadingDelegate) tabLifestyleScreen.j0.getValue(), (HeroBannerDelegate) tabLifestyleScreen.f89909k0.getValue()), false);
                    case 2:
                        koi.k kVarC = tabLifestyleScreen.P.f.c(IconGridWidgetDelegate.class);
                        if (kVarC != null) {
                            return (IconGridWidgetDelegate) kVarC;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(IconGridWidgetDelegate.class).e()));
                    case 3:
                        koi.k kVarC2 = tabLifestyleScreen.P.f.c(TilePaginatedGridWidgetDelegate.class);
                        if (kVarC2 != null) {
                            return (TilePaginatedGridWidgetDelegate) kVarC2;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(TilePaginatedGridWidgetDelegate.class).e()));
                    case 4:
                        KProperty[] kPropertyArr3 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen2 = this.f217282b;
                        return tki.g.a(tabLifestyleScreen2, tabLifestyleScreen2.d(), zhm.d0.E0(((fd6.a) tabLifestyleScreen2.f89914t0.getValue()).e, zhm.v.k((FullScreenStateDelegate) tabLifestyleScreen2.U.getValue(), (ScrollerDelegate) tabLifestyleScreen2.m0.getValue(), (VoucherSmallLoadingDelegate) tabLifestyleScreen2.V.getValue(), (ActionWidgetDelegate) tabLifestyleScreen2.Y.getValue(), new ActionWidgetLoadingDelegate(), (FeedPostDelegate) tabLifestyleScreen2.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen2.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen2.f89905b0.getValue(), (FeedCollectionDelegate) tabLifestyleScreen2.c0.getValue(), (GridBoxDelegate) tabLifestyleScreen2.i0.getValue(), (IconDelegate) tabLifestyleScreen2.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen2.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen2.f0.getValue(), (RowDelegate) tabLifestyleScreen2.g0.getValue(), (RowLoadingDelegate) tabLifestyleScreen2.f89908h0.getValue(), (PlaceholderRowDelegate) tabLifestyleScreen2.T.getValue(), (ListSubheaderDelegate) tabLifestyleScreen2.S.getValue(), (RowsWidgetDelegate) tabLifestyleScreen2.l0.getValue())), R$id.tabLifestyle_recyclerView, null, tabLifestyleScreen2.P, null, 40);
                    case 5:
                        KProperty[] kPropertyArr4 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen3 = this.f217282b;
                        phm.a aVar = (phm.a) ue0.e.j(tabLifestyleScreen3.m2()).a().get(eei.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", eei.a.class, " is not found"));
                        }
                        vle.b bVar = ((vle.b) aVar2.b()).D;
                        TabLifestyleScreenContract$InputData tabLifestyleScreenContract$InputData = tabLifestyleScreen3.K;
                        tabLifestyleScreenContract$InputData.getClass();
                        return new vle.c(bVar, new g39.c(), tabLifestyleScreen3, tabLifestyleScreenContract$InputData, new c0c.t(tabLifestyleScreen3.p0, (ScrollerDelegate) tabLifestyleScreen3.m0.getValue(), tabLifestyleScreen3.P.f, 2), tabLifestyleScreen3);
                    case 6:
                        KProperty[] kPropertyArr5 = TabLifestyleScreen.f89903w0;
                        return (z) ((vle.c) tabLifestyleScreen.R1()).V.get();
                    case 7:
                        KProperty[] kPropertyArr6 = TabLifestyleScreen.f89903w0;
                        return (fd6.a) ((vle.c) tabLifestyleScreen.R1()).f290398j.get();
                    case 8:
                        KProperty[] kPropertyArr7 = TabLifestyleScreen.f89903w0;
                        return (on.a) ((vle.c) tabLifestyleScreen.R1()).X.get();
                    default:
                        KProperty[] kPropertyArr8 = TabLifestyleScreen.f89903w0;
                        return new GridBoxDelegate(zhm.v.k((IconDelegate) tabLifestyleScreen.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen.f0.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                }
            }
        });
        final int i43 = 8;
        this.u0 = w.y0(new Function0(this) { // from class: nme.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabLifestyleScreen f217282b;

            {
                this.f217282b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i43;
                TabLifestyleScreen tabLifestyleScreen = this.f217282b;
                switch (i222) {
                    case 0:
                        KProperty[] kPropertyArr = TabLifestyleScreen.f89903w0;
                        return (rp0.l0) ((vle.c) tabLifestyleScreen.R1()).W.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TabLifestyleScreen.f89903w0;
                        return new ScrollerDelegate(zhm.v.k((VoucherSmallLoadingDelegate) tabLifestyleScreen.V.getValue(), (ChallengeMediumLoadingDelegate) tabLifestyleScreen.W.getValue(), (ChallengeMediumDelegate) tabLifestyleScreen.X.getValue(), (FeedPostDelegate) tabLifestyleScreen.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen.f89905b0.getValue(), (ActionWidgetDelegate) tabLifestyleScreen.Y.getValue(), (HeroBannerLoadingDelegate) tabLifestyleScreen.j0.getValue(), (HeroBannerDelegate) tabLifestyleScreen.f89909k0.getValue()), false);
                    case 2:
                        koi.k kVarC = tabLifestyleScreen.P.f.c(IconGridWidgetDelegate.class);
                        if (kVarC != null) {
                            return (IconGridWidgetDelegate) kVarC;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(IconGridWidgetDelegate.class).e()));
                    case 3:
                        koi.k kVarC2 = tabLifestyleScreen.P.f.c(TilePaginatedGridWidgetDelegate.class);
                        if (kVarC2 != null) {
                            return (TilePaginatedGridWidgetDelegate) kVarC2;
                        }
                        throw new IllegalStateException(h30.l.r("No delegate found for class ", kotlin.jvm.internal.o0.f186429a.b(TilePaginatedGridWidgetDelegate.class).e()));
                    case 4:
                        KProperty[] kPropertyArr3 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen2 = this.f217282b;
                        return tki.g.a(tabLifestyleScreen2, tabLifestyleScreen2.d(), zhm.d0.E0(((fd6.a) tabLifestyleScreen2.f89914t0.getValue()).e, zhm.v.k((FullScreenStateDelegate) tabLifestyleScreen2.U.getValue(), (ScrollerDelegate) tabLifestyleScreen2.m0.getValue(), (VoucherSmallLoadingDelegate) tabLifestyleScreen2.V.getValue(), (ActionWidgetDelegate) tabLifestyleScreen2.Y.getValue(), new ActionWidgetLoadingDelegate(), (FeedPostDelegate) tabLifestyleScreen2.Z.getValue(), (HybridTileDelegate) tabLifestyleScreen2.f89904a0.getValue(), (FeedPostLoadingDelegate) tabLifestyleScreen2.f89905b0.getValue(), (FeedCollectionDelegate) tabLifestyleScreen2.c0.getValue(), (GridBoxDelegate) tabLifestyleScreen2.i0.getValue(), (IconDelegate) tabLifestyleScreen2.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen2.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen2.f0.getValue(), (RowDelegate) tabLifestyleScreen2.g0.getValue(), (RowLoadingDelegate) tabLifestyleScreen2.f89908h0.getValue(), (PlaceholderRowDelegate) tabLifestyleScreen2.T.getValue(), (ListSubheaderDelegate) tabLifestyleScreen2.S.getValue(), (RowsWidgetDelegate) tabLifestyleScreen2.l0.getValue())), R$id.tabLifestyle_recyclerView, null, tabLifestyleScreen2.P, null, 40);
                    case 5:
                        KProperty[] kPropertyArr4 = TabLifestyleScreen.f89903w0;
                        TabLifestyleScreen tabLifestyleScreen3 = this.f217282b;
                        phm.a aVar = (phm.a) ue0.e.j(tabLifestyleScreen3.m2()).a().get(eei.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", eei.a.class, " is not found"));
                        }
                        vle.b bVar = ((vle.b) aVar2.b()).D;
                        TabLifestyleScreenContract$InputData tabLifestyleScreenContract$InputData = tabLifestyleScreen3.K;
                        tabLifestyleScreenContract$InputData.getClass();
                        return new vle.c(bVar, new g39.c(), tabLifestyleScreen3, tabLifestyleScreenContract$InputData, new c0c.t(tabLifestyleScreen3.p0, (ScrollerDelegate) tabLifestyleScreen3.m0.getValue(), tabLifestyleScreen3.P.f, 2), tabLifestyleScreen3);
                    case 6:
                        KProperty[] kPropertyArr5 = TabLifestyleScreen.f89903w0;
                        return (z) ((vle.c) tabLifestyleScreen.R1()).V.get();
                    case 7:
                        KProperty[] kPropertyArr6 = TabLifestyleScreen.f89903w0;
                        return (fd6.a) ((vle.c) tabLifestyleScreen.R1()).f290398j.get();
                    case 8:
                        KProperty[] kPropertyArr7 = TabLifestyleScreen.f89903w0;
                        return (on.a) ((vle.c) tabLifestyleScreen.R1()).X.get();
                    default:
                        KProperty[] kPropertyArr8 = TabLifestyleScreen.f89903w0;
                        return new GridBoxDelegate(zhm.v.k((IconDelegate) tabLifestyleScreen.f89906d0.getValue(), (IconLoadingDelegate) tabLifestyleScreen.f89907e0.getValue(), (LargeActionButtonDelegate) tabLifestyleScreen.f0.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                }
            }
        });
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.z;
        this.f89915v0 = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getM() {
        return Integer.valueOf(this.O);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        b0 uiState = (b0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarMessage navBarMessage = uiState.f217287h;
        SmallActionButtonDelegate.Model model = uiState.f;
        boolean z = uiState.e;
        jme.c cVar = uiState.f217285c;
        boolean z3 = uiState.f217286g;
        itb.a aVar = uiState.f217284b;
        List<? extends NavBarMenuItem> list = uiState.d;
        if (qVar == null || !(qVar instanceof a0)) {
            e3().d.setAvatar(new t2(aVar.f168357a, z3));
            e3().d.setMenuItems(list);
            ((vqi.a) ((vle.c) R1()).e.E.get()).b(list);
            h3(uiState);
            i3(cVar);
            e3().f272055g.setForceDynamicBackground(z);
            d3(model);
            e3().d.setMessage(navBarMessage);
            return;
        }
        a0 a0Var = (a0) qVar;
        if (a0Var.f217276a || a0Var.f217279g) {
            e3().d.setAvatar(new t2(aVar.f168357a, z3));
        }
        if (a0Var.f217277b) {
            h3(uiState);
        }
        if (a0Var.f217278c) {
            i3(cVar);
        }
        if (a0Var.d) {
            e3().d.setMenuItems(list);
            ((vqi.a) ((vle.c) R1()).e.E.get()).b(list);
        }
        if (a0Var.e) {
            e3().f272055g.setForceDynamicBackground(z);
        }
        if (a0Var.f) {
            d3(model);
        }
        if (a0Var.f217280h) {
            e3().d.setMessage(navBarMessage);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.f89915v0;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void W() {
        super.W();
        ((f) d()).c0.a();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        f fVar = (f) d();
        fVar.getClass();
        Continuation continuation = null;
        if (i != 1005) {
            if (i == 2004) {
                if (i2 == 1) {
                    l.b1(fVar, new m0(fVar.f89946p.b(i19.f.ALWAYS), 15), null, new g0(5, fVar, continuation), 3);
                    return;
                }
                return;
            } else {
                if (i != 2200) {
                    return;
                }
                CreditCardRevPointsLockedDestination.INSTANCE.getClass();
                String stringExtra = intent != null ? intent.getStringExtra("CREDIT_CARD_REV_POINTS_LOCKED_BRIDGE_ARGS") : null;
                if (stringExtra != null) {
                    knm.b.j(fVar.l1(), new CreditCardTopupDestination(stringExtra, (KompotDestination) null, 6));
                    return;
                }
                return;
            }
        }
        RevPointsSpareChangeControllerApi$BridgeDestination.INSTANCE.getClass();
        RevPointsSpareChangeControllerApi$Result revPointsSpareChangeControllerApi$Result = intent != null ? (RevPointsSpareChangeControllerApi$Result) intent.getParcelableExtra("REV_POINTS_SPARE_CHANGE_BRIDGE_ARGS") : null;
        if (revPointsSpareChangeControllerApi$Result != null) {
            if ((revPointsSpareChangeControllerApi$Result instanceof RevPointsSpareChangeControllerApi$Result.Activated) || (revPointsSpareChangeControllerApi$Result instanceof RevPointsSpareChangeControllerApi$Result.Updated) || (revPointsSpareChangeControllerApi$Result instanceof RevPointsSpareChangeControllerApi$Result.Deactivated)) {
                fVar.l2(new g0(0, fVar, continuation), new yi5.b(26));
                fVar.l2(new nme.h0(3, fVar, continuation), new yi5.b(26));
                fVar.l2(new nme.h0(2, fVar, continuation), new yi5.b(26));
                fVar.c0.a();
            } else if (!(revPointsSpareChangeControllerApi$Result instanceof RevPointsSpareChangeControllerApi$Result.Skipped)) {
                throw new NoWhenBranchMatchedException();
            }
            ((x1c.a) fVar.u).Z2(revPointsSpareChangeControllerApi$Result);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.home_lifestyle, null, null, 14));
        j3(false);
        xv0.w wVar = new xv0.w(new p(1, this.p0, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 12), null);
        ScreenContentRecyclerView tabLifestyleRecyclerView = e3().f;
        Intrinsics.checkNotNullExpressionValue(tabLifestyleRecyclerView, "tabLifestyleRecyclerView");
        wVar.b(tabLifestyleRecyclerView);
        ScreenContentRecyclerView tabLifestyleRecyclerView2 = e3().f;
        Intrinsics.checkNotNullExpressionValue(tabLifestyleRecyclerView2, "tabLifestyleRecyclerView");
        l0.k(this.Q, tabLifestyleRecyclerView2, this.P, (rp0.l0) this.R.getValue());
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v118, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v137, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v71, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v81, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v86, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        int i = 3;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.U.getValue()).f52371h.f121375b), null, new nme.o(this, null), 3);
        int i2 = 4;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().d.D()), null, new t(this, continuation, i2), 3);
        int i3 = 5;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().d.F()), null, new t(this, continuation, i3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().d.b()), null, new nme.d(this, continuation, i3), 3);
        e3().d.setSearchButtonText(new TextLocalisedClause(R$string.tab_lifestyle_search_hint, null, null, 14));
        int i5 = 6;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().d.L()), null, new t(this, continuation, i5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ChallengeMediumDelegate) this.X.getValue()).d), null, new v(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(e3().f272055g.f59454c.d, new tx.f(3))), null, new nme.d(this, continuation, i5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().e.f283811r), null, new nme.d(this, continuation, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FeedPostDelegate) this.Z.getValue()).f52336c), null, new nme.w(this, null), 3);
        ?? r102 = this.f89904a0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((HybridTileDelegate) r102.getValue()).f52467c), null, new nme.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((HybridTileDelegate) r102.getValue()).d), null, new g(this, null), 3);
        ?? r103 = this.c0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FeedCollectionDelegate) r103.getValue()).f52322h), null, new nme.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FeedCollectionDelegate) r103.getValue()).i), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FeedCollectionDelegate) r103.getValue()).f52323j), null, new nme.j(this, null), 3);
        int i6 = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((rp0.l0) this.R.getValue()).f256113c), null, new nme.d(this, continuation, i6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.f0.getValue()).d.f121375b), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((IconDelegate) this.f89906d0.getValue()).p()), null, new nme.l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.g0.getValue()).f53218h), null, new nme.m(this, null), 3);
        ?? r104 = this.f89909k0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((HeroBannerDelegate) r104.getValue()).d), null, new n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((HeroBannerDelegate) r104.getValue()).e), null, new nme.p(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((IconGridWidgetDelegate) this.f89910n0.getValue()).f), null, new nme.q(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TilePaginatedGridWidgetDelegate) this.f89911o0.getValue()).f), null, new r(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().e.j()), null, new nme.s(this, null), 3);
        int i21 = 0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().f272053b.f56386h), null, new t(this, continuation, i21), 3);
        int i22 = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().e.k()), null, new nme.d(this, continuation, i22), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().e.e.f59173n), null, new t(this, continuation, i6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().e.e.f59170j), null, new t(this, continuation, i22), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().e.e.f59171l), null, new t(this, continuation, i), 3);
        on.a aVar = (on.a) this.u0.getValue();
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = e3().f272052a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        com.revolut.kompot.navigable.a.g2(this, ((sn.a) aVar).b(controllerContainerCoordinatorLayout, false), null, new nme.d(this, continuation, 8), 3);
        ScreenContentRecyclerView tabLifestyleRecyclerView = e3().f;
        Intrinsics.checkNotNullExpressionValue(tabLifestyleRecyclerView, "tabLifestyleRecyclerView");
        com.revolut.kompot.navigable.a.g2(this, vkm.q.C(vkm.q.J(rd0.e.b(g4i.a.c(x.c(tabLifestyleRecyclerView, 7))), rd0.e.b(g4i.a.c(x.c(e3().f272055g.getRecyclerView(), 7)))), p0.f264002b), null, new nme.d(this, continuation, i21), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().d.H()), null, new nme.d(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().d.I()), null, new nme.d(this, continuation, i2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionWidgetDelegate) this.Y.getValue()).d.f121375b), null, new nme.u(this, null), 3);
    }

    public final void d3(SmallActionButtonDelegate.Model model) {
        j3(model != null);
        if (model == null) {
            SmallActionButton tabLifestyleButton = e3().f272053b;
            Intrinsics.checkNotNullExpressionValue(tabLifestyleButton, "tabLifestyleButton");
            tabLifestyleButton.setVisibility(8);
        } else {
            SmallActionButton tabLifestyleButton2 = e3().f272053b;
            Intrinsics.checkNotNullExpressionValue(tabLifestyleButton2, "tabLifestyleButton");
            tabLifestyleButton2.setVisibility(0);
            e3().f272053b.setIcon(model.f53339c);
            e3().f272053b.setText(model.f);
            e3().f272053b.i(model.f53338b);
        }
    }

    @Override // ash.j
    /* JADX INFO: renamed from: e1, reason: from getter */
    public final l0 getQ() {
        return this.Q;
    }

    public final tle.a e3() {
        ViewBinding value = this.M.getValue(this, f89903w0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (tle.a) value;
    }

    @Override // jji.h
    public final NavBarWithContainer f() {
        NavBarWithContainer tabLifestyleNavBarWithContainer = e3().d;
        Intrinsics.checkNotNullExpressionValue(tabLifestyleNavBarWithContainer, "tabLifestyleNavBarWithContainer");
        return tabLifestyleNavBarWithContainer;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final ome.c R1() {
        return (ome.c) this.f89912r0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final z d() {
        return (z) this.f89913s0.getValue();
    }

    @Override // jji.h
    public final View getContent() {
        ScreenContentRecyclerView tabLifestyleRecyclerView = e3().f;
        Intrinsics.checkNotNullExpressionValue(tabLifestyleRecyclerView, "tabLifestyleRecyclerView");
        return tabLifestyleRecyclerView;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    public final void h3(b0 b0Var) {
        jme.c cVar = b0Var.f217285c;
        if (cVar instanceof jme.b) {
            e3().f272055g.setModel(((jme.b) cVar).f176602a);
            e3().d.setHeaderDisclaimer(null);
        } else {
            if (!(cVar instanceof jme.a)) {
                throw new NoWhenBranchMatchedException();
            }
            jme.a aVar = (jme.a) cVar;
            e3().e.setModel(aVar.f176599a);
            e3().e.setHeightStrategy(aVar.f176600b);
            e3().d.setHeaderDisclaimer(aVar.f176601c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i3(jme.c r9) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreen.i3(jme.c):void");
    }

    public final void j3(boolean z) {
        Activity activityM2;
        float f;
        if (z) {
            activityM2 = m2();
            f = 80.0f;
        } else {
            activityM2 = m2();
            f = 8.0f;
        }
        int iK = kli.a.k(activityM2, f);
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iP = boh.f.p(context) + iK;
        ScreenContentRecyclerView tabLifestyleRecyclerView = e3().f;
        Intrinsics.checkNotNullExpressionValue(tabLifestyleRecyclerView, "tabLifestyleRecyclerView");
        knm.b.v(iP, tabLifestyleRecyclerView);
        e3().f.setClipToPadding(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.q0.getValue();
    }

    @Override // hx0.d0
    /* JADX INFO: renamed from: k1, reason: from getter */
    public final s getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ash.j
    public final ihm.f t0() {
        return ((rp0.l0) this.R.getValue()).f256113c;
    }

    @Override // jji.h
    public final View v() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = e3().f272052a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return hx0.h.b(controllerContainerCoordinatorLayout);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ash.j
    public final void z1(String anchorItemId, mw0.a menu) {
        Intrinsics.checkNotNullParameter(anchorItemId, "anchorItemId");
        Intrinsics.checkNotNullParameter(menu, "menu");
        ((rp0.l0) this.R.getValue()).e(anchorItemId, menu, mw0.o.VIEW_BOUNDS, new mw0.l(false));
    }
}
