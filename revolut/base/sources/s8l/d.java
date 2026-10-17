package s8l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f261071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f261072b;

    public d(String deeplink, c cVar) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f261071a = deeplink;
        this.f261072b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f261071a, dVar.f261071a) && Intrinsics.f(this.f261072b, dVar.f261072b);
    }

    public final int hashCode() {
        int iHashCode = this.f261071a.hashCode() * 31;
        c cVar = this.f261072b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
