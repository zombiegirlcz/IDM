package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class w5 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f120066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RolleeScreenContract$InputData f120067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f120068c;
    public final e4m.e d;
    public final t5 e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120070h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120071j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f120072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f120073m;

    public w5(c1 c1Var, v5 v5Var, ViewController viewController, RolleeScreenContract$InputData rolleeScreenContract$InputData) {
        this.f120068c = c1Var;
        this.f120066a = viewController;
        this.f120067b = rolleeScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 1;
        t5 t5Var = new t5(c1Var, v5Var, this, 1, i);
        this.e = t5Var;
        this.f = e4m.b.b(t5Var);
        this.f120069g = e4m.b.b(new t5(c1Var, v5Var, this, 0, i));
        this.f120070h = e4m.b.b(new t5(c1Var, v5Var, this, 3, i));
        this.i = e4m.b.b(new t5(c1Var, v5Var, this, 2, i));
        this.f120071j = e4m.b.b(this.e);
        this.k = e4m.b.b(new t5(c1Var, v5Var, this, 5, i));
        this.f120072l = e4m.b.b(new t5(c1Var, v5Var, this, 6, i));
        this.f120073m = e4m.b.b(new t5(c1Var, v5Var, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120071j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f120069g.get(), (yji.d) this.i.get());
    }
}
