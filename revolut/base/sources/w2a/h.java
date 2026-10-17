package w2a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293990a;

    public h(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f293990a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f293990a, ((h) obj2).f293990a);
    }

    public final int hashCode() {
        return this.f293990a.hashCode();
    }
}
