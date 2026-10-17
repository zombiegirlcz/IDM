package ix6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169410a;

    public r(String customerId) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        this.f169410a = customerId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f169410a, ((r) obj2).f169410a);
    }

    public final int hashCode() {
        return this.f169410a.hashCode();
    }
}
