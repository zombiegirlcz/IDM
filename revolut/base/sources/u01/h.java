package u01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1b.e f276011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d1b.e chartStyle) {
        super("updateChartType", 8);
        Intrinsics.checkNotNullParameter(chartStyle, "chartStyle");
        this.f276011c = chartStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f276011c == ((h) obj2).f276011c;
    }

    public final int hashCode() {
        return this.f276011c.hashCode();
    }
}
