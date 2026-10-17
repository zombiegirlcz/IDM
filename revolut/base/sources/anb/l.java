package anb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.ui.edit_account_name.SavingsAccountEditNameScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsAccountEditNameScreenContract$InputData f6657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f6658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f6659c;
    public final e4m.e d;

    public l(n nVar, SavingsAccountEditNameScreenContract$InputData savingsAccountEditNameScreenContract$InputData) {
        this.f6657a = savingsAccountEditNameScreenContract$InputData;
        int i = 9;
        this.f6658b = e4m.b.b(new ak5.f(nVar, this, 1, i));
        this.f6659c = e4m.b.b(new ak5.f(nVar, this, 0, i));
        this.d = e4m.b.b(new ak5.f(nVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f6659c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
