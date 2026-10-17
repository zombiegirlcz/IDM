package k4i;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.flow.BreakdownFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import jm4.c3;
import s5i.k;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BreakdownFlowContract$InputData f180908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f180909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f180910c;
    public final b d = this;
    public final e4m.e e;

    public b(c cVar, ViewController viewController, BreakdownFlowContract$InputData breakdownFlowContract$InputData) {
        this.f180910c = cVar;
        this.f180908a = breakdownFlowContract$InputData;
        this.f180909b = viewController;
        this.e = e4m.b.b(new c3(cVar, this, 12));
    }

    public final k b() {
        s5i.b bVar = new s5i.b();
        c cVar = this.f180910c;
        k5i.c cVarA = cVar.f180914g.a();
        n8b.a aVarA = cVar.f180915h.a();
        s.j(aVarA);
        gte.a aVarB = cVar.i.b();
        s.j(aVarB);
        return new k(bVar, cVarA, aVarA, aVarB);
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
