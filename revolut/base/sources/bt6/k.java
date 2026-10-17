package bt6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.TaxHubAssessmentScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxHubAssessmentScreenContract$InputData f18357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f18358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f18359c;
    public final e4m.e d;

    public k(b bVar, j jVar, TaxHubAssessmentScreenContract$InputData taxHubAssessmentScreenContract$InputData) {
        this.f18357a = taxHubAssessmentScreenContract$InputData;
        this.f18358b = e4m.b.b(new afj.d(bVar, jVar, this, 1, 16));
        int i = 16;
        this.f18359c = e4m.b.b(new afj.d(bVar, jVar, this, 0, i));
        this.d = e4m.b.b(new afj.d(bVar, jVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f18359c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
