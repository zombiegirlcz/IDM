package com.revolut.feature.trading.impl.ui.collections;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.impl.ui.collections.CollectionScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rxe.b;
import s4f.k;
import s4f.l;
import s4f.m;
import te0.w;
import vc.s;
import xki.e;
import xv0.x;
import yhm.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/trading/impl/ui/collections/CollectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ls4f/m;", "Companion", "a", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CollectionScreen extends ViewController<q> implements dli.a {
    public final Lazy K;
    public final Lazy L;
    public final int M;
    public final h N;
    public final LargeActionButtonDelegate O;
    public final ListSubheaderDelegate P;
    public final RowDelegate Q;
    public final RowLoadingDelegate R;
    public final TextDelegate S;
    public final SmallCardDelegate T;
    public final Lazy U;
    public final SwipeToActionDelegate V;
    public final koi.h W;
    public final Object X;
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(CollectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public CollectionScreen(CollectionScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = j.b(new b(this, input, 20));
        final int i = 0;
        this.L = j.b(new Function0(this) { // from class: s4f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CollectionScreen f259844b;

            {
                this.f259844b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CollectionScreen collectionScreen = this.f259844b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CollectionScreen.Y;
                        return (x) ((c4f.c) ((t4f.a) collectionScreen.K.getValue())).f21202l.get();
                    case 1:
                        return new ScrollerDelegate(zhm.u.c(collectionScreen.T), false);
                    default:
                        KProperty[] kPropertyArr2 = CollectionScreen.Y;
                        CollectionScreen collectionScreen2 = this.f259844b;
                        return dli.f.a(collectionScreen2, collectionScreen2.d(), zhm.v.k(collectionScreen2.O, collectionScreen2.P, collectionScreen2.R, (ScrollerDelegate) collectionScreen2.U.getValue(), collectionScreen2.T, collectionScreen2.V, collectionScreen2.S, new FullScreenStateDelegate()), R$id.recyclerView, new ryd.i(collectionScreen2, 24), collectionScreen2.W, null, 32);
                }
            }
        });
        this.M = R$layout.screen_recycler_navbar;
        this.N = s.t(this, s4f.b.f);
        this.O = new LargeActionButtonDelegate();
        this.P = new ListSubheaderDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        this.R = new RowLoadingDelegate();
        this.S = new TextDelegate();
        SmallCardDelegate.INSTANCE.getClass();
        this.T = new SmallCardDelegate(SmallCardDelegate.f53351j);
        final int i2 = 1;
        this.U = j.b(new Function0(this) { // from class: s4f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CollectionScreen f259844b;

            {
                this.f259844b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CollectionScreen collectionScreen = this.f259844b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CollectionScreen.Y;
                        return (x) ((c4f.c) ((t4f.a) collectionScreen.K.getValue())).f21202l.get();
                    case 1:
                        return new ScrollerDelegate(zhm.u.c(collectionScreen.T), false);
                    default:
                        KProperty[] kPropertyArr2 = CollectionScreen.Y;
                        CollectionScreen collectionScreen2 = this.f259844b;
                        return dli.f.a(collectionScreen2, collectionScreen2.d(), zhm.v.k(collectionScreen2.O, collectionScreen2.P, collectionScreen2.R, (ScrollerDelegate) collectionScreen2.U.getValue(), collectionScreen2.T, collectionScreen2.V, collectionScreen2.S, new FullScreenStateDelegate()), R$id.recyclerView, new ryd.i(collectionScreen2, 24), collectionScreen2.W, null, 32);
                }
            }
        });
        this.V = new SwipeToActionDelegate(rowDelegate, false);
        this.W = new koi.h(null, false, false, 7);
        final int i3 = 2;
        this.X = w.y0(new Function0(this) { // from class: s4f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CollectionScreen f259844b;

            {
                this.f259844b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CollectionScreen collectionScreen = this.f259844b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CollectionScreen.Y;
                        return (x) ((c4f.c) ((t4f.a) collectionScreen.K.getValue())).f21202l.get();
                    case 1:
                        return new ScrollerDelegate(zhm.u.c(collectionScreen.T), false);
                    default:
                        KProperty[] kPropertyArr2 = CollectionScreen.Y;
                        CollectionScreen collectionScreen2 = this.f259844b;
                        return dli.f.a(collectionScreen2, collectionScreen2.d(), zhm.v.k(collectionScreen2.O, collectionScreen2.P, collectionScreen2.R, (ScrollerDelegate) collectionScreen2.U.getValue(), collectionScreen2.T, collectionScreen2.V, collectionScreen2.S, new FullScreenStateDelegate()), R$id.recyclerView, new ryd.i(collectionScreen2, 24), collectionScreen2.W, null, 32);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        l lVar = uiState.f259862b;
        boolean z = lVar instanceof k;
        navBarWithToolbar.setLoadingVisible(z);
        if (!(lVar instanceof s4f.j)) {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        s4f.j jVar = (s4f.j) lVar;
        Clause clause = jVar.f259858b;
        TextClause textClause = jVar.f259857a;
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar2, "navBarWithToolbar");
        navBarWithToolbar2.setTitle(textClause, null);
        d3().f174539b.setToolbarTitle(textClause);
        d3().f174539b.setSecondDescriptionVisible(clause != null);
        d3().f174539b.setSecondDescriptionText(clause);
        d3().f174539b.setSearchButtonActive(jVar.f259859c);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t4f.a) this.K.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new s1k.b(this, continuation, 7), 3);
        ViewController.P2(this, t1.d(new ryj.w(rd0.e.b(d3().f174539b.f59409p.f57337m), 9), 300L), new s4f.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(w.a0(this.Q.f53218h, new s4b.e(3))), new s4f.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(w.a0(this.T.d, new s4b.e(4))), new s4f.e(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(w.a0(d3().f174539b.x0(), new s4b.e(5))), new s4f.e(this, continuation, 3), 3);
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        ViewController.P2(this, rd0.e.b(x.c(recyclerView, 7)), new s4f.e(this, continuation, 4), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.N.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final s4f.x d() {
        return (s4f.x) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.X.getValue();
    }
}
