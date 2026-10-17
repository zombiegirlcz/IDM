package hfg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f151831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f151832b;

    public f(ArrayList availableAirlines, ArrayList unavailableAirlines) {
        Intrinsics.checkNotNullParameter(availableAirlines, "availableAirlines");
        Intrinsics.checkNotNullParameter(unavailableAirlines, "unavailableAirlines");
        this.f151831a = availableAirlines;
        this.f151832b = unavailableAirlines;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f151831a.equals(fVar.f151831a) && this.f151832b.equals(fVar.f151832b);
    }

    public final int hashCode() {
        return this.f151832b.hashCode() + (this.f151831a.hashCode() * 31);
    }
}
