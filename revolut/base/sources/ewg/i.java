package ewg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.analytics.ui.widgetised.allocation.WidgetisedAnalyticsAllocationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pyg.f f130216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetisedAnalyticsAllocationScreenContract$InputData f130217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f130218c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f130219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f130220h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f130221j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f130222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f130223m;

    public i(h hVar, k kVar, ViewController viewController, WidgetisedAnalyticsAllocationScreenContract$InputData widgetisedAnalyticsAllocationScreenContract$InputData, pyg.f fVar) {
        this.f130218c = hVar;
        this.f130216a = fVar;
        this.f130217b = widgetisedAnalyticsAllocationScreenContract$InputData;
        int i = 5;
        this.d = e4m.b.b(new ehe.o(hVar, kVar, this, 2, i));
        this.e = e4m.b.b(new ehe.o(hVar, kVar, this, 1, i));
        this.f = e4m.b.b(new ehe.o(hVar, kVar, this, 0, i));
        this.f130219g = e4m.b.b(new ehe.o(hVar, kVar, this, 4, i));
        this.f130220h = e4m.b.b(new ehe.o(hVar, kVar, this, 6, i));
        this.i = e4m.b.b(new ehe.o(hVar, kVar, this, 5, i));
        this.f130221j = e4m.b.b(new ehe.o(hVar, kVar, this, 7, i));
        this.k = e4m.b.b(e4m.c.a(viewController));
        this.f130222l = e4m.b.b(new ehe.o(hVar, kVar, this, 8, i));
        this.f130223m = e4m.b.b(new ehe.o(hVar, kVar, this, 3, i));
    }

    public final uyg.h b() {
        h hVar = this.f130218c;
        tyg.j jVarD = hVar.d();
        nmc.d dVarD = hVar.f130204m.d();
        gte.a aVarB = hVar.k.b();
        vc.s.j(aVarB);
        return new uyg.h(jVarD, dVarD, aVarB);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get(), (yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
