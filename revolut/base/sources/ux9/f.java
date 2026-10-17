package ux9;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq9.j f283923b;

    public f(String charityId, jq9.j paymentItem) {
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f283922a = charityId;
        this.f283923b = paymentItem;
    }

    @Override // ux9.t
    public final jq9.b b() {
        return this.f283923b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f283922a.equals(fVar.f283922a) && this.f283923b.equals(fVar.f283923b);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(0, y.f(this.f283923b.f177504a, this.f283922a.hashCode() * 31, 31), 31);
    }
}
