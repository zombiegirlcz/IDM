package lu7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_embedded.impl.ui.screen.eligible_cards.InsuranceEligibleCardsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceEligibleCardsScreenContract$InputData f200151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f200152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f200153c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public q(s sVar, ViewController viewController, InsuranceEligibleCardsScreenContract$InputData insuranceEligibleCardsScreenContract$InputData) {
        this.f200152b = sVar;
        this.f200151a = insuranceEligibleCardsScreenContract$InputData;
        this.f200153c = e4m.b.b(new lti.l(sVar, this, 1, 16));
        this.d = e4m.b.b(e4m.c.a(viewController));
        this.e = e4m.b.b(new lti.l(sVar, this, 2, 16));
        this.f = e4m.b.b(new lti.l(sVar, this, 0, 16));
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
