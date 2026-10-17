package bt7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.CoverageDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoverageDetailsScreenContract$InputData f18416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f18417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f18418c;

    public f(i iVar, j jVar, CoverageDetailsScreenContract$InputData coverageDetailsScreenContract$InputData) {
        this.f18416a = coverageDetailsScreenContract$InputData;
        int i = 0;
        this.f18417b = e4m.b.b(new e(iVar, this, 1, i));
        this.f18418c = e4m.b.b(new e(iVar, this, 0, i));
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
