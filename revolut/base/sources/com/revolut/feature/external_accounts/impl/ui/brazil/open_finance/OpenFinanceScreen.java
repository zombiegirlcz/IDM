package com.revolut.feature.external_accounts.impl.ui.brazil.open_finance;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bk6.c;
import bk6.f;
import bk6.i;
import bk6.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.OpenFinanceScreen;
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
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import xf6.a3;
import xf6.b3;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/OpenFinanceScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/OpenFinanceScreenContract$Output;", "Ldli/a;", "Lbk6/j;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OpenFinanceScreen extends ViewController<OpenFinanceScreenContract$Output> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(OpenFinanceScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object N;
    public final Object O;
    public final Object Q;
    public final Object R;
    public final int K = R$layout.screen_recycler_navbar;
    public final TabsDelegate L = new TabsDelegate();
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final h P = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
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

    public OpenFinanceScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: bk6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenFinanceScreen f16262b;

            {
                this.f16262b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OpenFinanceScreen openFinanceScreen = this.f16262b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OpenFinanceScreen.S;
                        return new SwipeToActionDelegate(openFinanceScreen.M, false);
                    case 1:
                        KProperty[] kPropertyArr2 = OpenFinanceScreen.S;
                        OpenFinanceScreen openFinanceScreen2 = this.f16262b;
                        return dli.f.a(openFinanceScreen2, (i) openFinanceScreen2.R.getValue(), v.k(openFinanceScreen2.L, openFinanceScreen2.M, new RowLoadingDelegate(), new ListSubheaderDelegate(), (SwipeToActionDelegate) openFinanceScreen2.N.getValue(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = OpenFinanceScreen.S;
                        qji.b bVarU2 = openFinanceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.di.OpenFinanceScreenInjector");
                        a3 a3Var = (a3) bVarU2;
                        return new b3(a3Var.f304790a, a3Var.f304791b);
                    default:
                        KProperty[] kPropertyArr4 = OpenFinanceScreen.S;
                        return (i) ((b3) openFinanceScreen.Q.getValue()).f304802b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: bk6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenFinanceScreen f16262b;

            {
                this.f16262b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OpenFinanceScreen openFinanceScreen = this.f16262b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OpenFinanceScreen.S;
                        return new SwipeToActionDelegate(openFinanceScreen.M, false);
                    case 1:
                        KProperty[] kPropertyArr2 = OpenFinanceScreen.S;
                        OpenFinanceScreen openFinanceScreen2 = this.f16262b;
                        return dli.f.a(openFinanceScreen2, (i) openFinanceScreen2.R.getValue(), v.k(openFinanceScreen2.L, openFinanceScreen2.M, new RowLoadingDelegate(), new ListSubheaderDelegate(), (SwipeToActionDelegate) openFinanceScreen2.N.getValue(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = OpenFinanceScreen.S;
                        qji.b bVarU2 = openFinanceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.di.OpenFinanceScreenInjector");
                        a3 a3Var = (a3) bVarU2;
                        return new b3(a3Var.f304790a, a3Var.f304791b);
                    default:
                        KProperty[] kPropertyArr4 = OpenFinanceScreen.S;
                        return (i) ((b3) openFinanceScreen.Q.getValue()).f304802b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: bk6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenFinanceScreen f16262b;

            {
                this.f16262b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OpenFinanceScreen openFinanceScreen = this.f16262b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OpenFinanceScreen.S;
                        return new SwipeToActionDelegate(openFinanceScreen.M, false);
                    case 1:
                        KProperty[] kPropertyArr2 = OpenFinanceScreen.S;
                        OpenFinanceScreen openFinanceScreen2 = this.f16262b;
                        return dli.f.a(openFinanceScreen2, (i) openFinanceScreen2.R.getValue(), v.k(openFinanceScreen2.L, openFinanceScreen2.M, new RowLoadingDelegate(), new ListSubheaderDelegate(), (SwipeToActionDelegate) openFinanceScreen2.N.getValue(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = OpenFinanceScreen.S;
                        qji.b bVarU2 = openFinanceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.di.OpenFinanceScreenInjector");
                        a3 a3Var = (a3) bVarU2;
                        return new b3(a3Var.f304790a, a3Var.f304791b);
                    default:
                        KProperty[] kPropertyArr4 = OpenFinanceScreen.S;
                        return (i) ((b3) openFinanceScreen.Q.getValue()).f304802b.get();
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: bk6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenFinanceScreen f16262b;

            {
                this.f16262b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                OpenFinanceScreen openFinanceScreen = this.f16262b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OpenFinanceScreen.S;
                        return new SwipeToActionDelegate(openFinanceScreen.M, false);
                    case 1:
                        KProperty[] kPropertyArr2 = OpenFinanceScreen.S;
                        OpenFinanceScreen openFinanceScreen2 = this.f16262b;
                        return dli.f.a(openFinanceScreen2, (i) openFinanceScreen2.R.getValue(), v.k(openFinanceScreen2.L, openFinanceScreen2.M, new RowLoadingDelegate(), new ListSubheaderDelegate(), (SwipeToActionDelegate) openFinanceScreen2.N.getValue(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = OpenFinanceScreen.S;
                        qji.b bVarU2 = openFinanceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.di.OpenFinanceScreenInjector");
                        a3 a3Var = (a3) bVarU2;
                        return new b3(a3Var.f304790a, a3Var.f304791b);
                    default:
                        KProperty[] kPropertyArr4 = OpenFinanceScreen.S;
                        return (i) ((b3) openFinanceScreen.Q.getValue()).f304802b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f16272b;
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b3) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (i) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.open_finance_pix_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.open_finance_pix_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new bf5.a(this, continuation, 9), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53515c.f121375b), new bk6.e(this, continuation, 0), 3);
        RowDelegate rowDelegate = this.M;
        int i = 1;
        ViewController.P2(this, new c(rd0.e.b(rowDelegate.f53218h), i), new bk6.e(this, continuation, i), 3);
        ViewController.P2(this, new c(rd0.e.b(rowDelegate.f53218h), 0), new f(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
