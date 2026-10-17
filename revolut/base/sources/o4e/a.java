package o4e;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3h.c f222206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3h.e f222207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f222208c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public a(l lVar, k3h.e eVar, k3h.c cVar) {
        this.f222208c = lVar;
        this.f222206a = cVar;
        this.f222207b = eVar;
        int i = 1;
        this.d = e4m.b.b(new o41.b(lVar, this, 1, i));
        this.e = e4m.b.b(new o41.b(lVar, this, 0, i));
        this.f = e4m.b.b(new o41.b(lVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
