package q09;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f241185a;

    public g0(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f241185a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f241185a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f241185a, ((g0) obj2).f241185a);
    }

    public final int hashCode() {
        return this.f241185a.hashCode();
    }
}
