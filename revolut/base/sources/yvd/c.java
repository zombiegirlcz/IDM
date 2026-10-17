package yvd;

import com.revolut.feature.staking.impl.service.general.StakingService;
import com.revolut.feature.staking.impl.service.pocket.StakingPocketService;
import dcl.q;
import java.util.List;
import jud.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import y4f.o;
import y5b.b0;
import yk6.m;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f317163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jud.b f317164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f317165c;
    public final q d;
    public final by5.a e;
    public final StakingPocketService f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StakingService f317166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f317167h;
    public final x4l.c i;

    public c(j memoryCache, jud.b stakingPocketsDao, f stakingRewardsDao, q stakingPocketsMapper, by5.a stakingRewardsMapper, StakingPocketService stakingPocketsService, StakingService stakingService) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(stakingPocketsDao, "stakingPocketsDao");
        Intrinsics.checkNotNullParameter(stakingRewardsDao, "stakingRewardsDao");
        Intrinsics.checkNotNullParameter(stakingPocketsMapper, "stakingPocketsMapper");
        Intrinsics.checkNotNullParameter(stakingRewardsMapper, "stakingRewardsMapper");
        Intrinsics.checkNotNullParameter(stakingPocketsService, "stakingPocketsService");
        Intrinsics.checkNotNullParameter(stakingService, "stakingService");
        this.f317163a = memoryCache;
        this.f317164b = stakingPocketsDao;
        this.f317165c = stakingRewardsDao;
        this.d = stakingPocketsMapper;
        this.e = stakingRewardsMapper;
        this.f = stakingPocketsService;
        this.f317166g = stakingService;
        Continuation continuation = null;
        final int i = 0;
        final int i2 = 0;
        this.f317167h = new x4l.c(new b0(this, continuation, 8), new Function1(this) { // from class: yvd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f317160b;

            {
                this.f317160b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f317160b.f317163a.get("CACHE_KEY_STAKING_POCKET");
                    default:
                        String pocketId = (String) obj2;
                        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                        j jVar = this.f317160b.f317163a;
                        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                        return (vtd.c) jVar.get("CACHE_KEY_STAKING_REWARDS_" + pocketId);
                }
            }
        }, new Function2(this) { // from class: yvd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f317162b;

            {
                this.f317162b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        List stakingPockets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(stakingPockets, "stakingPockets");
                        this.f317162b.f317163a.f("CACHE_KEY_STAKING_POCKET", stakingPockets);
                        break;
                    default:
                        String pocketId = (String) obj2;
                        vtd.c stakingRewards = (vtd.c) obj3;
                        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                        Intrinsics.checkNotNullParameter(stakingRewards, "stakingRewards");
                        this.f317162b.f317163a.f(a10.b.t(pocketId, "pocketId", "CACHE_KEY_STAKING_REWARDS_", pocketId), stakingRewards);
                        break;
                }
                return Unit.f186387a;
            }
        }, new yl6.b(this, continuation, 13), new wa7.j(this, continuation, 21));
        final int i3 = 1;
        this.i = new x4l.c(new o(this, null), new Function1(this) { // from class: yvd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f317160b;

            {
                this.f317160b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f317160b.f317163a.get("CACHE_KEY_STAKING_POCKET");
                    default:
                        String pocketId = (String) obj2;
                        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                        j jVar = this.f317160b.f317163a;
                        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                        return (vtd.c) jVar.get("CACHE_KEY_STAKING_REWARDS_" + pocketId);
                }
            }
        }, new Function2(this) { // from class: yvd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f317162b;

            {
                this.f317162b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        List stakingPockets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(stakingPockets, "stakingPockets");
                        this.f317162b.f317163a.f("CACHE_KEY_STAKING_POCKET", stakingPockets);
                        break;
                    default:
                        String pocketId = (String) obj2;
                        vtd.c stakingRewards = (vtd.c) obj3;
                        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                        Intrinsics.checkNotNullParameter(stakingRewards, "stakingRewards");
                        this.f317162b.f317163a.f(a10.b.t(pocketId, "pocketId", "CACHE_KEY_STAKING_REWARDS_", pocketId), stakingRewards);
                        break;
                }
                return Unit.f186387a;
            }
        }, new m(this, continuation, 20), new wa7.j(this, continuation, 22));
    }
}
