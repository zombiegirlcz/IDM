package je5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173223a;

    public l(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f173223a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f173223a, ((l) obj2).f173223a);
    }

    public final int hashCode() {
        return this.f173223a.hashCode();
    }
}
