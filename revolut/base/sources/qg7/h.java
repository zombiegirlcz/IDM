package qg7;

import com.revolut.feature.incentive_reward.impl.model.lotteries.LotteryDrawDetails$ShareInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LotteryDrawDetails$ShareInfo f245670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f245671b;

    public h(LotteryDrawDetails$ShareInfo details, boolean z) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f245670a = details;
        this.f245671b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f245670a, hVar.f245670a) && this.f245671b == hVar.f245671b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f245671b) + (this.f245670a.hashCode() * 31);
    }
}
