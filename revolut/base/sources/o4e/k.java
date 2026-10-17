package o4e;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import v4e.n;
import v4e.q;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5e.g f222253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5e.c f222254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f222255c;
    public final q d;
    public final l e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f222256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f222257h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f222258j;

    public k(l lVar, i iVar, a5e.g gVar, a5e.c cVar, q qVar, n nVar) {
        this.e = lVar;
        this.f222253a = gVar;
        this.f222254b = cVar;
        this.f222255c = nVar;
        this.d = qVar;
        this.f = e4m.b.b(new o41.b(lVar, this, 1, 5));
        this.f222256g = e4m.b.b(new o41.b(lVar, this, 0, 5));
        this.f222257h = e4m.b.b(new o41.b(lVar, this, 3, 5));
        this.i = e4m.b.b(new o41.b(lVar, this, 2, 5));
        this.f222258j = e4m.b.b(new o41.b(lVar, this, 4, 5));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get(), (yji.n) this.f222257h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f222256g.get(), (yji.d) this.i.get());
    }
}
