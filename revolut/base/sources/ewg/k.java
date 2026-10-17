package ewg;

import com.google.common.collect.ImmutableSet;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsInputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetisedAnalyticsInputData f130230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gwg.a f130231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f130232c;
    public final h d;
    public final k e = this;
    public final e4m.e f = e4m.b.b(new e51.b(this, 26));

    public k(h hVar, WidgetisedAnalyticsInputData widgetisedAnalyticsInputData, AnalyticsProduct analyticsProduct, gwg.a aVar) {
        this.d = hVar;
        this.f130230a = widgetisedAnalyticsInputData;
        this.f130231b = aVar;
        this.f130232c = analyticsProduct;
    }

    public final kbb.c b() {
        h hVar = this.d;
        x8h.k kVarD = hVar.i.d();
        xv5.c cVarA = hVar.f130201j.a();
        vc.s.j(cVarA);
        return new kbb.c(kVarD, cVarA, this.f130231b);
    }

    public final kwg.b c() {
        nwg.a factory = this.d.a();
        syg.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        gwg.a displayCurrencyMode = this.f130231b;
        Intrinsics.checkNotNullParameter(displayCurrencyMode, "displayCurrencyMode");
        return factory.a(displayCurrencyMode);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
