package n9c;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f213632a;

    public c(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f213632a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f213632a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f213632a, ((c) obj2).f213632a);
    }

    public final int hashCode() {
        return this.f213632a.hashCode();
    }
}
