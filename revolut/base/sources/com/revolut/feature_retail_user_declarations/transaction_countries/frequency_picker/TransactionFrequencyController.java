package com.revolut.feature_retail_user_declarations.transaction_countries.frequency_picker;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature_retail_user_declarations.transaction_countries.frequency_picker.TransactionFrequencyController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oai.g0;
import oai.h0;
import oai.i0;
import pki.b;
import te0.w;
import v4a.a;
import vci.c;
import vci.d;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/transaction_countries/frequency_picker/TransactionFrequencyController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lvci/d;", "Lcli/k;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionFrequencyController extends BaseBottomSheetRecyclerController<d, k> {
    public static final /* synthetic */ int V = 0;
    public final c Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final List U;

    public TransactionFrequencyController(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: vci.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionFrequencyController f287756b;

            {
                this.f287756b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransactionFrequencyController transactionFrequencyController = this.f287756b;
                switch (i2) {
                    case 0:
                        int i3 = TransactionFrequencyController.V;
                        qji.b bVarU2 = transactionFrequencyController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.transaction_countries.frequency_picker.di.TransactionFrequencyControllerComponentInjector");
                        }
                        g0 g0Var = (g0) bVarU2;
                        i0 i0Var = g0Var.f223689b;
                        g0 g0Var2 = g0Var.f223690c;
                        c cVar = transactionFrequencyController.Q;
                        cVar.getClass();
                        return new h0(i0Var, g0Var2, cVar);
                    default:
                        int i5 = TransactionFrequencyController.V;
                        return (e) ((h0) transactionFrequencyController.R.getValue()).f223695b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: vci.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionFrequencyController f287756b;

            {
                this.f287756b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransactionFrequencyController transactionFrequencyController = this.f287756b;
                switch (i22) {
                    case 0:
                        int i3 = TransactionFrequencyController.V;
                        qji.b bVarU2 = transactionFrequencyController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.transaction_countries.frequency_picker.di.TransactionFrequencyControllerComponentInjector");
                        }
                        g0 g0Var = (g0) bVarU2;
                        i0 i0Var = g0Var.f223689b;
                        g0 g0Var2 = g0Var.f223690c;
                        c cVar = transactionFrequencyController.Q;
                        cVar.getClass();
                        return new h0(i0Var, g0Var2, cVar);
                    default:
                        int i5 = TransactionFrequencyController.V;
                        return (e) ((h0) transactionFrequencyController.R.getValue()).f223695b.get();
                }
            }
        });
        Lazy lazyY0 = w.y0(new a(27));
        this.T = lazyY0;
        this.U = u.c((SingleChoiceDelegate) lazyY0.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h0) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (vci.e) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SingleChoiceDelegate) this.T.getValue()).p()), null, new vci.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (vci.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
