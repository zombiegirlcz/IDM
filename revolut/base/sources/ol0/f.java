package ol0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f226287a;

    public f(List children) {
        Intrinsics.checkNotNullParameter(children, "children");
        this.f226287a = children;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f226287a, ((f) obj2).f226287a);
    }

    public final int hashCode() {
        return this.f226287a.hashCode();
    }
}
