package fjj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135667a;

    public r(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f135667a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f135667a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f135667a, ((r) obj2).f135667a);
    }

    public final int hashCode() {
        return this.f135667a.hashCode();
    }
}
