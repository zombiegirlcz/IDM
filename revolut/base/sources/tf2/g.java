package tf2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f270215a;

    public g(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f270215a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f270215a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f270215a, ((g) obj2).f270215a);
    }

    public final int hashCode() {
        return this.f270215a.hashCode();
    }
}
