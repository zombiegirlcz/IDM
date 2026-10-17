package dfj;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfj.a2 f114105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f114106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm0.d f114107c;

    public s3(nfj.a2 esimSubscriptionsRepository, k0 esimInstallationStateInteractor, dm0.d deviceIdProvider) {
        Intrinsics.checkNotNullParameter(esimSubscriptionsRepository, "esimSubscriptionsRepository");
        Intrinsics.checkNotNullParameter(esimInstallationStateInteractor, "esimInstallationStateInteractor");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        this.f114105a = esimSubscriptionsRepository;
        this.f114106b = esimInstallationStateInteractor;
        this.f114107c = deviceIdProvider;
    }

    public final vkm.d a(String subscriptionId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        nfj.s2 s2Var = (nfj.s2) this.f114105a;
        s2Var.getClass();
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return s2Var.f215041g.b(subscriptionId, loadingStrategy);
    }

    public final t38.e b(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new t38.e(((nfj.s2) this.f114105a).i(loadingStrategy), 24, this.f114106b.b(w4l.i.f294643c), new bwb.n(this, null, 21));
    }

    public final Object c(String str, gim.c cVar) {
        Object objD = ((nfj.s2) this.f114105a).f215041g.d(str, true, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        return objD == aVar ? objD : Unit.f186387a;
    }

    public final Object d(gim.c cVar) {
        x4l.c cVar2 = ((nfj.s2) this.f114105a).f;
        Unit unit = Unit.f186387a;
        Object objD = cVar2.d(unit, true, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = unit;
        }
        return objD == aVar ? objD : unit;
    }
}
