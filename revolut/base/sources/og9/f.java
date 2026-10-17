package og9;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg9.b f225060a;

    public f(sg9.b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f225060a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f225060a, ((f) obj2).f225060a);
    }

    public final int hashCode() {
        return this.f225060a.hashCode();
    }
}
