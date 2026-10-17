package nv1;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uv1.m f219392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f219393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f219394c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f219395g;

    public f(g gVar, e eVar, uv1.m mVar) {
        this.f219393b = gVar;
        this.f219392a = mVar;
        int i = 23;
        this.f219394c = e4m.b.b(new nk7.k(gVar, this, 2, i));
        this.d = e4m.b.b(new nk7.k(gVar, this, 1, i));
        this.e = e4m.b.b(new nk7.k(gVar, this, 0, i));
        this.f = e4m.b.b(new nk7.k(gVar, this, 3, i));
        this.f219395g = e4m.b.b(new nk7.k(gVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
