package i9g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fag.d0 f159814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qsg.b f159815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hyf.a f159816c;

    public l0(fag.d0 repository, qsg.b walletRepository, hyf.a travelExperiencesFeatureInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(walletRepository, "walletRepository");
        Intrinsics.checkNotNullParameter(travelExperiencesFeatureInteractor, "travelExperiencesFeatureInteractor");
        this.f159814a = repository;
        this.f159815b = walletRepository;
        this.f159816c = travelExperiencesFeatureInteractor;
    }

    public final efm.r a(String bookingId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.r rVarSwitchMap = ((c1g.m) this.f159816c).b().switchMap(new f0(6, new k0(this, bookingId, loadingStrategy, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }
}
