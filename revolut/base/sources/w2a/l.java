package w2a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f293994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f293995b;

    public l(List items, k layoutType) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        this.f293994a = items;
        this.f293995b = layoutType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f293994a, lVar.f293994a) && this.f293995b == lVar.f293995b;
    }

    public final int hashCode() {
        return this.f293995b.hashCode() + (this.f293994a.hashCode() * 31);
    }
}
