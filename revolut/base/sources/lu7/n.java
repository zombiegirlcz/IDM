package lu7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.InsuranceDetailsLayoutScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceDetailsLayoutScreenContract$InputData f200140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f200141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f200142c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f200143g;

    public n(s sVar, ViewController viewController, InsuranceDetailsLayoutScreenContract$InputData insuranceDetailsLayoutScreenContract$InputData) {
        this.f200141b = sVar;
        this.f200140a = insuranceDetailsLayoutScreenContract$InputData;
        int i = 14;
        this.f200142c = e4m.b.b(new lti.l(sVar, this, 1, i));
        this.d = e4m.b.b(new lti.l(sVar, this, 0, i));
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i2 = 14;
        this.f = e4m.b.b(new lti.l(sVar, this, 3, i2));
        this.f200143g = e4m.b.b(new lti.l(sVar, this, 2, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
