package m63;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f202995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f202996b;

    public f(List cards, List disposableLimits) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(disposableLimits, "disposableLimits");
        this.f202995a = cards;
        this.f202996b = disposableLimits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f202995a, fVar.f202995a) && Intrinsics.f(this.f202996b, fVar.f202996b);
    }

    public final int hashCode() {
        return this.f202996b.hashCode() + (this.f202995a.hashCode() * 31);
    }
}
