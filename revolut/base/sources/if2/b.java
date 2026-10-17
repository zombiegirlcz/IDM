package if2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmed.ConfirmedScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmedScreenContract$InputData f160839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f160840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f160841c;

    public b(f fVar, k kVar, ConfirmedScreenContract$InputData confirmedScreenContract$InputData) {
        this.f160839a = confirmedScreenContract$InputData;
        int i = 11;
        this.f160840b = e4m.b.b(new i72.j(this, 1, i));
        this.f160841c = e4m.b.b(new i72.j(this, 0, i));
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
