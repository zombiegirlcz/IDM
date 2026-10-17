package u01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1b.k f276021c;
    public final c1b.h d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(c1b.k chartTimeFrame, c1b.h chartInterval) {
        super("updateTimeframe", 8);
        Intrinsics.checkNotNullParameter(chartTimeFrame, "chartTimeFrame");
        Intrinsics.checkNotNullParameter(chartInterval, "chartInterval");
        this.f276021c = chartTimeFrame;
        this.d = chartInterval;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f276021c == rVar.f276021c && this.d == rVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.f276021c.hashCode() * 31);
    }
}
