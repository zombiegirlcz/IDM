package dfb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReverywhereWebAppScreenContract$InputData f113846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f113847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f113848c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f113849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f113850h;

    public d(b bVar, ViewController viewController, ReverywhereWebAppScreenContract$InputData reverywhereWebAppScreenContract$InputData) {
        this.f113847b = bVar;
        this.f113846a = reverywhereWebAppScreenContract$InputData;
        int i = 4;
        this.f113848c = e4m.b.b(new db1.f(bVar, this, 0, i));
        this.d = e4m.b.b(new db1.f(bVar, this, 2, i));
        this.e = e4m.b.b(new db1.f(bVar, this, 3, i));
        this.f = e4m.b.b(new db1.f(bVar, this, 1, i));
        this.f113849g = e4m.b.b(e4m.c.a(viewController));
        this.f113850h = e4m.b.b(new db1.f(bVar, this, 4, 4));
    }

    public final ffb.d b() {
        b bVar = this.f113847b;
        w39.b bVarA = bVar.f113838n.a();
        s.j(bVarA);
        y80.a aVarR = bVar.f113836l.r();
        s.j(aVarR);
        gte.a aVarB = bVar.f113831b.b();
        s.j(aVarB);
        return new ffb.d(bVarA, aVarR, aVarB);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f113848c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
