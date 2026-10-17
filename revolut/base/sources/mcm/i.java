package mcm;

import com.google.common.base.Preconditions;
import ecm.a1;
import ecm.g2;
import ecm.s0;
import ecm.u0;
import ecm.w0;
import ecm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends b {
    public static final g o = new g();
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u0 f204384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s0 f204385h;
    public a1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s0 f204386j;
    public a1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ecm.r f204387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public y0 f204388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f204389n;

    public i(f fVar) {
        e eVar = new e(this);
        this.f = eVar;
        this.i = eVar;
        this.k = eVar;
        this.f204384g = (u0) Preconditions.checkNotNull(fVar, "helper");
    }

    @Override // ecm.a1
    public final g2 a(w0 w0Var) {
        h hVar = (h) w0Var.f124891c;
        i(hVar.f204382a);
        a1 a1VarG = g();
        jpf.a aVarA = w0Var.a();
        aVarA.f177269c = hVar.f204383b;
        return a1VarG.a(aVarA.b());
    }

    @Override // ecm.a1
    public final void d(w0 w0Var) {
        h hVar = (h) w0Var.f124891c;
        i(hVar.f204382a);
        a1 a1VarG = g();
        jpf.a aVarA = w0Var.a();
        aVarA.f177269c = hVar.f204383b;
        a1VarG.d(aVarA.b());
    }

    @Override // ecm.a1
    public final void f() {
        this.k.f();
        this.i.f();
    }

    @Override // mcm.b
    public final a1 g() {
        a1 a1Var = this.k;
        return a1Var == this.f ? this.i : a1Var;
    }

    public final void h() {
        this.f204384g.f(this.f204387l, this.f204388m);
        this.i.f();
        this.i = this.k;
        this.f204385h = this.f204386j;
        this.k = this.f;
        this.f204386j = null;
    }

    public final void i(s0 s0Var) {
        Preconditions.checkNotNull(s0Var, "newBalancerFactory");
        if (s0Var.equals(this.f204386j)) {
            return;
        }
        this.k.f();
        this.k = this.f;
        this.f204386j = null;
        this.f204387l = ecm.r.CONNECTING;
        this.f204388m = o;
        if (s0Var.equals(this.f204385h)) {
            return;
        }
        f fVar = new f(this);
        a1 a1VarA = s0Var.a(fVar);
        fVar.f204380b = a1VarA;
        this.k = a1VarA;
        this.f204386j = s0Var;
        if (this.f204389n) {
            return;
        }
        h();
    }
}
