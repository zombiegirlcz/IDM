package com.revolut.feature.rev_points.impl.ui.learn;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardInnerRecyclerItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardLoadingItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardsHeaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.learn.RevPointsLearnScreen;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mta.c;
import mzb.e;
import mzb.f;
import mzb.g;
import mzb.i;
import pki.b;
import vc.s;
import z4l.j;
import zhm.v;
import zxb.n;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/learn/RevPointsLearnScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lmzb/j;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsLearnScreen extends ViewController<q> implements w {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(RevPointsLearnScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsLearnBinding;", 0))};
    public final FullScreenStateDelegate K;
    public final SwipeableCardInnerRecyclerItemDelegate L;
    public final j M;
    public final int N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public RevPointsLearnScreen(RevPointsLearnScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.K = fullScreenStateDelegate;
        SwipeableCardLoadingItemDelegate swipeableCardLoadingItemDelegate = new SwipeableCardLoadingItemDelegate();
        final int i = 0;
        final int i2 = 1;
        SwipeableCardInnerRecyclerItemDelegate swipeableCardInnerRecyclerItemDelegate = new SwipeableCardInnerRecyclerItemDelegate(v.k(new PlainTextDelegate(), new TextDelegate(), new SimpleMediaDelegate(), fullScreenStateDelegate, new SwipeableCardsHeaderDelegate()));
        this.L = swipeableCardInnerRecyclerItemDelegate;
        this.M = new j(7, v.k(swipeableCardLoadingItemDelegate, swipeableCardInnerRecyclerItemDelegate), false);
        this.N = R$layout.screen_rev_points_learn;
        this.O = te0.w.y0(new Function0(this) { // from class: mzb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsLearnScreen f210748b;

            {
                this.f210748b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                RevPointsLearnScreen revPointsLearnScreen = this.f210748b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsLearnScreen.S;
                        return n14.e.a(revPointsLearnScreen, (i) revPointsLearnScreen.R.getValue());
                    default:
                        KProperty[] kPropertyArr2 = RevPointsLearnScreen.S;
                        return (i) ((n) revPointsLearnScreen.Q.getValue()).f326227c.get();
                }
            }
        });
        this.P = s.t(this, f.f);
        this.Q = te0.w.y0(new e(this, inputData, i));
        this.R = te0.w.y0(new Function0(this) { // from class: mzb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsLearnScreen f210748b;

            {
                this.f210748b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                RevPointsLearnScreen revPointsLearnScreen = this.f210748b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsLearnScreen.S;
                        return n14.e.a(revPointsLearnScreen, (i) revPointsLearnScreen.R.getValue());
                    default:
                        KProperty[] kPropertyArr2 = RevPointsLearnScreen.S;
                        return (i) ((n) revPointsLearnScreen.Q.getValue()).f326227c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        mzb.j uiState = (mzb.j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        this.M.c(uiState.f210753a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (n) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (i) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((wxb.e) value).f300818b.setAdapter(this.M);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        a.g2(this, rd0.e.b(((wxb.e) value).f300818b.f0()), null, new c(this, continuation, 6), 3);
        a.g2(this, rd0.e.b(this.K.f52371h.f121375b), null, new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.e.f121375b), new mx5.g(this, continuation, 9), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.O.getValue();
    }
}
