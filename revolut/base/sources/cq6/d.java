package cq6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq6.a f108004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f108005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yud.g f108006c;
    public final n d;

    public d(iq6.a autoStakingResultPopupProvider, c flexibleStakingBannerCustomisationRepository, yud.g stakingInteractor, n flexibleStakingBannerMapper) {
        Intrinsics.checkNotNullParameter(autoStakingResultPopupProvider, "autoStakingResultPopupProvider");
        Intrinsics.checkNotNullParameter(flexibleStakingBannerCustomisationRepository, "flexibleStakingBannerCustomisationRepository");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(flexibleStakingBannerMapper, "flexibleStakingBannerMapper");
        this.f108004a = autoStakingResultPopupProvider;
        this.f108005b = flexibleStakingBannerCustomisationRepository;
        this.f108006c = stakingInteractor;
        this.d = flexibleStakingBannerMapper;
    }
}
