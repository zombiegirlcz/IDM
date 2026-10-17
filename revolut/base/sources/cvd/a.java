package cvd;

import kotlin.jvm.internal.Intrinsics;
import yud.g;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dwd.a f109330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f109331b;

    public a(dwd.a unstakingDataRepository, g stakingInteractor) {
        Intrinsics.checkNotNullParameter(unstakingDataRepository, "unstakingDataRepository");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        this.f109330a = unstakingDataRepository;
        this.f109331b = stakingInteractor;
    }
}
