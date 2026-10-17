package hye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aue.a f156867a;

    public l(aue.a limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f156867a = limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f156867a, ((l) obj2).f156867a);
    }

    public final int hashCode() {
        return this.f156867a.hashCode();
    }
}
