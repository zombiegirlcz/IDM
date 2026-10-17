package ya1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311889a;

    public b(String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.f311889a = orderId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f311889a, ((b) obj2).f311889a);
    }

    public final int hashCode() {
        return this.f311889a.hashCode();
    }
}
