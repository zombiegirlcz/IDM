package com.revolut.feature_retail_user_declarations.employer.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.employer.screen.EmployerController;
import com.revolut.feature_retail_user_declarations.employer.screen.EmployerControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.x;
import kbi.c;
import kbi.d;
import kbi.g;
import kbi.m;
import kji.f;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oai.i0;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/employer/screen/EmployerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature_retail_user_declarations/employer/screen/a;", "Ldli/a;", "Lkbi/m;", "Lkji/f;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmployerController extends ViewController<a> implements dli.a, f {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EmployerController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final EmployerControllerContract$InputData K;
    public final Object L;
    public final Object M;
    public final Lazy N;
    public final Object O;
    public final int P;
    public final h Q;

    public EmployerController(EmployerControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: kbi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmployerController f182597b;

            {
                this.f182597b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EmployerController employerController = this.f182597b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EmployerController.R;
                        qji.b bVarU2 = employerController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.employer.screen.di.EmployerControllerComponentInjector");
                        }
                        oai.n nVar = (oai.n) bVarU2;
                        i0 i0Var = nVar.f223742b;
                        oai.n nVar2 = nVar.f223743c;
                        EmployerControllerContract$InputData employerControllerContract$InputData = employerController.K;
                        employerControllerContract$InputData.getClass();
                        return new oai.m(i0Var, nVar2, employerControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EmployerController.R;
                        return (g) ((oai.m) employerController.L.getValue()).f223737c.get();
                    default:
                        KProperty[] kPropertyArr3 = EmployerController.R;
                        EmployerController employerController2 = this.f182597b;
                        return dli.f.a(employerController2, employerController2.d(), v.k((InputTextDelegate) employerController2.N.getValue(), new RowDelegate(null, null, 7)), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: kbi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmployerController f182597b;

            {
                this.f182597b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EmployerController employerController = this.f182597b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EmployerController.R;
                        qji.b bVarU2 = employerController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.employer.screen.di.EmployerControllerComponentInjector");
                        }
                        oai.n nVar = (oai.n) bVarU2;
                        i0 i0Var = nVar.f223742b;
                        oai.n nVar2 = nVar.f223743c;
                        EmployerControllerContract$InputData employerControllerContract$InputData = employerController.K;
                        employerControllerContract$InputData.getClass();
                        return new oai.m(i0Var, nVar2, employerControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EmployerController.R;
                        return (g) ((oai.m) employerController.L.getValue()).f223737c.get();
                    default:
                        KProperty[] kPropertyArr3 = EmployerController.R;
                        EmployerController employerController2 = this.f182597b;
                        return dli.f.a(employerController2, employerController2.d(), v.k((InputTextDelegate) employerController2.N.getValue(), new RowDelegate(null, null, 7)), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = j.b(new ka9.b(1));
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: kbi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmployerController f182597b;

            {
                this.f182597b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EmployerController employerController = this.f182597b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EmployerController.R;
                        qji.b bVarU2 = employerController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.employer.screen.di.EmployerControllerComponentInjector");
                        }
                        oai.n nVar = (oai.n) bVarU2;
                        i0 i0Var = nVar.f223742b;
                        oai.n nVar2 = nVar.f223743c;
                        EmployerControllerContract$InputData employerControllerContract$InputData = employerController.K;
                        employerControllerContract$InputData.getClass();
                        return new oai.m(i0Var, nVar2, employerControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EmployerController.R;
                        return (g) ((oai.m) employerController.L.getValue()).f223737c.get();
                    default:
                        KProperty[] kPropertyArr3 = EmployerController.R;
                        EmployerController employerController2 = this.f182597b;
                        return dli.f.a(employerController2, employerController2.d(), v.k((InputTextDelegate) employerController2.N.getValue(), new RowDelegate(null, null, 7)), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = R$layout.screen_recycler_navbar_two_buttons;
        this.Q = s.t(this, kbi.b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174573b.setEnabled(uiState.f182607b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (oai.m) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.onboarding_employer_selection_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.onboarding_employer_selection_subtitle, null, null, 14));
        EmployerControllerContract$InputData employerControllerContract$InputData = this.K;
        navBarWithToolbar.setNavigationButtonIcon(employerControllerContract$InputData.f97641b.a());
        d3().f174573b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        LargeActionButton largeActionButton = d3().e;
        largeActionButton.setText(new TextLocalisedClause(R$string.onboarding_employer_selection_self_employed, null, null, 14));
        largeActionButton.o(LargeActionButton.ButtonStyle.f58726b);
        this.z = employerControllerContract$InputData.f97641b.b();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Lazy lazy = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).f52575g.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).e.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new kbi.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new kbi.e(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new kbi.e(this, null, 2), 3);
    }

    public final x d3() {
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
