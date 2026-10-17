package z3h;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n4h.i f319265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2h.a f319266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f319267c;
    public final e4m.e d;

    public b(g gVar, t2h.a aVar, n4h.i iVar) {
        this.f319267c = gVar;
        this.f319265a = iVar;
        this.f319266b = aVar;
        this.d = e4m.b.b(new yf3.d(gVar, this, 7));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of(new aah.g(this.f319265a, (n4h.g) this.d.get()));
    }
}
