package oo2;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.BankAccountSwitchingPaymentsReviewScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends oki.h implements m {

    @NotNull
    public static final o Companion = new o();
    public final qo2.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f227004p;

    public p(cli.n stateMapper, BankAccountSwitchingPaymentsReviewScreenContract$InputData inputData, qo2.h paymentReviewInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(paymentReviewInteractor, "paymentReviewInteractor");
        this.o = paymentReviewInteractor;
        this.f227004p = mra.d.b(this, new i(inputData.f63951a, inputData.f63952b, inputData.f63953c, new Data(null, null, true, 3, null), inputData.d, (inputData.f63952b == mn2.a.CASS && inputData.f63953c == wn2.d.PARTIAL) ? Boolean.TRUE : null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new omg.e(this, null, 3), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f227004p;
    }
}
