package iw5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168965a;

    public f(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f168965a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f168965a, ((f) obj2).f168965a);
    }

    public final int hashCode() {
        return this.f168965a.hashCode();
    }
}
