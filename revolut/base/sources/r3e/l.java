package r3e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f251287a;

    public l(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f251287a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f251287a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f251287a, ((l) obj2).f251287a);
    }

    public final int hashCode() {
        return this.f251287a.hashCode();
    }

    public l() {
        this(f0.f322471a);
    }
}
