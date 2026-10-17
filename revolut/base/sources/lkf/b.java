package lkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196364a;

    public b(String paymentIntentId) {
        Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
        this.f196364a = paymentIntentId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f196364a, ((b) obj2).f196364a);
    }

    public final int hashCode() {
        return this.f196364a.hashCode();
    }
}
