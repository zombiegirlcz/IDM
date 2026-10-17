package ol0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f226306a;

    public r(List children) {
        Intrinsics.checkNotNullParameter(children, "children");
        this.f226306a = children;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f226306a, ((r) obj2).f226306a);
    }

    public final int hashCode() {
        return this.f226306a.hashCode();
    }
}
