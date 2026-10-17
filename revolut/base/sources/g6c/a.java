package g6c;

import kotlin.jvm.internal.Intrinsics;
import q6c.n;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f140917b;

    public a(String id10, n state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f140916a = id10;
        this.f140917b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f140916a, aVar.f140916a) && this.f140917b == aVar.f140917b;
    }

    public final int hashCode() {
        return this.f140917b.hashCode() + (this.f140916a.hashCode() * 31);
    }
}
