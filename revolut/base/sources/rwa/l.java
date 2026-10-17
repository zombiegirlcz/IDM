package rwa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f257874a;

    public l(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f257874a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f257874a, ((l) obj2).f257874a);
    }

    public final int hashCode() {
        return this.f257874a.hashCode();
    }
}
