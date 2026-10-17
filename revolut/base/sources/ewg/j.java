package ewg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.WidgetisedAnalyticsDashboardContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pyg.f f130224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetisedAnalyticsDashboardContract$InputData f130225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f130226c;
    public final k d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f130227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f130228h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f130229j;

    public j(h hVar, k kVar, ViewController viewController, WidgetisedAnalyticsDashboardContract$InputData widgetisedAnalyticsDashboardContract$InputData, pyg.f fVar) {
        this.f130226c = hVar;
        this.d = kVar;
        this.f130224a = fVar;
        this.f130225b = widgetisedAnalyticsDashboardContract$InputData;
        int i = 6;
        this.e = e4m.b.b(new ehe.o(hVar, kVar, this, 2, i));
        this.f = e4m.b.b(new ehe.o(hVar, kVar, this, 1, i));
        this.f130227g = e4m.b.b(new ehe.o(hVar, kVar, this, 0, i));
        this.f130228h = e4m.b.b(e4m.c.a(viewController));
        this.i = e4m.b.b(new ehe.o(hVar, kVar, this, 4, i));
        this.f130229j = e4m.b.b(new ehe.o(hVar, kVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get(), (yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f130227g.get());
    }
}
