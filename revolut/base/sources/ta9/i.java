package ta9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.onboarding.impl.onboarding.country.screen.CountryResidenceScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountryResidenceScreenContract$InputData f269228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f269229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0b.l f269230c;
    public final e4m.e d;

    public i(m mVar, h hVar, CountryResidenceScreenContract$InputData countryResidenceScreenContract$InputData) {
        this.f269229b = mVar;
        this.f269228a = countryResidenceScreenContract$InputData;
        int i = 20;
        this.f269230c = new t0b.l(mVar, this, 1, i);
        this.d = e4m.b.b(new t0b.l(mVar, this, 0, i));
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
