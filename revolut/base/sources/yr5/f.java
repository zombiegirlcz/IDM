package yr5;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f316133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qta.f f316134c;
    public final TrendViewDelegate.a d;
    public final Data e;
    public final Data f;

    public f(String widgetId, xi0.b bVar, qta.f selectedPlotDuration, TrendViewDelegate.a trendViewState, Data data, Data data2) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(selectedPlotDuration, "selectedPlotDuration");
        Intrinsics.checkNotNullParameter(trendViewState, "trendViewState");
        this.f316132a = widgetId;
        this.f316133b = bVar;
        this.f316134c = selectedPlotDuration;
        this.d = trendViewState;
        this.e = data;
        this.f = data2;
    }

    public static f a(f fVar, qta.f fVar2, TrendViewDelegate.a aVar, Data data, Data data2, int i) {
        String widgetId = fVar.f316132a;
        xi0.b bVar = fVar.f316133b;
        if ((i & 4) != 0) {
            fVar2 = fVar.f316134c;
        }
        qta.f selectedPlotDuration = fVar2;
        if ((i & 8) != 0) {
            aVar = fVar.d;
        }
        TrendViewDelegate.a trendViewState = aVar;
        if ((i & 16) != 0) {
            data = fVar.e;
        }
        Data data3 = data;
        if ((i & 32) != 0) {
            data2 = fVar.f;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(selectedPlotDuration, "selectedPlotDuration");
        Intrinsics.checkNotNullParameter(trendViewState, "trendViewState");
        return new f(widgetId, bVar, selectedPlotDuration, trendViewState, data3, data2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f316132a, fVar.f316132a) && Intrinsics.f(this.f316133b, fVar.f316133b) && this.f316134c == fVar.f316134c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f316132a.hashCode() * 31;
        xi0.b bVar = this.f316133b;
        int iHashCode2 = (this.d.hashCode() + ((this.f316134c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31)) * 31;
        Data data = this.e;
        int iHashCode3 = (iHashCode2 + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f;
        return iHashCode3 + (data2 != null ? data2.hashCode() : 0);
    }
}
