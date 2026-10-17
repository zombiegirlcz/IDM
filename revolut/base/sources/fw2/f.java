package fw2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.card_security.GooglePayCardSecurityScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GooglePayCardSecurityScreenContract$InputData f138537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f138538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f138539c;
    public final e4m.e d;
    public final e4m.e e;

    public f(d dVar, h hVar, ViewController viewController, GooglePayCardSecurityScreenContract$InputData googlePayCardSecurityScreenContract$InputData) {
        this.f138537a = googlePayCardSecurityScreenContract$InputData;
        this.f138538b = viewController;
        this.f138539c = e4m.b.b(new fta.e(dVar, this, 1, 1));
        this.d = e4m.b.b(new fta.e(dVar, this, 2, 1));
        this.e = e4m.b.b(new fta.e(dVar, this, 0, 1));
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
