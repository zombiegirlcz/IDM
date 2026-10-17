package ux9;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq9.j f283946b;

    public r(String cardOwnerId, jq9.j paymentItem) {
        Intrinsics.checkNotNullParameter(cardOwnerId, "cardOwnerId");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f283945a = cardOwnerId;
        this.f283946b = paymentItem;
    }

    @Override // ux9.t
    public final jq9.b b() {
        return this.f283946b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f283945a.equals(rVar.f283945a) && this.f283946b.equals(rVar.f283946b);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(0, y.f(this.f283946b.f177504a, this.f283945a.hashCode() * 31, 31), 31);
    }
}
