package g3e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f140265a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f140265a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f140265a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f140265a, ((c) obj2).f140265a);
    }

    public final int hashCode() {
        return this.f140265a.hashCode();
    }

    public c() {
        this(f0.f322471a);
    }
}
