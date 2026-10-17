package f28;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eel.c f131487a;

    public w(eel.c period) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f131487a = period;
    }

    @Override // f28.y
    public final eel.c L() {
        return this.f131487a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && this.f131487a == ((w) obj2).f131487a;
    }

    public final int hashCode() {
        return this.f131487a.hashCode();
    }

    public w() {
        this(eel.c.ONE_DAY);
    }
}
