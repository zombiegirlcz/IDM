package com.revolut.feature.shops.impl.ui.home;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.BigTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.StaggeredGridItemDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherExtraSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shops.api.model.ShopsCategory;
import com.revolut.feature.shops.impl.R$id;
import com.revolut.feature.shops.impl.R$layout;
import com.revolut.feature.shops.impl.R$string;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import did.i;
import dli.c;
import fb6.j;
import fca.d;
import fed.a0;
import fjd.f;
import fjd.g;
import fjd.k;
import fjd.l;
import fjd.m;
import fjd.t;
import fjd.u;
import fjd.v;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import skm.p0;
import te0.w;
import vc.s;
import whd.b;
import xki.e;
import xv0.x;
import yp0.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfjd/t;", "Ldli/a;", "Lfjd/v;", "Lwhd/b;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShopsCombinedHomeScreen extends ViewController<t> implements dli.a, b {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f87179h0 = {o0.f186429a.j(new h0(ShopsCombinedHomeScreen.class, "binding", "getBinding()Lcom/revolut/feature/shops/impl/databinding/ScreenShopsCombinedHomeBinding;", 0))};
    public final int K;
    public final boolean L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final StaggeredGridItemDelegate V;
    public final StaggeredGridItemDelegate W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f87180a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f87181b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f87182d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f87183e0;
    public final Object f0;
    public final Object g0;

    public ShopsCombinedHomeScreen(ShopsCombinedHomeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_shops_combined_home;
        this.L = true;
        this.M = s.t(this, fjd.b.f);
        this.N = w.y0(new a0(24));
        this.O = w.y0(new a0(15));
        this.P = w.y0(new a0(16));
        this.Q = w.y0(new a0(17));
        this.R = w.y0(new a0(18));
        this.S = w.y0(new a0(19));
        Lazy lazyY0 = w.y0(new a0(20));
        this.T = lazyY0;
        Lazy lazyY02 = w.y0(new a0(21));
        this.U = lazyY02;
        this.V = new StaggeredGridItemDelegate((VoucherSmallTileDelegate) lazyY0.getValue());
        this.W = new StaggeredGridItemDelegate((VoucherSmallLoadingDelegate) lazyY02.getValue());
        this.X = w.y0(new a0(22));
        this.Y = w.y0(new a0(23));
        this.Z = w.y0(new a0(25));
        final int i = 0;
        this.f87180a0 = w.y0(new Function0(this) { // from class: fjd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsCombinedHomeScreen f135566b;

            {
                this.f135566b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ShopsCombinedHomeScreen shopsCombinedHomeScreen = this.f135566b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ShopsCombinedHomeScreen.f87179h0;
                        return (fd6.a) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).f115024h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ShopsCombinedHomeScreen.f87179h0;
                        return new ScrollerDelegate(zhm.v.k(new SmallCardLoadingDelegate(null), new ActionCardLoadingDelegate(), (BigTileDelegate) shopsCombinedHomeScreen.O.getValue(), (VoucherExtraSmallTileDelegate) shopsCombinedHomeScreen.R.getValue(), (VoucherSmallTileDelegate) shopsCombinedHomeScreen.T.getValue(), (VoucherSmallLoadingDelegate) shopsCombinedHomeScreen.U.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = ShopsCombinedHomeScreen.f87179h0;
                        return zhm.d0.E0(((fd6.a) shopsCombinedHomeScreen.f87180a0.getValue()).e, zhm.v.k(new BigTileLoadingDelegate(), new ListSubheaderLoadingDelegate(), new FixedTabsLoadingDelegate(), new RewardsGridLoadingDelegate(), new MapPlainLoadingDelegate(), (RowDelegate) shopsCombinedHomeScreen.Z.getValue(), (LargeActionButtonDelegate) shopsCombinedHomeScreen.Y.getValue(), (FullScreenStateDelegate) shopsCombinedHomeScreen.N.getValue(), (BigTileDelegate) shopsCombinedHomeScreen.O.getValue(), (ScrollerDelegate) shopsCombinedHomeScreen.f87181b0.getValue(), (ListSubheaderDelegate) shopsCombinedHomeScreen.P.getValue(), (MapPlainDelegate) shopsCombinedHomeScreen.Q.getValue(), (RewardsGridDelegate) shopsCombinedHomeScreen.S.getValue(), (TextDelegate) shopsCombinedHomeScreen.X.getValue(), shopsCombinedHomeScreen.V, shopsCombinedHomeScreen.W));
                    case 3:
                        KProperty[] kPropertyArr4 = ShopsCombinedHomeScreen.f87179h0;
                        return (u) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).o.get();
                    case 4:
                        KProperty[] kPropertyArr5 = ShopsCombinedHomeScreen.f87179h0;
                        ShopsCombinedHomeScreen shopsCombinedHomeScreen2 = this.f135566b;
                        u uVarR2 = shopsCombinedHomeScreen2.R2();
                        int i3 = R$id.shopsCombinedHome_recyclerView;
                        StaggeredGridItemDelegate.Companion companion = StaggeredGridItemDelegate.INSTANCE;
                        List list = (List) shopsCombinedHomeScreen2.c0.getValue();
                        companion.getClass();
                        return dli.f.a(shopsCombinedHomeScreen2, uVarR2, StaggeredGridItemDelegate.Companion.a(list), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = ShopsCombinedHomeScreen.f87179h0;
                        return (on.a) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).f115029p.get();
                }
            }
        });
        final int i2 = 1;
        this.f87181b0 = w.y0(new Function0(this) { // from class: fjd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsCombinedHomeScreen f135566b;

            {
                this.f135566b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ShopsCombinedHomeScreen shopsCombinedHomeScreen = this.f135566b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShopsCombinedHomeScreen.f87179h0;
                        return (fd6.a) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).f115024h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ShopsCombinedHomeScreen.f87179h0;
                        return new ScrollerDelegate(zhm.v.k(new SmallCardLoadingDelegate(null), new ActionCardLoadingDelegate(), (BigTileDelegate) shopsCombinedHomeScreen.O.getValue(), (VoucherExtraSmallTileDelegate) shopsCombinedHomeScreen.R.getValue(), (VoucherSmallTileDelegate) shopsCombinedHomeScreen.T.getValue(), (VoucherSmallLoadingDelegate) shopsCombinedHomeScreen.U.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = ShopsCombinedHomeScreen.f87179h0;
                        return zhm.d0.E0(((fd6.a) shopsCombinedHomeScreen.f87180a0.getValue()).e, zhm.v.k(new BigTileLoadingDelegate(), new ListSubheaderLoadingDelegate(), new FixedTabsLoadingDelegate(), new RewardsGridLoadingDelegate(), new MapPlainLoadingDelegate(), (RowDelegate) shopsCombinedHomeScreen.Z.getValue(), (LargeActionButtonDelegate) shopsCombinedHomeScreen.Y.getValue(), (FullScreenStateDelegate) shopsCombinedHomeScreen.N.getValue(), (BigTileDelegate) shopsCombinedHomeScreen.O.getValue(), (ScrollerDelegate) shopsCombinedHomeScreen.f87181b0.getValue(), (ListSubheaderDelegate) shopsCombinedHomeScreen.P.getValue(), (MapPlainDelegate) shopsCombinedHomeScreen.Q.getValue(), (RewardsGridDelegate) shopsCombinedHomeScreen.S.getValue(), (TextDelegate) shopsCombinedHomeScreen.X.getValue(), shopsCombinedHomeScreen.V, shopsCombinedHomeScreen.W));
                    case 3:
                        KProperty[] kPropertyArr4 = ShopsCombinedHomeScreen.f87179h0;
                        return (u) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).o.get();
                    case 4:
                        KProperty[] kPropertyArr5 = ShopsCombinedHomeScreen.f87179h0;
                        ShopsCombinedHomeScreen shopsCombinedHomeScreen2 = this.f135566b;
                        u uVarR2 = shopsCombinedHomeScreen2.R2();
                        int i3 = R$id.shopsCombinedHome_recyclerView;
                        StaggeredGridItemDelegate.Companion companion = StaggeredGridItemDelegate.INSTANCE;
                        List list = (List) shopsCombinedHomeScreen2.c0.getValue();
                        companion.getClass();
                        return dli.f.a(shopsCombinedHomeScreen2, uVarR2, StaggeredGridItemDelegate.Companion.a(list), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = ShopsCombinedHomeScreen.f87179h0;
                        return (on.a) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).f115029p.get();
                }
            }
        });
        final int i3 = 2;
        this.c0 = w.y0(new Function0(this) { // from class: fjd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsCombinedHomeScreen f135566b;

            {
                this.f135566b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ShopsCombinedHomeScreen shopsCombinedHomeScreen = this.f135566b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShopsCombinedHomeScreen.f87179h0;
                        return (fd6.a) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).f115024h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ShopsCombinedHomeScreen.f87179h0;
                        return new ScrollerDelegate(zhm.v.k(new SmallCardLoadingDelegate(null), new ActionCardLoadingDelegate(), (BigTileDelegate) shopsCombinedHomeScreen.O.getValue(), (VoucherExtraSmallTileDelegate) shopsCombinedHomeScreen.R.getValue(), (VoucherSmallTileDelegate) shopsCombinedHomeScreen.T.getValue(), (VoucherSmallLoadingDelegate) shopsCombinedHomeScreen.U.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = ShopsCombinedHomeScreen.f87179h0;
                        return zhm.d0.E0(((fd6.a) shopsCombinedHomeScreen.f87180a0.getValue()).e, zhm.v.k(new BigTileLoadingDelegate(), new ListSubheaderLoadingDelegate(), new FixedTabsLoadingDelegate(), new RewardsGridLoadingDelegate(), new MapPlainLoadingDelegate(), (RowDelegate) shopsCombinedHomeScreen.Z.getValue(), (LargeActionButtonDelegate) shopsCombinedHomeScreen.Y.getValue(), (FullScreenStateDelegate) shopsCombinedHomeScreen.N.getValue(), (BigTileDelegate) shopsCombinedHomeScreen.O.getValue(), (ScrollerDelegate) shopsCombinedHomeScreen.f87181b0.getValue(), (ListSubheaderDelegate) shopsCombinedHomeScreen.P.getValue(), (MapPlainDelegate) shopsCombinedHomeScreen.Q.getValue(), (RewardsGridDelegate) shopsCombinedHomeScreen.S.getValue(), (TextDelegate) shopsCombinedHomeScreen.X.getValue(), shopsCombinedHomeScreen.V, shopsCombinedHomeScreen.W));
                    case 3:
                        KProperty[] kPropertyArr4 = ShopsCombinedHomeScreen.f87179h0;
                        return (u) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).o.get();
                    case 4:
                        KProperty[] kPropertyArr5 = ShopsCombinedHomeScreen.f87179h0;
                        ShopsCombinedHomeScreen shopsCombinedHomeScreen2 = this.f135566b;
                        u uVarR2 = shopsCombinedHomeScreen2.R2();
                        int i32 = R$id.shopsCombinedHome_recyclerView;
                        StaggeredGridItemDelegate.Companion companion = StaggeredGridItemDelegate.INSTANCE;
                        List list = (List) shopsCombinedHomeScreen2.c0.getValue();
                        companion.getClass();
                        return dli.f.a(shopsCombinedHomeScreen2, uVarR2, StaggeredGridItemDelegate.Companion.a(list), i32, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = ShopsCombinedHomeScreen.f87179h0;
                        return (on.a) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).f115029p.get();
                }
            }
        });
        this.f87182d0 = w.y0(new j(this, inputData, 7));
        final int i5 = 3;
        this.f87183e0 = w.y0(new Function0(this) { // from class: fjd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsCombinedHomeScreen f135566b;

            {
                this.f135566b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ShopsCombinedHomeScreen shopsCombinedHomeScreen = this.f135566b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShopsCombinedHomeScreen.f87179h0;
                        return (fd6.a) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).f115024h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ShopsCombinedHomeScreen.f87179h0;
                        return new ScrollerDelegate(zhm.v.k(new SmallCardLoadingDelegate(null), new ActionCardLoadingDelegate(), (BigTileDelegate) shopsCombinedHomeScreen.O.getValue(), (VoucherExtraSmallTileDelegate) shopsCombinedHomeScreen.R.getValue(), (VoucherSmallTileDelegate) shopsCombinedHomeScreen.T.getValue(), (VoucherSmallLoadingDelegate) shopsCombinedHomeScreen.U.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = ShopsCombinedHomeScreen.f87179h0;
                        return zhm.d0.E0(((fd6.a) shopsCombinedHomeScreen.f87180a0.getValue()).e, zhm.v.k(new BigTileLoadingDelegate(), new ListSubheaderLoadingDelegate(), new FixedTabsLoadingDelegate(), new RewardsGridLoadingDelegate(), new MapPlainLoadingDelegate(), (RowDelegate) shopsCombinedHomeScreen.Z.getValue(), (LargeActionButtonDelegate) shopsCombinedHomeScreen.Y.getValue(), (FullScreenStateDelegate) shopsCombinedHomeScreen.N.getValue(), (BigTileDelegate) shopsCombinedHomeScreen.O.getValue(), (ScrollerDelegate) shopsCombinedHomeScreen.f87181b0.getValue(), (ListSubheaderDelegate) shopsCombinedHomeScreen.P.getValue(), (MapPlainDelegate) shopsCombinedHomeScreen.Q.getValue(), (RewardsGridDelegate) shopsCombinedHomeScreen.S.getValue(), (TextDelegate) shopsCombinedHomeScreen.X.getValue(), shopsCombinedHomeScreen.V, shopsCombinedHomeScreen.W));
                    case 3:
                        KProperty[] kPropertyArr4 = ShopsCombinedHomeScreen.f87179h0;
                        return (u) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).o.get();
                    case 4:
                        KProperty[] kPropertyArr5 = ShopsCombinedHomeScreen.f87179h0;
                        ShopsCombinedHomeScreen shopsCombinedHomeScreen2 = this.f135566b;
                        u uVarR2 = shopsCombinedHomeScreen2.R2();
                        int i32 = R$id.shopsCombinedHome_recyclerView;
                        StaggeredGridItemDelegate.Companion companion = StaggeredGridItemDelegate.INSTANCE;
                        List list = (List) shopsCombinedHomeScreen2.c0.getValue();
                        companion.getClass();
                        return dli.f.a(shopsCombinedHomeScreen2, uVarR2, StaggeredGridItemDelegate.Companion.a(list), i32, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = ShopsCombinedHomeScreen.f87179h0;
                        return (on.a) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).f115029p.get();
                }
            }
        });
        final int i6 = 4;
        this.f0 = w.y0(new Function0(this) { // from class: fjd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsCombinedHomeScreen f135566b;

            {
                this.f135566b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                ShopsCombinedHomeScreen shopsCombinedHomeScreen = this.f135566b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShopsCombinedHomeScreen.f87179h0;
                        return (fd6.a) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).f115024h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ShopsCombinedHomeScreen.f87179h0;
                        return new ScrollerDelegate(zhm.v.k(new SmallCardLoadingDelegate(null), new ActionCardLoadingDelegate(), (BigTileDelegate) shopsCombinedHomeScreen.O.getValue(), (VoucherExtraSmallTileDelegate) shopsCombinedHomeScreen.R.getValue(), (VoucherSmallTileDelegate) shopsCombinedHomeScreen.T.getValue(), (VoucherSmallLoadingDelegate) shopsCombinedHomeScreen.U.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = ShopsCombinedHomeScreen.f87179h0;
                        return zhm.d0.E0(((fd6.a) shopsCombinedHomeScreen.f87180a0.getValue()).e, zhm.v.k(new BigTileLoadingDelegate(), new ListSubheaderLoadingDelegate(), new FixedTabsLoadingDelegate(), new RewardsGridLoadingDelegate(), new MapPlainLoadingDelegate(), (RowDelegate) shopsCombinedHomeScreen.Z.getValue(), (LargeActionButtonDelegate) shopsCombinedHomeScreen.Y.getValue(), (FullScreenStateDelegate) shopsCombinedHomeScreen.N.getValue(), (BigTileDelegate) shopsCombinedHomeScreen.O.getValue(), (ScrollerDelegate) shopsCombinedHomeScreen.f87181b0.getValue(), (ListSubheaderDelegate) shopsCombinedHomeScreen.P.getValue(), (MapPlainDelegate) shopsCombinedHomeScreen.Q.getValue(), (RewardsGridDelegate) shopsCombinedHomeScreen.S.getValue(), (TextDelegate) shopsCombinedHomeScreen.X.getValue(), shopsCombinedHomeScreen.V, shopsCombinedHomeScreen.W));
                    case 3:
                        KProperty[] kPropertyArr4 = ShopsCombinedHomeScreen.f87179h0;
                        return (u) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).o.get();
                    case 4:
                        KProperty[] kPropertyArr5 = ShopsCombinedHomeScreen.f87179h0;
                        ShopsCombinedHomeScreen shopsCombinedHomeScreen2 = this.f135566b;
                        u uVarR2 = shopsCombinedHomeScreen2.R2();
                        int i32 = R$id.shopsCombinedHome_recyclerView;
                        StaggeredGridItemDelegate.Companion companion = StaggeredGridItemDelegate.INSTANCE;
                        List list = (List) shopsCombinedHomeScreen2.c0.getValue();
                        companion.getClass();
                        return dli.f.a(shopsCombinedHomeScreen2, uVarR2, StaggeredGridItemDelegate.Companion.a(list), i32, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = ShopsCombinedHomeScreen.f87179h0;
                        return (on.a) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).f115029p.get();
                }
            }
        });
        final int i21 = 5;
        this.g0 = w.y0(new Function0(this) { // from class: fjd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsCombinedHomeScreen f135566b;

            {
                this.f135566b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                ShopsCombinedHomeScreen shopsCombinedHomeScreen = this.f135566b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShopsCombinedHomeScreen.f87179h0;
                        return (fd6.a) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).f115024h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ShopsCombinedHomeScreen.f87179h0;
                        return new ScrollerDelegate(zhm.v.k(new SmallCardLoadingDelegate(null), new ActionCardLoadingDelegate(), (BigTileDelegate) shopsCombinedHomeScreen.O.getValue(), (VoucherExtraSmallTileDelegate) shopsCombinedHomeScreen.R.getValue(), (VoucherSmallTileDelegate) shopsCombinedHomeScreen.T.getValue(), (VoucherSmallLoadingDelegate) shopsCombinedHomeScreen.U.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = ShopsCombinedHomeScreen.f87179h0;
                        return zhm.d0.E0(((fd6.a) shopsCombinedHomeScreen.f87180a0.getValue()).e, zhm.v.k(new BigTileLoadingDelegate(), new ListSubheaderLoadingDelegate(), new FixedTabsLoadingDelegate(), new RewardsGridLoadingDelegate(), new MapPlainLoadingDelegate(), (RowDelegate) shopsCombinedHomeScreen.Z.getValue(), (LargeActionButtonDelegate) shopsCombinedHomeScreen.Y.getValue(), (FullScreenStateDelegate) shopsCombinedHomeScreen.N.getValue(), (BigTileDelegate) shopsCombinedHomeScreen.O.getValue(), (ScrollerDelegate) shopsCombinedHomeScreen.f87181b0.getValue(), (ListSubheaderDelegate) shopsCombinedHomeScreen.P.getValue(), (MapPlainDelegate) shopsCombinedHomeScreen.Q.getValue(), (RewardsGridDelegate) shopsCombinedHomeScreen.S.getValue(), (TextDelegate) shopsCombinedHomeScreen.X.getValue(), shopsCombinedHomeScreen.V, shopsCombinedHomeScreen.W));
                    case 3:
                        KProperty[] kPropertyArr4 = ShopsCombinedHomeScreen.f87179h0;
                        return (u) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).o.get();
                    case 4:
                        KProperty[] kPropertyArr5 = ShopsCombinedHomeScreen.f87179h0;
                        ShopsCombinedHomeScreen shopsCombinedHomeScreen2 = this.f135566b;
                        u uVarR2 = shopsCombinedHomeScreen2.R2();
                        int i32 = R$id.shopsCombinedHome_recyclerView;
                        StaggeredGridItemDelegate.Companion companion = StaggeredGridItemDelegate.INSTANCE;
                        List list = (List) shopsCombinedHomeScreen2.c0.getValue();
                        companion.getClass();
                        return dli.f.a(shopsCombinedHomeScreen2, uVarR2, StaggeredGridItemDelegate.Companion.a(list), i32, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = ShopsCombinedHomeScreen.f87179h0;
                        return (on.a) ((did.i) shopsCombinedHomeScreen.f87182d0.getValue()).f115029p.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        v uiState = (v) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f305857b.setMenuItems(uiState.f135596b);
        List<com.revolut.core.ui_kit.views.q> list = uiState.f135597c;
        if (list.isEmpty()) {
            Tabs shopsCombinedHomeTabs = d3().d;
            Intrinsics.checkNotNullExpressionValue(shopsCombinedHomeTabs, "shopsCombinedHomeTabs");
            shopsCombinedHomeTabs.setVisibility(8);
            d3().f305857b.setSearchButtonActive(false);
            return;
        }
        Tabs tabs = d3().d;
        ShopsCategory shopsCategory = uiState.d;
        tabs.setItems(list, shopsCategory != null ? shopsCategory.f87040a : null);
        Tabs shopsCombinedHomeTabs2 = d3().d;
        Intrinsics.checkNotNullExpressionValue(shopsCombinedHomeTabs2, "shopsCombinedHomeTabs");
        shopsCombinedHomeTabs2.setVisibility(0);
        d3().f305857b.setSearchButtonActive(true);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return new AnalyticsProduct.Retail(super.f0());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.f87182d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f305857b;
        navBarWithToolbar.f59417v0 = false;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.shops_platform_screens_shops_rev10_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.shops_platform_screens_shops_rev10_title, null, null, 14), null);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.shops_screens_home_search_hint, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ScreenContentRecyclerView shopsCombinedHomeRecyclerView = d3().f305858c;
        Intrinsics.checkNotNullExpressionValue(shopsCombinedHomeRecyclerView, "shopsCombinedHomeRecyclerView");
        y.k(shopsCombinedHomeRecyclerView, ((c) this.f0.getValue()).w(), 0, 14);
        ScreenContentRecyclerView shopsCombinedHomeRecyclerView2 = d3().f305858c;
        Intrinsics.checkNotNullExpressionValue(shopsCombinedHomeRecyclerView2, "shopsCombinedHomeRecyclerView");
        y.a(shopsCombinedHomeRecyclerView2, 6, false, new d(this, 29));
    }

    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v71, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v77, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f305857b.f59410q), new fjd.h(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f305857b.o.f57403b), new f(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(d3().f305857b.v0()), new fjd.h(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().d.f58882b), new f(this, continuation, 5), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), new fjd.i(this, null), 3);
        ViewController.P2(this, rd0.e.b(((ListSubheaderDelegate) this.P.getValue()).f52707c), new fjd.j(this, null), 3);
        ViewController.P2(this, rd0.e.b(((BigTileDelegate) this.O.getValue()).d), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(((VoucherExtraSmallTileDelegate) this.R.getValue()).f53594c), new l(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RewardsGridDelegate) this.S.getValue()).f53209c.d), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(((VoucherSmallTileDelegate) this.T.getValue()).f53608c), new fjd.c(this, null), 3);
        ?? r62 = this.Z;
        ViewController.P2(this, rd0.e.b(((RowDelegate) r62.getValue()).f53218h), new fjd.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) r62.getValue()).f53220l), new fjd.e(this, null), 3);
        ?? r64 = this.Q;
        ViewController.P2(this, rd0.e.b(((MapPlainDelegate) r64.getValue()).f52768c), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(((MapPlainDelegate) r64.getValue()).d), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((TextDelegate) this.X.getValue()).d), new f(this, continuation, 2), 3);
        ScreenContentRecyclerView shopsCombinedHomeRecyclerView = d3().f305858c;
        Intrinsics.checkNotNullExpressionValue(shopsCombinedHomeRecyclerView, "shopsCombinedHomeRecyclerView");
        ViewController.P2(this, vkm.q.C(rd0.e.b(cp5.d.g(x.c(shopsCombinedHomeRecyclerView, 7))), p0.f264002b), new f(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(((LargeActionButtonDelegate) this.Y.getValue()).d.f121375b), new g(this, null), 3);
        on.a aVar = (on.a) this.g0.getValue();
        ScreenContentRecyclerView shopsCombinedHomeRecyclerView2 = d3().f305858c;
        Intrinsics.checkNotNullExpressionValue(shopsCombinedHomeRecyclerView2, "shopsCombinedHomeRecyclerView");
        ViewController.P2(this, ((sn.a) aVar).b(shopsCombinedHomeRecyclerView2, false), new f(this, continuation, 6), 3);
    }

    public final xhd.a d3() {
        ViewBinding value = this.M.getValue(this, f87179h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (xhd.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final u R2() {
        return (u) this.f87183e0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.f0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
