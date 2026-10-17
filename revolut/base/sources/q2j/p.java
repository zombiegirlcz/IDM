package q2j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eda.e f241692a;

    public p(eda.e creationResult) {
        Intrinsics.checkNotNullParameter(creationResult, "creationResult");
        this.f241692a = creationResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f241692a, ((p) obj2).f241692a);
    }

    public final int hashCode() {
        return this.f241692a.hashCode();
    }
}
