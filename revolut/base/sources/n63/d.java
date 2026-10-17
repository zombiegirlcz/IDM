package n63;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f212706b;

    public d(String str, Boolean bool) {
        this.f212705a = str;
        this.f212706b = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f212705a, dVar.f212705a) && Intrinsics.f(this.f212706b, dVar.f212706b);
    }

    public final int hashCode() {
        String str = this.f212705a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f212706b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
