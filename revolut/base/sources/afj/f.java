package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.EsimConnectivityTroubleshootingFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimConnectivityTroubleshootingFlowContract$InputData f4233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f4235c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public f(b bVar, ViewController viewController, EsimConnectivityTroubleshootingFlowContract$InputData esimConnectivityTroubleshootingFlowContract$InputData) {
        this.f4234b = bVar;
        this.f4233a = esimConnectivityTroubleshootingFlowContract$InputData;
        this.d = e4m.b.b(new a1e.c(bVar, this, 0, 9));
        this.e = e4m.b.b(e4m.c.a(viewController));
        this.f = e4m.b.b(new a1e.c(bVar, this, 1, 9));
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
