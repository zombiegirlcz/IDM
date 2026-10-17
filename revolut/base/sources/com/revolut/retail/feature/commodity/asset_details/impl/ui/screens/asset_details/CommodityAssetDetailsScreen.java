package com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import aw0.q0;
import com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.core.ui_kit.delegates.ExtraSmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.MultiTargetFanChartDelegate;
import com.revolut.core.ui_kit.delegates.MultiTargetFanChartLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.NewsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ButtonsActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.commodity.asset_details.impl.R$id;
import com.revolut.retail.feature.commodity.asset_details.impl.R$layout;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreenContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import czc.d0;
import d6j.g;
import d6j.j;
import d6j.k;
import d6j.l;
import d6j.m;
import d6j.n;
import d6j.t;
import dli.a;
import dtl.d;
import efm.r;
import fsl.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import m1d.b;
import org.jetbrains.annotations.NotNull;
import pcj.e;
import qzj.f;
import te0.w;
import vc.s;
import vkm.i;
import z0h.s1;
import zhm.u;
import zhm.v;
import zjh.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f:\u0001\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/retail/feature/commodity/asset_details/impl/ui/screens/asset_details/CommodityAssetDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ld6j/t;", "Lfsl/o;", "Lqzj/f;", "Lh1h/f;", "Lm1d/b;", "Lpcj/e;", "Lz0h/s1;", "Lwwk/e;", "Ldtl/d;", "Companion", "a", "feature_commodity_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CommodityAssetDetailsScreen extends ViewController<q> implements a, o, f, h1h.f, b, e, s1, wwk.e, d {
    public final CommodityAssetDetailsScreenContract$InputData K;
    public final int L;
    public final ListSubheaderLoadingDelegate M;
    public final CellDetailsLoadingDelegate N;
    public final CellDetailsDelegate O;
    public final RowLoadingDelegate P;
    public final RowDelegate Q;
    public final ListSubheaderDelegate R;
    public final HeaderDelegate S;
    public final MultiTargetFanChartDelegate T;
    public final MultiTargetFanChartLoadingDelegate U;
    public final InputDisclosureDelegate V;
    public final NewsDelegate W;
    public final ExtraSmallCardDelegate X;
    public final ScrollerDelegate Y;
    public final SwipeToActionDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f99780a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final TextClause f99781b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f99782d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f99783e0;
    public final Object f0;
    public final h g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f99784h0;
    public final Object i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f99785k0;
    public final Object l0;
    public final Object m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Object f99786n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final c f99787o0;
    public static final /* synthetic */ KProperty[] p0 = {o0.f186429a.j(new h0(CommodityAssetDetailsScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/commodity/asset_details/impl/databinding/ScreenCommodityAssetDetailsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public CommodityAssetDetailsScreen(CommodityAssetDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_commodity_asset_details;
        this.M = new ListSubheaderLoadingDelegate();
        this.N = new CellDetailsLoadingDelegate();
        this.O = new CellDetailsDelegate();
        this.P = new RowLoadingDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        this.R = new ListSubheaderDelegate();
        this.S = new HeaderDelegate();
        this.T = new MultiTargetFanChartDelegate();
        this.U = new MultiTargetFanChartLoadingDelegate();
        this.V = new InputDisclosureDelegate();
        NewsDelegate newsDelegate = new NewsDelegate();
        this.W = newsDelegate;
        NewsLoadingDelegate newsLoadingDelegate = new NewsLoadingDelegate();
        final int i = 0;
        ExtraSmallCardLoadingDelegate extraSmallCardLoadingDelegate = new ExtraSmallCardLoadingDelegate(0);
        final int i2 = 3;
        ExtraSmallCardDelegate extraSmallCardDelegate = new ExtraSmallCardDelegate(3);
        this.X = extraSmallCardDelegate;
        final int i3 = 4;
        final int i5 = 1;
        final int i6 = 2;
        this.Y = new ScrollerDelegate(v.k(newsDelegate, newsLoadingDelegate, extraSmallCardDelegate, extraSmallCardLoadingDelegate), false);
        this.Z = new SwipeToActionDelegate(rowDelegate, false);
        this.f99780a0 = w.y0(new d0(13));
        this.f99781b0 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        this.c0 = w.y0(new Function0(this) { // from class: d6j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityAssetDetailsScreen f111549b;

            {
                this.f111549b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i21 = i3;
                CommodityAssetDetailsScreen commodityAssetDetailsScreen = this.f111549b;
                switch (i21) {
                    case 0:
                        CommodityAssetDetailsScreen.Companion companion = CommodityAssetDetailsScreen.INSTANCE;
                        CommodityAssetDetailsScreen commodityAssetDetailsScreen2 = this.f111549b;
                        phm.a aVar = (phm.a) ue0.e.j(commodityAssetDetailsScreen2.m2()).a().get(w5j.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5j.b.class, " is not found"));
                        }
                        w5j.b bVar = ((w5j.b) aVar2.b()).I;
                        CommodityAssetDetailsScreenContract$InputData commodityAssetDetailsScreenContract$InputData = commodityAssetDetailsScreen2.K;
                        commodityAssetDetailsScreenContract$InputData.getClass();
                        od0.i.Companion.getClass();
                        zjh.c cVar = commodityAssetDetailsScreen2.f99787o0;
                        cVar.getClass();
                        return new w5j.c(bVar, commodityAssetDetailsScreen2, commodityAssetDetailsScreenContract$InputData, cVar, commodityAssetDetailsScreen2);
                    case 1:
                        CommodityAssetDetailsScreen.Companion companion2 = CommodityAssetDetailsScreen.INSTANCE;
                        return (r) ((w5j.c) commodityAssetDetailsScreen.f99785k0.getValue()).f295320h0.get();
                    case 2:
                        CommodityAssetDetailsScreen.Companion companion3 = CommodityAssetDetailsScreen.INSTANCE;
                        TrendViewDelegate trendViewDelegate = (TrendViewDelegate) commodityAssetDetailsScreen.f99780a0.getValue();
                        FixedTabsDelegate fixedTabsDelegate = (FixedTabsDelegate) commodityAssetDetailsScreen.f99782d0.getValue();
                        TabsDelegate tabsDelegate = (TabsDelegate) commodityAssetDetailsScreen.f99783e0.getValue();
                        CandleStickGraphDelegate candleStickGraphDelegate = (CandleStickGraphDelegate) commodityAssetDetailsScreen.c0.getValue();
                        RowDelegate rowDelegate2 = commodityAssetDetailsScreen.Q;
                        RowLoadingDelegate rowLoadingDelegate = commodityAssetDetailsScreen.P;
                        HeaderDelegate headerDelegate = commodityAssetDetailsScreen.S;
                        ListSubheaderDelegate listSubheaderDelegate = commodityAssetDetailsScreen.R;
                        CellDetailsDelegate cellDetailsDelegate = commodityAssetDetailsScreen.O;
                        ListSubheaderLoadingDelegate listSubheaderLoadingDelegate = commodityAssetDetailsScreen.M;
                        CellDetailsLoadingDelegate cellDetailsLoadingDelegate = commodityAssetDetailsScreen.N;
                        return zhm.v.k(trendViewDelegate, fixedTabsDelegate, tabsDelegate, candleStickGraphDelegate, rowDelegate2, rowLoadingDelegate, headerDelegate, listSubheaderDelegate, cellDetailsDelegate, listSubheaderLoadingDelegate, cellDetailsLoadingDelegate, commodityAssetDetailsScreen.Y, cellDetailsLoadingDelegate, commodityAssetDetailsScreen.T, commodityAssetDetailsScreen.U, (LargeActionButtonDelegate) commodityAssetDetailsScreen.f99784h0.getValue(), commodityAssetDetailsScreen.V, (TextDelegate) commodityAssetDetailsScreen.f0.getValue(), commodityAssetDetailsScreen.Z);
                    case 3:
                        CommodityAssetDetailsScreen.Companion companion4 = CommodityAssetDetailsScreen.INSTANCE;
                        CommodityAssetDetailsScreen commodityAssetDetailsScreen3 = this.f111549b;
                        return dli.f.a(commodityAssetDetailsScreen3, commodityAssetDetailsScreen3.R2(), (List) commodityAssetDetailsScreen3.m0.getValue(), R$id.commodityAssetDetails_recycler, null, null, null, 56);
                    case 4:
                        CommodityAssetDetailsScreen.Companion companion5 = CommodityAssetDetailsScreen.INSTANCE;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.candlestick_tooltip_open, null, null, 14);
                        TextClause textClause = commodityAssetDetailsScreen.f99781b0;
                        return new CandleStickGraphDelegate(yoj.b.w(textLocalisedClause, textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_close, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_high, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_low, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_volume, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_change, null, null, 14), textClause));
                    default:
                        CommodityAssetDetailsScreen.Companion companion6 = CommodityAssetDetailsScreen.INSTANCE;
                        return (j60.a) ((w5j.c) commodityAssetDetailsScreen.f99785k0.getValue()).u.get();
                }
            }
        });
        int i21 = 14;
        this.f99782d0 = w.y0(new d0(i21));
        this.f99783e0 = w.y0(new d0(15));
        this.f0 = w.y0(new d0(16));
        this.g0 = s.t(this, d6j.c.f);
        this.f99784h0 = w.y0(new d0(17));
        this.i0 = w.y0(new d0(18));
        final int i22 = 5;
        this.j0 = w.y0(new Function0(this) { // from class: d6j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityAssetDetailsScreen f111549b;

            {
                this.f111549b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i212 = i22;
                CommodityAssetDetailsScreen commodityAssetDetailsScreen = this.f111549b;
                switch (i212) {
                    case 0:
                        CommodityAssetDetailsScreen.Companion companion = CommodityAssetDetailsScreen.INSTANCE;
                        CommodityAssetDetailsScreen commodityAssetDetailsScreen2 = this.f111549b;
                        phm.a aVar = (phm.a) ue0.e.j(commodityAssetDetailsScreen2.m2()).a().get(w5j.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5j.b.class, " is not found"));
                        }
                        w5j.b bVar = ((w5j.b) aVar2.b()).I;
                        CommodityAssetDetailsScreenContract$InputData commodityAssetDetailsScreenContract$InputData = commodityAssetDetailsScreen2.K;
                        commodityAssetDetailsScreenContract$InputData.getClass();
                        od0.i.Companion.getClass();
                        zjh.c cVar = commodityAssetDetailsScreen2.f99787o0;
                        cVar.getClass();
                        return new w5j.c(bVar, commodityAssetDetailsScreen2, commodityAssetDetailsScreenContract$InputData, cVar, commodityAssetDetailsScreen2);
                    case 1:
                        CommodityAssetDetailsScreen.Companion companion2 = CommodityAssetDetailsScreen.INSTANCE;
                        return (r) ((w5j.c) commodityAssetDetailsScreen.f99785k0.getValue()).f295320h0.get();
                    case 2:
                        CommodityAssetDetailsScreen.Companion companion3 = CommodityAssetDetailsScreen.INSTANCE;
                        TrendViewDelegate trendViewDelegate = (TrendViewDelegate) commodityAssetDetailsScreen.f99780a0.getValue();
                        FixedTabsDelegate fixedTabsDelegate = (FixedTabsDelegate) commodityAssetDetailsScreen.f99782d0.getValue();
                        TabsDelegate tabsDelegate = (TabsDelegate) commodityAssetDetailsScreen.f99783e0.getValue();
                        CandleStickGraphDelegate candleStickGraphDelegate = (CandleStickGraphDelegate) commodityAssetDetailsScreen.c0.getValue();
                        RowDelegate rowDelegate2 = commodityAssetDetailsScreen.Q;
                        RowLoadingDelegate rowLoadingDelegate = commodityAssetDetailsScreen.P;
                        HeaderDelegate headerDelegate = commodityAssetDetailsScreen.S;
                        ListSubheaderDelegate listSubheaderDelegate = commodityAssetDetailsScreen.R;
                        CellDetailsDelegate cellDetailsDelegate = commodityAssetDetailsScreen.O;
                        ListSubheaderLoadingDelegate listSubheaderLoadingDelegate = commodityAssetDetailsScreen.M;
                        CellDetailsLoadingDelegate cellDetailsLoadingDelegate = commodityAssetDetailsScreen.N;
                        return zhm.v.k(trendViewDelegate, fixedTabsDelegate, tabsDelegate, candleStickGraphDelegate, rowDelegate2, rowLoadingDelegate, headerDelegate, listSubheaderDelegate, cellDetailsDelegate, listSubheaderLoadingDelegate, cellDetailsLoadingDelegate, commodityAssetDetailsScreen.Y, cellDetailsLoadingDelegate, commodityAssetDetailsScreen.T, commodityAssetDetailsScreen.U, (LargeActionButtonDelegate) commodityAssetDetailsScreen.f99784h0.getValue(), commodityAssetDetailsScreen.V, (TextDelegate) commodityAssetDetailsScreen.f0.getValue(), commodityAssetDetailsScreen.Z);
                    case 3:
                        CommodityAssetDetailsScreen.Companion companion4 = CommodityAssetDetailsScreen.INSTANCE;
                        CommodityAssetDetailsScreen commodityAssetDetailsScreen3 = this.f111549b;
                        return dli.f.a(commodityAssetDetailsScreen3, commodityAssetDetailsScreen3.R2(), (List) commodityAssetDetailsScreen3.m0.getValue(), R$id.commodityAssetDetails_recycler, null, null, null, 56);
                    case 4:
                        CommodityAssetDetailsScreen.Companion companion5 = CommodityAssetDetailsScreen.INSTANCE;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.candlestick_tooltip_open, null, null, 14);
                        TextClause textClause = commodityAssetDetailsScreen.f99781b0;
                        return new CandleStickGraphDelegate(yoj.b.w(textLocalisedClause, textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_close, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_high, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_low, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_volume, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_change, null, null, 14), textClause));
                    default:
                        CommodityAssetDetailsScreen.Companion companion6 = CommodityAssetDetailsScreen.INSTANCE;
                        return (j60.a) ((w5j.c) commodityAssetDetailsScreen.f99785k0.getValue()).u.get();
                }
            }
        });
        this.f99785k0 = w.y0(new Function0(this) { // from class: d6j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityAssetDetailsScreen f111549b;

            {
                this.f111549b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i212 = i;
                CommodityAssetDetailsScreen commodityAssetDetailsScreen = this.f111549b;
                switch (i212) {
                    case 0:
                        CommodityAssetDetailsScreen.Companion companion = CommodityAssetDetailsScreen.INSTANCE;
                        CommodityAssetDetailsScreen commodityAssetDetailsScreen2 = this.f111549b;
                        phm.a aVar = (phm.a) ue0.e.j(commodityAssetDetailsScreen2.m2()).a().get(w5j.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5j.b.class, " is not found"));
                        }
                        w5j.b bVar = ((w5j.b) aVar2.b()).I;
                        CommodityAssetDetailsScreenContract$InputData commodityAssetDetailsScreenContract$InputData = commodityAssetDetailsScreen2.K;
                        commodityAssetDetailsScreenContract$InputData.getClass();
                        od0.i.Companion.getClass();
                        zjh.c cVar = commodityAssetDetailsScreen2.f99787o0;
                        cVar.getClass();
                        return new w5j.c(bVar, commodityAssetDetailsScreen2, commodityAssetDetailsScreenContract$InputData, cVar, commodityAssetDetailsScreen2);
                    case 1:
                        CommodityAssetDetailsScreen.Companion companion2 = CommodityAssetDetailsScreen.INSTANCE;
                        return (r) ((w5j.c) commodityAssetDetailsScreen.f99785k0.getValue()).f295320h0.get();
                    case 2:
                        CommodityAssetDetailsScreen.Companion companion3 = CommodityAssetDetailsScreen.INSTANCE;
                        TrendViewDelegate trendViewDelegate = (TrendViewDelegate) commodityAssetDetailsScreen.f99780a0.getValue();
                        FixedTabsDelegate fixedTabsDelegate = (FixedTabsDelegate) commodityAssetDetailsScreen.f99782d0.getValue();
                        TabsDelegate tabsDelegate = (TabsDelegate) commodityAssetDetailsScreen.f99783e0.getValue();
                        CandleStickGraphDelegate candleStickGraphDelegate = (CandleStickGraphDelegate) commodityAssetDetailsScreen.c0.getValue();
                        RowDelegate rowDelegate2 = commodityAssetDetailsScreen.Q;
                        RowLoadingDelegate rowLoadingDelegate = commodityAssetDetailsScreen.P;
                        HeaderDelegate headerDelegate = commodityAssetDetailsScreen.S;
                        ListSubheaderDelegate listSubheaderDelegate = commodityAssetDetailsScreen.R;
                        CellDetailsDelegate cellDetailsDelegate = commodityAssetDetailsScreen.O;
                        ListSubheaderLoadingDelegate listSubheaderLoadingDelegate = commodityAssetDetailsScreen.M;
                        CellDetailsLoadingDelegate cellDetailsLoadingDelegate = commodityAssetDetailsScreen.N;
                        return zhm.v.k(trendViewDelegate, fixedTabsDelegate, tabsDelegate, candleStickGraphDelegate, rowDelegate2, rowLoadingDelegate, headerDelegate, listSubheaderDelegate, cellDetailsDelegate, listSubheaderLoadingDelegate, cellDetailsLoadingDelegate, commodityAssetDetailsScreen.Y, cellDetailsLoadingDelegate, commodityAssetDetailsScreen.T, commodityAssetDetailsScreen.U, (LargeActionButtonDelegate) commodityAssetDetailsScreen.f99784h0.getValue(), commodityAssetDetailsScreen.V, (TextDelegate) commodityAssetDetailsScreen.f0.getValue(), commodityAssetDetailsScreen.Z);
                    case 3:
                        CommodityAssetDetailsScreen.Companion companion4 = CommodityAssetDetailsScreen.INSTANCE;
                        CommodityAssetDetailsScreen commodityAssetDetailsScreen3 = this.f111549b;
                        return dli.f.a(commodityAssetDetailsScreen3, commodityAssetDetailsScreen3.R2(), (List) commodityAssetDetailsScreen3.m0.getValue(), R$id.commodityAssetDetails_recycler, null, null, null, 56);
                    case 4:
                        CommodityAssetDetailsScreen.Companion companion5 = CommodityAssetDetailsScreen.INSTANCE;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.candlestick_tooltip_open, null, null, 14);
                        TextClause textClause = commodityAssetDetailsScreen.f99781b0;
                        return new CandleStickGraphDelegate(yoj.b.w(textLocalisedClause, textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_close, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_high, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_low, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_volume, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_change, null, null, 14), textClause));
                    default:
                        CommodityAssetDetailsScreen.Companion companion6 = CommodityAssetDetailsScreen.INSTANCE;
                        return (j60.a) ((w5j.c) commodityAssetDetailsScreen.f99785k0.getValue()).u.get();
                }
            }
        });
        this.l0 = w.y0(new Function0(this) { // from class: d6j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityAssetDetailsScreen f111549b;

            {
                this.f111549b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i212 = i5;
                CommodityAssetDetailsScreen commodityAssetDetailsScreen = this.f111549b;
                switch (i212) {
                    case 0:
                        CommodityAssetDetailsScreen.Companion companion = CommodityAssetDetailsScreen.INSTANCE;
                        CommodityAssetDetailsScreen commodityAssetDetailsScreen2 = this.f111549b;
                        phm.a aVar = (phm.a) ue0.e.j(commodityAssetDetailsScreen2.m2()).a().get(w5j.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5j.b.class, " is not found"));
                        }
                        w5j.b bVar = ((w5j.b) aVar2.b()).I;
                        CommodityAssetDetailsScreenContract$InputData commodityAssetDetailsScreenContract$InputData = commodityAssetDetailsScreen2.K;
                        commodityAssetDetailsScreenContract$InputData.getClass();
                        od0.i.Companion.getClass();
                        zjh.c cVar = commodityAssetDetailsScreen2.f99787o0;
                        cVar.getClass();
                        return new w5j.c(bVar, commodityAssetDetailsScreen2, commodityAssetDetailsScreenContract$InputData, cVar, commodityAssetDetailsScreen2);
                    case 1:
                        CommodityAssetDetailsScreen.Companion companion2 = CommodityAssetDetailsScreen.INSTANCE;
                        return (r) ((w5j.c) commodityAssetDetailsScreen.f99785k0.getValue()).f295320h0.get();
                    case 2:
                        CommodityAssetDetailsScreen.Companion companion3 = CommodityAssetDetailsScreen.INSTANCE;
                        TrendViewDelegate trendViewDelegate = (TrendViewDelegate) commodityAssetDetailsScreen.f99780a0.getValue();
                        FixedTabsDelegate fixedTabsDelegate = (FixedTabsDelegate) commodityAssetDetailsScreen.f99782d0.getValue();
                        TabsDelegate tabsDelegate = (TabsDelegate) commodityAssetDetailsScreen.f99783e0.getValue();
                        CandleStickGraphDelegate candleStickGraphDelegate = (CandleStickGraphDelegate) commodityAssetDetailsScreen.c0.getValue();
                        RowDelegate rowDelegate2 = commodityAssetDetailsScreen.Q;
                        RowLoadingDelegate rowLoadingDelegate = commodityAssetDetailsScreen.P;
                        HeaderDelegate headerDelegate = commodityAssetDetailsScreen.S;
                        ListSubheaderDelegate listSubheaderDelegate = commodityAssetDetailsScreen.R;
                        CellDetailsDelegate cellDetailsDelegate = commodityAssetDetailsScreen.O;
                        ListSubheaderLoadingDelegate listSubheaderLoadingDelegate = commodityAssetDetailsScreen.M;
                        CellDetailsLoadingDelegate cellDetailsLoadingDelegate = commodityAssetDetailsScreen.N;
                        return zhm.v.k(trendViewDelegate, fixedTabsDelegate, tabsDelegate, candleStickGraphDelegate, rowDelegate2, rowLoadingDelegate, headerDelegate, listSubheaderDelegate, cellDetailsDelegate, listSubheaderLoadingDelegate, cellDetailsLoadingDelegate, commodityAssetDetailsScreen.Y, cellDetailsLoadingDelegate, commodityAssetDetailsScreen.T, commodityAssetDetailsScreen.U, (LargeActionButtonDelegate) commodityAssetDetailsScreen.f99784h0.getValue(), commodityAssetDetailsScreen.V, (TextDelegate) commodityAssetDetailsScreen.f0.getValue(), commodityAssetDetailsScreen.Z);
                    case 3:
                        CommodityAssetDetailsScreen.Companion companion4 = CommodityAssetDetailsScreen.INSTANCE;
                        CommodityAssetDetailsScreen commodityAssetDetailsScreen3 = this.f111549b;
                        return dli.f.a(commodityAssetDetailsScreen3, commodityAssetDetailsScreen3.R2(), (List) commodityAssetDetailsScreen3.m0.getValue(), R$id.commodityAssetDetails_recycler, null, null, null, 56);
                    case 4:
                        CommodityAssetDetailsScreen.Companion companion5 = CommodityAssetDetailsScreen.INSTANCE;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.candlestick_tooltip_open, null, null, 14);
                        TextClause textClause = commodityAssetDetailsScreen.f99781b0;
                        return new CandleStickGraphDelegate(yoj.b.w(textLocalisedClause, textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_close, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_high, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_low, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_volume, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_change, null, null, 14), textClause));
                    default:
                        CommodityAssetDetailsScreen.Companion companion6 = CommodityAssetDetailsScreen.INSTANCE;
                        return (j60.a) ((w5j.c) commodityAssetDetailsScreen.f99785k0.getValue()).u.get();
                }
            }
        });
        this.m0 = w.y0(new Function0(this) { // from class: d6j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityAssetDetailsScreen f111549b;

            {
                this.f111549b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i212 = i6;
                CommodityAssetDetailsScreen commodityAssetDetailsScreen = this.f111549b;
                switch (i212) {
                    case 0:
                        CommodityAssetDetailsScreen.Companion companion = CommodityAssetDetailsScreen.INSTANCE;
                        CommodityAssetDetailsScreen commodityAssetDetailsScreen2 = this.f111549b;
                        phm.a aVar = (phm.a) ue0.e.j(commodityAssetDetailsScreen2.m2()).a().get(w5j.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5j.b.class, " is not found"));
                        }
                        w5j.b bVar = ((w5j.b) aVar2.b()).I;
                        CommodityAssetDetailsScreenContract$InputData commodityAssetDetailsScreenContract$InputData = commodityAssetDetailsScreen2.K;
                        commodityAssetDetailsScreenContract$InputData.getClass();
                        od0.i.Companion.getClass();
                        zjh.c cVar = commodityAssetDetailsScreen2.f99787o0;
                        cVar.getClass();
                        return new w5j.c(bVar, commodityAssetDetailsScreen2, commodityAssetDetailsScreenContract$InputData, cVar, commodityAssetDetailsScreen2);
                    case 1:
                        CommodityAssetDetailsScreen.Companion companion2 = CommodityAssetDetailsScreen.INSTANCE;
                        return (r) ((w5j.c) commodityAssetDetailsScreen.f99785k0.getValue()).f295320h0.get();
                    case 2:
                        CommodityAssetDetailsScreen.Companion companion3 = CommodityAssetDetailsScreen.INSTANCE;
                        TrendViewDelegate trendViewDelegate = (TrendViewDelegate) commodityAssetDetailsScreen.f99780a0.getValue();
                        FixedTabsDelegate fixedTabsDelegate = (FixedTabsDelegate) commodityAssetDetailsScreen.f99782d0.getValue();
                        TabsDelegate tabsDelegate = (TabsDelegate) commodityAssetDetailsScreen.f99783e0.getValue();
                        CandleStickGraphDelegate candleStickGraphDelegate = (CandleStickGraphDelegate) commodityAssetDetailsScreen.c0.getValue();
                        RowDelegate rowDelegate2 = commodityAssetDetailsScreen.Q;
                        RowLoadingDelegate rowLoadingDelegate = commodityAssetDetailsScreen.P;
                        HeaderDelegate headerDelegate = commodityAssetDetailsScreen.S;
                        ListSubheaderDelegate listSubheaderDelegate = commodityAssetDetailsScreen.R;
                        CellDetailsDelegate cellDetailsDelegate = commodityAssetDetailsScreen.O;
                        ListSubheaderLoadingDelegate listSubheaderLoadingDelegate = commodityAssetDetailsScreen.M;
                        CellDetailsLoadingDelegate cellDetailsLoadingDelegate = commodityAssetDetailsScreen.N;
                        return zhm.v.k(trendViewDelegate, fixedTabsDelegate, tabsDelegate, candleStickGraphDelegate, rowDelegate2, rowLoadingDelegate, headerDelegate, listSubheaderDelegate, cellDetailsDelegate, listSubheaderLoadingDelegate, cellDetailsLoadingDelegate, commodityAssetDetailsScreen.Y, cellDetailsLoadingDelegate, commodityAssetDetailsScreen.T, commodityAssetDetailsScreen.U, (LargeActionButtonDelegate) commodityAssetDetailsScreen.f99784h0.getValue(), commodityAssetDetailsScreen.V, (TextDelegate) commodityAssetDetailsScreen.f0.getValue(), commodityAssetDetailsScreen.Z);
                    case 3:
                        CommodityAssetDetailsScreen.Companion companion4 = CommodityAssetDetailsScreen.INSTANCE;
                        CommodityAssetDetailsScreen commodityAssetDetailsScreen3 = this.f111549b;
                        return dli.f.a(commodityAssetDetailsScreen3, commodityAssetDetailsScreen3.R2(), (List) commodityAssetDetailsScreen3.m0.getValue(), R$id.commodityAssetDetails_recycler, null, null, null, 56);
                    case 4:
                        CommodityAssetDetailsScreen.Companion companion5 = CommodityAssetDetailsScreen.INSTANCE;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.candlestick_tooltip_open, null, null, 14);
                        TextClause textClause = commodityAssetDetailsScreen.f99781b0;
                        return new CandleStickGraphDelegate(yoj.b.w(textLocalisedClause, textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_close, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_high, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_low, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_volume, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_change, null, null, 14), textClause));
                    default:
                        CommodityAssetDetailsScreen.Companion companion6 = CommodityAssetDetailsScreen.INSTANCE;
                        return (j60.a) ((w5j.c) commodityAssetDetailsScreen.f99785k0.getValue()).u.get();
                }
            }
        });
        this.f99786n0 = w.y0(new Function0(this) { // from class: d6j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityAssetDetailsScreen f111549b;

            {
                this.f111549b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i212 = i2;
                CommodityAssetDetailsScreen commodityAssetDetailsScreen = this.f111549b;
                switch (i212) {
                    case 0:
                        CommodityAssetDetailsScreen.Companion companion = CommodityAssetDetailsScreen.INSTANCE;
                        CommodityAssetDetailsScreen commodityAssetDetailsScreen2 = this.f111549b;
                        phm.a aVar = (phm.a) ue0.e.j(commodityAssetDetailsScreen2.m2()).a().get(w5j.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5j.b.class, " is not found"));
                        }
                        w5j.b bVar = ((w5j.b) aVar2.b()).I;
                        CommodityAssetDetailsScreenContract$InputData commodityAssetDetailsScreenContract$InputData = commodityAssetDetailsScreen2.K;
                        commodityAssetDetailsScreenContract$InputData.getClass();
                        od0.i.Companion.getClass();
                        zjh.c cVar = commodityAssetDetailsScreen2.f99787o0;
                        cVar.getClass();
                        return new w5j.c(bVar, commodityAssetDetailsScreen2, commodityAssetDetailsScreenContract$InputData, cVar, commodityAssetDetailsScreen2);
                    case 1:
                        CommodityAssetDetailsScreen.Companion companion2 = CommodityAssetDetailsScreen.INSTANCE;
                        return (r) ((w5j.c) commodityAssetDetailsScreen.f99785k0.getValue()).f295320h0.get();
                    case 2:
                        CommodityAssetDetailsScreen.Companion companion3 = CommodityAssetDetailsScreen.INSTANCE;
                        TrendViewDelegate trendViewDelegate = (TrendViewDelegate) commodityAssetDetailsScreen.f99780a0.getValue();
                        FixedTabsDelegate fixedTabsDelegate = (FixedTabsDelegate) commodityAssetDetailsScreen.f99782d0.getValue();
                        TabsDelegate tabsDelegate = (TabsDelegate) commodityAssetDetailsScreen.f99783e0.getValue();
                        CandleStickGraphDelegate candleStickGraphDelegate = (CandleStickGraphDelegate) commodityAssetDetailsScreen.c0.getValue();
                        RowDelegate rowDelegate2 = commodityAssetDetailsScreen.Q;
                        RowLoadingDelegate rowLoadingDelegate = commodityAssetDetailsScreen.P;
                        HeaderDelegate headerDelegate = commodityAssetDetailsScreen.S;
                        ListSubheaderDelegate listSubheaderDelegate = commodityAssetDetailsScreen.R;
                        CellDetailsDelegate cellDetailsDelegate = commodityAssetDetailsScreen.O;
                        ListSubheaderLoadingDelegate listSubheaderLoadingDelegate = commodityAssetDetailsScreen.M;
                        CellDetailsLoadingDelegate cellDetailsLoadingDelegate = commodityAssetDetailsScreen.N;
                        return zhm.v.k(trendViewDelegate, fixedTabsDelegate, tabsDelegate, candleStickGraphDelegate, rowDelegate2, rowLoadingDelegate, headerDelegate, listSubheaderDelegate, cellDetailsDelegate, listSubheaderLoadingDelegate, cellDetailsLoadingDelegate, commodityAssetDetailsScreen.Y, cellDetailsLoadingDelegate, commodityAssetDetailsScreen.T, commodityAssetDetailsScreen.U, (LargeActionButtonDelegate) commodityAssetDetailsScreen.f99784h0.getValue(), commodityAssetDetailsScreen.V, (TextDelegate) commodityAssetDetailsScreen.f0.getValue(), commodityAssetDetailsScreen.Z);
                    case 3:
                        CommodityAssetDetailsScreen.Companion companion4 = CommodityAssetDetailsScreen.INSTANCE;
                        CommodityAssetDetailsScreen commodityAssetDetailsScreen3 = this.f111549b;
                        return dli.f.a(commodityAssetDetailsScreen3, commodityAssetDetailsScreen3.R2(), (List) commodityAssetDetailsScreen3.m0.getValue(), R$id.commodityAssetDetails_recycler, null, null, null, 56);
                    case 4:
                        CommodityAssetDetailsScreen.Companion companion5 = CommodityAssetDetailsScreen.INSTANCE;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.candlestick_tooltip_open, null, null, 14);
                        TextClause textClause = commodityAssetDetailsScreen.f99781b0;
                        return new CandleStickGraphDelegate(yoj.b.w(textLocalisedClause, textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_close, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_high, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_low, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_volume, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_change, null, null, 14), textClause));
                    default:
                        CommodityAssetDetailsScreen.Companion companion6 = CommodityAssetDetailsScreen.INSTANCE;
                        return (j60.a) ((w5j.c) commodityAssetDetailsScreen.f99785k0.getValue()).u.get();
                }
            }
        });
        this.f99787o0 = new c(this, i21);
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f277457c;
        NavBarWithToolbar navBarWithToolbar2 = d3().f277457c;
        d6j.s sVar = uiState.f111603b;
        q0 q0Var = uiState.f111604c;
        navBarWithToolbar2.setMenuItems(sVar.i);
        CurrencyClause currencyClause = sVar.f111597a;
        CurrencyImage currencyImage = sVar.f111600g;
        Clause clause = sVar.f;
        Clause clause2 = sVar.e;
        Clause clause3 = sVar.f111599c;
        CompositeClause compositeClause = sVar.d;
        Clause textClause = sVar.f111598b;
        if (textClause == null) {
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, currencyClause, textClause, null, 4, null);
        navBarWithToolbar.setTitle(clause3, null);
        navBarWithToolbar.setTitleVisible(clause3 != null);
        navBarWithToolbar.setEndIconImage(currencyImage);
        navBarWithToolbar.setTitleTag(sVar.f111601h);
        navBarWithToolbar.setTitleTopDescription(compositeClause);
        navBarWithToolbar.setTitleTopDescriptionVisible(true);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionText(clause2);
        navBarWithToolbar.setThirdDescriptionText(clause);
        navBarWithToolbar.H0(true);
        ButtonsActionsView commodityAssetDetailsButtonsActions = d3().f277456b;
        Intrinsics.checkNotNullExpressionValue(commodityAssetDetailsButtonsActions, "commodityAssetDetailsButtonsActions");
        commodityAssetDetailsButtonsActions.setVisibility(q0Var == null ? 8 : 0);
        if (q0Var != null) {
            d3().f277456b.b(q0Var);
        }
    }

    @Override // dtl.d
    public final Flow B0() {
        return rd0.e.b(this.Z.f);
    }

    @Override // htl.g
    public final vkm.d O1() {
        return rd0.e.b(this.Q.f53218h);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (w5j.c) this.f99785k0.getValue();
    }

    @Override // pcj.e
    public final ihm.f Y0() {
        return this.T.f52778c.f121375b;
    }

    @Override // pcj.e
    public final r a1() {
        return this.R.d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        j60.a aVar = (j60.a) this.j0.getValue();
        ?? r06 = this.i0;
        aVar.d(u.c((LargeActionButtonDelegate) r06.getValue()));
        NavBarWithToolbar navBarWithToolbar = d3().f277457c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        Continuation continuation = null;
        int i = 2;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new d6j.f(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new d6j.d(this, continuation, i), 3);
        int i2 = 1;
        navBarWithToolbar.setCompactDescriptions(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setThirdDescriptionVisible(true);
        ?? r102 = this.f99782d0;
        ihm.f fVar = ((FixedTabsDelegate) r102.getValue()).f52339c.f121375b;
        g gVar = g.f;
        r map = fVar.map(new cie.b(24));
        ?? r4 = this.f99783e0;
        ihm.f fVar2 = ((TabsDelegate) r4.getValue()).f53515c.f121375b;
        d6j.h hVar = d6j.h.f;
        r rVarMerge = r.merge(map, fVar2.map(new cie.b(25)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        int i3 = 0;
        ViewController.P2(this, rd0.e.b(rVarMerge), new d6j.d(this, continuation, i3), 3);
        ViewController.P2(this, rd0.e.b(((FixedTabsDelegate) r102.getValue()).d.f121375b), new d6j.e(this, null), 3);
        r rVarFilter = ((TabsDelegate) r4.getValue()).f.f121375b.filter(new d2i.a(new d6j.b(i3), 15));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new d6j.f(this, continuation, i3), 3);
        ViewController.P2(this, rd0.e.b(((TrendViewDelegate) this.f99780a0.getValue()).r()), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CandleStickGraphDelegate) this.c0.getValue()).d), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f277456b.e.f121375b), new d6j.d(this, continuation, i2), 3);
        ViewController.P2(this, rd0.e.b(((LargeActionButtonDelegate) r06.getValue()).d.f121375b), new l(this, null), 3);
        ViewController.P2(this, new cbf.c(rd0.e.b(this.O.d), 27), new d6j.f(this, continuation, i2), 3);
        r rVarFilter2 = this.V.f52538c.filter(new d2i.a(new d27.d0(29), 14));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter2), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53218h), new n(this, null), 3);
    }

    @Override // f1h.f
    /* JADX INFO: renamed from: c, reason: from getter */
    public final RowDelegate getS() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // m1d.b
    public final Flow c1() {
        return rd0.e.b(((LargeActionButtonDelegate) this.f99784h0.getValue()).d.f121375b);
    }

    @Override // m1d.b
    public final vkm.d d0() {
        return rd0.e.b(this.R.f52707c);
    }

    public final u5j.a d3() {
        ViewBinding value = this.g0.getValue(this, p0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u5j.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d6j.r h3() {
        return (d6j.r) this.l0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF0() {
        return this.L;
    }

    @Override // h1h.f
    /* JADX INFO: renamed from: j0, reason: from getter */
    public final ListSubheaderDelegate getT() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f99786n0.getValue();
    }

    @Override // fsl.o
    public final vkm.d k0() {
        return rd0.e.b(this.R.f52707c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // z0h.s1
    public final vkm.d r() {
        return rd0.e.b(((TextDelegate) this.f0.getValue()).d);
    }

    @Override // pcj.e
    public final r s1() {
        return this.T.e.f121375b;
    }

    @Override // pcj.e
    public final r w0() {
        return this.R.f52707c;
    }

    @Override // m1d.b
    public final Flow x() {
        return i.f290039a;
    }
}
