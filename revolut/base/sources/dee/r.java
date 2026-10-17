package dee;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f113419a;

    public r(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f113419a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f113419a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f113419a, ((r) obj2).f113419a);
    }

    public final int hashCode() {
        return this.f113419a.hashCode();
    }
}
