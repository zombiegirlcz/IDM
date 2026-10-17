package vn2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.bank_account_switching.impl.ui.request_status.BankAccountSwitchingRequestStatusScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankAccountSwitchingRequestStatusScreenContract$InputData f290702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f290703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f290704c;
    public final e4m.e d;

    public n(h hVar, BankAccountSwitchingRequestStatusScreenContract$InputData bankAccountSwitchingRequestStatusScreenContract$InputData) {
        this.f290703b = hVar;
        this.f290702a = bankAccountSwitchingRequestStatusScreenContract$InputData;
        int i = 1;
        this.f290704c = e4m.b.b(new l(hVar, this, 1, i));
        this.d = e4m.b.b(new l(hVar, this, 0, i));
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
