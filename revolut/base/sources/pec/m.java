package pec;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235372a;

    public m(String orderToken) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        this.f235372a = orderToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f235372a, ((m) obj2).f235372a);
    }

    public final int hashCode() {
        return this.f235372a.hashCode();
    }
}
