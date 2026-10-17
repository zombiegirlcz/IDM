package wel;

import com.revolut.shared.feature.wealth.models.portfolio.TradingOnboardingStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingOnboardingStatus f296827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f296829c;
    public final boolean d;

    public h(TradingOnboardingStatus onboardingStatus, String str, j jVar, boolean z) {
        Intrinsics.checkNotNullParameter(onboardingStatus, "onboardingStatus");
        this.f296827a = onboardingStatus;
        this.f296828b = str;
        this.f296829c = jVar;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f296827a == hVar.f296827a && Intrinsics.f(this.f296828b, hVar.f296828b) && this.f296829c == hVar.f296829c && this.d == hVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f296827a.hashCode() * 31;
        String str = this.f296828b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        j jVar = this.f296829c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31);
    }
}
