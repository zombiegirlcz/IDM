package gig;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144201b;

    public m(String accountId, String str) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f144200a = accountId;
        this.f144201b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f144200a, mVar.f144200a) && Intrinsics.f(this.f144201b, mVar.f144201b);
    }

    public final int hashCode() {
        int iHashCode = this.f144200a.hashCode() * 31;
        String str = this.f144201b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
