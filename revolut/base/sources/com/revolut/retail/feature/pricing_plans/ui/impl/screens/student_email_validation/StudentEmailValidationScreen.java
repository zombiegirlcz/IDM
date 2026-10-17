package com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_validation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.m6;
import aw0.n6;
import cli.o;
import cli.q;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_validation.StudentEmailValidationScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_validation.StudentEmailValidationScreenContract$InputData;
import dli.a;
import java.util.List;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qgk.i0;
import qgk.t1;
import qgk.y1;
import snk.b;
import snk.c;
import snk.d;
import snk.j;
import snk.l;
import te0.w;
import vc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/student_email_validation/StudentEmailValidationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsnk/j;", "Ldli/a;", "Lsnk/l;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StudentEmailValidationScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(StudentEmailValidationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final StudentEmailValidationScreenContract$InputData K;
    public final h L;
    public final int M;
    public final InputTextDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public StudentEmailValidationScreen(StudentEmailValidationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar_action_footer;
        this.N = new InputTextDelegate(null);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: snk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StudentEmailValidationScreen f264632b;

            {
                this.f264632b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StudentEmailValidationScreen studentEmailValidationScreen = this.f264632b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StudentEmailValidationScreen.R;
                        StudentEmailValidationScreen studentEmailValidationScreen2 = this.f264632b;
                        return dli.f.a(studentEmailValidationScreen2, studentEmailValidationScreen2.R2(), zhm.u.c(studentEmailValidationScreen2.N), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = StudentEmailValidationScreen.R;
                        qji.b bVarU2 = studentEmailValidationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_validation.di.StudentEmailValidationScreenInjector");
                        y1 y1Var = (y1) bVarU2;
                        i0 i0Var = y1Var.f246334b;
                        y1 y1Var2 = y1Var.f246335c;
                        StudentEmailValidationScreenContract$InputData studentEmailValidationScreenContract$InputData = studentEmailValidationScreen.K;
                        studentEmailValidationScreenContract$InputData.getClass();
                        return new t1(i0Var, y1Var2, studentEmailValidationScreen, studentEmailValidationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = StudentEmailValidationScreen.R;
                        return (k) ((t1) studentEmailValidationScreen.P.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: snk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StudentEmailValidationScreen f264632b;

            {
                this.f264632b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StudentEmailValidationScreen studentEmailValidationScreen = this.f264632b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StudentEmailValidationScreen.R;
                        StudentEmailValidationScreen studentEmailValidationScreen2 = this.f264632b;
                        return dli.f.a(studentEmailValidationScreen2, studentEmailValidationScreen2.R2(), zhm.u.c(studentEmailValidationScreen2.N), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = StudentEmailValidationScreen.R;
                        qji.b bVarU2 = studentEmailValidationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_validation.di.StudentEmailValidationScreenInjector");
                        y1 y1Var = (y1) bVarU2;
                        i0 i0Var = y1Var.f246334b;
                        y1 y1Var2 = y1Var.f246335c;
                        StudentEmailValidationScreenContract$InputData studentEmailValidationScreenContract$InputData = studentEmailValidationScreen.K;
                        studentEmailValidationScreenContract$InputData.getClass();
                        return new t1(i0Var, y1Var2, studentEmailValidationScreen, studentEmailValidationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = StudentEmailValidationScreen.R;
                        return (k) ((t1) studentEmailValidationScreen.P.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: snk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StudentEmailValidationScreen f264632b;

            {
                this.f264632b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StudentEmailValidationScreen studentEmailValidationScreen = this.f264632b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StudentEmailValidationScreen.R;
                        StudentEmailValidationScreen studentEmailValidationScreen2 = this.f264632b;
                        return dli.f.a(studentEmailValidationScreen2, studentEmailValidationScreen2.R2(), zhm.u.c(studentEmailValidationScreen2.N), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = StudentEmailValidationScreen.R;
                        qji.b bVarU2 = studentEmailValidationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_validation.di.StudentEmailValidationScreenInjector");
                        y1 y1Var = (y1) bVarU2;
                        i0 i0Var = y1Var.f246334b;
                        y1 y1Var2 = y1Var.f246335c;
                        StudentEmailValidationScreenContract$InputData studentEmailValidationScreenContract$InputData = studentEmailValidationScreen.K;
                        studentEmailValidationScreenContract$InputData.getClass();
                        return new t1(i0Var, y1Var2, studentEmailValidationScreen, studentEmailValidationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = StudentEmailValidationScreen.R;
                        return (k) ((t1) studentEmailValidationScreen.P.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        Clause clause = uiState.f264641a;
        if (clause != null) {
            navBarWithToolbar.setSecondDescriptionText(clause);
            navBarWithToolbar.setSecondDescriptionVisible(true);
        } else {
            navBarWithToolbar.setSecondDescriptionVisible(false);
        }
        List<? extends NavBarMenuItem> list = uiState.f264642b;
        if (list != null) {
            navBarWithToolbar.setMenuItems(list);
        } else {
            navBarWithToolbar.setMenuItems(f0.f322471a);
        }
        d3().f174533b.setModel(new e(false, uiState.f264643c, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.student_plans_register_email_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "VERIFY_BUTTON_TAG", uiState.e, null, null, null, 972), null, null, 53));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t1) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.student_plans_register_email_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        d3().f174533b.setModel(new e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.student_plans_register_email_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "VERIFY_BUTTON_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 55));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174534c.o.f57403b), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.N.e.f121375b), new snk.e(this, null), 3);
        int i = 1;
        ViewController.P2(this, rd0.e.b(d3().f174533b.e), new d(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new c(this, continuation, i), 3);
    }

    public final k d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final snk.k R2() {
        return (snk.k) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
