package vu1;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.blik.impl.ui.terms_acceptance.terms.TermsScreenContract$InputData;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms;
import kotlin.jvm.internal.Intrinsics;
import vnl.o;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends oki.h implements dli.b {
    public final eu1.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TermsScreenContract$InputData f292199p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f292200q;

    public h(eu1.a blikInteractor, TermsScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(blikInteractor, "blikInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = blikInteractor;
        this.f292199p = inputData;
        this.f292200q = mra.d.b(this, new d(new Data(null, null, true, 3, null), 0, ((ApmOnboardingStatusTerms) inputData.f61695a.get(0)).f61977a, ((ApmOnboardingStatusTerms) inputData.f61695a.get(0)).f61978b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new o(this, (ApmOnboardingStatusTerms) this.f292199p.f61695a.get(0), null, 5), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f292200q;
    }
}
