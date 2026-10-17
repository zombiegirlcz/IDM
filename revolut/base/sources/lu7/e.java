package lu7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.CoverageDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoverageDetailsScreenContract$InputData f200085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f200086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f200087c;

    public e(s sVar, CoverageDetailsScreenContract$InputData coverageDetailsScreenContract$InputData) {
        this.f200085a = coverageDetailsScreenContract$InputData;
        int i = 9;
        this.f200086b = e4m.b.b(new lti.l(sVar, this, 1, i));
        this.f200087c = e4m.b.b(new lti.l(sVar, this, 0, i));
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
