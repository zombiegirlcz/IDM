package ux9;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq9.j f283927b;

    public h(String addressId, jq9.j paymentItem) {
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f283926a = addressId;
        this.f283927b = paymentItem;
    }

    @Override // ux9.t
    public final jq9.b b() {
        return this.f283927b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f283926a.equals(hVar.f283926a) && this.f283927b.equals(hVar.f283927b);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(0, y.f(this.f283927b.f177504a, this.f283926a.hashCode() * 31, 31), 31);
    }
}
