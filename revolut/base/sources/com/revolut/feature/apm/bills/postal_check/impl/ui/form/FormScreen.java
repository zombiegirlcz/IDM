package com.revolut.feature.apm.bills.postal_check.impl.ui.form;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.postal_check.api.R$string;
import com.revolut.feature.apm.bills.postal_check.impl.ui.form.FormScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ir1.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mr1.b;
import mr1.d;
import mr1.f;
import mr1.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/postal_check/impl/ui/form/FormScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmr1/f;", "Ldli/a;", "Lmr1/g;", "feature_apm_bills_postal_check_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FormScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(FormScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final InputTextDelegate L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public FormScreen(FormScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = new InputTextDelegate(null);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: mr1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormScreen f208039b;

            {
                this.f208039b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = FormScreen.Q;
                        FormScreen formScreen = this.f208039b;
                        return dli.f.a(formScreen, (h) formScreen.P.getValue(), u.c(formScreen.L), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = FormScreen.Q;
                        return (h) ((ir1.c) this.f208039b.O.getValue()).f167959c.get();
                }
            }
        });
        this.N = s.t(this, b.f);
        this.O = w.y0(new mhd.b(this, inputData, 13));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: mr1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormScreen f208039b;

            {
                this.f208039b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FormScreen.Q;
                        FormScreen formScreen = this.f208039b;
                        return dli.f.a(formScreen, (h) formScreen.P.getValue(), u.c(formScreen.L), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = FormScreen.Q;
                        return (h) ((ir1.c) this.f208039b.O.getValue()).f167959c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f208044b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (mr1.h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.postal_check_form_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.postal_check_form_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174564b.setText(new TextLocalisedClause(R$string.postal_check_form_action, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new mr1.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new mr1.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.e.f121375b), null, new d(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
