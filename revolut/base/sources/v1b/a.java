package v1b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.ConfirmationOfPayeeScreenContract$InputData;
import java.util.Set;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationOfPayeeScreenContract$InputData f285278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f285279b = e4m.b.b(new ux8.b(this, 4));

    public a(b bVar, ConfirmationOfPayeeScreenContract$InputData confirmationOfPayeeScreenContract$InputData) {
        this.f285278a = confirmationOfPayeeScreenContract$InputData;
    }

    public final h6d.c b() {
        return new h6d.c(this.f285278a, new g6d.c());
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
