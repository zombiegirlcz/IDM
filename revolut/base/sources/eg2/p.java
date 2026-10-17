package eg2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f125536a;

    public p(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f125536a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f125536a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f125536a, ((p) obj2).f125536a);
    }

    public final int hashCode() {
        return this.f125536a.hashCode();
    }
}
