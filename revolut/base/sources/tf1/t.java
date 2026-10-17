package tf1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f270200a;

    public t(List categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f270200a = categories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f270200a, ((t) obj2).f270200a);
    }

    public final int hashCode() {
        return this.f270200a.hashCode();
    }
}
