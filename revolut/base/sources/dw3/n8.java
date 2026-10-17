package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class n8 implements xki.e, b84.c, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119366a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f119367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119368c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119370h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119371j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119372l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119373m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119374n;

    public n8(c1 c1Var, q4 q4Var, ViewController viewController) {
        this.f119368c = c1Var;
        this.f119367b = viewController;
        this.d = e4m.b.b(e4m.c.a(viewController));
        s7 s7Var = new s7(c1Var, q4Var, this, 1, 29);
        this.f119374n = s7Var;
        this.e = e4m.b.b(s7Var);
        int i = 29;
        this.f = e4m.b.b(new s7(c1Var, q4Var, this, 0, i));
        this.f119369g = e4m.b.b(new s7(c1Var, q4Var, this, 2, i));
        this.f119370h = e4m.b.b(new s7(c1Var, q4Var, this, 4, i));
        this.i = e4m.b.b(new s7(c1Var, q4Var, this, 3, i));
        this.f119371j = e4m.b.b(new s7(c1Var, q4Var, this, 5, i));
        this.k = e4m.b.b((s7) this.f119374n);
        this.f119372l = e4m.b.b(new s7(c1Var, q4Var, this, 7, i));
        this.f119373m = e4m.b.b(new s7(c1Var, q4Var, this, 6, i));
    }

    @Override // b84.c
    public final a84.a b() {
        switch (this.f119366a) {
        }
        return (a84.a) this.i.get();
    }

    @Override // bx4.a
    public final cx4.b c() {
        switch (this.f119366a) {
        }
        return (cx4.b) this.f119369g.get();
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f119366a) {
        }
        return ImmutableSet.of((yji.n) this.f119371j.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f119366a) {
        }
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f119369g.get(), (yji.d) this.i.get());
    }

    public n8(c1 c1Var, k1 k1Var, ViewController viewController) {
        this.f119368c = c1Var;
        this.f119367b = viewController;
        this.d = e4m.b.b(e4m.c.a(viewController));
        s7 s7Var = new s7(c1Var, k1Var, this, 1, 28);
        this.f119374n = s7Var;
        this.e = e4m.b.b(s7Var);
        int i = 28;
        this.f = e4m.b.b(new s7(c1Var, k1Var, this, 0, i));
        this.f119369g = e4m.b.b(new s7(c1Var, k1Var, this, 2, i));
        this.f119370h = e4m.b.b(new s7(c1Var, k1Var, this, 4, i));
        this.i = e4m.b.b(new s7(c1Var, k1Var, this, 3, i));
        this.f119371j = e4m.b.b(new s7(c1Var, k1Var, this, 5, i));
        this.k = e4m.b.b((s7) this.f119374n);
        this.f119372l = e4m.b.b(new s7(c1Var, k1Var, this, 7, i));
        this.f119373m = e4m.b.b(new s7(c1Var, k1Var, this, 6, i));
    }
}
