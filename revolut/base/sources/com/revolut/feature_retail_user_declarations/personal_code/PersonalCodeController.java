package com.revolut.feature_retail_user_declarations.personal_code;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.personal_code.PersonalCodeContract$InputData;
import com.revolut.feature_retail_user_declarations.personal_code.PersonalCodeController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oai.i0;
import oai.q;
import oai.x;
import pki.b;
import te0.w;
import vc.s;
import wbi.d;
import wbi.e;
import wbi.g;
import wbi.i;
import wbi.j;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/personal_code/PersonalCodeController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwbi/d;", "Ldli/a;", "Lwbi/e;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PersonalCodeController extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PersonalCodeController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PersonalCodeContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final InputTextDelegate Q;
    public final Object R;

    public PersonalCodeController(PersonalCodeContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = true;
        this.N = s.t(this, g.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: wbi.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalCodeController f296226b;

            {
                this.f296226b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PersonalCodeController personalCodeController = this.f296226b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PersonalCodeController.S;
                        qji.b bVarU2 = personalCodeController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.personal_code.di.PersonalCodeControllerInjector");
                        q qVar = (q) bVarU2;
                        i0 i0Var = qVar.f223759b;
                        q qVar2 = qVar.f223760c;
                        PersonalCodeContract$InputData personalCodeContract$InputData = personalCodeController.K;
                        personalCodeContract$InputData.getClass();
                        return new x(i0Var, qVar2, personalCodeContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PersonalCodeController.S;
                        return (j) ((x) personalCodeController.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = PersonalCodeController.S;
                        PersonalCodeController personalCodeController2 = this.f296226b;
                        return dli.f.a(personalCodeController2, (j) personalCodeController2.P.getValue(), u.c(personalCodeController2.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: wbi.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalCodeController f296226b;

            {
                this.f296226b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PersonalCodeController personalCodeController = this.f296226b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PersonalCodeController.S;
                        qji.b bVarU2 = personalCodeController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.personal_code.di.PersonalCodeControllerInjector");
                        q qVar = (q) bVarU2;
                        i0 i0Var = qVar.f223759b;
                        q qVar2 = qVar.f223760c;
                        PersonalCodeContract$InputData personalCodeContract$InputData = personalCodeController.K;
                        personalCodeContract$InputData.getClass();
                        return new x(i0Var, qVar2, personalCodeContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PersonalCodeController.S;
                        return (j) ((x) personalCodeController.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = PersonalCodeController.S;
                        PersonalCodeController personalCodeController2 = this.f296226b;
                        return dli.f.a(personalCodeController2, (j) personalCodeController2.P.getValue(), u.c(personalCodeController2.Q), 0, null, null, null, 60);
                }
            }
        });
        this.Q = new InputTextDelegate(null);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: wbi.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalCodeController f296226b;

            {
                this.f296226b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PersonalCodeController personalCodeController = this.f296226b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PersonalCodeController.S;
                        qji.b bVarU2 = personalCodeController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.personal_code.di.PersonalCodeControllerInjector");
                        q qVar = (q) bVarU2;
                        i0 i0Var = qVar.f223759b;
                        q qVar2 = qVar.f223760c;
                        PersonalCodeContract$InputData personalCodeContract$InputData = personalCodeController.K;
                        personalCodeContract$InputData.getClass();
                        return new x(i0Var, qVar2, personalCodeContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PersonalCodeController.S;
                        return (j) ((x) personalCodeController.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = PersonalCodeController.S;
                        PersonalCodeController personalCodeController2 = this.f296226b;
                        return dli.f.a(personalCodeController2, (j) personalCodeController2.P.getValue(), u.c(personalCodeController2.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f296224b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (j) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        int i = R$string.personal_code_input_title;
        PersonalCodeContract$InputData personalCodeContract$InputData = this.K;
        navBarWithToolbar.setTitle(new TextLocalisedClause(i, u.c(personalCodeContract$InputData.f97706b), null, 12), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.personal_code_input_subtitle, u.c(personalCodeContract$InputData.f97706b), null, 12));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174564b.setText(new TextLocalisedClause(R$string.common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new wbi.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new wbi.h(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.e.f121375b), null, new i(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
