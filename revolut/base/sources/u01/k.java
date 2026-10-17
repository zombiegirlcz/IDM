package u01;

import com.revolut.feature.retail.advanced_charts.models.ChartTimeFrameDisplayType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1b.h f276014c;
    public final ChartTimeFrameDisplayType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c1b.h chartInterval, ChartTimeFrameDisplayType chartTimeFrameDisplayType) {
        super("updateInterval", 8);
        Intrinsics.checkNotNullParameter(chartInterval, "chartInterval");
        Intrinsics.checkNotNullParameter(chartTimeFrameDisplayType, "chartTimeFrameDisplayType");
        this.f276014c = chartInterval;
        this.d = chartTimeFrameDisplayType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f276014c == kVar.f276014c && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.f276014c.hashCode() * 31);
    }
}
