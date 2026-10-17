package m2j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f202048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xqe.b f202049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppg.b f202050c;
    public final gte.a d;

    public j0(wsg.b newWalletsInteractor, xqe.b teenProfileInteractor, ppg.b vaultsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(teenProfileInteractor, "teenProfileInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f202048a = newWalletsInteractor;
        this.f202049b = teenProfileInteractor;
        this.f202050c = vaultsInteractor;
        this.d = featureToggleInteractor;
    }
}
