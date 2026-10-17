package ux9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq9.d f283931b;

    public j(String groupId, jq9.d paymentItem) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f283930a = groupId;
        this.f283931b = paymentItem;
    }

    @Override // ux9.t
    public final jq9.b b() {
        return this.f283931b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f283930a, jVar.f283930a) && this.f283931b.equals(jVar.f283931b);
    }

    @Override // ux9.n
    public final String getGroupId() {
        return this.f283930a;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(0, (this.f283931b.f177498a.hashCode() + (this.f283930a.hashCode() * 31)) * 31, 31);
    }
}
