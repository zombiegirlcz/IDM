package dfj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b5 implements s4 {

    @NotNull
    public static final t4 Companion = new t4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s3 f113921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nfj.z1 f113922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ynj.i f113923c;

    public b5(s3 esimSubscriptionsInteractor, nfj.z1 esimSubscriptionsRefundQuoteRepository, ynj.i esimSubscriptionRefundDurationProvider) {
        Intrinsics.checkNotNullParameter(esimSubscriptionsInteractor, "esimSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(esimSubscriptionsRefundQuoteRepository, "esimSubscriptionsRefundQuoteRepository");
        Intrinsics.checkNotNullParameter(esimSubscriptionRefundDurationProvider, "esimSubscriptionRefundDurationProvider");
        this.f113921a = esimSubscriptionsInteractor;
        this.f113922b = esimSubscriptionsRefundQuoteRepository;
        this.f113923c = esimSubscriptionRefundDurationProvider;
    }
}
