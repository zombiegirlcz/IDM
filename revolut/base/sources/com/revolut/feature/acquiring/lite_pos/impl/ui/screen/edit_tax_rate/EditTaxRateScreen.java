package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.R$id;
import com.revolut.feature.acquiring.lite_pos.impl.R$layout;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.EditTaxRateScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.EditTaxRateScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ld1.j;
import ld1.l;
import ld1.p;
import qe1.b;
import qe1.c;
import qe1.d;
import qe1.f;
import qe1.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/edit_tax_rate/EditTaxRateScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lqe1/g;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditTaxRateScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EditTaxRateScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenEditTaxRateBinding;", 0))};
    public final EditTaxRateScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final InputTextDelegate P;
    public final Object Q;

    public EditTaxRateScreen(EditTaxRateScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_edit_tax_rate;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: qe1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditTaxRateScreen f245049b;

            {
                this.f245049b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EditTaxRateScreen editTaxRateScreen = this.f245049b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EditTaxRateScreen.R;
                        qji.b bVarU2 = editTaxRateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.di.EditTaxRateScreenInjector");
                        p pVar = (p) bVarU2;
                        l lVar = pVar.f193985a;
                        p pVar2 = pVar.f193986b;
                        EditTaxRateScreenContract$InputData editTaxRateScreenContract$InputData = editTaxRateScreen.K;
                        editTaxRateScreenContract$InputData.getClass();
                        return new ld1.j(lVar, pVar2, editTaxRateScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditTaxRateScreen.R;
                        return (f) ((ld1.j) editTaxRateScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = EditTaxRateScreen.R;
                        EditTaxRateScreen editTaxRateScreen2 = this.f245049b;
                        return dli.f.a(editTaxRateScreen2, (f) editTaxRateScreen2.O.getValue(), u.c(editTaxRateScreen2.P), R$id.editTaxRateScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: qe1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditTaxRateScreen f245049b;

            {
                this.f245049b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EditTaxRateScreen editTaxRateScreen = this.f245049b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditTaxRateScreen.R;
                        qji.b bVarU2 = editTaxRateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.di.EditTaxRateScreenInjector");
                        p pVar = (p) bVarU2;
                        l lVar = pVar.f193985a;
                        p pVar2 = pVar.f193986b;
                        EditTaxRateScreenContract$InputData editTaxRateScreenContract$InputData = editTaxRateScreen.K;
                        editTaxRateScreenContract$InputData.getClass();
                        return new ld1.j(lVar, pVar2, editTaxRateScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditTaxRateScreen.R;
                        return (f) ((ld1.j) editTaxRateScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = EditTaxRateScreen.R;
                        EditTaxRateScreen editTaxRateScreen2 = this.f245049b;
                        return dli.f.a(editTaxRateScreen2, (f) editTaxRateScreen2.O.getValue(), u.c(editTaxRateScreen2.P), R$id.editTaxRateScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new InputTextDelegate(new qc8.a(10));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: qe1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditTaxRateScreen f245049b;

            {
                this.f245049b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EditTaxRateScreen editTaxRateScreen = this.f245049b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditTaxRateScreen.R;
                        qji.b bVarU2 = editTaxRateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.di.EditTaxRateScreenInjector");
                        p pVar = (p) bVarU2;
                        l lVar = pVar.f193985a;
                        p pVar2 = pVar.f193986b;
                        EditTaxRateScreenContract$InputData editTaxRateScreenContract$InputData = editTaxRateScreen.K;
                        editTaxRateScreenContract$InputData.getClass();
                        return new ld1.j(lVar, pVar2, editTaxRateScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditTaxRateScreen.R;
                        return (f) ((ld1.j) editTaxRateScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = EditTaxRateScreen.R;
                        EditTaxRateScreen editTaxRateScreen2 = this.f245049b;
                        return dli.f.a(editTaxRateScreen2, (f) editTaxRateScreen2.O.getValue(), u.c(editTaxRateScreen2.P), R$id.editTaxRateScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f172924b.setEnabled(uiState.f245054c);
        d3().f172925c.setMenuItems(uiState.f245053b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f172925c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.product_catalogue_flow_tax_rates_edit_tax_rate_percent_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f172924b.setText(new TextLocalisedClause(R$string.product_catalogue_common_action_save, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f172925c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f172925c.o.f57403b), new qc3.c(this, null, 5), 3);
        ViewController.P2(this, rd0.e.b(d3().f172924b.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.e.f121375b), new d(this, null), 3);
    }

    public final jd1.g d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jd1.g) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
