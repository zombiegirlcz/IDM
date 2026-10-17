package ny4;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f220659a;

    public h(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f220659a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f220659a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f220659a, ((h) obj2).f220659a);
    }

    public final int hashCode() {
        return this.f220659a.hashCode();
    }
}
