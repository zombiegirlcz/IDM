package com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen.LinkedAccountsConsentScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import xf6.d0;
import xf6.e0;
import xf6.t;
import xki.e;
import yl6.c;
import yl6.d;
import yl6.f;
import yl6.g;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/linked_accounts_screen/LinkedAccountsConsentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/linked_accounts_screen/LinkedAccountsConsentScreenContract$OutputData;", "Ldli/a;", "Lyl6/g;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinkedAccountsConsentScreen extends ViewController<LinkedAccountsConsentScreenContract$OutputData> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(LinkedAccountsConsentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object N;
    public final Object O;
    public final Object Q;
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate P = new FullScreenStateDelegate();

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

    public LinkedAccountsConsentScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: yl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedAccountsConsentScreen f314657b;

            {
                this.f314657b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LinkedAccountsConsentScreen linkedAccountsConsentScreen = this.f314657b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedAccountsConsentScreen.R;
                        qji.b bVarU2 = linkedAccountsConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen.di.LinkedAccountsConsentScreenInjector");
                        t tVar = ((d0) bVarU2).f304816a;
                        e0 e0Var = new e0();
                        e0Var.f304830a = e4m.b.b(new xb1.m(tVar, e0Var, 1, 9));
                        e0Var.f304831b = e4m.b.b(new xb1.m(tVar, e0Var, 0, 9));
                        return e0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = LinkedAccountsConsentScreen.R;
                        return (f) ((e0) linkedAccountsConsentScreen.N.getValue()).f304831b.get();
                    default:
                        KProperty[] kPropertyArr3 = LinkedAccountsConsentScreen.R;
                        LinkedAccountsConsentScreen linkedAccountsConsentScreen2 = this.f314657b;
                        return dli.f.a(linkedAccountsConsentScreen2, (f) linkedAccountsConsentScreen2.O.getValue(), v.k(linkedAccountsConsentScreen2.M, new RowLoadingDelegate(), linkedAccountsConsentScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: yl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedAccountsConsentScreen f314657b;

            {
                this.f314657b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LinkedAccountsConsentScreen linkedAccountsConsentScreen = this.f314657b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedAccountsConsentScreen.R;
                        qji.b bVarU2 = linkedAccountsConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen.di.LinkedAccountsConsentScreenInjector");
                        t tVar = ((d0) bVarU2).f304816a;
                        e0 e0Var = new e0();
                        e0Var.f304830a = e4m.b.b(new xb1.m(tVar, e0Var, 1, 9));
                        e0Var.f304831b = e4m.b.b(new xb1.m(tVar, e0Var, 0, 9));
                        return e0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = LinkedAccountsConsentScreen.R;
                        return (f) ((e0) linkedAccountsConsentScreen.N.getValue()).f304831b.get();
                    default:
                        KProperty[] kPropertyArr3 = LinkedAccountsConsentScreen.R;
                        LinkedAccountsConsentScreen linkedAccountsConsentScreen2 = this.f314657b;
                        return dli.f.a(linkedAccountsConsentScreen2, (f) linkedAccountsConsentScreen2.O.getValue(), v.k(linkedAccountsConsentScreen2.M, new RowLoadingDelegate(), linkedAccountsConsentScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: yl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedAccountsConsentScreen f314657b;

            {
                this.f314657b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LinkedAccountsConsentScreen linkedAccountsConsentScreen = this.f314657b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedAccountsConsentScreen.R;
                        qji.b bVarU2 = linkedAccountsConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen.di.LinkedAccountsConsentScreenInjector");
                        t tVar = ((d0) bVarU2).f304816a;
                        e0 e0Var = new e0();
                        e0Var.f304830a = e4m.b.b(new xb1.m(tVar, e0Var, 1, 9));
                        e0Var.f304831b = e4m.b.b(new xb1.m(tVar, e0Var, 0, 9));
                        return e0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = LinkedAccountsConsentScreen.R;
                        return (f) ((e0) linkedAccountsConsentScreen.N.getValue()).f304831b.get();
                    default:
                        KProperty[] kPropertyArr3 = LinkedAccountsConsentScreen.R;
                        LinkedAccountsConsentScreen linkedAccountsConsentScreen2 = this.f314657b;
                        return dli.f.a(linkedAccountsConsentScreen2, (f) linkedAccountsConsentScreen2.O.getValue(), v.k(linkedAccountsConsentScreen2.M, new RowLoadingDelegate(), linkedAccountsConsentScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        String str = uiState.f314659a;
        String str2 = uiState.f314660b;
        if (str != null) {
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            navBarWithToolbar.setTitle(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        }
        d3().f174539b.setSecondDescriptionVisible(str2 != null);
        if (str2 != null) {
            d3().f174539b.setSecondDescriptionText(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new yl6.b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
