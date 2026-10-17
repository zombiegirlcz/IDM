package gqd;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f145696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f145697b;

    public t(ArrayList sortedDestinations, c cVar) {
        Intrinsics.checkNotNullParameter(sortedDestinations, "sortedDestinations");
        this.f145696a = sortedDestinations;
        this.f145697b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f145696a.equals(tVar.f145696a) && Intrinsics.f(this.f145697b, tVar.f145697b);
    }

    public final int hashCode() {
        int iHashCode = this.f145696a.hashCode() * 31;
        c cVar = this.f145697b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
