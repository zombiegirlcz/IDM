package com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers.LoanRepaymentAccountsController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers.LoanRepaymentAccountsControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u45.t0;
import u45.u0;
import vc.s;
import w5b.b6;
import w65.c;
import w6h.f;
import w75.b;
import w75.g;
import w75.l;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentaccounts/multipleborrowers/LoanRepaymentAccountsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lw75/g;", "Ldli/a;", "Lw75/h;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanRepaymentAccountsController extends ViewController<g> implements a {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f70518a0 = {o0.f186429a.j(new h0(LoanRepaymentAccountsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final LoanRepaymentAccountsControllerContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final boolean V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    public LoanRepaymentAccountsController(LoanRepaymentAccountsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = w.y0(new b6(6));
        this.N = w.y0(new b6(7));
        this.O = w.y0(new b6(8));
        this.P = w.y0(new b6(9));
        this.Q = w.y0(new b6(10));
        this.R = w.y0(new b6(11));
        final int i = 5;
        this.S = w.y0(new Function0(this) { // from class: w75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentAccountsController f295467b;

            {
                this.f295467b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LoanRepaymentAccountsController loanRepaymentAccountsController = this.f295467b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanRepaymentAccountsController.f70518a0;
                        return v.k((SelectableDelegate) loanRepaymentAccountsController.R.getValue(), (LargeActionButtonDelegate) loanRepaymentAccountsController.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = LoanRepaymentAccountsController.f70518a0;
                        return (j60.a) ((u0) loanRepaymentAccountsController.Z.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = LoanRepaymentAccountsController.f70518a0;
                        LoanRepaymentAccountsController loanRepaymentAccountsController2 = this.f295467b;
                        return dli.f.a(loanRepaymentAccountsController2, (l) loanRepaymentAccountsController2.Y.getValue(), (List) loanRepaymentAccountsController2.S.getValue(), 0, null, null, null, 60);
                    case 3:
                        KProperty[] kPropertyArr4 = LoanRepaymentAccountsController.f70518a0;
                        return (l) ((u0) loanRepaymentAccountsController.Z.getValue()).f277231h.get();
                    case 4:
                        KProperty[] kPropertyArr5 = LoanRepaymentAccountsController.f70518a0;
                        qji.b bVarU2 = loanRepaymentAccountsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers.di.RepaymentAccountsScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        u45.h hVar = t0Var.f277222b;
                        t0 t0Var2 = t0Var.f277223c;
                        LoanRepaymentAccountsControllerContract$InputData loanRepaymentAccountsControllerContract$InputData = loanRepaymentAccountsController.K;
                        loanRepaymentAccountsControllerContract$InputData.getClass();
                        return new u0(hVar, t0Var2, loanRepaymentAccountsController, loanRepaymentAccountsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = LoanRepaymentAccountsController.f70518a0;
                        return v.k((FullScreenStateDelegate) loanRepaymentAccountsController.Q.getValue(), (CellDetailsSwitcherDelegate) loanRepaymentAccountsController.M.getValue(), (CellDetailsActionDelegate) loanRepaymentAccountsController.N.getValue(), (ListSubheaderDelegate) loanRepaymentAccountsController.O.getValue(), new RowDelegate(null, null, 7), new RowLoadingDelegate());
                }
            }
        });
        final int i2 = 0;
        this.T = w.y0(new Function0(this) { // from class: w75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentAccountsController f295467b;

            {
                this.f295467b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LoanRepaymentAccountsController loanRepaymentAccountsController = this.f295467b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanRepaymentAccountsController.f70518a0;
                        return v.k((SelectableDelegate) loanRepaymentAccountsController.R.getValue(), (LargeActionButtonDelegate) loanRepaymentAccountsController.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = LoanRepaymentAccountsController.f70518a0;
                        return (j60.a) ((u0) loanRepaymentAccountsController.Z.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = LoanRepaymentAccountsController.f70518a0;
                        LoanRepaymentAccountsController loanRepaymentAccountsController2 = this.f295467b;
                        return dli.f.a(loanRepaymentAccountsController2, (l) loanRepaymentAccountsController2.Y.getValue(), (List) loanRepaymentAccountsController2.S.getValue(), 0, null, null, null, 60);
                    case 3:
                        KProperty[] kPropertyArr4 = LoanRepaymentAccountsController.f70518a0;
                        return (l) ((u0) loanRepaymentAccountsController.Z.getValue()).f277231h.get();
                    case 4:
                        KProperty[] kPropertyArr5 = LoanRepaymentAccountsController.f70518a0;
                        qji.b bVarU2 = loanRepaymentAccountsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers.di.RepaymentAccountsScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        u45.h hVar = t0Var.f277222b;
                        t0 t0Var2 = t0Var.f277223c;
                        LoanRepaymentAccountsControllerContract$InputData loanRepaymentAccountsControllerContract$InputData = loanRepaymentAccountsController.K;
                        loanRepaymentAccountsControllerContract$InputData.getClass();
                        return new u0(hVar, t0Var2, loanRepaymentAccountsController, loanRepaymentAccountsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = LoanRepaymentAccountsController.f70518a0;
                        return v.k((FullScreenStateDelegate) loanRepaymentAccountsController.Q.getValue(), (CellDetailsSwitcherDelegate) loanRepaymentAccountsController.M.getValue(), (CellDetailsActionDelegate) loanRepaymentAccountsController.N.getValue(), (ListSubheaderDelegate) loanRepaymentAccountsController.O.getValue(), new RowDelegate(null, null, 7), new RowLoadingDelegate());
                }
            }
        });
        final int i3 = 1;
        this.U = w.y0(new Function0(this) { // from class: w75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentAccountsController f295467b;

            {
                this.f295467b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LoanRepaymentAccountsController loanRepaymentAccountsController = this.f295467b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanRepaymentAccountsController.f70518a0;
                        return v.k((SelectableDelegate) loanRepaymentAccountsController.R.getValue(), (LargeActionButtonDelegate) loanRepaymentAccountsController.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = LoanRepaymentAccountsController.f70518a0;
                        return (j60.a) ((u0) loanRepaymentAccountsController.Z.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = LoanRepaymentAccountsController.f70518a0;
                        LoanRepaymentAccountsController loanRepaymentAccountsController2 = this.f295467b;
                        return dli.f.a(loanRepaymentAccountsController2, (l) loanRepaymentAccountsController2.Y.getValue(), (List) loanRepaymentAccountsController2.S.getValue(), 0, null, null, null, 60);
                    case 3:
                        KProperty[] kPropertyArr4 = LoanRepaymentAccountsController.f70518a0;
                        return (l) ((u0) loanRepaymentAccountsController.Z.getValue()).f277231h.get();
                    case 4:
                        KProperty[] kPropertyArr5 = LoanRepaymentAccountsController.f70518a0;
                        qji.b bVarU2 = loanRepaymentAccountsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers.di.RepaymentAccountsScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        u45.h hVar = t0Var.f277222b;
                        t0 t0Var2 = t0Var.f277223c;
                        LoanRepaymentAccountsControllerContract$InputData loanRepaymentAccountsControllerContract$InputData = loanRepaymentAccountsController.K;
                        loanRepaymentAccountsControllerContract$InputData.getClass();
                        return new u0(hVar, t0Var2, loanRepaymentAccountsController, loanRepaymentAccountsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = LoanRepaymentAccountsController.f70518a0;
                        return v.k((FullScreenStateDelegate) loanRepaymentAccountsController.Q.getValue(), (CellDetailsSwitcherDelegate) loanRepaymentAccountsController.M.getValue(), (CellDetailsActionDelegate) loanRepaymentAccountsController.N.getValue(), (ListSubheaderDelegate) loanRepaymentAccountsController.O.getValue(), new RowDelegate(null, null, 7), new RowLoadingDelegate());
                }
            }
        });
        this.V = true;
        this.W = R$layout.screen_recycler_navbar;
        final int i5 = 2;
        this.X = w.y0(new Function0(this) { // from class: w75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentAccountsController f295467b;

            {
                this.f295467b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                LoanRepaymentAccountsController loanRepaymentAccountsController = this.f295467b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanRepaymentAccountsController.f70518a0;
                        return v.k((SelectableDelegate) loanRepaymentAccountsController.R.getValue(), (LargeActionButtonDelegate) loanRepaymentAccountsController.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = LoanRepaymentAccountsController.f70518a0;
                        return (j60.a) ((u0) loanRepaymentAccountsController.Z.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = LoanRepaymentAccountsController.f70518a0;
                        LoanRepaymentAccountsController loanRepaymentAccountsController2 = this.f295467b;
                        return dli.f.a(loanRepaymentAccountsController2, (l) loanRepaymentAccountsController2.Y.getValue(), (List) loanRepaymentAccountsController2.S.getValue(), 0, null, null, null, 60);
                    case 3:
                        KProperty[] kPropertyArr4 = LoanRepaymentAccountsController.f70518a0;
                        return (l) ((u0) loanRepaymentAccountsController.Z.getValue()).f277231h.get();
                    case 4:
                        KProperty[] kPropertyArr5 = LoanRepaymentAccountsController.f70518a0;
                        qji.b bVarU2 = loanRepaymentAccountsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers.di.RepaymentAccountsScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        u45.h hVar = t0Var.f277222b;
                        t0 t0Var2 = t0Var.f277223c;
                        LoanRepaymentAccountsControllerContract$InputData loanRepaymentAccountsControllerContract$InputData = loanRepaymentAccountsController.K;
                        loanRepaymentAccountsControllerContract$InputData.getClass();
                        return new u0(hVar, t0Var2, loanRepaymentAccountsController, loanRepaymentAccountsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = LoanRepaymentAccountsController.f70518a0;
                        return v.k((FullScreenStateDelegate) loanRepaymentAccountsController.Q.getValue(), (CellDetailsSwitcherDelegate) loanRepaymentAccountsController.M.getValue(), (CellDetailsActionDelegate) loanRepaymentAccountsController.N.getValue(), (ListSubheaderDelegate) loanRepaymentAccountsController.O.getValue(), new RowDelegate(null, null, 7), new RowLoadingDelegate());
                }
            }
        });
        final int i6 = 3;
        this.Y = w.y0(new Function0(this) { // from class: w75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentAccountsController f295467b;

            {
                this.f295467b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                LoanRepaymentAccountsController loanRepaymentAccountsController = this.f295467b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanRepaymentAccountsController.f70518a0;
                        return v.k((SelectableDelegate) loanRepaymentAccountsController.R.getValue(), (LargeActionButtonDelegate) loanRepaymentAccountsController.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = LoanRepaymentAccountsController.f70518a0;
                        return (j60.a) ((u0) loanRepaymentAccountsController.Z.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = LoanRepaymentAccountsController.f70518a0;
                        LoanRepaymentAccountsController loanRepaymentAccountsController2 = this.f295467b;
                        return dli.f.a(loanRepaymentAccountsController2, (l) loanRepaymentAccountsController2.Y.getValue(), (List) loanRepaymentAccountsController2.S.getValue(), 0, null, null, null, 60);
                    case 3:
                        KProperty[] kPropertyArr4 = LoanRepaymentAccountsController.f70518a0;
                        return (l) ((u0) loanRepaymentAccountsController.Z.getValue()).f277231h.get();
                    case 4:
                        KProperty[] kPropertyArr5 = LoanRepaymentAccountsController.f70518a0;
                        qji.b bVarU2 = loanRepaymentAccountsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers.di.RepaymentAccountsScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        u45.h hVar = t0Var.f277222b;
                        t0 t0Var2 = t0Var.f277223c;
                        LoanRepaymentAccountsControllerContract$InputData loanRepaymentAccountsControllerContract$InputData = loanRepaymentAccountsController.K;
                        loanRepaymentAccountsControllerContract$InputData.getClass();
                        return new u0(hVar, t0Var2, loanRepaymentAccountsController, loanRepaymentAccountsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = LoanRepaymentAccountsController.f70518a0;
                        return v.k((FullScreenStateDelegate) loanRepaymentAccountsController.Q.getValue(), (CellDetailsSwitcherDelegate) loanRepaymentAccountsController.M.getValue(), (CellDetailsActionDelegate) loanRepaymentAccountsController.N.getValue(), (ListSubheaderDelegate) loanRepaymentAccountsController.O.getValue(), new RowDelegate(null, null, 7), new RowLoadingDelegate());
                }
            }
        });
        final int i21 = 4;
        this.Z = w.y0(new Function0(this) { // from class: w75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentAccountsController f295467b;

            {
                this.f295467b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                LoanRepaymentAccountsController loanRepaymentAccountsController = this.f295467b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanRepaymentAccountsController.f70518a0;
                        return v.k((SelectableDelegate) loanRepaymentAccountsController.R.getValue(), (LargeActionButtonDelegate) loanRepaymentAccountsController.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = LoanRepaymentAccountsController.f70518a0;
                        return (j60.a) ((u0) loanRepaymentAccountsController.Z.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = LoanRepaymentAccountsController.f70518a0;
                        LoanRepaymentAccountsController loanRepaymentAccountsController2 = this.f295467b;
                        return dli.f.a(loanRepaymentAccountsController2, (l) loanRepaymentAccountsController2.Y.getValue(), (List) loanRepaymentAccountsController2.S.getValue(), 0, null, null, null, 60);
                    case 3:
                        KProperty[] kPropertyArr4 = LoanRepaymentAccountsController.f70518a0;
                        return (l) ((u0) loanRepaymentAccountsController.Z.getValue()).f277231h.get();
                    case 4:
                        KProperty[] kPropertyArr5 = LoanRepaymentAccountsController.f70518a0;
                        qji.b bVarU2 = loanRepaymentAccountsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers.di.RepaymentAccountsScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        u45.h hVar = t0Var.f277222b;
                        t0 t0Var2 = t0Var.f277223c;
                        LoanRepaymentAccountsControllerContract$InputData loanRepaymentAccountsControllerContract$InputData = loanRepaymentAccountsController.K;
                        loanRepaymentAccountsControllerContract$InputData.getClass();
                        return new u0(hVar, t0Var2, loanRepaymentAccountsController, loanRepaymentAccountsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = LoanRepaymentAccountsController.f70518a0;
                        return v.k((FullScreenStateDelegate) loanRepaymentAccountsController.Q.getValue(), (CellDetailsSwitcherDelegate) loanRepaymentAccountsController.M.getValue(), (CellDetailsActionDelegate) loanRepaymentAccountsController.N.getValue(), (ListSubheaderDelegate) loanRepaymentAccountsController.O.getValue(), new RowDelegate(null, null, 7), new RowLoadingDelegate());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        w75.h uiState = (w75.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(uiState.f295473a, null);
        navBarWithToolbar.setSecondDescriptionText(uiState.f295474b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u0) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.U.getValue()).d((List) this.T.getValue());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c(this, null, 3), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(((CellDetailsSwitcherDelegate) this.M.getValue()).f51912c), rd0.e.b(((CellDetailsActionDelegate) this.N.getValue()).d), rd0.e.b(((ListSubheaderDelegate) this.O.getValue()).f52707c), rd0.e.b(((FullScreenStateDelegate) this.Q.getValue()).f52371h.f121375b)), new w75.c(this, continuation, 0), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(((LargeActionButtonDelegate) this.P.getValue()).d.f121375b), rd0.e.b(w.a0(((SelectableDelegate) this.R.getValue()).r(), new f(1)))), new w75.c(this, continuation, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, f70518a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
