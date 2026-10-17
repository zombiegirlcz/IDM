package ak5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements rk5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData f5717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f5718b;

    public l(j jVar, CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData) {
        this.f5717a = inputData;
        this.f5718b = e4m.b.b(new k(jVar, this));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
