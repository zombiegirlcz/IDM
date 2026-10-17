package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e5 implements bej.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f113955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f113956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q7c.g f113957c;

    public e5(wsg.n walletInteractor, gte.a featureToggleInteractor, q7c.g paymentMethodsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(paymentMethodsInteractor, "paymentMethodsInteractor");
        this.f113955a = walletInteractor;
        this.f113956b = featureToggleInteractor;
        this.f113957c = paymentMethodsInteractor;
    }
}
