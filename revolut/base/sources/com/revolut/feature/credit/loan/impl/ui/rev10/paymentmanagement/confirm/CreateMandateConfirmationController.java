package com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.CreateMandateConfirmationController;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.CreateMandateConfirmationControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import g06.k;
import g53.e;
import g75.b;
import g75.d;
import g75.f;
import g75.g;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u45.a1;
import u45.z0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/paymentmanagement/confirm/CreateMandateConfirmationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg75/g;", "Ldli/a;", "Lg75/h;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreateMandateConfirmationController extends ViewController<g> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CreateMandateConfirmationController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CreateMandateConfirmationControllerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public CreateMandateConfirmationController(CreateMandateConfirmationControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = w.y0(new e(5));
        this.O = w.y0(new e(6));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: g75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateMandateConfirmationController f141110b;

            {
                this.f141110b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreateMandateConfirmationController createMandateConfirmationController = this.f141110b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreateMandateConfirmationController.S;
                        qji.b bVarU2 = createMandateConfirmationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.di.CreateMandateConfirmationControllerInjector");
                        z0 z0VarB = ((h75.a) bVarU2).b();
                        CreateMandateConfirmationControllerContract$InputData createMandateConfirmationControllerContract$InputData = createMandateConfirmationController.K;
                        switch (z0VarB.f277263a) {
                            case 0:
                                createMandateConfirmationControllerContract$InputData.getClass();
                                z0VarB.d = createMandateConfirmationControllerContract$InputData;
                                break;
                            default:
                                createMandateConfirmationControllerContract$InputData.getClass();
                                z0VarB.d = createMandateConfirmationControllerContract$InputData;
                                break;
                        }
                        return (a1) ((z0) z0VarB.mo3808a(createMandateConfirmationController)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreateMandateConfirmationController.S;
                        a1 a1Var = (a1) createMandateConfirmationController.P.getValue();
                        switch (a1Var.f277050a) {
                            case 0:
                                return (f) a1Var.f277052c.get();
                            default:
                                return (f) a1Var.f277052c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CreateMandateConfirmationController.S;
                        CreateMandateConfirmationController createMandateConfirmationController2 = this.f141110b;
                        return dli.f.a(createMandateConfirmationController2, (f) createMandateConfirmationController2.Q.getValue(), v.k(new TextDelegate(), (CellDetailsDelegate) createMandateConfirmationController2.N.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) createMandateConfirmationController2.O.getValue(), new FooterTextDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: g75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateMandateConfirmationController f141110b;

            {
                this.f141110b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreateMandateConfirmationController createMandateConfirmationController = this.f141110b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreateMandateConfirmationController.S;
                        qji.b bVarU2 = createMandateConfirmationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.di.CreateMandateConfirmationControllerInjector");
                        z0 z0VarB = ((h75.a) bVarU2).b();
                        CreateMandateConfirmationControllerContract$InputData createMandateConfirmationControllerContract$InputData = createMandateConfirmationController.K;
                        switch (z0VarB.f277263a) {
                            case 0:
                                createMandateConfirmationControllerContract$InputData.getClass();
                                z0VarB.d = createMandateConfirmationControllerContract$InputData;
                                break;
                            default:
                                createMandateConfirmationControllerContract$InputData.getClass();
                                z0VarB.d = createMandateConfirmationControllerContract$InputData;
                                break;
                        }
                        return (a1) ((z0) z0VarB.mo3808a(createMandateConfirmationController)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreateMandateConfirmationController.S;
                        a1 a1Var = (a1) createMandateConfirmationController.P.getValue();
                        switch (a1Var.f277050a) {
                            case 0:
                                return (f) a1Var.f277052c.get();
                            default:
                                return (f) a1Var.f277052c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CreateMandateConfirmationController.S;
                        CreateMandateConfirmationController createMandateConfirmationController2 = this.f141110b;
                        return dli.f.a(createMandateConfirmationController2, (f) createMandateConfirmationController2.Q.getValue(), v.k(new TextDelegate(), (CellDetailsDelegate) createMandateConfirmationController2.N.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) createMandateConfirmationController2.O.getValue(), new FooterTextDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: g75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateMandateConfirmationController f141110b;

            {
                this.f141110b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreateMandateConfirmationController createMandateConfirmationController = this.f141110b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreateMandateConfirmationController.S;
                        qji.b bVarU2 = createMandateConfirmationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.di.CreateMandateConfirmationControllerInjector");
                        z0 z0VarB = ((h75.a) bVarU2).b();
                        CreateMandateConfirmationControllerContract$InputData createMandateConfirmationControllerContract$InputData = createMandateConfirmationController.K;
                        switch (z0VarB.f277263a) {
                            case 0:
                                createMandateConfirmationControllerContract$InputData.getClass();
                                z0VarB.d = createMandateConfirmationControllerContract$InputData;
                                break;
                            default:
                                createMandateConfirmationControllerContract$InputData.getClass();
                                z0VarB.d = createMandateConfirmationControllerContract$InputData;
                                break;
                        }
                        return (a1) ((z0) z0VarB.mo3808a(createMandateConfirmationController)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreateMandateConfirmationController.S;
                        a1 a1Var = (a1) createMandateConfirmationController.P.getValue();
                        switch (a1Var.f277050a) {
                            case 0:
                                return (f) a1Var.f277052c.get();
                            default:
                                return (f) a1Var.f277052c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CreateMandateConfirmationController.S;
                        CreateMandateConfirmationController createMandateConfirmationController2 = this.f141110b;
                        return dli.f.a(createMandateConfirmationController2, (f) createMandateConfirmationController2.Q.getValue(), v.k(new TextDelegate(), (CellDetailsDelegate) createMandateConfirmationController2.N.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) createMandateConfirmationController2.O.getValue(), new FooterTextDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g75.h uiState = (g75.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Clause clause = uiState.f141116b;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        Clause clause2 = uiState.f141117c;
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        navBarWithToolbar.setSecondDescriptionText(clause2);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setVisibility(uiState.e ? 0 : 8);
        largeActionButton.setText(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (a1) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new d(this, null, 1), 3);
        ViewController.P2(this, new ay4.f(vkm.q.J(rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), rd0.e.b(((CellDetailsDelegate) this.N.getValue()).d)), yx4.b.Companion, 6), new k(this, null, 23), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
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
}
