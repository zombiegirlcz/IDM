package qtd;

import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import gtd.r;
import jtd.u;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0j.a f249091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ktd.c f249092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f249093c;
    public final m d;
    public final r e;

    public b(f0j.a travelInteractor, ktd.c travelToolsProvider, d travelModeWidgetMapper, m navigator, r travelNavigator) {
        Intrinsics.checkNotNullParameter(travelInteractor, "travelInteractor");
        Intrinsics.checkNotNullParameter(travelToolsProvider, "travelToolsProvider");
        Intrinsics.checkNotNullParameter(travelModeWidgetMapper, "travelModeWidgetMapper");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(travelNavigator, "travelNavigator");
        this.f249091a = travelInteractor;
        this.f249092b = travelToolsProvider;
        this.f249093c = travelModeWidgetMapper;
        this.d = navigator;
        this.e = travelNavigator;
    }

    public final Object a(Object obj2, nc7.b bVar) {
        u uVar = obj2 instanceof u ? (u) obj2 : null;
        if (uVar != null) {
            Object objA = this.e.a(uVar, bVar);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
        }
        this.d.c(u0.f(AnalyticsFeatureConfig.TravelMode.Destination.f87438a));
        return Unit.f186387a;
    }
}
