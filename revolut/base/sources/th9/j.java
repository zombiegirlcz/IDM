package th9;

import com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.PaymentReviewContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentReviewContract$InputData f271339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x02.b f271340b;

    public j(PaymentReviewContract$InputData inputData, x02.b quoteInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        this.f271339a = inputData;
        this.f271340b = quoteInteractor;
    }
}
