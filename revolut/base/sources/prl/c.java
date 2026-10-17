package prl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239323a;

    public c(String compoundId) {
        Intrinsics.checkNotNullParameter(compoundId, "compoundId");
        this.f239323a = compoundId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f239323a, ((c) obj2).f239323a);
    }

    public final int hashCode() {
        return this.f239323a.hashCode();
    }
}
