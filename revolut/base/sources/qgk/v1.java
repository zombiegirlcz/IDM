package qgk;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class v1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nkd.b f246289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mkd.g f246290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f246291c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246293h;

    public v1(i0 i0Var, u1 u1Var, nkd.b bVar, mkd.g gVar) {
        this.f246291c = i0Var;
        this.f246289a = bVar;
        this.f246290b = gVar;
        this.d = e4m.b.b(new p1(i0Var, this, 1, 3));
        this.e = e4m.b.b(new p1(i0Var, this, 0, 3));
        this.f = e4m.b.b(new p1(i0Var, this, 2, 3));
        this.f246292g = e4m.b.b(new p1(i0Var, this, 4, 3));
        this.f246293h = e4m.b.b(new p1(i0Var, this, 3, 3));
    }

    public final dnk.l b() {
        return new dnk.l(this.f246291c.e.g(), 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get(), (yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
