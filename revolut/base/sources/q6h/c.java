package q6h;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f242597a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f242597a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f242597a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f242597a, ((c) obj2).f242597a);
    }

    public final int hashCode() {
        return this.f242597a.hashCode();
    }

    public c() {
        this(f0.f322471a);
    }
}
