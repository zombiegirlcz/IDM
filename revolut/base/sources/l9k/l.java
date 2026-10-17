package l9k;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f193281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f193282b;

    public l(List items, h hVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f193281a = items;
        this.f193282b = hVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f193281a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f193281a, lVar.f193281a) && Intrinsics.f(this.f193282b, lVar.f193282b);
    }

    public final int hashCode() {
        int iHashCode = this.f193281a.hashCode() * 31;
        h hVar = this.f193282b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
