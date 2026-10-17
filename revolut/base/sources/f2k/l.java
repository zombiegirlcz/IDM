package f2k;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f131849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f131850b;

    public l(List items, h hVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f131849a = items;
        this.f131850b = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f131849a, lVar.f131849a) && Intrinsics.f(this.f131850b, lVar.f131850b);
    }

    public final int hashCode() {
        int iHashCode = this.f131849a.hashCode() * 31;
        h hVar = this.f131850b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
