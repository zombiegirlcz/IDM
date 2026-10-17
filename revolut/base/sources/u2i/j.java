package u2i;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f276680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0i.a f276681b;

    public j(List bannerItems, r0i.a aVar) {
        Intrinsics.checkNotNullParameter(bannerItems, "bannerItems");
        this.f276680a = bannerItems;
        this.f276681b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f276680a, jVar.f276680a) && this.f276681b == jVar.f276681b;
    }

    public final int hashCode() {
        int iHashCode = this.f276680a.hashCode() * 31;
        r0i.a aVar = this.f276681b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
