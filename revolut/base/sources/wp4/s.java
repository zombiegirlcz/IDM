package wp4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f299087a;

    public s(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f299087a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f299087a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f299087a, ((s) obj2).f299087a);
    }

    public final int hashCode() {
        return this.f299087a.hashCode();
    }
}
