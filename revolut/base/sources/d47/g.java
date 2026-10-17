package d47;

import aii.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f111235a;

    public g(Set categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f111235a = categories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f111235a, ((g) obj2).f111235a);
    }

    public final int hashCode() {
        return this.f111235a.hashCode();
    }
}
