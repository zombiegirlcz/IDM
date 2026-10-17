package vn2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.BankAccountSwitchingStartDateSelectionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankAccountSwitchingStartDateSelectionScreenContract$InputData f290711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f290712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f290713c;
    public final e4m.e d;

    public q(h hVar, BankAccountSwitchingStartDateSelectionScreenContract$InputData bankAccountSwitchingStartDateSelectionScreenContract$InputData) {
        this.f290712b = hVar;
        this.f290711a = bankAccountSwitchingStartDateSelectionScreenContract$InputData;
        int i = 4;
        this.f290713c = e4m.b.b(new l(hVar, this, 1, i));
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
