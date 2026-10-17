package jt2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f178320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f178321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f178322c;
    public final b d;
    public final f e;
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f178323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vu.c f178324h;
    public final w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f178325j;

    public g(i loadingSection, q stepSection, m rewardSection, b activeSection, f inactiveSection, s termsConditionsSection, o rewardTargetAccountSectionStateMapper, vu.c configurationProvider, w userLevelBonusBannerStateMapper, k moreRewardSectionStateMapper) {
        Intrinsics.checkNotNullParameter(loadingSection, "loadingSection");
        Intrinsics.checkNotNullParameter(stepSection, "stepSection");
        Intrinsics.checkNotNullParameter(rewardSection, "rewardSection");
        Intrinsics.checkNotNullParameter(activeSection, "activeSection");
        Intrinsics.checkNotNullParameter(inactiveSection, "inactiveSection");
        Intrinsics.checkNotNullParameter(termsConditionsSection, "termsConditionsSection");
        Intrinsics.checkNotNullParameter(rewardTargetAccountSectionStateMapper, "rewardTargetAccountSectionStateMapper");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(userLevelBonusBannerStateMapper, "userLevelBonusBannerStateMapper");
        Intrinsics.checkNotNullParameter(moreRewardSectionStateMapper, "moreRewardSectionStateMapper");
        this.f178320a = loadingSection;
        this.f178321b = stepSection;
        this.f178322c = rewardSection;
        this.d = activeSection;
        this.e = inactiveSection;
        this.f = termsConditionsSection;
        this.f178323g = rewardTargetAccountSectionStateMapper;
        this.f178324h = configurationProvider;
        this.i = userLevelBonusBannerStateMapper;
        this.f178325j = moreRewardSectionStateMapper;
    }
}
