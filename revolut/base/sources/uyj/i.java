package uyj;

import com.revolut.retail.feature.learn.impl.ui.share_rewards.ShareRewardsScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends jki.g implements jki.h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ShareRewardsScreenContract$InputData f284434p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jyj.b f284435q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ez8.b f284436r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tqi.g f284437s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f284438t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, ShareRewardsScreenContract$InputData inputData, jyj.b shareRewardArtist, ez8.b shareRewardImageCache, tqi.g shareNaviCommandFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shareRewardArtist, "shareRewardArtist");
        Intrinsics.checkNotNullParameter(shareRewardImageCache, "shareRewardImageCache");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        this.f284434p = inputData;
        this.f284435q = shareRewardArtist;
        this.f284436r = shareRewardImageCache;
        this.f284437s = shareNaviCommandFactory;
        this.f284438t = new d(null);
    }

    @Override // yji.l
    public final void I1() {
        l2(new h(this, this.f284434p.f101773a, null), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f284438t;
    }
}
