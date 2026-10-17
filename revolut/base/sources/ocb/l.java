package ocb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f224184a;

    public l(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f224184a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f224184a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f224184a, ((l) obj2).f224184a);
    }

    public final int hashCode() {
        return this.f224184a.hashCode();
    }
}
