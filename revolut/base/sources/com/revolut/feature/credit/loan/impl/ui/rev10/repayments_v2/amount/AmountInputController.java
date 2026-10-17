package com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.AmountInputController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.AmountInputControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import e54.r;
import e85.d;
import e85.j;
import e85.l;
import jii.i;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u45.c0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/AmountInputController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Le85/j;", "Ldli/a;", "Le85/l;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AmountInputController extends ViewController<j> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AmountInputController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarActionFooterBinding;", 0))};
    public final AmountInputControllerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final CenteredAmountDelegate Q;
    public final Object R;

    public AmountInputController(AmountInputControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_basic_navbar_action_footer;
        this.M = s.t(this, e85.b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: e85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountInputController f123577b;

            {
                this.f123577b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AmountInputController amountInputController = this.f123577b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AmountInputController.S;
                        qji.b bVarU2 = amountInputController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.di.AmountInputControllerInjector");
                        }
                        c0 c0Var = (c0) bVarU2;
                        u45.h hVar = c0Var.f277074b;
                        c0 c0Var2 = c0Var.f277075c;
                        AmountInputControllerContract$InputData amountInputControllerContract$InputData = amountInputController.K;
                        amountInputControllerContract$InputData.getClass();
                        return new u45.c(hVar, c0Var2, amountInputControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AmountInputController.S;
                        return (i) ((u45.c) amountInputController.N.getValue()).f277072g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AmountInputController.S;
                        qd0.b bVarN = ((u45.c) amountInputController.N.getValue()).f277070b.f277138q.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = AmountInputController.S;
                        AmountInputController amountInputController2 = this.f123577b;
                        return dli.f.a(amountInputController2, amountInputController2.k3(), u.c(amountInputController2.Q), amountInputController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: e85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountInputController f123577b;

            {
                this.f123577b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AmountInputController amountInputController = this.f123577b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AmountInputController.S;
                        qji.b bVarU2 = amountInputController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.di.AmountInputControllerInjector");
                        }
                        c0 c0Var = (c0) bVarU2;
                        u45.h hVar = c0Var.f277074b;
                        c0 c0Var2 = c0Var.f277075c;
                        AmountInputControllerContract$InputData amountInputControllerContract$InputData = amountInputController.K;
                        amountInputControllerContract$InputData.getClass();
                        return new u45.c(hVar, c0Var2, amountInputControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AmountInputController.S;
                        return (i) ((u45.c) amountInputController.N.getValue()).f277072g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AmountInputController.S;
                        qd0.b bVarN = ((u45.c) amountInputController.N.getValue()).f277070b.f277138q.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = AmountInputController.S;
                        AmountInputController amountInputController2 = this.f123577b;
                        return dli.f.a(amountInputController2, amountInputController2.k3(), u.c(amountInputController2.Q), amountInputController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: e85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountInputController f123577b;

            {
                this.f123577b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AmountInputController amountInputController = this.f123577b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AmountInputController.S;
                        qji.b bVarU2 = amountInputController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.di.AmountInputControllerInjector");
                        }
                        c0 c0Var = (c0) bVarU2;
                        u45.h hVar = c0Var.f277074b;
                        c0 c0Var2 = c0Var.f277075c;
                        AmountInputControllerContract$InputData amountInputControllerContract$InputData = amountInputController.K;
                        amountInputControllerContract$InputData.getClass();
                        return new u45.c(hVar, c0Var2, amountInputControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AmountInputController.S;
                        return (i) ((u45.c) amountInputController.N.getValue()).f277072g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AmountInputController.S;
                        qd0.b bVarN = ((u45.c) amountInputController.N.getValue()).f277070b.f277138q.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = AmountInputController.S;
                        AmountInputController amountInputController2 = this.f123577b;
                        return dli.f.a(amountInputController2, amountInputController2.k3(), u.c(amountInputController2.Q), amountInputController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        this.Q = new CenteredAmountDelegate(new r(this, 8));
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: e85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountInputController f123577b;

            {
                this.f123577b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AmountInputController amountInputController = this.f123577b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AmountInputController.S;
                        qji.b bVarU2 = amountInputController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.di.AmountInputControllerInjector");
                        }
                        c0 c0Var = (c0) bVarU2;
                        u45.h hVar = c0Var.f277074b;
                        c0 c0Var2 = c0Var.f277075c;
                        AmountInputControllerContract$InputData amountInputControllerContract$InputData = amountInputController.K;
                        amountInputControllerContract$InputData.getClass();
                        return new u45.c(hVar, c0Var2, amountInputControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AmountInputController.S;
                        return (i) ((u45.c) amountInputController.N.getValue()).f277072g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AmountInputController.S;
                        qd0.b bVarN = ((u45.c) amountInputController.N.getValue()).f277070b.f277138q.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = AmountInputController.S;
                        AmountInputController amountInputController2 = this.f123577b;
                        return dli.f.a(amountInputController2, amountInputController2.k3(), u.c(amountInputController2.Q), amountInputController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174527b.setModel(uiState.f123590b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u45.c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setItemAnimator(null);
        BasicNavBar basicNavBar = d3().f174528c;
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        basicNavBar.setTitle(new TextLocalisedClause(R$string.loan_management_repayment_v2_amount_title, null, null, 14));
        basicNavBar.setTitleCentered(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174528c.f59211b), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.Q.e.f121375b), new e85.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174527b.f), new d(this, continuation, 1), 3);
        ViewController.P2(this, new b75.d(rd0.e.b(d3().f174527b.e), yx4.b.Companion, 2), new e0b.c(this, continuation, 21), 3);
    }

    public final i d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (i) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final e85.i R2() {
        return (e85.i) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
