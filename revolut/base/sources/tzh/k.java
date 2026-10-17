package tzh;

import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f275975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zud.a f275976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yud.g f275977c;

    public k(n walletInteractor, zud.a autoStakingConsentInteractor, yud.g stakingInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(autoStakingConsentInteractor, "autoStakingConsentInteractor");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        this.f275975a = walletInteractor;
        this.f275976b = autoStakingConsentInteractor;
        this.f275977c = stakingInteractor;
    }
}
