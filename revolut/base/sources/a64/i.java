package a64;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1540a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f1540a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f1540a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f1540a, ((i) obj2).f1540a);
    }

    public final int hashCode() {
        return this.f1540a.hashCode();
    }
}
