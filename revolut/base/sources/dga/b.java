package dga;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f114611a;

    public b(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f114611a = exception;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f114611a, ((b) obj2).f114611a);
    }

    public final int hashCode() {
        return this.f114611a.hashCode();
    }
}
