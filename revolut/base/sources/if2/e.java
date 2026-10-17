package if2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.subscription.UpiConfirmationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpiConfirmationScreenContract$InputData f160848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i9e.l f160849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i9e.l f160850c;
    public final e4m.e d;

    public e(f fVar, k kVar, UpiConfirmationScreenContract$InputData upiConfirmationScreenContract$InputData) {
        this.f160848a = upiConfirmationScreenContract$InputData;
        this.f160849b = new i9e.l(fVar, this, 1, 5);
        this.f160850c = new i9e.l(fVar, this, 2, 5);
        this.d = e4m.b.b(new i9e.l(fVar, this, 0, 5));
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
