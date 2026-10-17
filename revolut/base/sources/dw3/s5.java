package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.RejectedControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class s5 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RejectedControllerContract$InputData f119765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g5 f119767c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119769h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119770j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119772m;

    public s5(c1 c1Var, ViewController viewController, RejectedControllerContract$InputData rejectedControllerContract$InputData) {
        this.f119765a = rejectedControllerContract$InputData;
        this.f119766b = e4m.b.b(e4m.c.a(viewController));
        g5 g5Var = new g5(c1Var, this, 1, 7);
        this.f119767c = g5Var;
        this.d = e4m.b.b(g5Var);
        this.e = e4m.b.b(e4m.c.a(rejectedControllerContract$InputData));
        int i = 7;
        this.f = e4m.b.b(new g5(c1Var, this, 0, i));
        this.f119768g = e4m.b.b(new g5(c1Var, this, 4, i));
        this.f119769h = e4m.b.b(new g5(c1Var, this, 3, i));
        this.i = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f119770j = e4m.b.b(this.f119767c);
        this.k = e4m.b.b(new g5(c1Var, this, 6, i));
        this.f119771l = e4m.b.b(new g5(c1Var, this, 7, i));
        this.f119772m = e4m.b.b(new g5(c1Var, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119770j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.i.get());
    }
}
