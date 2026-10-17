package lu7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.MakeClaimScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MakeClaimScreenContract$InputData f200173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f200174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f200175c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f200176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f200177h;

    public t(s sVar, ViewController viewController, MakeClaimScreenContract$InputData makeClaimScreenContract$InputData) {
        this.f200174b = sVar;
        this.f200173a = makeClaimScreenContract$InputData;
        int i = 17;
        this.f200175c = e4m.b.b(new lti.l(sVar, this, 1, i));
        this.d = e4m.b.b(new lti.l(sVar, this, 0, i));
        this.e = e4m.b.b(new lti.l(sVar, this, 3, i));
        this.f = e4m.b.b(e4m.c.a(viewController));
        int i2 = 17;
        this.f200176g = e4m.b.b(new lti.l(sVar, this, 4, i2));
        this.f200177h = e4m.b.b(new lti.l(sVar, this, 2, i2));
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
