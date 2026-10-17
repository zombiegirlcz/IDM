package f28;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eel.c f131488a;

    public x(eel.c period) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f131488a = period;
    }

    @Override // f28.y
    public final eel.c L() {
        return this.f131488a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && this.f131488a == ((x) obj2).f131488a;
    }

    public final int hashCode() {
        return this.f131488a.hashCode();
    }

    public x() {
        this(eel.c.ONE_MONTH);
    }
}
