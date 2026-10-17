package fw2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GooglePayConfirmationControllerContract$InputData f138540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f138541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f138542c;
    public final e4m.e d;
    public final e4m.e e;

    public g(d dVar, h hVar, ViewController viewController, GooglePayConfirmationControllerContract$InputData googlePayConfirmationControllerContract$InputData) {
        this.f138540a = googlePayConfirmationControllerContract$InputData;
        this.f138541b = viewController;
        this.f138542c = e4m.b.b(new fta.e(dVar, this, 1, 2));
        this.d = e4m.b.b(new fta.e(dVar, this, 2, 2));
        this.e = e4m.b.b(new fta.e(dVar, this, 0, 2));
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
