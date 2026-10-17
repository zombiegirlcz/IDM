package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.flows.installation.EsimInstallationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements xki.c, inj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimInstallationFlowContract$InputData f4350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f4352c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f4353g;

    public n(b bVar, ViewController viewController, EsimInstallationFlowContract$InputData esimInstallationFlowContract$InputData) {
        this.f4351b = bVar;
        this.f4350a = esimInstallationFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 13;
        this.e = e4m.b.b(new a1e.c(bVar, this, 1, i));
        this.f = e4m.b.b(new a1e.c(bVar, this, 0, i));
        this.f4353g = e4m.b.b(new a1e.c(bVar, this, 2, i));
    }

    @Override // inj.a
    public final e3 A() {
        return new e3(this.f4351b, this.f4352c, 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
