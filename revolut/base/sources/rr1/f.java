package rr1;

import as1.h;
import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import r7d.o;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f256652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f256653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f256654c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f256655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f256656h;

    public f(a aVar, e eVar, ViewController viewController, h hVar) {
        this.f256653b = aVar;
        this.f256652a = hVar;
        this.f256654c = e4m.b.b(e4m.c.a(viewController));
        int i = 22;
        this.d = e4m.b.b(new o(aVar, this, 2, i));
        this.e = e4m.b.b(new o(aVar, this, 1, i));
        this.f = e4m.b.b(new o(aVar, this, 0, i));
        this.f256655g = e4m.b.b(new o(aVar, this, 4, i));
        this.f256656h = e4m.b.b(new o(aVar, this, 3, i));
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
