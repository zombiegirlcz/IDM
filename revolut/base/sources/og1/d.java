package og1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GooglePayConfirmationControllerContract$InputData f224963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f224964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f224965c;
    public final e4m.e d;
    public final e4m.e e;

    public d(i iVar, e eVar, ViewController viewController, GooglePayConfirmationControllerContract$InputData googlePayConfirmationControllerContract$InputData) {
        this.f224963a = googlePayConfirmationControllerContract$InputData;
        this.f224964b = viewController;
        this.f224965c = e4m.b.b(new o41.b(iVar, this, 1, 26));
        this.d = e4m.b.b(new o41.b(iVar, this, 2, 26));
        this.e = e4m.b.b(new o41.b(iVar, this, 0, 26));
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
