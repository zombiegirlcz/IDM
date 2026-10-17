package z58;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import z0g.k0;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n68.o f319562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f319563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f319564c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f319565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f319566h;

    public g(j jVar, ViewController viewController, n68.o oVar) {
        this.f319562a = oVar;
        this.f319563b = e4m.b.b(e4m.c.a(viewController));
        int i = 10;
        this.f319564c = e4m.b.b(new k0(jVar, this, 2, i));
        this.d = e4m.b.b(new k0(jVar, this, 1, i));
        this.e = e4m.b.b(new k0(jVar, this, 0, i));
        this.f = e4m.g.a(new k0(jVar, this, 4, i));
        this.f319565g = e4m.b.b(new k0(jVar, this, 5, i));
        this.f319566h = e4m.b.b(new k0(jVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
