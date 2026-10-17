package h8e;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f150023a;

    public g(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f150023a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f150023a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f150023a, ((g) obj2).f150023a);
    }

    public final int hashCode() {
        return this.f150023a.hashCode();
    }
}
