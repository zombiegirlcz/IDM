package d7f;

import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import kotlin.jvm.internal.Intrinsics;
import vel.l;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f111952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final del.b f111953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RoboPortfolioInfo f111954c;
    public final vel.j d;

    public e(l performanceParameters, del.b portfolioBalance, RoboPortfolioInfo portfolioInfo, vel.j performance) {
        Intrinsics.checkNotNullParameter(performanceParameters, "performanceParameters");
        Intrinsics.checkNotNullParameter(portfolioBalance, "portfolioBalance");
        Intrinsics.checkNotNullParameter(portfolioInfo, "portfolioInfo");
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f111952a = performanceParameters;
        this.f111953b = portfolioBalance;
        this.f111954c = portfolioInfo;
        this.d = performance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f111952a, eVar.f111952a) && Intrinsics.f(this.f111953b, eVar.f111953b) && Intrinsics.f(this.f111954c, eVar.f111954c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f111954c.hashCode() + ((this.f111953b.hashCode() + (this.f111952a.hashCode() * 31)) * 31)) * 31);
    }
}
