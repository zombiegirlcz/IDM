package lu7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_embedded.impl.ui.flow.documents_review.InsuranceDocumentsReviewFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements jv7.b, xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceDocumentsReviewFlowContract$InputData f200148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f200149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f200150c = this;
    public final e4m.e d = e4m.b.b(new ljl.n(this, 18));

    public p(s sVar, InsuranceDocumentsReviewFlowContract$InputData insuranceDocumentsReviewFlowContract$InputData) {
        this.f200149b = sVar;
        this.f200148a = insuranceDocumentsReviewFlowContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // jv7.b
    public final jv7.a j() {
        return new d0(this.f200149b, this.f200150c);
    }
}
