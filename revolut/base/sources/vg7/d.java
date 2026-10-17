package vg7;

import com.revolut.feature.incentive_reward.impl.model.lotteries.LotteryDrawDetails$ShareInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LotteryDrawDetails$ShareInfo f288783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f288784b;

    public d(LotteryDrawDetails$ShareInfo details, ArrayList shareActions) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(shareActions, "shareActions");
        this.f288783a = details;
        this.f288784b = shareActions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f288783a, dVar.f288783a) && this.f288784b.equals(dVar.f288784b);
    }

    public final int hashCode() {
        return this.f288784b.hashCode() + (this.f288783a.hashCode() * 31);
    }
}
