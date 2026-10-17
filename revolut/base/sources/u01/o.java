package u01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1b.d f276018c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d1b.d chartOpenPosition) {
        super("updatePositionLine", 8);
        Intrinsics.checkNotNullParameter(chartOpenPosition, "chartOpenPosition");
        this.f276018c = chartOpenPosition;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f276018c, ((o) obj2).f276018c);
    }

    public final int hashCode() {
        return this.f276018c.hashCode();
    }
}
