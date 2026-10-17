package iv3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f168709a;

    public c(d error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f168709a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f168709a == ((c) obj2).f168709a;
    }

    public final int hashCode() {
        return this.f168709a.hashCode();
    }
}
