package lzi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f200979a;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f200979a == ((g) obj2).f200979a;
    }

    public final int hashCode() {
        return this.f200979a.hashCode();
    }

    public g(f weekDay) {
        Intrinsics.checkNotNullParameter(weekDay, "weekDay");
        this.f200979a = weekDay;
    }

    public /* synthetic */ g(int i) {
        this(f.MONDAY);
    }
}
