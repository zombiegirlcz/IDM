package com.revolut.feature.apm.swish.impl.ui.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.swish.api.R$string;
import com.revolut.feature.apm.swish.impl.ui.confirmation.SwishConfirmationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import he2.d;
import ke2.b;
import ke2.c;
import ke2.i;
import ke2.j;
import ke2.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c7;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/swish/impl/ui/confirmation/SwishConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lke2/i;", "Ldli/a;", "Lke2/k;", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwishConfirmationScreen extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(SwishConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final CellDetailsDelegate K;
    public final Object L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;

    public SwishConfirmationScreen(SwishConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new CellDetailsDelegate();
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ke2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwishConfirmationScreen f182955b;

            {
                this.f182955b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = SwishConfirmationScreen.Q;
                        SwishConfirmationScreen swishConfirmationScreen = this.f182955b;
                        return dli.f.a(swishConfirmationScreen, (j) swishConfirmationScreen.P.getValue(), u.c(swishConfirmationScreen.K), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = SwishConfirmationScreen.Q;
                        return (j) ((he2.d) this.f182955b.O.getValue()).d.get();
                }
            }
        });
        this.M = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.N = s.t(this, b.f);
        this.O = w.y0(new k8e.a(this, inputData, 9));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ke2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwishConfirmationScreen f182955b;

            {
                this.f182955b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SwishConfirmationScreen.Q;
                        SwishConfirmationScreen swishConfirmationScreen = this.f182955b;
                        return dli.f.a(swishConfirmationScreen, (j) swishConfirmationScreen.P.getValue(), u.c(swishConfirmationScreen.K), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = SwishConfirmationScreen.Q;
                        return (j) ((he2.d) this.f182955b.O.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((k) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.swish_registration_confirmation_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.swish_registration_confirmation_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174557b.setText(new TextLocalisedClause(R$string.swish_registration_confirmation_action, null, null, 14));
        d3().f174557b.setLoadingButtonTag("CONTINUE_BUTTON");
        d3().f174558c.setContent(new c7(new TextLocalisedClause(R$string.swish_registration_confirmation_disclaimer_text, u.c(new TextLocalisedClause(R$string.swish_registration_confirmation_disclaimer_link, null, new Click(30, (Integer) null, (Object) null, "ID_CLICK_TERMS_AND_CONDITIONS", false), 10)), null, 12), false, null, 6));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174558c.f58608l), null, new c(this, null, 2), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
