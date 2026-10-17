package y9a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311819a;

    public k(String authorisationId) {
        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
        this.f311819a = authorisationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f311819a, ((k) obj2).f311819a);
    }

    public final int hashCode() {
        return this.f311819a.hashCode();
    }
}
