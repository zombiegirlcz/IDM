package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.EsimMobilePlanCancellationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanCancellationScreenContract$InputData f4416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f4417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f4418c;
    public final e4m.e d;
    public final e4m.e e;

    public r0(b bVar, p pVar, ViewController viewController, EsimMobilePlanCancellationScreenContract$InputData esimMobilePlanCancellationScreenContract$InputData) {
        this.f4416a = esimMobilePlanCancellationScreenContract$InputData;
        this.f4417b = viewController;
        int i = 27;
        this.f4418c = e4m.b.b(new a1e.c(bVar, this, 2, i));
        this.d = e4m.b.b(new a1e.c(bVar, this, 1, i));
        this.e = e4m.b.b(new a1e.c(bVar, this, 0, i));
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
