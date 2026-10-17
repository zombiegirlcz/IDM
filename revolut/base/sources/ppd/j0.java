package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.IncomeSorterFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSorterFlowContract$InputData f238442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f238444c = this;
    public final e4m.e d;
    public final e4m.e e;

    public j0(n nVar, IncomeSorterFlowContract$InputData incomeSorterFlowContract$InputData) {
        this.f238443b = nVar;
        this.f238442a = incomeSorterFlowContract$InputData;
        int i = 0;
        this.d = e4m.b.b(new i0(nVar, this, 1, i));
        this.e = e4m.b.b(new i0(nVar, this, 0, i));
    }

    public final prl.e b() {
        n nVar = this.f238443b;
        ang.f fVarE = nVar.i.e();
        l80.e eVarH = nVar.d.h();
        vc.s.j(eVarH);
        wzi.a aVarA = ((ctj.b) nVar.I).a();
        vc.s.j(aVarA);
        ge3.a aVarE = nVar.f238486c.e();
        vc.s.j(aVarE);
        return new prl.e(fVarE, eVarH, aVarA, aVarE);
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
