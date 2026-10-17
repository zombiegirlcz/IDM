package g0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f139473a;

    public c(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f139473a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f139473a, ((c) obj2).f139473a);
    }

    public final int hashCode() {
        return this.f139473a.hashCode();
    }
}
