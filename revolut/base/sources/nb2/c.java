package nb2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.PayToConfirmationScreenContract$InputData;
import java.util.Set;
import ms1.s;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayToConfirmationScreenContract$InputData f213967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f213968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f213969c;

    public c(b bVar, PayToConfirmationScreenContract$InputData payToConfirmationScreenContract$InputData) {
        this.f213967a = payToConfirmationScreenContract$InputData;
        int i = 14;
        this.f213968b = e4m.b.b(new s(bVar, this, 1, i));
        this.f213969c = e4m.b.b(new s(bVar, this, 0, i));
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
