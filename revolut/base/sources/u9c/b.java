package u9c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278450a;

    public b(String orderToken) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        this.f278450a = orderToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f278450a, ((b) obj2).f278450a);
    }

    public final int hashCode() {
        return this.f278450a.hashCode();
    }
}
