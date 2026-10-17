package u01;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f276020c;

    public q(Set set) {
        super("updateSymbolsToCompareList", 8);
        this.f276020c = set;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f276020c, ((q) obj2).f276020c);
    }

    public final int hashCode() {
        Set set = this.f276020c;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }
}
