package nya;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f220768a;

    public z(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f220768a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f220768a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f220768a, ((z) obj2).f220768a);
    }

    public final int hashCode() {
        return this.f220768a.hashCode();
    }
}
