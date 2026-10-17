package bt6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.TaxHubAssessmentFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxHubAssessmentFlowContract$InputData f18353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f18354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f18355c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public j(b bVar, TaxHubAssessmentFlowContract$InputData taxHubAssessmentFlowContract$InputData) {
        this.f18354b = bVar;
        this.f18353a = taxHubAssessmentFlowContract$InputData;
        this.d = e4m.b.b(new b6b.m(bVar, this, 1, 24));
        this.e = e4m.b.b(new b6b.m(bVar, this, 0, 24));
        this.f = e4m.b.b(new b6b.m(bVar, this, 2, 24));
    }

    public final ex6.d b() {
        b bVar = this.f18354b;
        sf0.h hVarB = bVar.k.b();
        vc.s.j(hVarB);
        v60.e eVarA = bVar.f18300l.a();
        vc.s.j(eVarA);
        return new ex6.d(hVarB, eVarA);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
