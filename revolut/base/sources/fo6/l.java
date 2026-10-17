package fo6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final se6.h f136832a;

    public l(se6.h branch) {
        Intrinsics.checkNotNullParameter(branch, "branch");
        this.f136832a = branch;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f136832a, ((l) obj2).f136832a);
    }

    public final int hashCode() {
        return this.f136832a.hashCode();
    }
}
