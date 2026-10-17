package com.revolut.feature.credit.application.plugins.impl.ui.sso;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.sso.SelfieIntroScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import dw3.f6;
import dw3.g6;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import t9l.f;
import te0.w;
import th9.k;
import ti4.i;
import ti4.j;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/sso/SelfieIntroScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lti4/i;", "Ldli/a;", "Lti4/j;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelfieIntroScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(SelfieIntroScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object M;
    public final Object O;
    public final Object P;
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final h L = s.t(this, a.f);
    public final Object N = w.y0(new k(4));

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

    public SelfieIntroScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ti4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelfieIntroScreen f271412b;

            {
                this.f271412b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SelfieIntroScreen selfieIntroScreen = this.f271412b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SelfieIntroScreen.Q;
                        return (k) ((g6) selfieIntroScreen.P.getValue()).f118826b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SelfieIntroScreen.Q;
                        SelfieIntroScreen selfieIntroScreen2 = this.f271412b;
                        return dli.f.a(selfieIntroScreen2, (k) selfieIntroScreen2.M.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7), (TextDelegate) selfieIntroScreen2.N.getValue()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = SelfieIntroScreen.Q;
                        qji.b bVarU2 = selfieIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.sso.di.SelfieIntroScreenInjector");
                        g6 g6Var = new g6();
                        g6Var.f118825a = e4m.b.b(new f6(g6Var, 1, 0));
                        g6Var.f118826b = e4m.b.b(new f6(g6Var, 0, 0));
                        return g6Var;
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ti4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelfieIntroScreen f271412b;

            {
                this.f271412b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SelfieIntroScreen selfieIntroScreen = this.f271412b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelfieIntroScreen.Q;
                        return (k) ((g6) selfieIntroScreen.P.getValue()).f118826b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SelfieIntroScreen.Q;
                        SelfieIntroScreen selfieIntroScreen2 = this.f271412b;
                        return dli.f.a(selfieIntroScreen2, (k) selfieIntroScreen2.M.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7), (TextDelegate) selfieIntroScreen2.N.getValue()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = SelfieIntroScreen.Q;
                        qji.b bVarU2 = selfieIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.sso.di.SelfieIntroScreenInjector");
                        g6 g6Var = new g6();
                        g6Var.f118825a = e4m.b.b(new f6(g6Var, 1, 0));
                        g6Var.f118826b = e4m.b.b(new f6(g6Var, 0, 0));
                        return g6Var;
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ti4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelfieIntroScreen f271412b;

            {
                this.f271412b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SelfieIntroScreen selfieIntroScreen = this.f271412b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelfieIntroScreen.Q;
                        return (k) ((g6) selfieIntroScreen.P.getValue()).f118826b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SelfieIntroScreen.Q;
                        SelfieIntroScreen selfieIntroScreen2 = this.f271412b;
                        return dli.f.a(selfieIntroScreen2, (k) selfieIntroScreen2.M.getValue(), v.k(new SimpleMediaDelegate(), new RowDelegate(null, null, 7), (TextDelegate) selfieIntroScreen2.N.getValue()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = SelfieIntroScreen.Q;
                        qji.b bVarU2 = selfieIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.sso.di.SelfieIntroScreenInjector");
                        g6 g6Var = new g6();
                        g6Var.f118825a = e4m.b.b(new f6(g6Var, 1, 0));
                        g6Var.f118826b = e4m.b.b(new f6(g6Var, 0, 0));
                        return g6Var;
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g6) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (ti4.k) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        u uVarD3 = d3();
        uVarD3.f174565c.setHeaderTitleMode(j0.MULTILINE);
        NavBarWithToolbar navBarWithToolbar = uVarD3.f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_sso_selfie_intro_title, null, null, 14));
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_sso_selfie_intro_title, null, null, 14), null);
        uVarD3.f174564b.setText(new TextLocalisedClause(R$string.credit_sso_selfie_intro_button, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        f fVar = new f(rd0.e.b(d3().f174565c.f59410q), 5);
        ?? r142 = this.M;
        com.revolut.kompot.navigable.a.g2(this, fVar, null, new ryj.f(2, (ti4.k) r142.getValue(), ti4.k.class, "onEvent", "onEvent(Lcom/revolut/feature/credit/application/plugins/impl/ui/sso/SelfieIntroScreenContract$Event;)V", 4, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, new f(rd0.e.b(d3().f174564b.o), 6), null, new ryj.f(2, (ti4.k) r142.getValue(), ti4.k.class, "onEvent", "onEvent(Lcom/revolut/feature/credit/application/plugins/impl/ui/sso/SelfieIntroScreenContract$Event;)V", 4, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, new f(rd0.e.b(((TextDelegate) this.N.getValue()).d), 7), null, new ryj.f(2, (ti4.k) r142.getValue(), ti4.k.class, "onEvent", "onEvent(Lcom/revolut/feature/credit/application/plugins/impl/ui/sso/SelfieIntroScreenContract$Event;)V", 4, 21), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
