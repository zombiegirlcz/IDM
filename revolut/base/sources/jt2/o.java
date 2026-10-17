package jt2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ws2.f f178330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vu.g f178331b;

    public o(ws2.f rewardTargetAccountMapper, vu.g resourceProvider, n5j.k referralRewardAccountManageGuard) {
        Intrinsics.checkNotNullParameter(rewardTargetAccountMapper, "rewardTargetAccountMapper");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(referralRewardAccountManageGuard, "referralRewardAccountManageGuard");
        this.f178330a = rewardTargetAccountMapper;
        this.f178331b = resourceProvider;
    }
}
