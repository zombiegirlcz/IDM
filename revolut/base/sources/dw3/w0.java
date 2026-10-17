package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.selection.CreditAddressSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class w0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditAddressSelectionScreenContract$InputData f120046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f120047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f120048c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120050h;
    public final e4m.e i;

    public w0(c1 c1Var, x0 x0Var, ViewController viewController, CreditAddressSelectionScreenContract$InputData creditAddressSelectionScreenContract$InputData) {
        this.f120046a = creditAddressSelectionScreenContract$InputData;
        this.f120047b = e4m.b.b(e4m.c.a(viewController));
        int i = 5;
        e0 e0Var = new e0(c1Var, x0Var, this, 1, i);
        this.f120048c = e0Var;
        this.d = e4m.b.b(e0Var);
        this.e = e4m.b.b(new e0(c1Var, x0Var, this, 0, i));
        this.f = e4m.b.b(new e0(c1Var, x0Var, this, 2, i));
        this.f120049g = e4m.b.b(this.f120048c);
        this.f120050h = e4m.b.b(new e0(c1Var, x0Var, this, 3, i));
        this.i = e4m.b.b(new e0(c1Var, x0Var, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120049g.get(), (yji.n) this.f120050h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f.get());
    }
}
