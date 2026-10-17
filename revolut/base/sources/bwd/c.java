package bwd;

import b6a.d;
import btd.e;
import bwb.n;
import com.revolut.feature.staking.impl.service.rewards.StakingRewardsService;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingRewardsService f19319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f19320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f19321c;
    public final ze0.a d;
    public final Lazy e;
    public final x4l.c f;

    public c(StakingRewardsService service, j memoryCache, ue0.c storage, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f19319a = service;
        this.f19320b = memoryCache;
        this.f19321c = storage;
        this.d = forceReloadStrategyFactory;
        this.e = yhm.j.b(new bvb.a(this, 1));
        Continuation continuation = null;
        this.f = new x4l.c(new d(this, continuation, 14), new bq7.j(this, 21), new a(this, 0), new e(this, continuation, 13), new n(this, continuation, 1));
    }

    public static String a(String str) {
        return j6.a.q("STAKING_REWARDS_SUMMARY_KEY_", str);
    }
}
