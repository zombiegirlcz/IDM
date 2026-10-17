package sm1;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn1.i f264332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f264333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f264334c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f264335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f264336h;

    public j(d dVar, i iVar, ViewController viewController, mn1.i iVar2) {
        this.f264333b = dVar;
        this.f264332a = iVar2;
        this.f264334c = e4m.b.b(e4m.c.a(viewController));
        int i = 25;
        this.d = e4m.b.b(new ryc.d(dVar, this, 2, i));
        this.e = e4m.b.b(new ryc.d(dVar, this, 1, i));
        this.f = e4m.b.b(new ryc.d(dVar, this, 0, i));
        this.f264335g = e4m.b.b(new ryc.d(dVar, this, 4, i));
        this.f264336h = e4m.b.b(new ryc.d(dVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
