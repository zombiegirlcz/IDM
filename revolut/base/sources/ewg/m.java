package ewg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.analytics.ui.widgetised.pnl.WidgetisedAnalyticsPnLScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pyg.f f130241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetisedAnalyticsPnLScreenContract$InputData f130242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f130243c;
    public final k d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f130244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f130245h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f130246j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f130247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f130248m;

    public m(h hVar, k kVar, ViewController viewController, WidgetisedAnalyticsPnLScreenContract$InputData widgetisedAnalyticsPnLScreenContract$InputData, pyg.f fVar) {
        this.f130243c = hVar;
        this.d = kVar;
        this.f130241a = fVar;
        this.f130242b = widgetisedAnalyticsPnLScreenContract$InputData;
        int i = 18;
        this.e = e4m.b.b(new ea2.p(hVar, this, 2, i));
        this.f = e4m.b.b(new ea2.p(hVar, this, 1, i));
        this.f130244g = e4m.b.b(new ea2.p(hVar, this, 0, i));
        this.f130245h = e4m.b.b(new ea2.p(hVar, this, 5, i));
        this.i = e4m.b.b(new ea2.p(hVar, this, 4, i));
        this.f130246j = e4m.b.b(new ea2.p(hVar, this, 6, i));
        this.k = e4m.b.b(e4m.c.a(viewController));
        int i2 = 18;
        this.f130247l = e4m.b.b(new ea2.p(hVar, this, 7, i2));
        this.f130248m = e4m.b.b(new ea2.p(hVar, this, 3, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get(), (yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f130244g.get());
    }
}
