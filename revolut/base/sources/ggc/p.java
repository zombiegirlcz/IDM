package ggc;

import com.revolut.feature.rewards.api.model.rewards.RewardAvatar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardAvatar f143657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143659c;
    public final o d;

    public p(RewardAvatar rewardAvatar, String title, String str, o oVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f143657a = rewardAvatar;
        this.f143658b = title;
        this.f143659c = str;
        this.d = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f143657a, pVar.f143657a) && Intrinsics.f(this.f143658b, pVar.f143658b) && Intrinsics.f(this.f143659c, pVar.f143659c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        RewardAvatar rewardAvatar = this.f143657a;
        int iC = p.a.c((rewardAvatar == null ? 0 : rewardAvatar.hashCode()) * 31, 31, this.f143658b);
        String str = this.f143659c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        o oVar = this.d;
        return iHashCode + (oVar != null ? oVar.hashCode() : 0);
    }
}
