package ppd;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1h.j f238415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eqd.c f238416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f238417c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public g0(n nVar, j0 j0Var, eqd.c cVar, d1h.j jVar) {
        this.f238417c = nVar;
        this.f238415a = jVar;
        this.f238416b = cVar;
        this.d = e4m.b.b(new pa6.f(nVar, this, 0, 28));
        this.e = e4m.b.b(new pa6.f(nVar, this, 2, 28));
        this.f = e4m.b.b(new pa6.f(nVar, this, 1, 28));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of(dw3.l.m((d1h.e) this.d.get()));
    }

    @Override // xki.e
    public final Set g() {
        gah.f fVarA = ((u8h.b) this.f238417c.V).a();
        vc.s.j(fVarA);
        return ImmutableSet.of(dw3.l.l(fVarA, this.f238415a, (d1h.e) this.d.get()));
    }
}
