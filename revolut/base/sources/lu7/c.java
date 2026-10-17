package lu7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.card_claims.CardClaimsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardClaimsScreenContract$InputData f200073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f200074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f200075c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public c(s sVar, ViewController viewController, CardClaimsScreenContract$InputData cardClaimsScreenContract$InputData) {
        this.f200074b = sVar;
        this.f200073a = cardClaimsScreenContract$InputData;
        this.f200075c = e4m.b.b(new lti.l(sVar, this, 1, 7));
        this.d = e4m.b.b(e4m.c.a(viewController));
        this.e = e4m.b.b(new lti.l(sVar, this, 2, 7));
        this.f = e4m.b.b(new lti.l(sVar, this, 0, 7));
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
