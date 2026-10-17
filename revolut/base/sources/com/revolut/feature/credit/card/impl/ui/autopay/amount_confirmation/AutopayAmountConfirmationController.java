package com.revolut.feature.credit.card.impl.ui.autopay.amount_confirmation;

import android.view.View;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.card.impl.ui.autopay.amount_confirmation.AutopayAmountConfirmationContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.amount_confirmation.AutopayAmountConfirmationController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jm4.a3;
import jm4.b0;
import jm4.j0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import rp4.a;
import rp4.d;
import rp4.g;
import rp4.h;
import rp4.j;
import te0.w;
import vkm.q;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/amount_confirmation/AutopayAmountConfirmationController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lrp4/d;", "Lrp4/a;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AutopayAmountConfirmationController extends BaseBottomSheetRecyclerController<d, a> {
    public static final /* synthetic */ int V = 0;
    public final AutopayAmountConfirmationContract$InputData Q;
    public final InputChecklistDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public AutopayAmountConfirmationController(AutopayAmountConfirmationContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        InputChecklistDelegate inputChecklistDelegate = new InputChecklistDelegate();
        this.R = inputChecklistDelegate;
        final int i = 0;
        final int i2 = 1;
        this.S = v.k(inputChecklistDelegate, new RowDelegate(null, null, 7));
        this.T = w.y0(new Function0(this) { // from class: rp4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutopayAmountConfirmationController f256261b;

            {
                this.f256261b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                AutopayAmountConfirmationController autopayAmountConfirmationController = this.f256261b;
                switch (i3) {
                    case 0:
                        int i5 = AutopayAmountConfirmationController.V;
                        qji.b bVarU2 = autopayAmountConfirmationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.autopay.amount_confirmation.di.AutopayAmountConfirmationInjector");
                        j0 j0Var = (j0) bVarU2;
                        a3 a3Var = j0Var.f176144b;
                        j0 j0Var2 = j0Var.f176145c;
                        AutopayAmountConfirmationContract$InputData autopayAmountConfirmationContract$InputData = autopayAmountConfirmationController.Q;
                        autopayAmountConfirmationContract$InputData.getClass();
                        return new b0(a3Var, j0Var2, autopayAmountConfirmationContract$InputData);
                    default:
                        int i6 = AutopayAmountConfirmationController.V;
                        return (j) ((b0) autopayAmountConfirmationController.T.getValue()).f175996b.get();
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: rp4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutopayAmountConfirmationController f256261b;

            {
                this.f256261b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                AutopayAmountConfirmationController autopayAmountConfirmationController = this.f256261b;
                switch (i3) {
                    case 0:
                        int i5 = AutopayAmountConfirmationController.V;
                        qji.b bVarU2 = autopayAmountConfirmationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.autopay.amount_confirmation.di.AutopayAmountConfirmationInjector");
                        j0 j0Var = (j0) bVarU2;
                        a3 a3Var = j0Var.f176144b;
                        j0 j0Var2 = j0Var.f176145c;
                        AutopayAmountConfirmationContract$InputData autopayAmountConfirmationContract$InputData = autopayAmountConfirmationController.Q;
                        autopayAmountConfirmationContract$InputData.getClass();
                        return new b0(a3Var, j0Var2, autopayAmountConfirmationContract$InputData);
                    default:
                        int i6 = AutopayAmountConfirmationController.V;
                        return (j) ((b0) autopayAmountConfirmationController.T.getValue()).f175996b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b0) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (j) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        InputChecklistDelegate inputChecklistDelegate = this.R;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(inputChecklistDelegate.f52518c), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputChecklistDelegate.p()), new h(this, continuation, 0), 3);
        ViewController.P2(this, new an9.g(q.J(e3(), f3()), 26), new h(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (j) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
