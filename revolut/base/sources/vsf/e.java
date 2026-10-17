package vsf;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ttf.d f291778a;

    public e(ttf.d operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f291778a = operation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f291778a == ((e) obj2).f291778a;
    }

    public final int hashCode() {
        return this.f291778a.hashCode();
    }
}
