package fhh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.tax_advantage_account.impl.ui.tax_allowance_detail.TaxAllowanceDetailScreenContract$InputData;
import fa0.q;
import java.util.Set;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxAllowanceDetailScreenContract$InputData f135230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f135231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f135232c;

    public a(b bVar, TaxAllowanceDetailScreenContract$InputData taxAllowanceDetailScreenContract$InputData) {
        this.f135230a = taxAllowanceDetailScreenContract$InputData;
        int i = 16;
        this.f135231b = e4m.b.b(new q(bVar, this, 1, i));
        this.f135232c = e4m.b.b(new q(bVar, this, 0, i));
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
