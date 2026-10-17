package anb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.ui.automations.SavingsAutomationsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsAutomationsScreenContract$InputData f6679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f6680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f6681c;
    public final e4m.e d;
    public final e4m.e e;

    public o(n nVar, SavingsAutomationsScreenContract$InputData savingsAutomationsScreenContract$InputData) {
        this.f6680b = nVar;
        this.f6679a = savingsAutomationsScreenContract$InputData;
        int i = 10;
        this.f6681c = e4m.b.b(new ak5.f(nVar, this, 1, i));
        this.d = e4m.b.b(new ak5.f(nVar, this, 0, i));
        this.e = e4m.b.b(new ak5.f(nVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
