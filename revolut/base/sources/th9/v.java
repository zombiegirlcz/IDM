package th9;

import cli.y;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.PaymentReviewContract$InputData;
import ip0.v7;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends oki.h implements dli.b {

    @NotNull
    public static final s Companion = new s();
    public final PaymentReviewContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x02.d f271351p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f271352q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nh9.d f271353r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final nh9.e f271354s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f271355t;

    public v(PaymentReviewContract$InputData inputData, x02.d router, j interactor, nh9.d paymentExtension, nh9.e paymentResultExtension, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(paymentExtension, "paymentExtension");
        Intrinsics.checkNotNullParameter(paymentResultExtension, "paymentResultExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f271351p = router;
        this.f271352q = interactor;
        this.f271353r = paymentExtension;
        this.f271354s = paymentResultExtension;
        this.f271355t = mra.d.b(this, new a(inputData.f78797b, inputData.f78798c, null, inputData.e, inputData.f), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(v7.w(this.f271355t.B(new tfh.a(8))), new s9b.n(continuation, this, 28)), null, new t9h.b(this, continuation, 17), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f271355t;
    }
}
