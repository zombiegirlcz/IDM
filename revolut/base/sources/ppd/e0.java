package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSorterDestinationsContract$InputData f238398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238400c;

    public e0(n nVar, j0 j0Var, IncomeSorterDestinationsContract$InputData incomeSorterDestinationsContract$InputData) {
        this.f238399b = nVar;
        this.f238398a = incomeSorterDestinationsContract$InputData;
        this.f238400c = e4m.b.b(new u(nVar, this, 5));
    }

    public final end.f b() {
        n nVar = this.f238399b;
        nmc.d dVarD = nVar.J.d();
        gte.a aVarB = nVar.f238482a.b();
        vc.s.j(aVarB);
        return new end.f(dVarD, aVarB, new ufl.b(new tfl.a()));
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
