package u7k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl3.a f277965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f277966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.retail.feature.payments.payment_links.impl.ui.details.a f277967c;
    public final k61.a d;

    public k(cl3.a contactsInteractor, ang.f userInteractor, com.revolut.retail.feature.payments.payment_links.impl.ui.details.a paymentLinkDetailsProvider, k61.a transferInteractor) {
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(paymentLinkDetailsProvider, "paymentLinkDetailsProvider");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        this.f277965a = contactsInteractor;
        this.f277966b = userInteractor;
        this.f277967c = paymentLinkDetailsProvider;
        this.d = transferInteractor;
    }
}
