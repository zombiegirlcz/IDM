package com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bx4.c;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.confirmation.LoanConfirmWithdrawalController;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.confirmation.LoanConfirmWithdrawalControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import hwi.l0;
import hx7.i;
import i5b.d;
import i65.b;
import i65.n;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/cancellation_v2/confirmation/LoanConfirmWithdrawalController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Li65/n;", "Ldli/a;", "Li65/o;", "Lbx4/c;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanConfirmWithdrawalController extends ViewController<n> implements a, c {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(LoanConfirmWithdrawalController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final LoanConfirmWithdrawalControllerContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public LoanConfirmWithdrawalController(LoanConfirmWithdrawalControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: i65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanConfirmWithdrawalController f158858b;

            {
                this.f158858b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LoanConfirmWithdrawalController loanConfirmWithdrawalController = this.f158858b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanConfirmWithdrawalController.Q;
                        qji.b bVarU2 = loanConfirmWithdrawalController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.confirmation.di.LoanConfirmWithdrawalControllerInjector");
                        }
                        u45.k kVar = (u45.k) bVarU2;
                        u45.h hVar = kVar.f277161b;
                        u45.k kVar2 = kVar.f277162c;
                        LoanConfirmWithdrawalControllerContract$InputData loanConfirmWithdrawalControllerContract$InputData = loanConfirmWithdrawalController.K;
                        loanConfirmWithdrawalControllerContract$InputData.getClass();
                        return new u45.n(hVar, kVar2, loanConfirmWithdrawalController, loanConfirmWithdrawalControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanConfirmWithdrawalController.Q;
                        return (k) ((u45.n) loanConfirmWithdrawalController.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanConfirmWithdrawalController.Q;
                        LoanConfirmWithdrawalController loanConfirmWithdrawalController2 = this.f158858b;
                        return dli.f.a(loanConfirmWithdrawalController2, loanConfirmWithdrawalController2.d(), ((u45.n) loanConfirmWithdrawalController2.N.getValue()).c().Q(), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: i65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanConfirmWithdrawalController f158858b;

            {
                this.f158858b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LoanConfirmWithdrawalController loanConfirmWithdrawalController = this.f158858b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanConfirmWithdrawalController.Q;
                        qji.b bVarU2 = loanConfirmWithdrawalController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.confirmation.di.LoanConfirmWithdrawalControllerInjector");
                        }
                        u45.k kVar = (u45.k) bVarU2;
                        u45.h hVar = kVar.f277161b;
                        u45.k kVar2 = kVar.f277162c;
                        LoanConfirmWithdrawalControllerContract$InputData loanConfirmWithdrawalControllerContract$InputData = loanConfirmWithdrawalController.K;
                        loanConfirmWithdrawalControllerContract$InputData.getClass();
                        return new u45.n(hVar, kVar2, loanConfirmWithdrawalController, loanConfirmWithdrawalControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanConfirmWithdrawalController.Q;
                        return (k) ((u45.n) loanConfirmWithdrawalController.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanConfirmWithdrawalController.Q;
                        LoanConfirmWithdrawalController loanConfirmWithdrawalController2 = this.f158858b;
                        return dli.f.a(loanConfirmWithdrawalController2, loanConfirmWithdrawalController2.d(), ((u45.n) loanConfirmWithdrawalController2.N.getValue()).c().Q(), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: i65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanConfirmWithdrawalController f158858b;

            {
                this.f158858b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LoanConfirmWithdrawalController loanConfirmWithdrawalController = this.f158858b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanConfirmWithdrawalController.Q;
                        qji.b bVarU2 = loanConfirmWithdrawalController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.confirmation.di.LoanConfirmWithdrawalControllerInjector");
                        }
                        u45.k kVar = (u45.k) bVarU2;
                        u45.h hVar = kVar.f277161b;
                        u45.k kVar2 = kVar.f277162c;
                        LoanConfirmWithdrawalControllerContract$InputData loanConfirmWithdrawalControllerContract$InputData = loanConfirmWithdrawalController.K;
                        loanConfirmWithdrawalControllerContract$InputData.getClass();
                        return new u45.n(hVar, kVar2, loanConfirmWithdrawalController, loanConfirmWithdrawalControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanConfirmWithdrawalController.Q;
                        return (k) ((u45.n) loanConfirmWithdrawalController.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanConfirmWithdrawalController.Q;
                        LoanConfirmWithdrawalController loanConfirmWithdrawalController2 = this.f158858b;
                        return dli.f.a(loanConfirmWithdrawalController2, loanConfirmWithdrawalController2.d(), ((u45.n) loanConfirmWithdrawalController2.N.getValue()).c().Q(), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i65.o uiState = (i65.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        i.z(screenRecyclerNavbarActionFooterNavBar, uiState.f158869b);
        d3().f174533b.setModel(uiState.f158870c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u45.n) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new l0(this, null, 16), 3);
        ViewController.P2(this, new d(rd0.e.b(d3().f174533b.f), 2), new i65.e(this, null, 0), 3);
        ViewController.P2(this, new d(rd0.e.b(d3().f174533b.f58955g), 3), new i65.e(this, null, 1), 3);
    }

    public final k d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i65.k d() {
        return (i65.k) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
