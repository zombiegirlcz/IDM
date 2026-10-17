package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.DocumentsContentContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class j2 implements xki.e, b84.c, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f119016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DocumentsContentContract$InputData f119017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119018c;
    public final e0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119020h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119021j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119022l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119023m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119024n;

    public j2(c1 c1Var, o0 o0Var, ViewController viewController, DocumentsContentContract$InputData documentsContentContract$InputData) {
        this.f119016a = viewController;
        this.f119017b = documentsContentContract$InputData;
        this.f119018c = e4m.b.b(e4m.c.a(viewController));
        int i = 12;
        e0 e0Var = new e0(c1Var, o0Var, this, 1, i);
        this.d = e0Var;
        this.e = e4m.b.b(e0Var);
        this.f = e4m.b.b(new e0(c1Var, o0Var, this, 0, i));
        this.f119019g = e4m.b.b(new e0(c1Var, o0Var, this, 2, i));
        this.f119020h = e4m.b.b(new e0(c1Var, o0Var, this, 4, i));
        this.i = e4m.b.b(new e0(c1Var, o0Var, this, 3, i));
        this.f119021j = e4m.b.b(new e0(c1Var, o0Var, this, 5, i));
        this.k = e4m.b.b(this.d);
        this.f119022l = e4m.b.b(new e0(c1Var, o0Var, this, 6, i));
        this.f119023m = e4m.b.b(new e0(c1Var, o0Var, this, 8, i));
        this.f119024n = e4m.b.b(new e0(c1Var, o0Var, this, 7, i));
        e4m.b.b(new e0(c1Var, o0Var, this, 9, i));
    }

    @Override // b84.c
    public final a84.a b() {
        return (a84.a) this.i.get();
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.f119019g.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119021j.get(), (yji.n) this.k.get(), (yji.n) this.f119022l.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f119019g.get(), (yji.d) this.i.get());
    }
}
