package ux9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f283953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f283954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jq9.b f283955c;

    public u(long j2, int i, jq9.b paymentItem) {
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f283953a = j2;
        this.f283954b = i;
        this.f283955c = paymentItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f283953a == uVar.f283953a && this.f283954b == uVar.f283954b && Intrinsics.f(this.f283955c, uVar.f283955c);
    }

    public final int hashCode() {
        return this.f283955c.hashCode() + j6.a.b(this.f283954b, Long.hashCode(this.f283953a) * 31, 31);
    }
}
