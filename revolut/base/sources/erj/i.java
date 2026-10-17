package erj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.BudgetingFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements xki.c, vrj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BudgetingFlowContract$InputData f128708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f128709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f128710c = this;
    public final e4m.e d = e4m.b.b(new e51.b(this, 19));

    public i(h hVar, BudgetingFlowContract$InputData budgetingFlowContract$InputData) {
        this.f128709b = hVar;
        this.f128708a = budgetingFlowContract$InputData;
    }

    @Override // vrj.a
    public final vrj.b b() {
        return new o(this.f128709b, this.f128710c);
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
