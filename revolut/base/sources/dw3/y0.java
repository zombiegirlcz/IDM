package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.input.CreditAddressInputScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class y0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditAddressInputScreenContract$InputData f120188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f120189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f120190c;
    public final e0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120192h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120193j;

    public y0(c1 c1Var, x0 x0Var, ViewController viewController, CreditAddressInputScreenContract$InputData creditAddressInputScreenContract$InputData) {
        this.f120189b = c1Var;
        this.f120188a = creditAddressInputScreenContract$InputData;
        this.f120190c = e4m.b.b(e4m.c.a(viewController));
        int i = 6;
        e0 e0Var = new e0(c1Var, x0Var, this, 1, i);
        this.d = e0Var;
        this.e = e4m.b.b(e0Var);
        this.f = e4m.b.b(new e0(c1Var, x0Var, this, 0, i));
        this.f120191g = e4m.b.b(new e0(c1Var, x0Var, this, 2, i));
        this.f120192h = e4m.b.b(this.d);
        this.i = e4m.b.b(new e0(c1Var, x0Var, this, 3, i));
        this.f120193j = e4m.b.b(new e0(c1Var, x0Var, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120192h.get(), (yji.n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f120191g.get());
    }
}
