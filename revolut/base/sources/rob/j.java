package rob;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f255955a;

    public j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f255955a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f255955a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f255955a, ((j) obj2).f255955a);
    }

    public final int hashCode() {
        return this.f255955a.hashCode();
    }
}
