package com.revolut.feature.rev_points.impl.ui.wrapped.cards;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardCoverHeaderDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardCoverItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardInnerRecyclerItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardLoadingItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardsHeaderDelegate;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.wrapped.cards.RevPointsWrappedCardsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import eq8.b;
import f1c.i;
import f1c.k;
import f1c.n;
import f1c.r;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.a;
import vc.s;
import wxb.p;
import xki.e;
import z4l.j;
import zhm.v;
import zxb.c0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/wrapped/cards/RevPointsWrappedCardsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lf1c/n;", "Lcli/w;", "Lf1c/s;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsWrappedCardsScreen extends ViewController<n> implements w {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(RevPointsWrappedCardsScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsWrappedCardsBinding;", 0))};
    public final int K;
    public final FullScreenStateDelegate L;
    public final InputChecklistDelegate M;
    public final SwipeableCardCoverItemDelegate N;
    public final SwipeableCardInnerRecyclerItemDelegate O;
    public final j P;
    public final int Q;
    public final Object R;
    public final h S;
    public final Object T;
    public final Object U;

    public RevPointsWrappedCardsScreen(RevPointsWrappedCardsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$style.UiKitTheme_Night;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.L = fullScreenStateDelegate;
        SwipeableCardLoadingItemDelegate swipeableCardLoadingItemDelegate = new SwipeableCardLoadingItemDelegate();
        InputChecklistDelegate inputChecklistDelegate = new InputChecklistDelegate();
        this.M = inputChecklistDelegate;
        SwipeableCardCoverItemDelegate swipeableCardCoverItemDelegate = new SwipeableCardCoverItemDelegate();
        this.N = swipeableCardCoverItemDelegate;
        final int i = 0;
        final int i2 = 1;
        SwipeableCardInnerRecyclerItemDelegate swipeableCardInnerRecyclerItemDelegate = new SwipeableCardInnerRecyclerItemDelegate(v.k(fullScreenStateDelegate, inputChecklistDelegate, new SwipeableCardsHeaderDelegate(), new SwipeableCardCoverHeaderDelegate(), new RowDelegate(null, null, 7)));
        this.O = swipeableCardInnerRecyclerItemDelegate;
        this.P = new j(7, v.k(swipeableCardLoadingItemDelegate, swipeableCardInnerRecyclerItemDelegate, swipeableCardCoverItemDelegate), false);
        this.Q = R$layout.screen_rev_points_wrapped_cards;
        this.R = te0.w.y0(new Function0(this) { // from class: f1c.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsWrappedCardsScreen f131242b;

            {
                this.f131242b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                RevPointsWrappedCardsScreen revPointsWrappedCardsScreen = this.f131242b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsWrappedCardsScreen.V;
                        return n14.e.a(revPointsWrappedCardsScreen, revPointsWrappedCardsScreen.R2());
                    default:
                        KProperty[] kPropertyArr2 = RevPointsWrappedCardsScreen.V;
                        return (r) ((c0) revPointsWrappedCardsScreen.T.getValue()).e.get();
                }
            }
        });
        this.S = s.t(this, f1c.h.f);
        this.T = te0.w.y0(new b(this, inputData, 20));
        this.U = te0.w.y0(new Function0(this) { // from class: f1c.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsWrappedCardsScreen f131242b;

            {
                this.f131242b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                RevPointsWrappedCardsScreen revPointsWrappedCardsScreen = this.f131242b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsWrappedCardsScreen.V;
                        return n14.e.a(revPointsWrappedCardsScreen, revPointsWrappedCardsScreen.R2());
                    default:
                        KProperty[] kPropertyArr2 = RevPointsWrappedCardsScreen.V;
                        return (r) ((c0) revPointsWrappedCardsScreen.T.getValue()).e.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.K);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f1c.s uiState = (f1c.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        this.P.c(uiState.f131250a);
        Integer num = uiState.f131251b;
        if (num != null) {
            d3().f300847b.setCurrentItem(num.intValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f300847b.setAdapter(this.P);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f300847b.f0()), new ev7.b(this, continuation, 11), 3);
        ViewController.P2(this, rd0.e.b(d3().f300847b.g0()), new i(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new f1c.j(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52518c), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.e.f121375b), new i(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.e.f121375b), new i(this, continuation, 2), 3);
    }

    public final p d3() {
        ViewBinding value = this.S.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r R2() {
        return (r) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final a k() {
        return (a0) this.R.getValue();
    }
}
