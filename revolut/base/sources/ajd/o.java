package ajd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5550a;

    public o(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f5550a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f5550a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f5550a, ((o) obj2).f5550a);
    }

    public final int hashCode() {
        return this.f5550a.hashCode();
    }
}
