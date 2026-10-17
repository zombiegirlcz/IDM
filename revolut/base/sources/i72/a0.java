package i72;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class a0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f159051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f159052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f159053c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f159054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f159055h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f159056j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f159057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f159058m;

    public a0(m mVar, w wVar, ViewController viewController) {
        this.f159051a = mVar;
        this.f159052b = wVar;
        this.f159053c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new ehe.o(mVar, wVar, this, 1, 26));
        this.e = e4m.b.b(new ehe.o(mVar, wVar, this, 0, 26));
        this.f = e4m.b.b(new ehe.o(mVar, wVar, this, 3, 26));
        this.f159054g = e4m.b.b(new ehe.o(mVar, wVar, this, 2, 26));
        this.f159055h = e4m.b.b(new ehe.o(mVar, wVar, this, 5, 26));
        this.i = e4m.b.b(new ehe.o(mVar, wVar, this, 4, 26));
        this.f159056j = e4m.b.b(new ehe.o(mVar, wVar, this, 7, 26));
        this.k = e4m.b.b(new ehe.o(mVar, wVar, this, 9, 26));
        this.f159057l = e4m.b.b(new ehe.o(mVar, wVar, this, 8, 26));
        this.f159058m = e4m.b.b(new ehe.o(mVar, wVar, this, 6, 26));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f159054g.get());
    }
}
