package n9e;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f213637a;

    public f(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f213637a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f213637a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f213637a, ((f) obj2).f213637a);
    }

    public final int hashCode() {
        return this.f213637a.hashCode();
    }
}
