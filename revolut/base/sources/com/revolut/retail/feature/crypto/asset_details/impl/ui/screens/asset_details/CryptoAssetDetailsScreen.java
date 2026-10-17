package com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details;

import a9j.w;
import android.view.View;
import aw0.o9;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate;
import com.revolut.core.ui_kit.delegates.CellWithLinearGaugeDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewProductSmallDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.NewsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SimpleActionHeaderDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.delegates.airtip.AirTipDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.crypto.asset_details.api.R$string;
import com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreenContract$InputData;
import d9j.f;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import no.k;
import pt5.r;
import u6h.h;
import u7k.f0;
import u8j.b;
import u8j.d;
import u8j.e;
import x8j.o;
import y8j.c;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/asset_details/CryptoAssetDetailsScreen;", "Lcom/revolut/retail/feature/crypto/asset_details/common/api/ui/BaseCryptoAssetDetailsScreen;", "Lu8j/b;", "Lu8j/d;", "Lu8j/e;", "La9j/w;", "Lg9j/d;", "Ly8j/c;", "Lt8j/e;", "Lm1d/b;", "Ld9j/f;", "Le5d/d;", "Lpt5/r;", "Lx8j/o;", "Lbq6/b;", "Lno/k;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoAssetDetailsScreen extends BaseCryptoAssetDetailsScreen<b, d> implements e, w, g9j.d, c, t8j.e, m1d.b, f, e5d.d, r, o, bq6.b, k {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f99949w0 = 0;
    public final CryptoAssetDetailsScreenContract$InputData Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f99950a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f99951b0;
    public final TextClause c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f99952d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f99953e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f99954h0;
    public final Object i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final NewProductSmallDelegate f99955k0;
    public final SmallStockCardDelegate l0;
    public final AppTipDelegate m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final AirTipDelegate f99956n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final ActionWidgetDelegate f99957o0;
    public final SmallCardDelegate p0;
    public final SmallActionButtonDelegate q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ActionCardDelegate f99958r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final SimpleActionHeaderDelegate f99959s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ScrollerDelegate f99960t0;
    public final Object u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public AnalyticsContext f99961v0;

    public CryptoAssetDetailsScreen(CryptoAssetDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Z = inputData;
        final int i = 0;
        this.f99950a0 = te0.w.y0(new Function0(this) { // from class: u8j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAssetDetailsScreen f278222b;

            {
                this.f278222b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoAssetDetailsScreen cryptoAssetDetailsScreen = this.f278222b;
                switch (i2) {
                    case 0:
                        int i3 = CryptoAssetDetailsScreen.f99949w0;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoAssetDetailsScreen.m2()).a().get(t7j.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t7j.a.class, " is not found"));
                        }
                        q8j.c cVar = ((q8j.c) aVar2.b()).M;
                        CryptoAssetDetailsScreenContract$InputData cryptoAssetDetailsScreenContract$InputData = cryptoAssetDetailsScreen.Z;
                        cryptoAssetDetailsScreenContract$InputData.getClass();
                        return new q8j.e(cVar, cryptoAssetDetailsScreen, cryptoAssetDetailsScreenContract$InputData);
                    case 1:
                        int i5 = CryptoAssetDetailsScreen.f99949w0;
                        return (c) ((q8j.e) cryptoAssetDetailsScreen.f99950a0.getValue()).f243112e0.get();
                    case 2:
                        int i6 = CryptoAssetDetailsScreen.f99949w0;
                        return (j60.a) ((q8j.e) cryptoAssetDetailsScreen.f99950a0.getValue()).f243124w.get();
                    case 3:
                        int i21 = CryptoAssetDetailsScreen.f99949w0;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_open, null, null, 14);
                        TextClause textClause = cryptoAssetDetailsScreen.c0;
                        return new CandleStickGraphDelegate(yoj.b.w(textLocalisedClause, textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_close, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_high, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_low, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_volume, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_change, null, null, 14), textClause));
                    default:
                        int i22 = CryptoAssetDetailsScreen.f99949w0;
                        return v.k(new CellWithLinearGaugeDelegate(), (CandleStickGraphDelegate) cryptoAssetDetailsScreen.f0.getValue(), (LargeActionButtonDelegate) cryptoAssetDetailsScreen.f99954h0.getValue(), cryptoAssetDetailsScreen.f99960t0, (FullScreenStateDelegate) cryptoAssetDetailsScreen.j0.getValue(), cryptoAssetDetailsScreen.f99955k0, cryptoAssetDetailsScreen.m0, cryptoAssetDetailsScreen.f99956n0, cryptoAssetDetailsScreen.f99957o0, cryptoAssetDetailsScreen.q0, cryptoAssetDetailsScreen.f99959s0);
                }
            }
        });
        final int i2 = 1;
        this.f99951b0 = te0.w.y0(new Function0(this) { // from class: u8j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAssetDetailsScreen f278222b;

            {
                this.f278222b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoAssetDetailsScreen cryptoAssetDetailsScreen = this.f278222b;
                switch (i22) {
                    case 0:
                        int i3 = CryptoAssetDetailsScreen.f99949w0;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoAssetDetailsScreen.m2()).a().get(t7j.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t7j.a.class, " is not found"));
                        }
                        q8j.c cVar = ((q8j.c) aVar2.b()).M;
                        CryptoAssetDetailsScreenContract$InputData cryptoAssetDetailsScreenContract$InputData = cryptoAssetDetailsScreen.Z;
                        cryptoAssetDetailsScreenContract$InputData.getClass();
                        return new q8j.e(cVar, cryptoAssetDetailsScreen, cryptoAssetDetailsScreenContract$InputData);
                    case 1:
                        int i5 = CryptoAssetDetailsScreen.f99949w0;
                        return (c) ((q8j.e) cryptoAssetDetailsScreen.f99950a0.getValue()).f243112e0.get();
                    case 2:
                        int i6 = CryptoAssetDetailsScreen.f99949w0;
                        return (j60.a) ((q8j.e) cryptoAssetDetailsScreen.f99950a0.getValue()).f243124w.get();
                    case 3:
                        int i21 = CryptoAssetDetailsScreen.f99949w0;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_open, null, null, 14);
                        TextClause textClause = cryptoAssetDetailsScreen.c0;
                        return new CandleStickGraphDelegate(yoj.b.w(textLocalisedClause, textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_close, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_high, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_low, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_volume, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_change, null, null, 14), textClause));
                    default:
                        int i222 = CryptoAssetDetailsScreen.f99949w0;
                        return v.k(new CellWithLinearGaugeDelegate(), (CandleStickGraphDelegate) cryptoAssetDetailsScreen.f0.getValue(), (LargeActionButtonDelegate) cryptoAssetDetailsScreen.f99954h0.getValue(), cryptoAssetDetailsScreen.f99960t0, (FullScreenStateDelegate) cryptoAssetDetailsScreen.j0.getValue(), cryptoAssetDetailsScreen.f99955k0, cryptoAssetDetailsScreen.m0, cryptoAssetDetailsScreen.f99956n0, cryptoAssetDetailsScreen.f99957o0, cryptoAssetDetailsScreen.q0, cryptoAssetDetailsScreen.f99959s0);
                }
            }
        });
        this.c0 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        final int i3 = 2;
        this.f99952d0 = te0.w.y0(new Function0(this) { // from class: u8j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAssetDetailsScreen f278222b;

            {
                this.f278222b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoAssetDetailsScreen cryptoAssetDetailsScreen = this.f278222b;
                switch (i22) {
                    case 0:
                        int i32 = CryptoAssetDetailsScreen.f99949w0;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoAssetDetailsScreen.m2()).a().get(t7j.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t7j.a.class, " is not found"));
                        }
                        q8j.c cVar = ((q8j.c) aVar2.b()).M;
                        CryptoAssetDetailsScreenContract$InputData cryptoAssetDetailsScreenContract$InputData = cryptoAssetDetailsScreen.Z;
                        cryptoAssetDetailsScreenContract$InputData.getClass();
                        return new q8j.e(cVar, cryptoAssetDetailsScreen, cryptoAssetDetailsScreenContract$InputData);
                    case 1:
                        int i5 = CryptoAssetDetailsScreen.f99949w0;
                        return (c) ((q8j.e) cryptoAssetDetailsScreen.f99950a0.getValue()).f243112e0.get();
                    case 2:
                        int i6 = CryptoAssetDetailsScreen.f99949w0;
                        return (j60.a) ((q8j.e) cryptoAssetDetailsScreen.f99950a0.getValue()).f243124w.get();
                    case 3:
                        int i21 = CryptoAssetDetailsScreen.f99949w0;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_open, null, null, 14);
                        TextClause textClause = cryptoAssetDetailsScreen.c0;
                        return new CandleStickGraphDelegate(yoj.b.w(textLocalisedClause, textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_close, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_high, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_low, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_volume, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_change, null, null, 14), textClause));
                    default:
                        int i222 = CryptoAssetDetailsScreen.f99949w0;
                        return v.k(new CellWithLinearGaugeDelegate(), (CandleStickGraphDelegate) cryptoAssetDetailsScreen.f0.getValue(), (LargeActionButtonDelegate) cryptoAssetDetailsScreen.f99954h0.getValue(), cryptoAssetDetailsScreen.f99960t0, (FullScreenStateDelegate) cryptoAssetDetailsScreen.j0.getValue(), cryptoAssetDetailsScreen.f99955k0, cryptoAssetDetailsScreen.m0, cryptoAssetDetailsScreen.f99956n0, cryptoAssetDetailsScreen.f99957o0, cryptoAssetDetailsScreen.q0, cryptoAssetDetailsScreen.f99959s0);
                }
            }
        });
        this.f99953e0 = te0.w.y0(new h(10));
        final int i5 = 3;
        this.f0 = te0.w.y0(new Function0(this) { // from class: u8j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAssetDetailsScreen f278222b;

            {
                this.f278222b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CryptoAssetDetailsScreen cryptoAssetDetailsScreen = this.f278222b;
                switch (i22) {
                    case 0:
                        int i32 = CryptoAssetDetailsScreen.f99949w0;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoAssetDetailsScreen.m2()).a().get(t7j.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t7j.a.class, " is not found"));
                        }
                        q8j.c cVar = ((q8j.c) aVar2.b()).M;
                        CryptoAssetDetailsScreenContract$InputData cryptoAssetDetailsScreenContract$InputData = cryptoAssetDetailsScreen.Z;
                        cryptoAssetDetailsScreenContract$InputData.getClass();
                        return new q8j.e(cVar, cryptoAssetDetailsScreen, cryptoAssetDetailsScreenContract$InputData);
                    case 1:
                        int i59 = CryptoAssetDetailsScreen.f99949w0;
                        return (c) ((q8j.e) cryptoAssetDetailsScreen.f99950a0.getValue()).f243112e0.get();
                    case 2:
                        int i6 = CryptoAssetDetailsScreen.f99949w0;
                        return (j60.a) ((q8j.e) cryptoAssetDetailsScreen.f99950a0.getValue()).f243124w.get();
                    case 3:
                        int i21 = CryptoAssetDetailsScreen.f99949w0;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_open, null, null, 14);
                        TextClause textClause = cryptoAssetDetailsScreen.c0;
                        return new CandleStickGraphDelegate(yoj.b.w(textLocalisedClause, textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_close, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_high, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_low, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_volume, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_change, null, null, 14), textClause));
                    default:
                        int i222 = CryptoAssetDetailsScreen.f99949w0;
                        return v.k(new CellWithLinearGaugeDelegate(), (CandleStickGraphDelegate) cryptoAssetDetailsScreen.f0.getValue(), (LargeActionButtonDelegate) cryptoAssetDetailsScreen.f99954h0.getValue(), cryptoAssetDetailsScreen.f99960t0, (FullScreenStateDelegate) cryptoAssetDetailsScreen.j0.getValue(), cryptoAssetDetailsScreen.f99955k0, cryptoAssetDetailsScreen.m0, cryptoAssetDetailsScreen.f99956n0, cryptoAssetDetailsScreen.f99957o0, cryptoAssetDetailsScreen.q0, cryptoAssetDetailsScreen.f99959s0);
                }
            }
        });
        this.g0 = te0.w.y0(new h(11));
        this.f99954h0 = te0.w.y0(new h(12));
        Lazy lazyY0 = te0.w.y0(new h(13));
        this.i0 = lazyY0;
        this.j0 = te0.w.y0(new h(14));
        this.f99955k0 = new NewProductSmallDelegate();
        SmallStockCardDelegate smallStockCardDelegate = new SmallStockCardDelegate();
        this.l0 = smallStockCardDelegate;
        this.m0 = new AppTipDelegate();
        this.f99956n0 = new AirTipDelegate();
        this.f99957o0 = new ActionWidgetDelegate();
        SmallCardDelegate smallCardDelegate = new SmallCardDelegate(null);
        this.p0 = smallCardDelegate;
        this.q0 = new SmallActionButtonDelegate();
        ActionCardDelegate actionCardDelegate = new ActionCardDelegate();
        this.f99958r0 = actionCardDelegate;
        this.f99959s0 = new SimpleActionHeaderDelegate();
        final int i6 = 4;
        this.f99960t0 = new ScrollerDelegate(v.k((NewsDelegate) lazyY0.getValue(), new NewsLoadingDelegate(), smallStockCardDelegate, smallCardDelegate, new SmallCardLoadingDelegate(null), actionCardDelegate), false);
        this.u0 = te0.w.y0(new Function0(this) { // from class: u8j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAssetDetailsScreen f278222b;

            {
                this.f278222b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CryptoAssetDetailsScreen cryptoAssetDetailsScreen = this.f278222b;
                switch (i22) {
                    case 0:
                        int i32 = CryptoAssetDetailsScreen.f99949w0;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoAssetDetailsScreen.m2()).a().get(t7j.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t7j.a.class, " is not found"));
                        }
                        q8j.c cVar = ((q8j.c) aVar2.b()).M;
                        CryptoAssetDetailsScreenContract$InputData cryptoAssetDetailsScreenContract$InputData = cryptoAssetDetailsScreen.Z;
                        cryptoAssetDetailsScreenContract$InputData.getClass();
                        return new q8j.e(cVar, cryptoAssetDetailsScreen, cryptoAssetDetailsScreenContract$InputData);
                    case 1:
                        int i59 = CryptoAssetDetailsScreen.f99949w0;
                        return (c) ((q8j.e) cryptoAssetDetailsScreen.f99950a0.getValue()).f243112e0.get();
                    case 2:
                        int i66 = CryptoAssetDetailsScreen.f99949w0;
                        return (j60.a) ((q8j.e) cryptoAssetDetailsScreen.f99950a0.getValue()).f243124w.get();
                    case 3:
                        int i21 = CryptoAssetDetailsScreen.f99949w0;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_open, null, null, 14);
                        TextClause textClause = cryptoAssetDetailsScreen.c0;
                        return new CandleStickGraphDelegate(yoj.b.w(textLocalisedClause, textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_close, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_high, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_low, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_volume, null, null, 14), textClause), yoj.b.w(new TextLocalisedClause(R$string.crypto_asset_details_chart_candlestick_tooltip_change, null, null, 14), textClause));
                    default:
                        int i222 = CryptoAssetDetailsScreen.f99949w0;
                        return v.k(new CellWithLinearGaugeDelegate(), (CandleStickGraphDelegate) cryptoAssetDetailsScreen.f0.getValue(), (LargeActionButtonDelegate) cryptoAssetDetailsScreen.f99954h0.getValue(), cryptoAssetDetailsScreen.f99960t0, (FullScreenStateDelegate) cryptoAssetDetailsScreen.j0.getValue(), cryptoAssetDetailsScreen.f99955k0, cryptoAssetDetailsScreen.m0, cryptoAssetDetailsScreen.f99956n0, cryptoAssetDetailsScreen.f99957o0, cryptoAssetDetailsScreen.q0, cryptoAssetDetailsScreen.f99959s0);
                }
            }
        });
    }

    @Override // com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen, cli.w
    public final void B(cli.o oVar, q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.B(uiState, qVar);
        e3().f320023c.setMenuItems(uiState.f278238b);
        this.f99961v0 = uiState.f278241h;
    }

    @Override // e5d.d
    /* JADX INFO: renamed from: I0, reason: from getter */
    public final AirTipDelegate getF87535n0() {
        return this.f99956n0;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f99961v0 = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // x8j.o
    public final Flow N1() {
        return rd0.e.b(((LargeActionButtonDelegate) this.f99953e0.getValue()).d.f121375b);
    }

    @Override // e5d.d
    public final ScreenContentRecyclerView O() {
        ScreenContentRecyclerView cryptoAssetDetailsRecycler = e3().d;
        Intrinsics.checkNotNullExpressionValue(cryptoAssetDetailsRecycler, "cryptoAssetDetailsRecycler");
        return cryptoAssetDetailsRecycler;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (q8j.e) this.f99950a0.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getG0() {
        return this.f99961v0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (u8j.c) this.f99951b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pt5.r
    public final efm.r S() {
        return ((LargeActionButtonDelegate) this.f99954h0.getValue()).d.f121375b;
    }

    @Override // x8j.o
    public final Flow S1() {
        return rd0.e.b(e3().f320022b.e.f121375b);
    }

    @Override // pt5.r
    public final efm.r T() {
        return rd0.e.c(rd0.e.b(c().f53218h), g.f186406a);
    }

    @Override // pt5.r
    public final efm.r U() {
        return j0().f52707c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        ((j60.a) this.f99952d0.getValue()).d(v.k((LargeActionButtonDelegate) this.f99953e0.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), new TwinHorizontalButtonDelegate(), new RowDelegate(null, null, 7)));
    }

    @Override // com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen, com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.b3(view);
        ViewController.P2(this, rd0.e.b(e3().f320023c.o.f57403b), new f0(this, null, 9), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen, m1d.b
    public final RowDelegate c() {
        return (RowDelegate) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // m1d.b
    public final Flow c1() {
        return rd0.e.b(((LargeActionButtonDelegate) this.f99954h0.getValue()).d.f121375b);
    }

    @Override // m1d.b
    public final vkm.d d0() {
        return rd0.e.b(j0().f52707c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen
    /* JADX INFO: renamed from: d3 */
    public final List getC0() {
        return (List) this.u0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen
    public final d8j.f f3() {
        return (u8j.c) this.f99951b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pt5.r
    public final efm.r h0() {
        return ((FixedTabsDelegate) this.N.getValue()).f52339c.f121375b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pt5.r
    public final efm.r i0() {
        return ((FullScreenStateDelegate) this.j0.getValue()).f52371h.f121375b;
    }

    @Override // com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen
    /* JADX INFO: renamed from: i3 */
    public final void B(d8j.g gVar, Object obj2) {
        d uiState = (d) gVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.B(uiState, obj2);
        e3().f320023c.setMenuItems(uiState.f278238b);
        this.f99961v0 = uiState.f278241h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pt5.r
    public final efm.r j1() {
        efm.r map = ((SwipeToActionDelegate) this.U.getValue()).f.map(new u3a.q(new u8c.c(6), 22));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // m1d.b
    public final Flow x() {
        return rd0.e.b(((SwipeToActionDelegate) this.U.getValue()).f);
    }
}
