package blb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.core.calculator.presentation.SavingsCalculatorScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsCalculatorScreenContract$InputData f16497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f16498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f16499c;
    public final e4m.e d;

    public c(e eVar, SavingsCalculatorScreenContract$InputData savingsCalculatorScreenContract$InputData) {
        this.f16498b = eVar;
        this.f16497a = savingsCalculatorScreenContract$InputData;
        int i = 13;
        this.f16499c = e4m.b.b(new aq1.e(eVar, this, 1, i));
        this.d = e4m.b.b(new aq1.e(eVar, this, 0, i));
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
