package ni4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f215638a;

    public c(it3.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f215638a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f215638a, ((c) obj2).f215638a);
    }

    public final int hashCode() {
        return this.f215638a.hashCode();
    }
}
