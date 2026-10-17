package pm1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237443a;

    public b(String termsId) {
        Intrinsics.checkNotNullParameter(termsId, "termsId");
        this.f237443a = termsId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f237443a, ((b) obj2).f237443a);
    }

    public final int hashCode() {
        return this.f237443a.hashCode();
    }
}
