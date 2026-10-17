package d2k;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f110875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f110876c;
    public final AccountId d;

    public d(String groupId, p pVar, boolean z, AccountId accountId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f110874a = groupId;
        this.f110875b = pVar;
        this.f110876c = z;
        this.d = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f110874a, dVar.f110874a) && Intrinsics.f(this.f110875b, dVar.f110875b) && this.f110876c == dVar.f110876c && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f110874a.hashCode() * 31;
        p pVar = this.f110875b;
        int iC = j6.a.c((iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31, 31, this.f110876c);
        AccountId accountId = this.d;
        return iC + (accountId != null ? accountId.hashCode() : 0);
    }
}
