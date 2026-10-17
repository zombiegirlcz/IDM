package ux9;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq9.j f283925b;

    public g(String counterpartyId, jq9.j paymentItem) {
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f283924a = counterpartyId;
        this.f283925b = paymentItem;
    }

    @Override // ux9.t
    public final jq9.b b() {
        return this.f283925b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f283924a, gVar.f283924a) && this.f283925b.equals(gVar.f283925b);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(0, y.f(this.f283925b.f177504a, this.f283924a.hashCode() * 31, 31), 31);
    }
}
