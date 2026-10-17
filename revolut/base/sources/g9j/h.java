package g9j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9j.a f141918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9j.g f141919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9j.d f141920c;
    public final cd5.c d;

    public h(h9j.a bannerMapper, h9j.g holdingMapper, h9j.d earningMapper, cd5.c stakingBannerMapper, cd5.f stakingProgressBarMapper) {
        Intrinsics.checkNotNullParameter(bannerMapper, "bannerMapper");
        Intrinsics.checkNotNullParameter(holdingMapper, "holdingMapper");
        Intrinsics.checkNotNullParameter(earningMapper, "earningMapper");
        Intrinsics.checkNotNullParameter(stakingBannerMapper, "stakingBannerMapper");
        Intrinsics.checkNotNullParameter(stakingProgressBarMapper, "stakingProgressBarMapper");
        this.f141918a = bannerMapper;
        this.f141919b = holdingMapper;
        this.f141920c = earningMapper;
        this.d = stakingBannerMapper;
    }
}
