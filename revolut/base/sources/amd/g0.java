package amd;

import com.revolut.feature.retail.savings.api.navigation.models.TradingOnboardingState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TradingOnboardingState f6329c;

    public g0(String vaultId, String str, TradingOnboardingState tradingOnboardingState) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        this.f6327a = vaultId;
        this.f6328b = str;
        this.f6329c = tradingOnboardingState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f6327a, g0Var.f6327a) && Intrinsics.f(this.f6328b, g0Var.f6328b) && Intrinsics.f(this.f6329c, g0Var.f6329c);
    }

    public final int hashCode() {
        int iHashCode = this.f6327a.hashCode() * 31;
        String str = this.f6328b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        TradingOnboardingState tradingOnboardingState = this.f6329c;
        return iHashCode2 + (tradingOnboardingState != null ? tradingOnboardingState.hashCode() : 0);
    }
}
