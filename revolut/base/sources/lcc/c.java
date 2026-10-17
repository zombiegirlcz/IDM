package lcc;

import com.revolut.retail.feature.esim.impl.ui.screens.refund_summary.EsimDataPlanRefundSummaryBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.refund_summary.EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.EsimRefundInfoBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.EsimRefundInfoBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.a;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.non_refundable.EsimNonRefundableBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.non_refundable.EsimNonRefundableBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.EsimRefundScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.EsimRefundScreenContract$RefundInfo;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.a;
import jnj.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f193837b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f193836a = i;
        this.f193837b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        final com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c) this.f193837b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        EsimRefundScreenContract$ModalStep step = (EsimRefundScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, EsimRefundScreenContract$ModalStep.HowRefundsCalculated.f101446a)) {
            EsimRefundInfoBottomSheetScreen esimRefundInfoBottomSheetScreen = new EsimRefundInfoBottomSheetScreen(EsimRefundInfoBottomSheetScreenContract$InputData.HowRefundsCalculated.f101436a);
            final int i = 1;
            Function1 block = new Function1() { // from class: lnj.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            jnj.e result = (jnj.e) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!Intrinsics.f(result, e.a.f176814a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar.C2(a.C0624a.f101453a);
                            return Unit.f186387a;
                        default:
                            com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.a result2 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.a) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!Intrinsics.f(result2, a.C0623a.f101438a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar.C2(a.C0624a.f101453a);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            esimRefundInfoBottomSheetScreen.H = block;
            return esimRefundInfoBottomSheetScreen;
        }
        if (Intrinsics.f(step, EsimRefundScreenContract$ModalStep.RefundPending.f101448a)) {
            EsimRefundInfoBottomSheetScreen esimRefundInfoBottomSheetScreen2 = new EsimRefundInfoBottomSheetScreen(EsimRefundInfoBottomSheetScreenContract$InputData.RefundPending.f101437a);
            final int i2 = 1;
            Function1 block2 = new Function1() { // from class: lnj.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            jnj.e result = (jnj.e) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!Intrinsics.f(result, e.a.f176814a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar.C2(a.C0624a.f101453a);
                            return Unit.f186387a;
                        default:
                            com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.a result2 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.a) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!Intrinsics.f(result2, a.C0623a.f101438a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar.C2(a.C0624a.f101453a);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            esimRefundInfoBottomSheetScreen2.H = block2;
            return esimRefundInfoBottomSheetScreen2;
        }
        if (!(step instanceof EsimRefundScreenContract$ModalStep.NonEligibleForRefund)) {
            if (!(step instanceof EsimRefundScreenContract$ModalStep.RefundSummary)) {
                throw new NoWhenBranchMatchedException();
            }
            EsimRefundScreenContract$RefundInfo esimRefundScreenContract$RefundInfo = ((EsimRefundScreenContract$ModalStep.RefundSummary) step).f101449a;
            return new EsimDataPlanRefundSummaryBottomSheetScreen(new EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData(esimRefundScreenContract$RefundInfo.f101450a, esimRefundScreenContract$RefundInfo.f101452c, esimRefundScreenContract$RefundInfo.d));
        }
        EsimNonRefundableBottomSheetScreen esimNonRefundableBottomSheetScreen = new EsimNonRefundableBottomSheetScreen(new EsimNonRefundableBottomSheetScreenContract$InputData(((EsimRefundScreenContract$ModalStep.NonEligibleForRefund) step).f101447a));
        final int i3 = 0;
        Function1 block3 = new Function1() { // from class: lnj.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i3) {
                    case 0:
                        jnj.e result = (jnj.e) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (!Intrinsics.f(result, e.a.f176814a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar.C2(a.C0624a.f101453a);
                        return Unit.f186387a;
                    default:
                        com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.a result2 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.a) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (!Intrinsics.f(result2, a.C0623a.f101438a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar.C2(a.C0624a.f101453a);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        esimNonRefundableBottomSheetScreen.H = block3;
        return esimNonRefundableBottomSheetScreen;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x038f  */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r53, java.lang.Object r54) {
        /*
            Method dump skipped, instruction units count: 3262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lcc.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
