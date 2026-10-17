package ld1;

import com.revolut.feature.acquiring.lite_pos.api.navigation.SelectTaxRateScreenProvider$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class v implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectTaxRateScreenProvider$InputData f194003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f194004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f194005c;

    public v(l lVar, SelectTaxRateScreenProvider$InputData selectTaxRateScreenProvider$InputData) {
        this.f194004b = lVar;
        this.f194003a = selectTaxRateScreenProvider$InputData;
        this.f194005c = e4m.b.b(new g(lVar, this, 5));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
