package rze;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f258595a;

    public d(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f258595a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f258595a, ((d) obj2).f258595a);
    }

    public final int hashCode() {
        return this.f258595a.hashCode();
    }
}
