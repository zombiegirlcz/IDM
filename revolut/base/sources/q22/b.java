package q22;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f241488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f241489b;

    public b(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f241488a = items;
        this.f241489b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f241488a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f241488a, bVar.f241488a) && this.f241489b == bVar.f241489b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f241489b) + (this.f241488a.hashCode() * 31);
    }
}
