package ua2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278526a;

    public l(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f278526a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f278526a, ((l) obj2).f278526a);
    }

    public final int hashCode() {
        return this.f278526a.hashCode();
    }
}
