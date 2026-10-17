package u01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1b.e f276005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c1b.e drawing) {
        super("enableDrawingMode", 8);
        Intrinsics.checkNotNullParameter(drawing, "drawing");
        this.f276005c = drawing;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f276005c == ((b) obj2).f276005c;
    }

    public final int hashCode() {
        return this.f276005c.hashCode();
    }
}
