package k6d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f181684c;
    public final d d;

    public c(String id10, String str, e state, d dVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f181682a = id10;
        this.f181683b = str;
        this.f181684c = state;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f181682a, cVar.f181682a) && Intrinsics.f(this.f181683b, cVar.f181683b) && this.f181684c == cVar.f181684c && this.d == cVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f181682a.hashCode() * 31;
        String str = this.f181683b;
        int iHashCode2 = (this.f181684c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        d dVar = this.d;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
