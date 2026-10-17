package ba2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f13880a;

    public d(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f13880a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f13880a, ((d) obj2).f13880a);
    }

    public final int hashCode() {
        return this.f13880a.hashCode();
    }
}
