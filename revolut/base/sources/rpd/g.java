package rpd;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f256369a;

    public g(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f256369a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f256369a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f256369a, ((g) obj2).f256369a);
    }

    public final int hashCode() {
        return this.f256369a.hashCode();
    }
}
