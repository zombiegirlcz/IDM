package z52;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.iris.impl.ui.area.IrisAreaScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f319448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IrisAreaScreenContract$InputData f319449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f319450c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f319451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f319452h;
    public final e4m.e i;

    public l(j jVar, m mVar, ViewController viewController, IrisAreaScreenContract$InputData irisAreaScreenContract$InputData) {
        this.f319450c = jVar;
        this.f319448a = viewController;
        this.f319449b = irisAreaScreenContract$InputData;
        int i = 29;
        this.d = e4m.b.b(new wpg.g(jVar, mVar, this, 2, i));
        this.e = e4m.b.b(new wpg.g(jVar, mVar, this, 1, i));
        this.f = e4m.b.b(new wpg.g(jVar, mVar, this, 0, i));
        this.f319451g = e4m.b.b(new wpg.g(jVar, mVar, this, 4, i));
        this.f319452h = e4m.b.b(new wpg.g(jVar, mVar, this, 3, i));
        this.i = e4m.b.b(new wpg.g(jVar, mVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f319452h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
