package ol0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f226292a;

    public j(List children) {
        Intrinsics.checkNotNullParameter(children, "children");
        this.f226292a = children;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f226292a, ((j) obj2).f226292a);
    }

    public final int hashCode() {
        return this.f226292a.hashCode();
    }
}
