package lbc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wbc.m f193649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yac.e f193650b;

    public v(wbc.m orderDetails, yac.e linkedTransactions) {
        Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
        Intrinsics.checkNotNullParameter(linkedTransactions, "linkedTransactions");
        this.f193649a = orderDetails;
        this.f193650b = linkedTransactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f193649a, vVar.f193649a) && Intrinsics.f(this.f193650b, vVar.f193650b);
    }

    public final int hashCode() {
        return this.f193650b.hashCode() + (this.f193649a.hashCode() * 31);
    }
}
