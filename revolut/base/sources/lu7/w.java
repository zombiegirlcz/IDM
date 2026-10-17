package lu7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.SchemeInsuranceDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SchemeInsuranceDetailsScreenContract$InputData f200184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f200185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f200186c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f200187g;

    public w(s sVar, ViewController viewController, SchemeInsuranceDetailsScreenContract$InputData schemeInsuranceDetailsScreenContract$InputData) {
        this.f200184a = schemeInsuranceDetailsScreenContract$InputData;
        this.f200185b = e4m.b.b(e4m.c.a(viewController));
        int i = 19;
        this.f200186c = e4m.b.b(new lti.l(sVar, this, 2, i));
        this.d = e4m.b.b(new lti.l(sVar, this, 1, i));
        this.e = e4m.b.b(new lti.l(sVar, this, 0, i));
        this.f = e4m.b.b(new lti.l(sVar, this, 4, i));
        this.f200187g = e4m.b.b(new lti.l(sVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
