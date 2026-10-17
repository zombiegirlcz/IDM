package com.revolut.feature.payments_migration.impl.ui.screen.payment_selection;

import android.os.Parcelable;
import android.view.View;
import cli.k;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments_migration.impl.ui.screen.payment_selection.PaymentSelectionContract$InputData;
import com.revolut.feature.payments_migration.impl.ui.screen.payment_selection.PaymentSelectionController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mta.c;
import n6a.d;
import n6a.f;
import n6a.g;
import no.m;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/ui/screen/payment_selection/PaymentSelectionController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ln6a/d;", "Lcli/k;", "Lno/m;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentSelectionController extends BaseBottomSheetRecyclerController<d, k> implements m {
    public static final /* synthetic */ int W = 0;
    public final PaymentSelectionContract$InputData Q;
    public final AnalyticsProduct.Retail R;
    public final RowDelegate S;
    public final Object T;
    public final List U;
    public final Object V;

    public PaymentSelectionController(PaymentSelectionContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.R = a.h(k9Var, "value", k9Var);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.S = rowDelegate;
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: n6a.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentSelectionController f212752b;

            {
                this.f212752b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PaymentSelectionController paymentSelectionController = this.f212752b;
                switch (i2) {
                    case 0:
                        int i3 = PaymentSelectionController.W;
                        return (g) ((u5a.d) paymentSelectionController.V.getValue()).f277411b.get();
                    default:
                        int i5 = PaymentSelectionController.W;
                        qji.b bVarU2 = paymentSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments_migration.impl.ui.screen.payment_selection.di.PaymentSelectionControllerComponent.Injector");
                        u5a.g gVar = (u5a.g) bVarU2;
                        u5a.f fVar = gVar.f277428a;
                        u5a.g gVar2 = gVar.f277429b;
                        PaymentSelectionContract$InputData paymentSelectionContract$InputData = paymentSelectionController.Q;
                        paymentSelectionContract$InputData.getClass();
                        return new u5a.d(fVar, gVar2, paymentSelectionContract$InputData);
                }
            }
        });
        this.U = u.c(rowDelegate);
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: n6a.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentSelectionController f212752b;

            {
                this.f212752b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PaymentSelectionController paymentSelectionController = this.f212752b;
                switch (i22) {
                    case 0:
                        int i3 = PaymentSelectionController.W;
                        return (g) ((u5a.d) paymentSelectionController.V.getValue()).f277411b.get();
                    default:
                        int i5 = PaymentSelectionController.W;
                        qji.b bVarU2 = paymentSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments_migration.impl.ui.screen.payment_selection.di.PaymentSelectionControllerComponent.Injector");
                        u5a.g gVar = (u5a.g) bVarU2;
                        u5a.f fVar = gVar.f277428a;
                        u5a.g gVar2 = gVar.f277429b;
                        PaymentSelectionContract$InputData paymentSelectionContract$InputData = paymentSelectionController.Q;
                        paymentSelectionContract$InputData.getClass();
                        return new u5a.d(fVar, gVar2, paymentSelectionContract$InputData);
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u5a.d) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.S.f53218h), new f(this, null), 3);
        ViewController.P2(this, e3(), new c(this, null, 17), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (g) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
