package m2b;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7d.i f201875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4b.i f201876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f201877c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public o(v vVar, e4b.i iVar, i7d.i iVar2) {
        this.f201877c = vVar;
        this.f201875a = iVar2;
        this.f201876b = iVar;
        int i = 8;
        this.d = e4m.b.b(new lzk.b(vVar, this, 1, i));
        this.e = e4m.b.b(new lzk.b(vVar, this, 0, i));
        this.f = e4m.b.b(new lzk.b(vVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        i7d.o oVar = (i7d.o) this.d.get();
        h7d.e.a(oVar);
        return ImmutableSet.of(oVar);
    }

    @Override // xki.e
    public final Set g() {
        i7d.n nVar = (i7d.n) this.e.get();
        h7d.c.a(nVar);
        return ImmutableSet.of(nVar);
    }
}
