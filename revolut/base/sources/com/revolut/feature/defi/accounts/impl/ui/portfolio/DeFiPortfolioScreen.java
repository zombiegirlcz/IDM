package com.revolut.feature.defi.accounts.impl.ui.portfolio;

import a08.e;
import a26.b;
import a26.d;
import aii.q;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ash.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.defi.accounts.impl.ui.portfolio.DeFiPortfolioScreen;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dli.c;
import efm.r;
import ihm.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rp0.l0;
import ut5.l;
import vc.s;
import xv0.w;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/accounts/impl/ui/portfolio/DeFiPortfolioScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "La26/e;", "Lut5/l;", "Lash/j;", "feature_defi_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiPortfolioScreen extends ViewController<q> implements a, l, j {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(DeFiPortfolioScreen.class, "binding", "getBinding()Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0))};
    public final w K;
    public final RowDelegate L;
    public final LargeActionButtonDelegate M;
    public final SingleChoiceDelegate N;
    public final ListSubheaderDelegate O;
    public final FooterTextDelegate P;
    public final h Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final int W;

    public DeFiPortfolioScreen(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.K = new w(new e(1, v0.a.d("create(...)"), f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 3), null);
        this.L = new RowDelegate(null, null, 7);
        this.M = new LargeActionButtonDelegate();
        this.N = new SingleChoiceDelegate();
        this.O = new ListSubheaderDelegate();
        this.P = new FooterTextDelegate();
        this.Q = s.t(this, b.f);
        final int i = 0;
        this.R = te0.w.y0(new Function0(this) { // from class: a26.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiPortfolioScreen f669b;

            {
                this.f669b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeFiPortfolioScreen deFiPortfolioScreen = this.f669b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiPortfolioScreen.X;
                        return (l0) ((n16.d) ((b26.a) deFiPortfolioScreen.U.getValue())).f211263h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiPortfolioScreen.X;
                        return (d) ((n16.d) ((b26.a) deFiPortfolioScreen.U.getValue())).f211269q.get();
                    default:
                        KProperty[] kPropertyArr3 = DeFiPortfolioScreen.X;
                        DeFiPortfolioScreen deFiPortfolioScreen2 = this.f669b;
                        return dli.f.a(deFiPortfolioScreen2, (d) deFiPortfolioScreen2.T.getValue(), v.k(new FullScreenStateDelegate(), deFiPortfolioScreen2.L, deFiPortfolioScreen2.M, deFiPortfolioScreen2.O, new RowLoadingDelegate(), deFiPortfolioScreen2.P), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.S = te0.w.y0(new a08.b(12));
        final int i2 = 1;
        this.T = te0.w.y0(new Function0(this) { // from class: a26.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiPortfolioScreen f669b;

            {
                this.f669b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeFiPortfolioScreen deFiPortfolioScreen = this.f669b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiPortfolioScreen.X;
                        return (l0) ((n16.d) ((b26.a) deFiPortfolioScreen.U.getValue())).f211263h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiPortfolioScreen.X;
                        return (d) ((n16.d) ((b26.a) deFiPortfolioScreen.U.getValue())).f211269q.get();
                    default:
                        KProperty[] kPropertyArr3 = DeFiPortfolioScreen.X;
                        DeFiPortfolioScreen deFiPortfolioScreen2 = this.f669b;
                        return dli.f.a(deFiPortfolioScreen2, (d) deFiPortfolioScreen2.T.getValue(), v.k(new FullScreenStateDelegate(), deFiPortfolioScreen2.L, deFiPortfolioScreen2.M, deFiPortfolioScreen2.O, new RowLoadingDelegate(), deFiPortfolioScreen2.P), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.U = te0.w.y0(new a07.b(this, accountId, 2));
        final int i3 = 2;
        this.V = te0.w.y0(new Function0(this) { // from class: a26.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiPortfolioScreen f669b;

            {
                this.f669b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeFiPortfolioScreen deFiPortfolioScreen = this.f669b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiPortfolioScreen.X;
                        return (l0) ((n16.d) ((b26.a) deFiPortfolioScreen.U.getValue())).f211263h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiPortfolioScreen.X;
                        return (d) ((n16.d) ((b26.a) deFiPortfolioScreen.U.getValue())).f211269q.get();
                    default:
                        KProperty[] kPropertyArr3 = DeFiPortfolioScreen.X;
                        DeFiPortfolioScreen deFiPortfolioScreen2 = this.f669b;
                        return dli.f.a(deFiPortfolioScreen2, (d) deFiPortfolioScreen2.T.getValue(), v.k(new FullScreenStateDelegate(), deFiPortfolioScreen2.L, deFiPortfolioScreen2.M, deFiPortfolioScreen2.O, new RowLoadingDelegate(), deFiPortfolioScreen2.P), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.W = R$layout.screen_recycler_view;
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((a26.e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b26.a) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.T.getValue();
    }

    @Override // ut5.l
    public final r S() {
        return this.M.d.f121375b;
    }

    @Override // ut5.l
    public final r T() {
        return this.L.f53218h;
    }

    @Override // ut5.l
    public final f W1() {
        return this.L.f53227t;
    }

    @Override // ut5.l
    public final r Y() {
        return this.N.p();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((n16.d) ((b26.a) this.U.getValue())).f.get()).d(v.k(this.N, this.M));
        ViewBinding value = this.Q.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView recyclerView = ((pji.a) value).f236787b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        this.K.b(recyclerView);
        tw0.l0 p2 = getP();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.recyclerkit.delegates.DiffAdapter");
        tw0.l0.k(p2, recyclerView, (koi.h) adapter, (l0) this.R.getValue());
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        knm.b.v(boh.f.p(context), recyclerView);
        recyclerView.setClipToPadding(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        this.K.c();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.P.e.f121375b), new a07.d(this, null, 4), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ash.j
    /* JADX INFO: renamed from: e1 */
    public final tw0.l0 getP() {
        return (tw0.l0) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.V.getValue();
    }

    @Override // ut5.l
    public final r t() {
        r rVarEmpty = r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ash.j
    public final f t0() {
        return ((l0) this.R.getValue()).f256113c;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ash.j
    public final void z1(String anchorItemId, mw0.a menu) {
        Intrinsics.checkNotNullParameter(anchorItemId, "anchorItemId");
        Intrinsics.checkNotNullParameter(menu, "menu");
        ((l0) this.R.getValue()).e(anchorItemId, menu, mw0.o.VIEW_BOUNDS, new mw0.l(false));
    }
}
