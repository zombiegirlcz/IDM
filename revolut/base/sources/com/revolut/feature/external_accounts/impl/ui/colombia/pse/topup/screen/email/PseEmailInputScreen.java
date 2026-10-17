package com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.screen.email;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.e0;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.screen.email.PseEmailInputScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dl6.c;
import dl6.f;
import dl6.g;
import h30.l;
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
import te0.w;
import vc.s;
import xf6.m0;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/colombia/pse/topup/screen/email/PseEmailInputScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldl6/f;", "Ldli/a;", "Ldl6/g;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PseEmailInputScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PseEmailInputScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object N;
    public final Object O;
    public final Object Q;
    public final boolean K = true;
    public final h L = s.t(this, a.f);
    public final int M = R$layout.screen_recycler_navbar_nextbutton;
    public final InputTextDelegate P = new InputTextDelegate(null);

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

    public PseEmailInputScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: dl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PseEmailInputScreen f115705b;

            {
                this.f115705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PseEmailInputScreen pseEmailInputScreen = this.f115705b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PseEmailInputScreen.R;
                        qji.b bVarU2 = pseEmailInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.screen.email.di.PseEmailInputScreenInjector");
                        m0 m0Var = new m0();
                        int i3 = 27;
                        m0Var.f304946a = e4m.b.b(new vy9.a(m0Var, 1, i3));
                        m0Var.f304947b = e4m.b.b(new vy9.a(m0Var, 0, i3));
                        return m0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = PseEmailInputScreen.R;
                        return (h) ((m0) pseEmailInputScreen.N.getValue()).f304947b.get();
                    default:
                        KProperty[] kPropertyArr3 = PseEmailInputScreen.R;
                        PseEmailInputScreen pseEmailInputScreen2 = this.f115705b;
                        return dli.f.a(pseEmailInputScreen2, (h) pseEmailInputScreen2.O.getValue(), zhm.u.c(pseEmailInputScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: dl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PseEmailInputScreen f115705b;

            {
                this.f115705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PseEmailInputScreen pseEmailInputScreen = this.f115705b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PseEmailInputScreen.R;
                        qji.b bVarU2 = pseEmailInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.screen.email.di.PseEmailInputScreenInjector");
                        m0 m0Var = new m0();
                        int i3 = 27;
                        m0Var.f304946a = e4m.b.b(new vy9.a(m0Var, 1, i3));
                        m0Var.f304947b = e4m.b.b(new vy9.a(m0Var, 0, i3));
                        return m0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = PseEmailInputScreen.R;
                        return (h) ((m0) pseEmailInputScreen.N.getValue()).f304947b.get();
                    default:
                        KProperty[] kPropertyArr3 = PseEmailInputScreen.R;
                        PseEmailInputScreen pseEmailInputScreen2 = this.f115705b;
                        return dli.f.a(pseEmailInputScreen2, (h) pseEmailInputScreen2.O.getValue(), zhm.u.c(pseEmailInputScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: dl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PseEmailInputScreen f115705b;

            {
                this.f115705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PseEmailInputScreen pseEmailInputScreen = this.f115705b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PseEmailInputScreen.R;
                        qji.b bVarU2 = pseEmailInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.screen.email.di.PseEmailInputScreenInjector");
                        m0 m0Var = new m0();
                        int i32 = 27;
                        m0Var.f304946a = e4m.b.b(new vy9.a(m0Var, 1, i32));
                        m0Var.f304947b = e4m.b.b(new vy9.a(m0Var, 0, i32));
                        return m0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = PseEmailInputScreen.R;
                        return (h) ((m0) pseEmailInputScreen.N.getValue()).f304947b.get();
                    default:
                        KProperty[] kPropertyArr3 = PseEmailInputScreen.R;
                        PseEmailInputScreen pseEmailInputScreen2 = this.f115705b;
                        return dli.f.a(pseEmailInputScreen2, (h) pseEmailInputScreen2.O.getValue(), zhm.u.c(pseEmailInputScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f115709b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (dl6.h) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pse_topup_email_input_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.pse_topup_email_input_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.pse_topup_email_input_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionTextStyle(e0.CAPTION);
        l.A(R.string.common_action_continue, null, null, 14, d3().f174564b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new dl6.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new dl6.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.e.f121375b), null, new c(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
