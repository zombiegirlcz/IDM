package q9c;

import com.revolut.feature.revolutpay.api.domain.models.order.RevolutPayOrderSummaryContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends yji.n implements h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RevolutPayOrderSummaryContract$InputData f243865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ang.f f243866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t9c.a f243867n;

    public i(RevolutPayOrderSummaryContract$InputData inputData, ang.f userInteractor, t9c.a businessRevolutPayDeeplinkFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(businessRevolutPayDeeplinkFactory, "businessRevolutPayDeeplinkFactory");
        this.f243865l = inputData;
        this.f243866m = userInteractor;
        this.f243867n = businessRevolutPayDeeplinkFactory;
    }
}
