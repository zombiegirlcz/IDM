package ugc;

import do3.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f280004b;

    public e(String id10, t tVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f280003a = id10;
        this.f280004b = tVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f280003a, eVar.f280003a) && this.f280004b == eVar.f280004b;
    }

    public final int hashCode() {
        int iHashCode = this.f280003a.hashCode() * 31;
        t tVar = this.f280004b;
        return iHashCode + (tVar == null ? 0 : tVar.hashCode());
    }
}
