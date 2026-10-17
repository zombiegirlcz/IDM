package oxe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f230794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f230795b;

    public l(List items, k kVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f230794a = items;
        this.f230795b = kVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f230794a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f230794a, lVar.f230794a) && Intrinsics.f(this.f230795b, lVar.f230795b);
    }

    public final int hashCode() {
        int iHashCode = this.f230794a.hashCode() * 31;
        k kVar = this.f230795b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }
}
