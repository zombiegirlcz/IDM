package u01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1b.a f276012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d1b.a colors) {
        super("updateColors", 8);
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f276012c = colors;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f276012c, ((i) obj2).f276012c);
    }

    public final int hashCode() {
        return this.f276012c.hashCode();
    }
}
