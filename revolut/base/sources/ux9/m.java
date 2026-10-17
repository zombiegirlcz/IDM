package ux9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq9.e f283937b;

    public m(String groupId, jq9.e paymentItem) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f283936a = groupId;
        this.f283937b = paymentItem;
    }

    @Override // ux9.t
    public final jq9.b b() {
        return this.f283937b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f283936a, mVar.f283936a) && this.f283937b.equals(mVar.f283937b);
    }

    @Override // ux9.n
    public final String getGroupId() {
        return this.f283936a;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(0, (this.f283937b.f177499a.hashCode() + (this.f283936a.hashCode() * 31)) * 31, 31);
    }
}
