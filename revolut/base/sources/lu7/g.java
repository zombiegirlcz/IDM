package lu7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_list.CoverageListScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoverageListScreenContract$InputData f200097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f200098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f200099c;

    public g(s sVar, f fVar, CoverageListScreenContract$InputData coverageListScreenContract$InputData) {
        this.f200097a = coverageListScreenContract$InputData;
        int i = 10;
        this.f200098b = e4m.b.b(new lti.l(sVar, this, 1, i));
        this.f200099c = e4m.b.b(new lti.l(sVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
