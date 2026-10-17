package ao1;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f7892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f7893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f7894c;
    public final e4m.e d;
    public final e4m.e e;

    public i(d dVar, e eVar, ViewController viewController) {
        this.f7892a = dVar;
        this.f7893b = e4m.b.b(e4m.c.a(viewController));
        int i = 16;
        this.f7894c = e4m.b.b(new ak5.f(dVar, this, 1, i));
        this.d = e4m.b.b(new ak5.f(dVar, this, 0, i));
        this.e = e4m.b.b(new ak5.f(dVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
