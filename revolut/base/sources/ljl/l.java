package ljl;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qll.r f196014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f196015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f196016c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f196017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f196018h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f196019j;

    public l(q0 q0Var, j jVar, qll.r rVar) {
        this.f196015b = q0Var;
        this.f196016c = jVar;
        this.f196014a = rVar;
        this.d = e4m.b.b(new ld1.q(q0Var, jVar, this, 2, 7));
        int i = 7;
        this.e = e4m.b.b(new ld1.q(q0Var, jVar, this, 1, i));
        this.f = e4m.b.b(new ld1.q(q0Var, jVar, this, 0, i));
        this.f196017g = e4m.b.b(new ld1.q(q0Var, jVar, this, 3, i));
        this.f196018h = e4m.b.b(new ld1.q(q0Var, jVar, this, 6, i));
        this.i = e4m.b.b(new ld1.q(q0Var, jVar, this, 5, i));
        this.f196019j = e4m.b.b(new ld1.q(q0Var, jVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f196017g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f196016c.f195993q.get(), (yji.d) this.f.get());
    }
}
