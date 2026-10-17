package w5f;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f295236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f295237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f295238c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f295239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f295240h;
    public final e4m.e i;

    public t(m mVar, s sVar, ViewController viewController) {
        this.f295237b = mVar;
        this.f295236a = viewController;
        this.f295238c = e4m.b.b(new r7d.w(mVar, sVar, this, 0, 27));
        int i = 27;
        this.d = e4m.b.b(new r7d.w(mVar, sVar, this, 1, i));
        this.e = e4m.b.b(new r7d.w(mVar, sVar, this, 3, i));
        this.f = e4m.b.b(new r7d.w(mVar, sVar, this, 2, i));
        this.f295239g = e4m.b.b(new r7d.w(mVar, sVar, this, 4, i));
        this.f295240h = e4m.b.b(new r7d.w(mVar, sVar, this, 6, i));
        this.i = e4m.b.b(new r7d.w(mVar, sVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of(dw3.l.m((d1h.e) this.d.get()), (yji.n) this.e.get(), (yji.n) this.f295239g.get());
    }

    @Override // xki.e
    public final Set g() {
        gah.f fVarA = ((u8h.b) this.f295237b.f295191c).a();
        vc.s.j(fVarA);
        aah.g gVarL = dw3.l.l(fVarA, (d1h.j) this.f295238c.get(), (d1h.e) this.d.get());
        yji.d dVar = (yji.d) this.f.get();
        w7f.f model = (w7f.f) this.f295239g.get();
        Intrinsics.checkNotNullParameter(model, "model");
        return ImmutableSet.of((l8f.a) gVarL, (l8f.a) dVar, new l8f.a());
    }
}
