package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.billing;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b6b.n;
import b6b.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.billing.CobrandedCardsBillingScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import xo8.a0;
import y4f.c;
import y5g.d;
import y6b.g;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/billing/CobrandedCardsBillingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ly6b/h;", "<init>", "()V", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsBillingScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CobrandedCardsBillingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final Object M = w.y0(new c(16));
    public final Object N = w.y0(new c(17));
    public final Object O = w.y0(new c(18));
    public final Object P;
    public final Object Q;
    public final Object R;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public CobrandedCardsBillingScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: y6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsBillingScreen f311247b;

            {
                this.f311247b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CobrandedCardsBillingScreen cobrandedCardsBillingScreen = this.f311247b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsBillingScreen.S;
                        CobrandedCardsBillingScreen cobrandedCardsBillingScreen2 = this.f311247b;
                        return dli.f.a(cobrandedCardsBillingScreen2, cobrandedCardsBillingScreen2.R2(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), (InputDisclosureDelegate) cobrandedCardsBillingScreen2.N.getValue(), new PlainTextDelegate(), (FullScreenStateDelegate) cobrandedCardsBillingScreen2.M.getValue(), (TextDelegate) cobrandedCardsBillingScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsBillingScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(cobrandedCardsBillingScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new n(((o) aVar2.b()).f12655j);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsBillingScreen.S;
                        return (g) ((n) cobrandedCardsBillingScreen.Q.getValue()).f12646c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: y6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsBillingScreen f311247b;

            {
                this.f311247b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CobrandedCardsBillingScreen cobrandedCardsBillingScreen = this.f311247b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsBillingScreen.S;
                        CobrandedCardsBillingScreen cobrandedCardsBillingScreen2 = this.f311247b;
                        return dli.f.a(cobrandedCardsBillingScreen2, cobrandedCardsBillingScreen2.R2(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), (InputDisclosureDelegate) cobrandedCardsBillingScreen2.N.getValue(), new PlainTextDelegate(), (FullScreenStateDelegate) cobrandedCardsBillingScreen2.M.getValue(), (TextDelegate) cobrandedCardsBillingScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsBillingScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(cobrandedCardsBillingScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new n(((o) aVar2.b()).f12655j);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsBillingScreen.S;
                        return (g) ((n) cobrandedCardsBillingScreen.Q.getValue()).f12646c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: y6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsBillingScreen f311247b;

            {
                this.f311247b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CobrandedCardsBillingScreen cobrandedCardsBillingScreen = this.f311247b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsBillingScreen.S;
                        CobrandedCardsBillingScreen cobrandedCardsBillingScreen2 = this.f311247b;
                        return dli.f.a(cobrandedCardsBillingScreen2, cobrandedCardsBillingScreen2.R2(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), (InputDisclosureDelegate) cobrandedCardsBillingScreen2.N.getValue(), new PlainTextDelegate(), (FullScreenStateDelegate) cobrandedCardsBillingScreen2.M.getValue(), (TextDelegate) cobrandedCardsBillingScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsBillingScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(cobrandedCardsBillingScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new n(((o) aVar2.b()).f12655j);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsBillingScreen.S;
                        return (g) ((n) cobrandedCardsBillingScreen.Q.getValue()).f12646c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        y6b.h uiState = (y6b.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f311252a;
        navBarWithToolbar.setLoadingVisible(clause == null);
        navBarWithToolbar.setTitle(clause, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new d(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.M.getValue()).f52371h.f121375b), new y6b.d(this, null), 3);
        ViewController.P2(this, new a0(rd0.e.b(((InputDisclosureDelegate) this.N.getValue()).f52538c), 18), new y6b.e(this, continuation, 0), 3);
        ViewController.P2(this, new a0(rd0.e.b(((TextDelegate) this.O.getValue()).d), 19), new y6b.e(this, continuation, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
