package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class l0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wba.i f234013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234015c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f234016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f234017h;

    public l0(d0 d0Var, k0 k0Var, ViewController viewController, wba.i iVar) {
        this.f234014b = d0Var;
        this.f234013a = iVar;
        this.f234015c = e4m.b.b(e4m.c.a(viewController));
        int i = 10;
        this.d = e4m.b.b(new m(d0Var, this, 2, i));
        this.e = e4m.b.b(new m(d0Var, this, 1, i));
        this.f = e4m.b.b(new m(d0Var, this, 0, i));
        this.f234016g = e4m.b.b(new m(d0Var, this, 4, i));
        this.f234017h = e4m.b.b(new m(d0Var, this, 3, i));
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
