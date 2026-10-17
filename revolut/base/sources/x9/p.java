package x9;

import d9.y;
import d9.z;
import p9.j0;
import p9.t;

/* JADX INFO: loaded from: classes16.dex */
public final class p extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f303518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k9.q f303519c;
    public final k9.r d;
    public final z e;

    public p(k9.p pVar, j0 j0Var, k9.r rVar, k9.q qVar, z zVar) {
        this.f303518b = j0Var;
        this.d = rVar;
        this.f303519c = qVar == null ? k9.q.i : qVar;
        this.e = zVar;
    }

    public static p p(m9.h hVar, j0 j0Var, k9.r rVar, k9.q qVar, y yVar) {
        z zVar;
        y yVar2;
        if (yVar == null || yVar == (yVar2 = y.USE_DEFAULTS)) {
            zVar = t.f234246a;
        } else {
            z zVar2 = z.e;
            zVar = yVar != yVar2 ? new z(yVar, null, null, null) : z.e;
        }
        return new p(hVar.e(), j0Var, rVar, qVar, zVar);
    }

    @Override // p9.t
    public final z b() {
        return this.e;
    }

    @Override // p9.t
    public final p9.j f() {
        return null;
    }

    @Override // p9.t
    public final p9.d g() {
        return null;
    }

    @Override // p9.t
    public final p9.g h() {
        return null;
    }

    @Override // p9.t
    public final k9.q i() {
        return this.f303519c;
    }

    @Override // p9.t
    public final String j() {
        return this.d.f182194a;
    }

    @Override // p9.t
    public final Class k() {
        return this.f303518b.e.f26182a;
    }

    @Override // p9.t
    public final p9.g l() {
        return null;
    }

    @Override // p9.t
    public final void m() {
    }

    @Override // p9.t
    public final boolean n() {
        return false;
    }
}
