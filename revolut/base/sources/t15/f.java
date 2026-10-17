package t15;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.impl.ui.security_deposit.SecurityDepositInfoScreenContract$InputData;
import java.util.Set;
import t0b.l;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecurityDepositInfoScreenContract$InputData f267177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f267178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f267179c;

    public f(d dVar, SecurityDepositInfoScreenContract$InputData securityDepositInfoScreenContract$InputData) {
        this.f267177a = securityDepositInfoScreenContract$InputData;
        int i = 3;
        this.f267178b = e4m.b.b(new l(dVar, this, 1, i));
        this.f267179c = e4m.b.b(new l(dVar, this, 0, i));
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
