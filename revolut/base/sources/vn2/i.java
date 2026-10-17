package vn2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.bank_account_switching.impl.ui.form.BankAccountSwitchingFormScreenContract$InputData;
import java.util.Set;
import us6.r2;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankAccountSwitchingFormScreenContract$InputData f290685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f290686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f290687c;
    public final e4m.e d;

    public i(h hVar, BankAccountSwitchingFormScreenContract$InputData bankAccountSwitchingFormScreenContract$InputData) {
        this.f290686b = hVar;
        this.f290685a = bankAccountSwitchingFormScreenContract$InputData;
        int i = 28;
        this.f290687c = e4m.b.b(new r2(hVar, this, 1, i));
        this.d = e4m.b.b(new r2(hVar, this, 0, i));
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
