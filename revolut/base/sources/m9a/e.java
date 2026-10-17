package m9a;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g8a.a f203675a;

    public e(g8a.a reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f203675a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f203675a == ((e) obj2).f203675a;
    }

    public final int hashCode() {
        return this.f203675a.hashCode();
    }
}
