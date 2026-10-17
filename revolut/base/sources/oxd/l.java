package oxd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f230776a;

    public l(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f230776a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f230776a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f230776a, ((l) obj2).f230776a);
    }

    public final int hashCode() {
        return this.f230776a.hashCode();
    }
}
