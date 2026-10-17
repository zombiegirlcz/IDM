package j4c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171343a;

    public j(String orderNumber) {
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        this.f171343a = orderNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f171343a, ((j) obj2).f171343a);
    }

    public final int hashCode() {
        return this.f171343a.hashCode();
    }
}
