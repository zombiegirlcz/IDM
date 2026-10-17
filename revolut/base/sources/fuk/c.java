package fuk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.GroupedBarLineChartDelegate;
import com.revolut.core.ui_kit.delegates.HorizontalLegendDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsDelegate f138227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GroupedBarLineChartDelegate f138228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HorizontalLegendDelegate f138229c;

    public c(CellDetailsDelegate cellDetailsDelegate, GroupedBarLineChartDelegate groupedBarLineChartDelegate, HorizontalLegendDelegate horizontalLegendDelegate) {
        Intrinsics.checkNotNullParameter(cellDetailsDelegate, "cellDetailsDelegate");
        Intrinsics.checkNotNullParameter(groupedBarLineChartDelegate, "groupedBarLineChartDelegate");
        Intrinsics.checkNotNullParameter(horizontalLegendDelegate, "horizontalLegendDelegate");
        this.f138227a = cellDetailsDelegate;
        this.f138228b = groupedBarLineChartDelegate;
        this.f138229c = horizontalLegendDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f138227a, cVar.f138227a) && Intrinsics.f(this.f138228b, cVar.f138228b) && Intrinsics.f(this.f138229c, cVar.f138229c);
    }

    public final int hashCode() {
        return this.f138229c.hashCode() + ((this.f138228b.hashCode() + (this.f138227a.hashCode() * 31)) * 31);
    }
}
