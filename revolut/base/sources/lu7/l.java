package lu7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_activation.InsuranceCoverageActivationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceCoverageActivationScreenContract$InputData f200131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f200132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f200133c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public l(s sVar, ViewController viewController, InsuranceCoverageActivationScreenContract$InputData insuranceCoverageActivationScreenContract$InputData) {
        this.f200132b = sVar;
        this.f200131a = insuranceCoverageActivationScreenContract$InputData;
        this.f200133c = e4m.b.b(new lti.l(sVar, this, 1, 13));
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 13;
        this.e = e4m.b.b(new lti.l(sVar, this, 2, i));
        this.f = e4m.b.b(new lti.l(sVar, this, 0, i));
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
