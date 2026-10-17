package noc;

import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f218000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RoboPortfolioInfo f218001b;

    public v(List assetAllocations, RoboPortfolioInfo portfolio) {
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        this.f218000a = assetAllocations;
        this.f218001b = portfolio;
    }

    @Override // noc.x
    public final List a() {
        return this.f218000a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f218000a, vVar.f218000a) && Intrinsics.f(this.f218001b, vVar.f218001b);
    }

    public final int hashCode() {
        return this.f218001b.hashCode() + (this.f218000a.hashCode() * 31);
    }
}
