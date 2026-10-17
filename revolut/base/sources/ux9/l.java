package ux9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq9.f f283935b;

    public l(String groupId, jq9.f paymentItem) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f283934a = groupId;
        this.f283935b = paymentItem;
    }

    @Override // ux9.t
    public final jq9.b b() {
        return this.f283935b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f283934a, lVar.f283934a) && this.f283935b.equals(lVar.f283935b);
    }

    @Override // ux9.n
    public final String getGroupId() {
        return this.f283934a;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(0, (this.f283935b.f177500a.hashCode() + (this.f283934a.hashCode() * 31)) * 31, 31);
    }
}
