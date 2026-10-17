package vxc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.EntityHomeScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EntityHomeScreenContract$InputData f293066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f293067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f293068c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f293069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f293070h;
    public final e4m.e i;

    public f(d dVar, c cVar, ViewController viewController, EntityHomeScreenContract$InputData entityHomeScreenContract$InputData) {
        this.f293067b = dVar;
        this.f293066a = entityHomeScreenContract$InputData;
        this.f293068c = e4m.b.b(e4m.c.a(viewController));
        int i = 25;
        this.d = e4m.b.b(new vn2.l(dVar, this, 0, i));
        this.e = e4m.b.b(new vn2.l(dVar, this, 1, i));
        this.f = e4m.b.b(new vn2.l(dVar, this, 3, i));
        this.f293069g = e4m.b.b(new vn2.l(dVar, this, 5, i));
        this.f293070h = e4m.b.b(new vn2.l(dVar, this, 4, i));
        this.i = e4m.b.b(new vn2.l(dVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        y9l.a aVar = (y9l.a) this.e.get();
        xhi.f.j(aVar);
        return ImmutableSet.of(aVar);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
