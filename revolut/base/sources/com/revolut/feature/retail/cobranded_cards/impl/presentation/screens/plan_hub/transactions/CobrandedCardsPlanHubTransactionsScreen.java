package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.CobrandedCardsPlanHubTransactionsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pvk.i;
import q7b.d;
import q7b.g;
import te0.w;
import vc.s;
import xki.e;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/transactions/CobrandedCardsPlanHubTransactionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lq7b/h;", "<init>", "()V", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsPlanHubTransactionsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CobrandedCardsPlanHubTransactionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final Object M = w.y0(new q50.w(8));
    public final Object N = w.y0(new q50.w(9));
    public final Object O = w.y0(new q50.w(10));
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

    public CobrandedCardsPlanHubTransactionsScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: q7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubTransactionsScreen f242792b;

            {
                this.f242792b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CobrandedCardsPlanHubTransactionsScreen cobrandedCardsPlanHubTransactionsScreen = this.f242792b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubTransactionsScreen.S;
                        CobrandedCardsPlanHubTransactionsScreen cobrandedCardsPlanHubTransactionsScreen2 = this.f242792b;
                        return dli.f.a(cobrandedCardsPlanHubTransactionsScreen2, cobrandedCardsPlanHubTransactionsScreen2.d(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (RowDelegate) cobrandedCardsPlanHubTransactionsScreen2.M.getValue(), new RowLoadingDelegate(), (InputDisclosureDelegate) cobrandedCardsPlanHubTransactionsScreen2.N.getValue(), (FullScreenStateDelegate) cobrandedCardsPlanHubTransactionsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubTransactionsScreen.S;
                        qji.b bVarU2 = cobrandedCardsPlanHubTransactionsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.di.CobrandedCardsPlanHubTransactionsScreenInjector");
                        }
                        b6b.q qVar = (b6b.q) bVarU2;
                        return new b6b.v(qVar.f12665b, qVar.f12666c);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubTransactionsScreen.S;
                        return (g) ((b6b.v) cobrandedCardsPlanHubTransactionsScreen.Q.getValue()).f12681c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: q7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubTransactionsScreen f242792b;

            {
                this.f242792b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CobrandedCardsPlanHubTransactionsScreen cobrandedCardsPlanHubTransactionsScreen = this.f242792b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubTransactionsScreen.S;
                        CobrandedCardsPlanHubTransactionsScreen cobrandedCardsPlanHubTransactionsScreen2 = this.f242792b;
                        return dli.f.a(cobrandedCardsPlanHubTransactionsScreen2, cobrandedCardsPlanHubTransactionsScreen2.d(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (RowDelegate) cobrandedCardsPlanHubTransactionsScreen2.M.getValue(), new RowLoadingDelegate(), (InputDisclosureDelegate) cobrandedCardsPlanHubTransactionsScreen2.N.getValue(), (FullScreenStateDelegate) cobrandedCardsPlanHubTransactionsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubTransactionsScreen.S;
                        qji.b bVarU2 = cobrandedCardsPlanHubTransactionsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.di.CobrandedCardsPlanHubTransactionsScreenInjector");
                        }
                        b6b.q qVar = (b6b.q) bVarU2;
                        return new b6b.v(qVar.f12665b, qVar.f12666c);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubTransactionsScreen.S;
                        return (g) ((b6b.v) cobrandedCardsPlanHubTransactionsScreen.Q.getValue()).f12681c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: q7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubTransactionsScreen f242792b;

            {
                this.f242792b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CobrandedCardsPlanHubTransactionsScreen cobrandedCardsPlanHubTransactionsScreen = this.f242792b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubTransactionsScreen.S;
                        CobrandedCardsPlanHubTransactionsScreen cobrandedCardsPlanHubTransactionsScreen2 = this.f242792b;
                        return dli.f.a(cobrandedCardsPlanHubTransactionsScreen2, cobrandedCardsPlanHubTransactionsScreen2.d(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (RowDelegate) cobrandedCardsPlanHubTransactionsScreen2.M.getValue(), new RowLoadingDelegate(), (InputDisclosureDelegate) cobrandedCardsPlanHubTransactionsScreen2.N.getValue(), (FullScreenStateDelegate) cobrandedCardsPlanHubTransactionsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubTransactionsScreen.S;
                        qji.b bVarU2 = cobrandedCardsPlanHubTransactionsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.di.CobrandedCardsPlanHubTransactionsScreenInjector");
                        }
                        b6b.q qVar = (b6b.q) bVarU2;
                        return new b6b.v(qVar.f12665b, qVar.f12666c);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubTransactionsScreen.S;
                        return (g) ((b6b.v) cobrandedCardsPlanHubTransactionsScreen.Q.getValue()).f12681c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((q7b.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b6b.v) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), new d(this, null), 3);
        ?? r62 = this.M;
        ViewController.P2(this, new i(rd0.e.b(((RowDelegate) r62.getValue()).f53218h), 25), new q7b.e(this, null, 0), 3);
        ViewController.P2(this, new i(rd0.e.b(((RowDelegate) r62.getValue()).o.f121375b), 26), new q7b.e(this, null, 1), 3);
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView recyclerView = ((m) value).f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        y.a(recyclerView, 10, true, new q56.o(this, 12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final g d() {
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
        return (c) this.P.getValue();
    }
}
