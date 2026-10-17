package pt5;

import com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoInvestmentsFeatureConfig.CurrencyMode f239614a;

    public c(CryptoInvestmentsFeatureConfig.CurrencyMode currencyMode) {
        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
        this.f239614a = currencyMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f239614a, ((c) obj2).f239614a);
    }

    public final int hashCode() {
        return this.f239614a.hashCode();
    }
}
