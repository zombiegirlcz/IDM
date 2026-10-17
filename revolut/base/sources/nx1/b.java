package nx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f220054a;

    public b(Exception throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f220054a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f220054a.equals(((b) obj2).f220054a);
    }

    public final int hashCode() {
        return this.f220054a.hashCode();
    }
}
