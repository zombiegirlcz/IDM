package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfj.k0 f113996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nfj.a2 f113997b;

    public i1(nfj.k0 esimPhoneNumberRepository, nfj.a2 subscriptionsRepository) {
        Intrinsics.checkNotNullParameter(esimPhoneNumberRepository, "esimPhoneNumberRepository");
        Intrinsics.checkNotNullParameter(subscriptionsRepository, "subscriptionsRepository");
        this.f113996a = esimPhoneNumberRepository;
        this.f113997b = subscriptionsRepository;
    }

    public final vkm.d a(String subscriptionId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        nfj.u0 u0Var = (nfj.u0) this.f113996a;
        u0Var.getClass();
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return u0Var.f215055g.b(new nfj.p0(subscriptionId), loadingStrategy);
    }
}
