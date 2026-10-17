package dj5;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import e4m.g;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f115114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f115115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f115116c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f115117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f115118h;

    public f(e eVar, ViewController viewController) {
        this.f115114a = eVar;
        int i = 14;
        this.f115115b = e4m.b.b(new db1.f(eVar, this, 1, i));
        this.f115116c = e4m.b.b(new db1.f(eVar, this, 3, i));
        this.d = g.a(new db1.f(eVar, this, 4, i));
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i2 = 14;
        this.f = e4m.b.b(new db1.f(eVar, this, 2, i2));
        this.f115117g = e4m.b.b(new db1.f(eVar, this, 0, i2));
        this.f115118h = e4m.b.b(new db1.f(eVar, this, 5, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
