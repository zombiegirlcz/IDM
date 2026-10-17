package ak5;

import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f5715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f5716b;

    public k(j jVar, l lVar) {
        this.f5715a = jVar;
        this.f5716b = lVar;
    }

    @Override // phm.a
    public final Object get() {
        CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData = this.f5716b.f5717a;
        gte.a aVarB = this.f5715a.f5703a.b();
        s.j(aVarB);
        return new com.revolut.feature.crypto.remittance.impl.ui.currency_picker.flow.a(inputData, aVarB);
    }
}
