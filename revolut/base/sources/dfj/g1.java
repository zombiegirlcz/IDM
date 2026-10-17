package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g1 implements bej.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7c.m f113976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nfj.f0 f113977b;

    public g1(q7c.m quoteInteractor, nfj.f0 phoneNumberCheckoutRepository) {
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(phoneNumberCheckoutRepository, "phoneNumberCheckoutRepository");
        this.f113976a = quoteInteractor;
        this.f113977b = phoneNumberCheckoutRepository;
    }
}
