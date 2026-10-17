package ur;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f282222a;

    public e(f status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f282222a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f282222a == ((e) obj2).f282222a;
    }

    public final int hashCode() {
        return this.f282222a.hashCode();
    }
}
