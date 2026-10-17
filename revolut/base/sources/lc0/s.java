package lc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f193771a;

    public s(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f193771a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f193771a, ((s) obj2).f193771a);
    }

    public final int hashCode() {
        return this.f193771a.hashCode();
    }
}
