package ewg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pyg.f f130249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetisedAnalyticsTotalValueScreenContract$InputData f130250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f130251c;
    public final k d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f130252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f130253h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f130254j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f130255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f130256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f130257n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f130258p;

    public n(h hVar, k kVar, ViewController viewController, WidgetisedAnalyticsTotalValueScreenContract$InputData widgetisedAnalyticsTotalValueScreenContract$InputData, pyg.f fVar) {
        this.f130251c = hVar;
        this.d = kVar;
        this.f130249a = fVar;
        this.f130250b = widgetisedAnalyticsTotalValueScreenContract$InputData;
        int i = 7;
        this.e = e4m.b.b(new ehe.o(hVar, kVar, this, 2, i));
        this.f = e4m.b.b(new ehe.o(hVar, kVar, this, 1, i));
        this.f130252g = e4m.b.b(new ehe.o(hVar, kVar, this, 0, i));
        this.f130253h = e4m.b.b(new ehe.o(hVar, kVar, this, 5, i));
        this.i = e4m.b.b(new ehe.o(hVar, kVar, this, 4, i));
        this.f130254j = e4m.b.b(new ehe.o(hVar, kVar, this, 6, i));
        this.k = e4m.b.b(new ehe.o(hVar, kVar, this, 7, i));
        this.f130255l = e4m.b.b(new ehe.o(hVar, kVar, this, 9, i));
        this.f130256m = e4m.b.b(new ehe.o(hVar, kVar, this, 8, i));
        this.f130257n = e4m.b.b(e4m.c.a(viewController));
        this.o = e4m.b.b(new ehe.o(hVar, kVar, this, 10, i));
        this.f130258p = e4m.b.b(new ehe.o(hVar, kVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get(), (yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f130252g.get());
    }
}
