package ryj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258402a;

    public k(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f258402a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f258402a, ((k) obj2).f258402a);
    }

    public final int hashCode() {
        return this.f258402a.hashCode();
    }
}
