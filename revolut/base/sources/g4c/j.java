package g4c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140478a;

    public j(String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.f140478a = orderId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f140478a, ((j) obj2).f140478a);
    }

    public final int hashCode() {
        return this.f140478a.hashCode();
    }
}
