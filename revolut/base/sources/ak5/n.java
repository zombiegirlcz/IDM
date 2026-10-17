package ak5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements pk5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData f5722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f5723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f5724c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public n(j jVar, CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData) {
        this.f5722a = inputData;
        this.f5723b = e4m.b.b(new m(jVar, this, 1));
        this.f5724c = e4m.b.b(new m(jVar, this, 0));
        this.d = e4m.b.b(new m(jVar, this, 3));
        this.e = e4m.b.b(new m(jVar, this, 4));
        this.f = e4m.b.b(new m(jVar, this, 2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f5724c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
