package vh2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f289275a;

    public e(List links) {
        Intrinsics.checkNotNullParameter(links, "links");
        this.f289275a = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f289275a, ((e) obj2).f289275a);
    }

    public final int hashCode() {
        return this.f289275a.hashCode();
    }
}
