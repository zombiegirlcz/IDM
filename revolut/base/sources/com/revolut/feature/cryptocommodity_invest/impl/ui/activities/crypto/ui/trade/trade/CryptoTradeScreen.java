package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade;

import android.view.View;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ActionCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.AvatarLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeVoucherLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeVoucherTileDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.CryptoTradeFlowContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.CryptoTradeScreen;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import iw5.j;
import ix5.f;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import my5.c;
import oqj.d;
import ox5.a0;
import ox5.b0;
import ox5.n;
import ox5.p;
import ox5.s;
import ox5.t;
import ox5.u;
import ox5.v;
import ox5.x;
import ox5.y;
import ox5.z;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/crypto/ui/trade/trade/CryptoTradeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liw5/a;", "Ldli/a;", "Lox5/o;", "", "Lmy5/c;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoTradeScreen extends ViewController<iw5.a> implements dli.a, c {
    public static final /* synthetic */ int g0 = 0;
    public final CryptoTradeFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Lazy Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f71562a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f71563b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f71564d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f71565e0;
    public final int f0;

    public CryptoTradeScreen(CryptoTradeFlowContract$InputData flowInputData, j headerMediator) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(headerMediator, "headerMediator");
        this.K = flowInputData;
        this.L = w.y0(new d(29));
        this.M = w.y0(new p(0));
        this.N = w.y0(new p(1));
        this.O = w.y0(new p(2));
        this.P = w.y0(new p(3));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: ox5.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoTradeScreen f230608b;

            {
                this.f230608b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoTradeScreen cryptoTradeScreen = this.f230608b;
                switch (i2) {
                    case 0:
                        return new SwipeToActionDelegate((RowDelegate) cryptoTradeScreen.P.getValue(), false);
                    case 1:
                        return new GridBoxDelegate(zhm.v.k((ReferralContactDelegate) cryptoTradeScreen.M.getValue(), new AvatarLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        return new ScrollerBoxDelegate(zhm.v.k(new LargeVoucherLoadingDelegate(), new LargeVoucherTileDelegate(), (RewardDelegate) cryptoTradeScreen.S.getValue(), (ActionCardDelegate) cryptoTradeScreen.T.getValue()));
                    case 3:
                        return new ScrollerDelegate(zhm.v.k((ActionCardDelegate) cryptoTradeScreen.T.getValue(), new ActionCardLoadingDelegate(), (SmallStockCardDelegate) cryptoTradeScreen.V.getValue(), (SmallCardLoadingDelegate) cryptoTradeScreen.W.getValue()), false);
                    case 4:
                        return (n) ((ix5.f) cryptoTradeScreen.c0.getValue()).o.get();
                    default:
                        CryptoTradeScreen cryptoTradeScreen2 = this.f230608b;
                        return dli.f.a(cryptoTradeScreen2, cryptoTradeScreen2.d(), zhm.v.k((ListSubheaderDelegate) cryptoTradeScreen2.L.getValue(), (ReferralContactDelegate) cryptoTradeScreen2.M.getValue(), (LargeActionButtonDelegate) cryptoTradeScreen2.N.getValue(), (SingleChoiceDelegate) cryptoTradeScreen2.O.getValue(), (FullScreenStateDelegate) cryptoTradeScreen2.Y.getValue(), (SwipeToActionDelegate) cryptoTradeScreen2.Q.getValue(), (RowDelegate) cryptoTradeScreen2.P.getValue(), (SmallStockCardDelegate) cryptoTradeScreen2.V.getValue(), (FixedTabsDelegate) cryptoTradeScreen2.R.getValue(), (ScrollerBoxDelegate) cryptoTradeScreen2.Z.getValue(), (ScrollerDelegate) cryptoTradeScreen2.f71562a0.getValue(), (RewardDelegate) cryptoTradeScreen2.S.getValue(), (GridBoxDelegate) cryptoTradeScreen2.U.getValue(), (RewardsGridDelegate) cryptoTradeScreen2.X.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new FixedTabsLoadingDelegate(), new RewardsGridLoadingDelegate(), new AvatarLoadingDelegate()), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.R = w.y0(new p(4));
        this.S = w.y0(new p(5));
        this.T = w.y0(new p(6));
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: ox5.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoTradeScreen f230608b;

            {
                this.f230608b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoTradeScreen cryptoTradeScreen = this.f230608b;
                switch (i22) {
                    case 0:
                        return new SwipeToActionDelegate((RowDelegate) cryptoTradeScreen.P.getValue(), false);
                    case 1:
                        return new GridBoxDelegate(zhm.v.k((ReferralContactDelegate) cryptoTradeScreen.M.getValue(), new AvatarLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        return new ScrollerBoxDelegate(zhm.v.k(new LargeVoucherLoadingDelegate(), new LargeVoucherTileDelegate(), (RewardDelegate) cryptoTradeScreen.S.getValue(), (ActionCardDelegate) cryptoTradeScreen.T.getValue()));
                    case 3:
                        return new ScrollerDelegate(zhm.v.k((ActionCardDelegate) cryptoTradeScreen.T.getValue(), new ActionCardLoadingDelegate(), (SmallStockCardDelegate) cryptoTradeScreen.V.getValue(), (SmallCardLoadingDelegate) cryptoTradeScreen.W.getValue()), false);
                    case 4:
                        return (n) ((ix5.f) cryptoTradeScreen.c0.getValue()).o.get();
                    default:
                        CryptoTradeScreen cryptoTradeScreen2 = this.f230608b;
                        return dli.f.a(cryptoTradeScreen2, cryptoTradeScreen2.d(), zhm.v.k((ListSubheaderDelegate) cryptoTradeScreen2.L.getValue(), (ReferralContactDelegate) cryptoTradeScreen2.M.getValue(), (LargeActionButtonDelegate) cryptoTradeScreen2.N.getValue(), (SingleChoiceDelegate) cryptoTradeScreen2.O.getValue(), (FullScreenStateDelegate) cryptoTradeScreen2.Y.getValue(), (SwipeToActionDelegate) cryptoTradeScreen2.Q.getValue(), (RowDelegate) cryptoTradeScreen2.P.getValue(), (SmallStockCardDelegate) cryptoTradeScreen2.V.getValue(), (FixedTabsDelegate) cryptoTradeScreen2.R.getValue(), (ScrollerBoxDelegate) cryptoTradeScreen2.Z.getValue(), (ScrollerDelegate) cryptoTradeScreen2.f71562a0.getValue(), (RewardDelegate) cryptoTradeScreen2.S.getValue(), (GridBoxDelegate) cryptoTradeScreen2.U.getValue(), (RewardsGridDelegate) cryptoTradeScreen2.X.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new FixedTabsLoadingDelegate(), new RewardsGridLoadingDelegate(), new AvatarLoadingDelegate()), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.V = w.y0(new p(7));
        this.W = w.y0(new p(8));
        this.X = w.y0(new p(9));
        this.Y = w.y0(new p(10));
        final int i3 = 2;
        this.Z = yhm.j.b(new Function0(this) { // from class: ox5.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoTradeScreen f230608b;

            {
                this.f230608b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoTradeScreen cryptoTradeScreen = this.f230608b;
                switch (i22) {
                    case 0:
                        return new SwipeToActionDelegate((RowDelegate) cryptoTradeScreen.P.getValue(), false);
                    case 1:
                        return new GridBoxDelegate(zhm.v.k((ReferralContactDelegate) cryptoTradeScreen.M.getValue(), new AvatarLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        return new ScrollerBoxDelegate(zhm.v.k(new LargeVoucherLoadingDelegate(), new LargeVoucherTileDelegate(), (RewardDelegate) cryptoTradeScreen.S.getValue(), (ActionCardDelegate) cryptoTradeScreen.T.getValue()));
                    case 3:
                        return new ScrollerDelegate(zhm.v.k((ActionCardDelegate) cryptoTradeScreen.T.getValue(), new ActionCardLoadingDelegate(), (SmallStockCardDelegate) cryptoTradeScreen.V.getValue(), (SmallCardLoadingDelegate) cryptoTradeScreen.W.getValue()), false);
                    case 4:
                        return (n) ((ix5.f) cryptoTradeScreen.c0.getValue()).o.get();
                    default:
                        CryptoTradeScreen cryptoTradeScreen2 = this.f230608b;
                        return dli.f.a(cryptoTradeScreen2, cryptoTradeScreen2.d(), zhm.v.k((ListSubheaderDelegate) cryptoTradeScreen2.L.getValue(), (ReferralContactDelegate) cryptoTradeScreen2.M.getValue(), (LargeActionButtonDelegate) cryptoTradeScreen2.N.getValue(), (SingleChoiceDelegate) cryptoTradeScreen2.O.getValue(), (FullScreenStateDelegate) cryptoTradeScreen2.Y.getValue(), (SwipeToActionDelegate) cryptoTradeScreen2.Q.getValue(), (RowDelegate) cryptoTradeScreen2.P.getValue(), (SmallStockCardDelegate) cryptoTradeScreen2.V.getValue(), (FixedTabsDelegate) cryptoTradeScreen2.R.getValue(), (ScrollerBoxDelegate) cryptoTradeScreen2.Z.getValue(), (ScrollerDelegate) cryptoTradeScreen2.f71562a0.getValue(), (RewardDelegate) cryptoTradeScreen2.S.getValue(), (GridBoxDelegate) cryptoTradeScreen2.U.getValue(), (RewardsGridDelegate) cryptoTradeScreen2.X.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new FixedTabsLoadingDelegate(), new RewardsGridLoadingDelegate(), new AvatarLoadingDelegate()), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        final int i5 = 3;
        this.f71562a0 = w.y0(new Function0(this) { // from class: ox5.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoTradeScreen f230608b;

            {
                this.f230608b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CryptoTradeScreen cryptoTradeScreen = this.f230608b;
                switch (i22) {
                    case 0:
                        return new SwipeToActionDelegate((RowDelegate) cryptoTradeScreen.P.getValue(), false);
                    case 1:
                        return new GridBoxDelegate(zhm.v.k((ReferralContactDelegate) cryptoTradeScreen.M.getValue(), new AvatarLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        return new ScrollerBoxDelegate(zhm.v.k(new LargeVoucherLoadingDelegate(), new LargeVoucherTileDelegate(), (RewardDelegate) cryptoTradeScreen.S.getValue(), (ActionCardDelegate) cryptoTradeScreen.T.getValue()));
                    case 3:
                        return new ScrollerDelegate(zhm.v.k((ActionCardDelegate) cryptoTradeScreen.T.getValue(), new ActionCardLoadingDelegate(), (SmallStockCardDelegate) cryptoTradeScreen.V.getValue(), (SmallCardLoadingDelegate) cryptoTradeScreen.W.getValue()), false);
                    case 4:
                        return (n) ((ix5.f) cryptoTradeScreen.c0.getValue()).o.get();
                    default:
                        CryptoTradeScreen cryptoTradeScreen2 = this.f230608b;
                        return dli.f.a(cryptoTradeScreen2, cryptoTradeScreen2.d(), zhm.v.k((ListSubheaderDelegate) cryptoTradeScreen2.L.getValue(), (ReferralContactDelegate) cryptoTradeScreen2.M.getValue(), (LargeActionButtonDelegate) cryptoTradeScreen2.N.getValue(), (SingleChoiceDelegate) cryptoTradeScreen2.O.getValue(), (FullScreenStateDelegate) cryptoTradeScreen2.Y.getValue(), (SwipeToActionDelegate) cryptoTradeScreen2.Q.getValue(), (RowDelegate) cryptoTradeScreen2.P.getValue(), (SmallStockCardDelegate) cryptoTradeScreen2.V.getValue(), (FixedTabsDelegate) cryptoTradeScreen2.R.getValue(), (ScrollerBoxDelegate) cryptoTradeScreen2.Z.getValue(), (ScrollerDelegate) cryptoTradeScreen2.f71562a0.getValue(), (RewardDelegate) cryptoTradeScreen2.S.getValue(), (GridBoxDelegate) cryptoTradeScreen2.U.getValue(), (RewardsGridDelegate) cryptoTradeScreen2.X.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new FixedTabsLoadingDelegate(), new RewardsGridLoadingDelegate(), new AvatarLoadingDelegate()), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.f71563b0 = R$style.UiKitTheme_Transparent;
        this.c0 = w.y0(new ot1.p(this, headerMediator, 7));
        final int i6 = 4;
        this.f71564d0 = w.y0(new Function0(this) { // from class: ox5.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoTradeScreen f230608b;

            {
                this.f230608b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CryptoTradeScreen cryptoTradeScreen = this.f230608b;
                switch (i22) {
                    case 0:
                        return new SwipeToActionDelegate((RowDelegate) cryptoTradeScreen.P.getValue(), false);
                    case 1:
                        return new GridBoxDelegate(zhm.v.k((ReferralContactDelegate) cryptoTradeScreen.M.getValue(), new AvatarLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        return new ScrollerBoxDelegate(zhm.v.k(new LargeVoucherLoadingDelegate(), new LargeVoucherTileDelegate(), (RewardDelegate) cryptoTradeScreen.S.getValue(), (ActionCardDelegate) cryptoTradeScreen.T.getValue()));
                    case 3:
                        return new ScrollerDelegate(zhm.v.k((ActionCardDelegate) cryptoTradeScreen.T.getValue(), new ActionCardLoadingDelegate(), (SmallStockCardDelegate) cryptoTradeScreen.V.getValue(), (SmallCardLoadingDelegate) cryptoTradeScreen.W.getValue()), false);
                    case 4:
                        return (n) ((ix5.f) cryptoTradeScreen.c0.getValue()).o.get();
                    default:
                        CryptoTradeScreen cryptoTradeScreen2 = this.f230608b;
                        return dli.f.a(cryptoTradeScreen2, cryptoTradeScreen2.d(), zhm.v.k((ListSubheaderDelegate) cryptoTradeScreen2.L.getValue(), (ReferralContactDelegate) cryptoTradeScreen2.M.getValue(), (LargeActionButtonDelegate) cryptoTradeScreen2.N.getValue(), (SingleChoiceDelegate) cryptoTradeScreen2.O.getValue(), (FullScreenStateDelegate) cryptoTradeScreen2.Y.getValue(), (SwipeToActionDelegate) cryptoTradeScreen2.Q.getValue(), (RowDelegate) cryptoTradeScreen2.P.getValue(), (SmallStockCardDelegate) cryptoTradeScreen2.V.getValue(), (FixedTabsDelegate) cryptoTradeScreen2.R.getValue(), (ScrollerBoxDelegate) cryptoTradeScreen2.Z.getValue(), (ScrollerDelegate) cryptoTradeScreen2.f71562a0.getValue(), (RewardDelegate) cryptoTradeScreen2.S.getValue(), (GridBoxDelegate) cryptoTradeScreen2.U.getValue(), (RewardsGridDelegate) cryptoTradeScreen2.X.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new FixedTabsLoadingDelegate(), new RewardsGridLoadingDelegate(), new AvatarLoadingDelegate()), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        final int i21 = 5;
        this.f71565e0 = w.y0(new Function0(this) { // from class: ox5.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoTradeScreen f230608b;

            {
                this.f230608b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                CryptoTradeScreen cryptoTradeScreen = this.f230608b;
                switch (i22) {
                    case 0:
                        return new SwipeToActionDelegate((RowDelegate) cryptoTradeScreen.P.getValue(), false);
                    case 1:
                        return new GridBoxDelegate(zhm.v.k((ReferralContactDelegate) cryptoTradeScreen.M.getValue(), new AvatarLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        return new ScrollerBoxDelegate(zhm.v.k(new LargeVoucherLoadingDelegate(), new LargeVoucherTileDelegate(), (RewardDelegate) cryptoTradeScreen.S.getValue(), (ActionCardDelegate) cryptoTradeScreen.T.getValue()));
                    case 3:
                        return new ScrollerDelegate(zhm.v.k((ActionCardDelegate) cryptoTradeScreen.T.getValue(), new ActionCardLoadingDelegate(), (SmallStockCardDelegate) cryptoTradeScreen.V.getValue(), (SmallCardLoadingDelegate) cryptoTradeScreen.W.getValue()), false);
                    case 4:
                        return (n) ((ix5.f) cryptoTradeScreen.c0.getValue()).o.get();
                    default:
                        CryptoTradeScreen cryptoTradeScreen2 = this.f230608b;
                        return dli.f.a(cryptoTradeScreen2, cryptoTradeScreen2.d(), zhm.v.k((ListSubheaderDelegate) cryptoTradeScreen2.L.getValue(), (ReferralContactDelegate) cryptoTradeScreen2.M.getValue(), (LargeActionButtonDelegate) cryptoTradeScreen2.N.getValue(), (SingleChoiceDelegate) cryptoTradeScreen2.O.getValue(), (FullScreenStateDelegate) cryptoTradeScreen2.Y.getValue(), (SwipeToActionDelegate) cryptoTradeScreen2.Q.getValue(), (RowDelegate) cryptoTradeScreen2.P.getValue(), (SmallStockCardDelegate) cryptoTradeScreen2.V.getValue(), (FixedTabsDelegate) cryptoTradeScreen2.R.getValue(), (ScrollerBoxDelegate) cryptoTradeScreen2.Z.getValue(), (ScrollerDelegate) cryptoTradeScreen2.f71562a0.getValue(), (RewardDelegate) cryptoTradeScreen2.S.getValue(), (GridBoxDelegate) cryptoTradeScreen2.U.getValue(), (RewardsGridDelegate) cryptoTradeScreen2.X.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new FixedTabsLoadingDelegate(), new RewardsGridLoadingDelegate(), new AvatarLoadingDelegate()), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.f0 = R$layout.screen_recycler_view;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getR() {
        return Integer.valueOf(this.f71563b0);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((ox5.o) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // my5.c
    public final r Q0() {
        return ((SingleChoiceDelegate) this.O.getValue()).p();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // my5.c
    public final r U() {
        return ((ListSubheaderDelegate) this.L.getValue()).f52707c;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((RewardDelegate) this.S.getValue()).d), new t(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RewardsGridDelegate) this.X.getValue()).f53209c.d), new u(this, null), 3);
        ViewController.P2(this, rd0.e.b(((SmallStockCardDelegate) this.V.getValue()).f53378c), new v(this, null), 3);
        ViewController.P2(this, rd0.e.b(((ActionCardDelegate) this.T.getValue()).f51572n), new ox5.w(this, null), 3);
        ViewController.P2(this, rd0.e.b(((ReferralContactDelegate) this.M.getValue()).q()), new x(this, null), 3);
        ?? r56 = this.P;
        ViewController.P2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53218h), new y(this, null), 3);
        ViewController.P2(this, rd0.e.b(((SwipeToActionDelegate) this.Q.getValue()).f), new z(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53227t), new a0(this, null), 3);
        ViewController.P2(this, rd0.e.b(((ListSubheaderDelegate) this.L.getValue()).f52707c), new b0(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FixedTabsDelegate) this.R.getValue()).f52339c.f121375b), new ox5.r(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.Y.getValue()).f52371h.f121375b), new s(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.f71564d0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.f0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f71565e0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // my5.c
    public final r x1() {
        return ((LargeActionButtonDelegate) this.N.getValue()).d.f121375b;
    }
}
