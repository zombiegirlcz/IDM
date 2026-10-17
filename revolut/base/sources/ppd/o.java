package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.budget.BudgetFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BudgetFlowContract$InputData f238515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f238517c = this;
    public final e4m.e d;
    public final e4m.e e;

    public o(n nVar, BudgetFlowContract$InputData budgetFlowContract$InputData) {
        this.f238516b = nVar;
        this.f238515a = budgetFlowContract$InputData;
        int i = 8;
        this.d = e4m.b.b(new pl1.h(this, 1, i));
        this.e = e4m.b.b(new pl1.h(this, 0, i));
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
