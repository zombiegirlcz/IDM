package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.execution.IncomeSorterExecutionContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSorterExecutionContract$InputData f238423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238425c;
    public final e4m.e d;

    public h0(n nVar, j0 j0Var, IncomeSorterExecutionContract$InputData incomeSorterExecutionContract$InputData) {
        this.f238424b = nVar;
        this.f238423a = incomeSorterExecutionContract$InputData;
        int i = 29;
        this.f238425c = e4m.b.b(new pa6.f(nVar, this, 1, i));
        this.d = e4m.b.b(new pa6.f(nVar, this, 0, i));
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
