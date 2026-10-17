package mic;

import com.revolut.feature.rewards.api.model.rewards.RewardAction;
import com.revolut.feature.rewards.api.model.rewards.RewardOutlet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ggc.l f205667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f205668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f205669c;
    public final RewardOutlet d;
    public final RewardAction e;
    public final kic.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f205670g;

    public k() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f205667a, kVar.f205667a) && this.f205668b == kVar.f205668b && Intrinsics.f(this.f205669c, kVar.f205669c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && this.f205670g == kVar.f205670g;
    }

    public final int hashCode() {
        ggc.l lVar = this.f205667a;
        int iD = p.a.d(j6.a.c((lVar == null ? 0 : lVar.hashCode()) * 31, 31, this.f205668b), 31, this.f205669c);
        RewardOutlet rewardOutlet = this.d;
        int iHashCode = (iD + (rewardOutlet == null ? 0 : rewardOutlet.hashCode())) * 31;
        RewardAction rewardAction = this.e;
        int iHashCode2 = (iHashCode + (rewardAction == null ? 0 : rewardAction.hashCode())) * 31;
        kic.h hVar = this.f;
        return Boolean.hashCode(this.f205670g) + ((iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31);
    }

    public k(ggc.l lVar, boolean z, List similarRewards, RewardOutlet rewardOutlet, RewardAction rewardAction, kic.h hVar, boolean z3) {
        Intrinsics.checkNotNullParameter(similarRewards, "similarRewards");
        this.f205667a = lVar;
        this.f205668b = z;
        this.f205669c = similarRewards;
        this.d = rewardOutlet;
        this.e = rewardAction;
        this.f = hVar;
        this.f205670g = z3;
    }

    public k(int i) {
        this(null, false, zhm.f0.f322471a, null, null, null, false);
    }
}
