package jpd;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f177261a;

    public b(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f177261a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f177261a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f177261a, ((b) obj2).f177261a);
    }

    public final int hashCode() {
        return this.f177261a.hashCode();
    }
}
