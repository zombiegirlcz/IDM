package com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker;

import android.view.View;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.StrategyPickerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.StrategyPickerController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import g53.e;
import g85.b;
import g85.c;
import g85.f;
import g85.g;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import u45.c0;
import u45.y0;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/strategypicker/StrategyPickerController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lg85/c;", "Lg85/b;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StrategyPickerController extends BaseBottomSheetRecyclerController<c, b> {
    public static final /* synthetic */ int V = 0;
    public final StrategyPickerContract$InputData Q;
    public final Object R;
    public final Object S;
    public final Lazy T;
    public final Lazy U;

    public StrategyPickerController(StrategyPickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: g85.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StrategyPickerController f141288b;

            {
                this.f141288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StrategyPickerController strategyPickerController = this.f141288b;
                switch (i2) {
                    case 0:
                        int i3 = StrategyPickerController.V;
                        qji.b bVarU2 = strategyPickerController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.di.StrategyPickerInjector");
                        }
                        c0 c0Var = (c0) bVarU2;
                        u45.h hVar = c0Var.f277074b;
                        c0 c0Var2 = c0Var.f277075c;
                        StrategyPickerContract$InputData strategyPickerContract$InputData = strategyPickerController.Q;
                        strategyPickerContract$InputData.getClass();
                        return new y0(hVar, c0Var2, strategyPickerContract$InputData);
                    case 1:
                        int i5 = StrategyPickerController.V;
                        return (g) ((y0) strategyPickerController.R.getValue()).f277258b.get();
                    default:
                        int i6 = StrategyPickerController.V;
                        return u.c((SingleChoiceDelegate) strategyPickerController.T.getValue());
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: g85.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StrategyPickerController f141288b;

            {
                this.f141288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StrategyPickerController strategyPickerController = this.f141288b;
                switch (i22) {
                    case 0:
                        int i3 = StrategyPickerController.V;
                        qji.b bVarU2 = strategyPickerController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.di.StrategyPickerInjector");
                        }
                        c0 c0Var = (c0) bVarU2;
                        u45.h hVar = c0Var.f277074b;
                        c0 c0Var2 = c0Var.f277075c;
                        StrategyPickerContract$InputData strategyPickerContract$InputData = strategyPickerController.Q;
                        strategyPickerContract$InputData.getClass();
                        return new y0(hVar, c0Var2, strategyPickerContract$InputData);
                    case 1:
                        int i5 = StrategyPickerController.V;
                        return (g) ((y0) strategyPickerController.R.getValue()).f277258b.get();
                    default:
                        int i6 = StrategyPickerController.V;
                        return u.c((SingleChoiceDelegate) strategyPickerController.T.getValue());
                }
            }
        });
        this.T = j.b(new e(13));
        final int i3 = 2;
        this.U = j.b(new Function0(this) { // from class: g85.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StrategyPickerController f141288b;

            {
                this.f141288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StrategyPickerController strategyPickerController = this.f141288b;
                switch (i22) {
                    case 0:
                        int i32 = StrategyPickerController.V;
                        qji.b bVarU2 = strategyPickerController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.di.StrategyPickerInjector");
                        }
                        c0 c0Var = (c0) bVarU2;
                        u45.h hVar = c0Var.f277074b;
                        c0 c0Var2 = c0Var.f277075c;
                        StrategyPickerContract$InputData strategyPickerContract$InputData = strategyPickerController.Q;
                        strategyPickerContract$InputData.getClass();
                        return new y0(hVar, c0Var2, strategyPickerContract$InputData);
                    case 1:
                        int i5 = StrategyPickerController.V;
                        return (g) ((y0) strategyPickerController.R.getValue()).f277258b.get();
                    default:
                        int i6 = StrategyPickerController.V;
                        return u.c((SingleChoiceDelegate) strategyPickerController.T.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (y0) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((SingleChoiceDelegate) this.T.getValue()).p()), new g85.e(this, null), 3);
        ViewController.P2(this, e3(), new f(this, null, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (g) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getU() {
        return (List) this.U.getValue();
    }
}
