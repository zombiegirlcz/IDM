package if2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmation.ConfirmationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationScreenContract$InputData f160836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f160837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f160838c;

    public a(f fVar, k kVar, ConfirmationScreenContract$InputData confirmationScreenContract$InputData) {
        this.f160836a = confirmationScreenContract$InputData;
        this.f160837b = e4m.b.b(new ehe.o(fVar, kVar, this, 1, 29));
        this.f160838c = e4m.b.b(new ehe.o(fVar, kVar, this, 0, 29));
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
