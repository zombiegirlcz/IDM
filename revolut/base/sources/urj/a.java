package urj;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f282313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ie3.a f282314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f282315c;

    public a(Data goal, ie3.a aVar, AccountId accountId) {
        Intrinsics.checkNotNullParameter(goal, "goal");
        this.f282313a = goal;
        this.f282314b = aVar;
        this.f282315c = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f282313a, aVar.f282313a) && Intrinsics.f(this.f282314b, aVar.f282314b) && Intrinsics.f(this.f282315c, aVar.f282315c);
    }

    public final int hashCode() {
        int iHashCode = this.f282313a.hashCode() * 31;
        ie3.a aVar = this.f282314b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        AccountId accountId = this.f282315c;
        return iHashCode2 + (accountId != null ? accountId.hashCode() : 0);
    }
}
