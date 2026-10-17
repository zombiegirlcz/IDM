package l3e;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f191942a;

    public g(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f191942a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f191942a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f191942a, ((g) obj2).f191942a);
    }

    public final int hashCode() {
        return this.f191942a.hashCode();
    }

    public g() {
        this(f0.f322471a);
    }
}
