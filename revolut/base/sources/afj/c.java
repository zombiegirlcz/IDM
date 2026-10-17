package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.flows.checkout.EsimCheckoutFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements xki.c, ihj.a, xgj.a, tmj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimCheckoutFlowContract$InputData f4182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f4184c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public c(b bVar, ViewController viewController, EsimCheckoutFlowContract$InputData esimCheckoutFlowContract$InputData) {
        this.f4183b = bVar;
        this.f4182a = esimCheckoutFlowContract$InputData;
        this.d = e4m.b.b(new a1e.c(bVar, this, 0, 8));
        this.e = e4m.b.b(e4m.c.a(viewController));
        this.f = e4m.b.b(new a1e.c(bVar, this, 1, 8));
    }

    @Override // xgj.a
    public final z0 H() {
        return new z0(this.f4183b, this.f4184c, 0);
    }

    @Override // ihj.a
    public final b1 O() {
        return new b1(this.f4183b, this.f4184c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // tmj.a
    public final a3 s() {
        return new a3(this.f4183b, this.f4184c, 1);
    }
}
