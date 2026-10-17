package ewg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pyg.f f130233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetisedAnalyticsPerformanceContract$InputData f130234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f130235c;
    public final k d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f130236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f130237h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f130238j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f130239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f130240m;

    public l(h hVar, k kVar, ViewController viewController, WidgetisedAnalyticsPerformanceContract$InputData widgetisedAnalyticsPerformanceContract$InputData, pyg.f fVar) {
        this.f130235c = hVar;
        this.d = kVar;
        this.f130233a = fVar;
        this.f130234b = widgetisedAnalyticsPerformanceContract$InputData;
        int i = 17;
        this.e = e4m.b.b(new ea2.p(hVar, this, 2, i));
        this.f = e4m.b.b(new ea2.p(hVar, this, 1, i));
        this.f130236g = e4m.b.b(new ea2.p(hVar, this, 0, i));
        this.f130237h = e4m.b.b(new ea2.p(hVar, this, 5, i));
        this.i = e4m.b.b(new ea2.p(hVar, this, 4, i));
        this.f130238j = e4m.b.b(new ea2.p(hVar, this, 6, i));
        this.k = e4m.b.b(e4m.c.a(viewController));
        int i2 = 17;
        this.f130239l = e4m.b.b(new ea2.p(hVar, this, 7, i2));
        this.f130240m = e4m.b.b(new ea2.p(hVar, this, 3, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get(), (yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f130236g.get());
    }
}
