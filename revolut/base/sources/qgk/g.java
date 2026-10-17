package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final akk.h f245958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f245959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f245960c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f245961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f245962h;

    public g(i0 i0Var, ViewController viewController, akk.h hVar) {
        this.f245958a = hVar;
        this.f245959b = e4m.b.b(e4m.c.a(viewController));
        int i = 25;
        this.f245960c = e4m.b.b(new prk.k0(i0Var, this, 2, i));
        this.d = e4m.b.b(new prk.k0(i0Var, this, 1, i));
        this.e = e4m.b.b(new prk.k0(i0Var, this, 0, i));
        this.f = e4m.b.b(new prk.k0(i0Var, this, 4, i));
        this.f245961g = e4m.b.b(new prk.k0(i0Var, this, 5, i));
        this.f245962h = e4m.b.b(new prk.k0(i0Var, this, 3, i));
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
