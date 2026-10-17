package i72;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.multibanco.impl.ui.home.area.MultibancoHomeAreaContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f159152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MultibancoHomeAreaContract$InputData f159153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ari.b f159154c;
    public final m d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f159155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f159156h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f159157j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f159158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f159159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f159160n;
    public final e4m.e o;

    public r(m mVar, s sVar, ari.b bVar, ViewController viewController, MultibancoHomeAreaContract$InputData multibancoHomeAreaContract$InputData) {
        this.d = mVar;
        this.f159152a = viewController;
        this.f159153b = multibancoHomeAreaContract$InputData;
        this.f159154c = bVar;
        int i = 24;
        this.e = e4m.b.b(new hjg.b(mVar, this, 2, i));
        this.f = e4m.b.b(new hjg.b(mVar, this, 1, i));
        this.f159155g = e4m.b.b(new hjg.b(mVar, this, 0, i));
        this.f159156h = e4m.b.b(new hjg.b(mVar, this, 4, i));
        this.i = e4m.b.b(new hjg.b(mVar, this, 3, i));
        this.f159157j = e4m.b.b(new hjg.b(mVar, this, 6, i));
        this.k = e4m.b.b(new hjg.b(mVar, this, 5, i));
        this.f159158l = e4m.b.b(new hjg.b(mVar, this, 10, i));
        this.f159159m = e4m.b.b(new hjg.b(mVar, this, 9, i));
        this.f159160n = e4m.b.b(new hjg.b(mVar, this, 8, i));
        this.o = e4m.b.b(new hjg.b(mVar, this, 7, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.i.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f159155g.get());
    }
}
