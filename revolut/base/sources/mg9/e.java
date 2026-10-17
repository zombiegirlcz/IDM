package mg9;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg9.b f205197a;

    public e(sg9.b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f205197a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f205197a, ((e) obj2).f205197a);
    }

    public final int hashCode() {
        return this.f205197a.hashCode();
    }
}
