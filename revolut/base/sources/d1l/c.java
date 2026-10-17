package d1l;

import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingOnboardingFeatureConfig.TradingAccountOrType f110663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EndPromptType f110664b;

    public c(TradingOnboardingFeatureConfig.TradingAccountOrType tradingAccountOrType, EndPromptType endPromptType) {
        Intrinsics.checkNotNullParameter(tradingAccountOrType, "tradingAccountOrType");
        Intrinsics.checkNotNullParameter(endPromptType, "endPromptType");
        this.f110663a = tradingAccountOrType;
        this.f110664b = endPromptType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f110663a, cVar.f110663a) && this.f110664b == cVar.f110664b;
    }

    public final int hashCode() {
        return this.f110664b.hashCode() + (this.f110663a.hashCode() * 31);
    }
}
