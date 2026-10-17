package ax4;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ey4.g f10870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f10871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f10872c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public f(e eVar, ViewController viewController, ey4.g gVar) {
        this.f10871b = eVar;
        this.f10870a = gVar;
        this.f10872c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new ak5.f(eVar, this, 0, 18));
        this.e = e4m.b.b(new ak5.f(eVar, this, 1, 18));
        this.f = e4m.b.b(new ak5.f(eVar, this, 2, 18));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.d.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
