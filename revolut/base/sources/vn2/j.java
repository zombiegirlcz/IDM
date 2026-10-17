package vn2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.bank_account_switching.impl.ui.link_list.BankAccountSwitchingLinkListScreenContract$InputData;
import java.util.Set;
import us6.r2;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankAccountSwitchingLinkListScreenContract$InputData f290688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f290689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f290690c;

    public j(h hVar, BankAccountSwitchingLinkListScreenContract$InputData bankAccountSwitchingLinkListScreenContract$InputData) {
        this.f290688a = bankAccountSwitchingLinkListScreenContract$InputData;
        int i = 29;
        this.f290689b = e4m.b.b(new r2(hVar, this, 1, i));
        this.f290690c = e4m.b.b(new r2(hVar, this, 0, i));
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
