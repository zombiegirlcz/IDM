package k6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181680a;

    public d(String orderToken) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        this.f181680a = orderToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f181680a, ((d) obj2).f181680a);
    }

    public final int hashCode() {
        return this.f181680a.hashCode();
    }
}
