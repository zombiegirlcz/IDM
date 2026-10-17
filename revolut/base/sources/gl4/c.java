package gl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f144556a;

    public c(b status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f144556a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f144556a == ((c) obj2).f144556a;
    }

    public final int hashCode() {
        return this.f144556a.hashCode();
    }
}
