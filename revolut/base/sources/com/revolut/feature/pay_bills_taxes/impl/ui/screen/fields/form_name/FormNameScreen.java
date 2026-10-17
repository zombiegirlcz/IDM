package com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.form_name;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.form_name.FormNameScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.form_name.FormNameScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lf9.i;
import lf9.m;
import qba.c;
import qg9.b;
import qg9.d;
import qg9.f;
import qg9.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/fields/form_name/FormNameScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqg9/f;", "Ldli/a;", "Lqg9/g;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FormNameScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(FormNameScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final FormNameScreenContract$InputData K;
    public final Object L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public FormNameScreen(FormNameScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new c(20));
        this.M = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: qg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormNameScreen f245702b;

            {
                this.f245702b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FormNameScreen formNameScreen = this.f245702b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FormNameScreen.R;
                        FormNameScreen formNameScreen2 = this.f245702b;
                        return dli.f.a(formNameScreen2, (h) formNameScreen2.Q.getValue(), u.c((InputTextDelegate) formNameScreen2.L.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FormNameScreen.R;
                        qji.b bVarU2 = formNameScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.form_name.di.FormNameScreenInjector");
                        lf9.h hVar = (lf9.h) bVarU2;
                        m mVar = hVar.f194717b;
                        lf9.h hVar2 = hVar.f194718c;
                        FormNameScreenContract$InputData formNameScreenContract$InputData = formNameScreen.K;
                        formNameScreenContract$InputData.getClass();
                        return new lf9.i(mVar, hVar2, formNameScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = FormNameScreen.R;
                        return (h) ((lf9.i) formNameScreen.P.getValue()).f194721b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: qg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormNameScreen f245702b;

            {
                this.f245702b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FormNameScreen formNameScreen = this.f245702b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FormNameScreen.R;
                        FormNameScreen formNameScreen2 = this.f245702b;
                        return dli.f.a(formNameScreen2, (h) formNameScreen2.Q.getValue(), u.c((InputTextDelegate) formNameScreen2.L.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FormNameScreen.R;
                        qji.b bVarU2 = formNameScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.form_name.di.FormNameScreenInjector");
                        lf9.h hVar = (lf9.h) bVarU2;
                        m mVar = hVar.f194717b;
                        lf9.h hVar2 = hVar.f194718c;
                        FormNameScreenContract$InputData formNameScreenContract$InputData = formNameScreen.K;
                        formNameScreenContract$InputData.getClass();
                        return new lf9.i(mVar, hVar2, formNameScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = FormNameScreen.R;
                        return (h) ((lf9.i) formNameScreen.P.getValue()).f194721b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: qg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormNameScreen f245702b;

            {
                this.f245702b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FormNameScreen formNameScreen = this.f245702b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FormNameScreen.R;
                        FormNameScreen formNameScreen2 = this.f245702b;
                        return dli.f.a(formNameScreen2, (h) formNameScreen2.Q.getValue(), u.c((InputTextDelegate) formNameScreen2.L.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FormNameScreen.R;
                        qji.b bVarU2 = formNameScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.form_name.di.FormNameScreenInjector");
                        lf9.h hVar = (lf9.h) bVarU2;
                        m mVar = hVar.f194717b;
                        lf9.h hVar2 = hVar.f194718c;
                        FormNameScreenContract$InputData formNameScreenContract$InputData = formNameScreen.K;
                        formNameScreenContract$InputData.getClass();
                        return new lf9.i(mVar, hVar2, formNameScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = FormNameScreen.R;
                        return (h) ((lf9.i) formNameScreen.P.getValue()).f194721b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174557b.setEnabled(uiState.f245707b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (qg9.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        int i = R$string.pay_bills_taxes_common_edit;
        String lowerCase = this.K.f78714a.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(lowerCase), null, 12);
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174557b.setText(new TextLocalisedClause(R$string.pay_bills_taxes_common_save, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new qg9.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new qg9.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.L.getValue()).e.f121375b), null, new d(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
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
        return (dli.c) this.O.getValue();
    }
}
