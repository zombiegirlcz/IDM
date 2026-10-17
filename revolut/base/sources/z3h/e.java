package z3h;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.InvestmentsControllerContract$InputData;
import java.util.Set;
import z0g.k0;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements p4h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2h.g f319271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2h.e f319272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InvestmentsControllerContract$InputData f319273c;
    public final g d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f319274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f319275h;

    public e(g gVar, InvestmentsControllerContract$InputData investmentsControllerContract$InputData, n2h.g gVar2, n2h.e eVar) {
        this.d = gVar;
        this.f319271a = gVar2;
        this.f319272b = eVar;
        this.f319273c = investmentsControllerContract$InputData;
        this.e = e4m.b.b(new k0(gVar, this, 2, 5));
        this.f = e4m.b.b(new k0(gVar, this, 1, 5));
        this.f319274g = e4m.b.b(new k0(gVar, this, 0, 5));
        this.f319275h = e4m.b.b(new k0(gVar, this, 3, 5));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(3);
        gdh.a aVar = (gdh.a) this.e.get();
        f9f.b.f(aVar);
        builderBuilderWithExpectedSize.add(aVar);
        builderBuilderWithExpectedSize.addAll((Iterable) f9f.b.k((gdh.a) this.e.get()));
        return j6.a.g(this.f, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f319274g.get());
    }
}
