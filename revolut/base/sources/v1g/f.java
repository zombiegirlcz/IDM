package v1g;

import aii.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f285311a;

    public f(Set categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f285311a = categories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f285311a, ((f) obj2).f285311a);
    }

    public final int hashCode() {
        return this.f285311a.hashCode();
    }
}
