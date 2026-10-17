package com.revolut.feature.direct_deposit.impl.ui_kompot.screen.setup;

import a96.f;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.direct_deposit.impl.R$string;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.setup.DirectDepositSetupScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import j3c.y;
import j96.b;
import j96.c;
import j96.d;
import j96.g;
import j96.i;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/direct_deposit/impl/ui_kompot/screen/setup/DirectDepositSetupScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lj96/b;", "Ldli/a;", "Lj96/d;", "<init>", "()V", "feature_direct_deposit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectDepositSetupScreen extends ViewController<b> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(DirectDepositSetupScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final Object L = w.y0(new y(28));
    public final Object M = w.y0(new y(29));
    public final h S = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public DirectDepositSetupScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: j96.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDepositSetupScreen f172299b;

            {
                this.f172299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DirectDepositSetupScreen directDepositSetupScreen = this.f172299b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDepositSetupScreen.T;
                        qd0.b bVarN = ((a96.f) directDepositSetupScreen.Q.getValue()).f2350a.e.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDepositSetupScreen.T;
                        return new InputTextDelegate(new j2c.n(directDepositSetupScreen, 19));
                    case 2:
                        KProperty[] kPropertyArr3 = DirectDepositSetupScreen.T;
                        DirectDepositSetupScreen directDepositSetupScreen2 = this.f172299b;
                        return dli.f.a(directDepositSetupScreen2, directDepositSetupScreen2.R2(), v.k((InputTextDelegate) directDepositSetupScreen2.O.getValue(), (ListSubheaderDelegate) directDepositSetupScreen2.L.getValue(), (WebViewDelegate) directDepositSetupScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = DirectDepositSetupScreen.T;
                        qji.b bVarU2 = directDepositSetupScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.direct_deposit.impl.ui_kompot.screen.setup.di.DirectDepositSetupScreenInjector");
                        a96.d dVar = (a96.d) bVarU2;
                        return new a96.f(dVar.f2344a, dVar.f2345b);
                    default:
                        KProperty[] kPropertyArr5 = DirectDepositSetupScreen.T;
                        return (c) ((a96.f) directDepositSetupScreen.Q.getValue()).f2351b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: j96.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDepositSetupScreen f172299b;

            {
                this.f172299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DirectDepositSetupScreen directDepositSetupScreen = this.f172299b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDepositSetupScreen.T;
                        qd0.b bVarN = ((a96.f) directDepositSetupScreen.Q.getValue()).f2350a.e.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDepositSetupScreen.T;
                        return new InputTextDelegate(new j2c.n(directDepositSetupScreen, 19));
                    case 2:
                        KProperty[] kPropertyArr3 = DirectDepositSetupScreen.T;
                        DirectDepositSetupScreen directDepositSetupScreen2 = this.f172299b;
                        return dli.f.a(directDepositSetupScreen2, directDepositSetupScreen2.R2(), v.k((InputTextDelegate) directDepositSetupScreen2.O.getValue(), (ListSubheaderDelegate) directDepositSetupScreen2.L.getValue(), (WebViewDelegate) directDepositSetupScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = DirectDepositSetupScreen.T;
                        qji.b bVarU2 = directDepositSetupScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.direct_deposit.impl.ui_kompot.screen.setup.di.DirectDepositSetupScreenInjector");
                        a96.d dVar = (a96.d) bVarU2;
                        return new a96.f(dVar.f2344a, dVar.f2345b);
                    default:
                        KProperty[] kPropertyArr5 = DirectDepositSetupScreen.T;
                        return (c) ((a96.f) directDepositSetupScreen.Q.getValue()).f2351b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: j96.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDepositSetupScreen f172299b;

            {
                this.f172299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DirectDepositSetupScreen directDepositSetupScreen = this.f172299b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDepositSetupScreen.T;
                        qd0.b bVarN = ((a96.f) directDepositSetupScreen.Q.getValue()).f2350a.e.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDepositSetupScreen.T;
                        return new InputTextDelegate(new j2c.n(directDepositSetupScreen, 19));
                    case 2:
                        KProperty[] kPropertyArr3 = DirectDepositSetupScreen.T;
                        DirectDepositSetupScreen directDepositSetupScreen2 = this.f172299b;
                        return dli.f.a(directDepositSetupScreen2, directDepositSetupScreen2.R2(), v.k((InputTextDelegate) directDepositSetupScreen2.O.getValue(), (ListSubheaderDelegate) directDepositSetupScreen2.L.getValue(), (WebViewDelegate) directDepositSetupScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = DirectDepositSetupScreen.T;
                        qji.b bVarU2 = directDepositSetupScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.direct_deposit.impl.ui_kompot.screen.setup.di.DirectDepositSetupScreenInjector");
                        a96.d dVar = (a96.d) bVarU2;
                        return new a96.f(dVar.f2344a, dVar.f2345b);
                    default:
                        KProperty[] kPropertyArr5 = DirectDepositSetupScreen.T;
                        return (c) ((a96.f) directDepositSetupScreen.Q.getValue()).f2351b.get();
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: j96.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDepositSetupScreen f172299b;

            {
                this.f172299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                DirectDepositSetupScreen directDepositSetupScreen = this.f172299b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDepositSetupScreen.T;
                        qd0.b bVarN = ((a96.f) directDepositSetupScreen.Q.getValue()).f2350a.e.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDepositSetupScreen.T;
                        return new InputTextDelegate(new j2c.n(directDepositSetupScreen, 19));
                    case 2:
                        KProperty[] kPropertyArr3 = DirectDepositSetupScreen.T;
                        DirectDepositSetupScreen directDepositSetupScreen2 = this.f172299b;
                        return dli.f.a(directDepositSetupScreen2, directDepositSetupScreen2.R2(), v.k((InputTextDelegate) directDepositSetupScreen2.O.getValue(), (ListSubheaderDelegate) directDepositSetupScreen2.L.getValue(), (WebViewDelegate) directDepositSetupScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = DirectDepositSetupScreen.T;
                        qji.b bVarU2 = directDepositSetupScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.direct_deposit.impl.ui_kompot.screen.setup.di.DirectDepositSetupScreenInjector");
                        a96.d dVar = (a96.d) bVarU2;
                        return new a96.f(dVar.f2344a, dVar.f2345b);
                    default:
                        KProperty[] kPropertyArr5 = DirectDepositSetupScreen.T;
                        return (c) ((a96.f) directDepositSetupScreen.Q.getValue()).f2351b.get();
                }
            }
        });
        final int i6 = 4;
        this.R = w.y0(new Function0(this) { // from class: j96.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDepositSetupScreen f172299b;

            {
                this.f172299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                DirectDepositSetupScreen directDepositSetupScreen = this.f172299b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDepositSetupScreen.T;
                        qd0.b bVarN = ((a96.f) directDepositSetupScreen.Q.getValue()).f2350a.e.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDepositSetupScreen.T;
                        return new InputTextDelegate(new j2c.n(directDepositSetupScreen, 19));
                    case 2:
                        KProperty[] kPropertyArr3 = DirectDepositSetupScreen.T;
                        DirectDepositSetupScreen directDepositSetupScreen2 = this.f172299b;
                        return dli.f.a(directDepositSetupScreen2, directDepositSetupScreen2.R2(), v.k((InputTextDelegate) directDepositSetupScreen2.O.getValue(), (ListSubheaderDelegate) directDepositSetupScreen2.L.getValue(), (WebViewDelegate) directDepositSetupScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = DirectDepositSetupScreen.T;
                        qji.b bVarU2 = directDepositSetupScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.direct_deposit.impl.ui_kompot.screen.setup.di.DirectDepositSetupScreenInjector");
                        a96.d dVar = (a96.d) bVarU2;
                        return new a96.f(dVar.f2344a, dVar.f2345b);
                    default:
                        KProperty[] kPropertyArr5 = DirectDepositSetupScreen.T;
                        return (c) ((a96.f) directDepositSetupScreen.Q.getValue()).f2351b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f172297b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.direct_deposit_setup_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setEnabled(false);
        largeActionButton.setText(new TextLocalisedClause(R$string.direct_deposit_form_creation_share_button_title, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) this.L.getValue()).f52707c), null, new g(this, null), 3);
        ?? r56 = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).f52575g.f121375b), null, new j96.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).e.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new j2c.b(this, null, 12), 3);
    }

    public final u d3() {
        ViewBinding value = this.S.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final c R2() {
        return (c) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
