package com.revolut.feature.wealth.impl.ui.invest.transactions.list.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c0d.e;
import cbh.b;
import cbh.c;
import cbh.i;
import cbh.p;
import cbh.y;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$InputData;
import com.revolut.feature.wealth.impl.ui.invest.transactions.list.screen.InvestTransactionsListScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import d1h.j;
import f1h.f;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import skm.k0;
import t60.g;
import te0.w;
import vc.s;
import vkm.d;
import vkm.q0;
import z0h.s1;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/invest/transactions/list/screen/InvestTransactionsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "", "Companion", "a", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestTransactionsListScreen extends ViewController<q> implements dli.a, f, s1, j {
    public final InvestTransactionsListContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final FooterTextDelegate V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(InvestTransactionsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public InvestTransactionsListScreen(InvestTransactionsListContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, c.f);
        final int i = 2;
        this.N = w.y0(new Function0(this) { // from class: cbh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestTransactionsListScreen f22802b;

            {
                this.f22802b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvestTransactionsListScreen investTransactionsListScreen = this.f22802b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvestTransactionsListScreen.Z;
                        return (t60.b) ((z9h.f) investTransactionsListScreen.N.getValue()).f320419l.get();
                    case 1:
                        return zhm.v.k((RowLoadingDelegate) investTransactionsListScreen.P.getValue(), investTransactionsListScreen.getS(), (TextDelegate) investTransactionsListScreen.R.getValue(), investTransactionsListScreen.getF91266e0(), (ListSubheaderDelegate) investTransactionsListScreen.U.getValue(), investTransactionsListScreen.V);
                    case 2:
                        KProperty[] kPropertyArr2 = InvestTransactionsListScreen.Z;
                        InvestTransactionsListScreen investTransactionsListScreen2 = this.f22802b;
                        phm.a aVar = (phm.a) ue0.e.j(investTransactionsListScreen2.m2()).a().get(z9h.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        z9h.d dVar = ((z9h.d) aVar2.b()).f320410w;
                        InvestTransactionsListContract$InputData investTransactionsListContract$InputData = investTransactionsListScreen2.K;
                        investTransactionsListContract$InputData.getClass();
                        ScreenContentRecyclerView recyclerView = investTransactionsListScreen2.d3().f174540c;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return new z9h.f(dVar, investTransactionsListScreen2, investTransactionsListContract$InputData, recyclerView, investTransactionsListScreen2, investTransactionsListScreen2, investTransactionsListScreen2);
                    case 3:
                        KProperty[] kPropertyArr3 = InvestTransactionsListScreen.Z;
                        InvestTransactionsListScreen investTransactionsListScreen3 = this.f22802b;
                        return dli.f.a(investTransactionsListScreen3, investTransactionsListScreen3.d(), (List) investTransactionsListScreen3.X.getValue(), investTransactionsListScreen3.d3().f174540c.getId(), null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr4 = InvestTransactionsListScreen.Z;
                        return (m) ((z9h.f) investTransactionsListScreen.N.getValue()).u.get();
                }
            }
        });
        final int i2 = 4;
        this.O = w.y0(new Function0(this) { // from class: cbh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestTransactionsListScreen f22802b;

            {
                this.f22802b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvestTransactionsListScreen investTransactionsListScreen = this.f22802b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestTransactionsListScreen.Z;
                        return (t60.b) ((z9h.f) investTransactionsListScreen.N.getValue()).f320419l.get();
                    case 1:
                        return zhm.v.k((RowLoadingDelegate) investTransactionsListScreen.P.getValue(), investTransactionsListScreen.getS(), (TextDelegate) investTransactionsListScreen.R.getValue(), investTransactionsListScreen.getF91266e0(), (ListSubheaderDelegate) investTransactionsListScreen.U.getValue(), investTransactionsListScreen.V);
                    case 2:
                        KProperty[] kPropertyArr2 = InvestTransactionsListScreen.Z;
                        InvestTransactionsListScreen investTransactionsListScreen2 = this.f22802b;
                        phm.a aVar = (phm.a) ue0.e.j(investTransactionsListScreen2.m2()).a().get(z9h.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        z9h.d dVar = ((z9h.d) aVar2.b()).f320410w;
                        InvestTransactionsListContract$InputData investTransactionsListContract$InputData = investTransactionsListScreen2.K;
                        investTransactionsListContract$InputData.getClass();
                        ScreenContentRecyclerView recyclerView = investTransactionsListScreen2.d3().f174540c;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return new z9h.f(dVar, investTransactionsListScreen2, investTransactionsListContract$InputData, recyclerView, investTransactionsListScreen2, investTransactionsListScreen2, investTransactionsListScreen2);
                    case 3:
                        KProperty[] kPropertyArr3 = InvestTransactionsListScreen.Z;
                        InvestTransactionsListScreen investTransactionsListScreen3 = this.f22802b;
                        return dli.f.a(investTransactionsListScreen3, investTransactionsListScreen3.d(), (List) investTransactionsListScreen3.X.getValue(), investTransactionsListScreen3.d3().f174540c.getId(), null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr4 = InvestTransactionsListScreen.Z;
                        return (m) ((z9h.f) investTransactionsListScreen.N.getValue()).u.get();
                }
            }
        });
        this.P = w.y0(new e(29));
        this.Q = w.y0(new b(0));
        this.R = w.y0(new b(1));
        this.S = w.y0(new b(2));
        this.T = w.y0(new b(3));
        this.U = w.y0(new b(4));
        this.V = new FooterTextDelegate();
        final int i3 = 0;
        this.W = w.y0(new Function0(this) { // from class: cbh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestTransactionsListScreen f22802b;

            {
                this.f22802b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvestTransactionsListScreen investTransactionsListScreen = this.f22802b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestTransactionsListScreen.Z;
                        return (t60.b) ((z9h.f) investTransactionsListScreen.N.getValue()).f320419l.get();
                    case 1:
                        return zhm.v.k((RowLoadingDelegate) investTransactionsListScreen.P.getValue(), investTransactionsListScreen.getS(), (TextDelegate) investTransactionsListScreen.R.getValue(), investTransactionsListScreen.getF91266e0(), (ListSubheaderDelegate) investTransactionsListScreen.U.getValue(), investTransactionsListScreen.V);
                    case 2:
                        KProperty[] kPropertyArr2 = InvestTransactionsListScreen.Z;
                        InvestTransactionsListScreen investTransactionsListScreen2 = this.f22802b;
                        phm.a aVar = (phm.a) ue0.e.j(investTransactionsListScreen2.m2()).a().get(z9h.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        z9h.d dVar = ((z9h.d) aVar2.b()).f320410w;
                        InvestTransactionsListContract$InputData investTransactionsListContract$InputData = investTransactionsListScreen2.K;
                        investTransactionsListContract$InputData.getClass();
                        ScreenContentRecyclerView recyclerView = investTransactionsListScreen2.d3().f174540c;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return new z9h.f(dVar, investTransactionsListScreen2, investTransactionsListContract$InputData, recyclerView, investTransactionsListScreen2, investTransactionsListScreen2, investTransactionsListScreen2);
                    case 3:
                        KProperty[] kPropertyArr3 = InvestTransactionsListScreen.Z;
                        InvestTransactionsListScreen investTransactionsListScreen3 = this.f22802b;
                        return dli.f.a(investTransactionsListScreen3, investTransactionsListScreen3.d(), (List) investTransactionsListScreen3.X.getValue(), investTransactionsListScreen3.d3().f174540c.getId(), null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr4 = InvestTransactionsListScreen.Z;
                        return (m) ((z9h.f) investTransactionsListScreen.N.getValue()).u.get();
                }
            }
        });
        final int i5 = 1;
        this.X = w.y0(new Function0(this) { // from class: cbh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestTransactionsListScreen f22802b;

            {
                this.f22802b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                InvestTransactionsListScreen investTransactionsListScreen = this.f22802b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestTransactionsListScreen.Z;
                        return (t60.b) ((z9h.f) investTransactionsListScreen.N.getValue()).f320419l.get();
                    case 1:
                        return zhm.v.k((RowLoadingDelegate) investTransactionsListScreen.P.getValue(), investTransactionsListScreen.getS(), (TextDelegate) investTransactionsListScreen.R.getValue(), investTransactionsListScreen.getF91266e0(), (ListSubheaderDelegate) investTransactionsListScreen.U.getValue(), investTransactionsListScreen.V);
                    case 2:
                        KProperty[] kPropertyArr2 = InvestTransactionsListScreen.Z;
                        InvestTransactionsListScreen investTransactionsListScreen2 = this.f22802b;
                        phm.a aVar = (phm.a) ue0.e.j(investTransactionsListScreen2.m2()).a().get(z9h.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        z9h.d dVar = ((z9h.d) aVar2.b()).f320410w;
                        InvestTransactionsListContract$InputData investTransactionsListContract$InputData = investTransactionsListScreen2.K;
                        investTransactionsListContract$InputData.getClass();
                        ScreenContentRecyclerView recyclerView = investTransactionsListScreen2.d3().f174540c;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return new z9h.f(dVar, investTransactionsListScreen2, investTransactionsListContract$InputData, recyclerView, investTransactionsListScreen2, investTransactionsListScreen2, investTransactionsListScreen2);
                    case 3:
                        KProperty[] kPropertyArr3 = InvestTransactionsListScreen.Z;
                        InvestTransactionsListScreen investTransactionsListScreen3 = this.f22802b;
                        return dli.f.a(investTransactionsListScreen3, investTransactionsListScreen3.d(), (List) investTransactionsListScreen3.X.getValue(), investTransactionsListScreen3.d3().f174540c.getId(), null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr4 = InvestTransactionsListScreen.Z;
                        return (m) ((z9h.f) investTransactionsListScreen.N.getValue()).u.get();
                }
            }
        });
        final int i6 = 3;
        this.Y = w.y0(new Function0(this) { // from class: cbh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestTransactionsListScreen f22802b;

            {
                this.f22802b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                InvestTransactionsListScreen investTransactionsListScreen = this.f22802b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestTransactionsListScreen.Z;
                        return (t60.b) ((z9h.f) investTransactionsListScreen.N.getValue()).f320419l.get();
                    case 1:
                        return zhm.v.k((RowLoadingDelegate) investTransactionsListScreen.P.getValue(), investTransactionsListScreen.getS(), (TextDelegate) investTransactionsListScreen.R.getValue(), investTransactionsListScreen.getF91266e0(), (ListSubheaderDelegate) investTransactionsListScreen.U.getValue(), investTransactionsListScreen.V);
                    case 2:
                        KProperty[] kPropertyArr2 = InvestTransactionsListScreen.Z;
                        InvestTransactionsListScreen investTransactionsListScreen2 = this.f22802b;
                        phm.a aVar = (phm.a) ue0.e.j(investTransactionsListScreen2.m2()).a().get(z9h.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        z9h.d dVar = ((z9h.d) aVar2.b()).f320410w;
                        InvestTransactionsListContract$InputData investTransactionsListContract$InputData = investTransactionsListScreen2.K;
                        investTransactionsListContract$InputData.getClass();
                        ScreenContentRecyclerView recyclerView = investTransactionsListScreen2.d3().f174540c;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return new z9h.f(dVar, investTransactionsListScreen2, investTransactionsListContract$InputData, recyclerView, investTransactionsListScreen2, investTransactionsListScreen2, investTransactionsListScreen2);
                    case 3:
                        KProperty[] kPropertyArr3 = InvestTransactionsListScreen.Z;
                        InvestTransactionsListScreen investTransactionsListScreen3 = this.f22802b;
                        return dli.f.a(investTransactionsListScreen3, investTransactionsListScreen3.d(), (List) investTransactionsListScreen3.X.getValue(), investTransactionsListScreen3.d3().f174540c.getId(), null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr4 = InvestTransactionsListScreen.Z;
                        return (m) ((z9h.f) investTransactionsListScreen.N.getValue()).u.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f22840a.f22830a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final FooterTextDelegate getV() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // d1h.j
    /* JADX INFO: renamed from: Q */
    public final FullScreenStateDelegate getF91266e0() {
        return (FullScreenStateDelegate) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (z9h.f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((z9h.f) this.N.getValue()).f320418j.get()).d(v.k((TextDelegate) this.R.getValue(), (LargeActionButtonDelegate) this.T.getValue()));
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        if (((y) d()).J2()) {
            return;
        }
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        yp0.y.a(recyclerView, 25, true, new c69.v(this, 18));
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        if (((y) d()).J2()) {
            ?? r72 = this.W;
            ax9.o oVar = new ax9.o(yh5.b.d(vkm.q.i(rd0.e.b(((g) ((t60.b) r72.getValue())).R()), 1, ukm.f.DROP_OLDEST), rd0.e.b(((g) ((t60.b) r72.getValue())).d)), 2);
            b.Companion companion = kotlin.time.b.INSTANCE;
            ViewController.P2(this, t1.e0(vkm.q.q(new cbh.f(t1.J(oVar, k0.e(kotlin.time.c.h(500L, pkm.e.MILLISECONDS))), 0))), new cbh.g(this, continuation, 0), 3);
        }
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new bv4.h(this, null, 13), 3);
        ViewController.P2(this, new q0(new cbf.c(rd0.e.b(getF91266e0().f52371h.f121375b), 1), new i(this, null), 1), null, 7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // f1h.f
    /* JADX INFO: renamed from: c */
    public final RowDelegate getS() {
        return (RowDelegate) this.Q.getValue();
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final cbh.m d() {
        return (cbh.m) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // z0h.s1
    public final d r() {
        return rd0.e.b(((TextDelegate) this.R.getValue()).d);
    }
}
