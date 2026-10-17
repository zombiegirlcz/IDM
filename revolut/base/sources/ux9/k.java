package ux9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq9.c f283933b;

    public k(String groupId, jq9.c paymentItem) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f283932a = groupId;
        this.f283933b = paymentItem;
    }

    @Override // ux9.t
    public final jq9.b b() {
        return this.f283933b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f283932a, kVar.f283932a) && this.f283933b.equals(kVar.f283933b);
    }

    @Override // ux9.n
    public final String getGroupId() {
        return this.f283932a;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(0, m72.b.f(this.f283933b.f177497a, this.f283932a.hashCode() * 31, 31), 31);
    }
}
