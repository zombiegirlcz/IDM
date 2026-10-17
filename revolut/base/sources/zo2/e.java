package zo2;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323861a;

    public e(String switchRequestId) {
        Intrinsics.checkNotNullParameter(switchRequestId, "switchRequestId");
        this.f323861a = switchRequestId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f323861a, ((e) obj2).f323861a);
    }

    public final int hashCode() {
        return this.f323861a.hashCode();
    }
}
