package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.sources.DownPaymentSourcesControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class p2 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DownPaymentSourcesControllerContract$InputData f119492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119494c;
    public final e0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119496h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119497j;

    public p2(c1 c1Var, o2 o2Var, ViewController viewController, DownPaymentSourcesControllerContract$InputData downPaymentSourcesControllerContract$InputData) {
        this.f119493b = c1Var;
        this.f119492a = downPaymentSourcesControllerContract$InputData;
        this.f119494c = e4m.b.b(e4m.c.a(viewController));
        int i = 14;
        e0 e0Var = new e0(c1Var, o2Var, this, 1, i);
        this.d = e0Var;
        this.e = e4m.b.b(e0Var);
        this.f = e4m.b.b(new e0(c1Var, o2Var, this, 0, i));
        this.f119495g = e4m.b.b(new e0(c1Var, o2Var, this, 2, i));
        this.f119496h = e4m.b.b(new e0(c1Var, o2Var, this, 3, i));
        this.i = e4m.b.b(this.d);
        this.f119497j = e4m.b.b(new e0(c1Var, o2Var, this, 4, i));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.f119495g.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119496h.get(), (yji.n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f119495g.get());
    }
}
