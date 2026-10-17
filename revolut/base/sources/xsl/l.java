package xsl;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import xf6.a1;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pdf.b f308671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f308672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f308673c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f308674g;

    public l(p pVar, ViewController viewController, pdf.b bVar) {
        this.f308672b = pVar;
        this.f308671a = bVar;
        this.f308673c = e4m.b.b(e4m.c.a(viewController));
        int i = 11;
        this.d = e4m.b.b(new a1(this, 2, i));
        this.e = e4m.b.b(new a1(this, 1, i));
        this.f = e4m.b.b(new a1(this, 0, i));
        this.f308674g = e4m.b.b(new a1(this, 3, i));
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
