package eyd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.statements.impl.ui.tax_filing.TaxFilingScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxFilingScreenContract$InputData f130732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f130733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130734c;

    public e0(b0 b0Var, TaxFilingScreenContract$InputData taxFilingScreenContract$InputData) {
        this.f130732a = taxFilingScreenContract$InputData;
        int i = 8;
        this.f130733b = e4m.b.b(new j(b0Var, this, 1, i));
        this.f130734c = e4m.b.b(new j(b0Var, this, 0, i));
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
