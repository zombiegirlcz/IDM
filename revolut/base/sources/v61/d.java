package v61;

import com.revolut.domain.models.moneyrequest.MoneyRequestState;
import com.revolut.domain.models.moneyrequest.SplitMoneyRequestStatus;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequestState f286275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SplitMoneyRequestStatus f286276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f286277c;
    public final long d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f286278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f286279h;

    public d(MoneyRequestState moneyRequestState, SplitMoneyRequestStatus splitMoneyRequestStatus, String itemId, long j2, String str, String str2, e payer, String reason) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(payer, "payer");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f286275a = moneyRequestState;
        this.f286276b = splitMoneyRequestStatus;
        this.f286277c = itemId;
        this.d = j2;
        this.e = str;
        this.f = str2;
        this.f286278g = payer;
        this.f286279h = reason;
    }

    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f286275a == dVar.f286275a && this.f286276b == dVar.f286276b && Intrinsics.f(this.f286277c, dVar.f286277c) && this.d == dVar.d && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f286278g, dVar.f286278g) && Intrinsics.f(this.f286279h, dVar.f286279h);
    }

    public final int hashCode() {
        MoneyRequestState moneyRequestState = this.f286275a;
        int iHashCode = (moneyRequestState == null ? 0 : moneyRequestState.hashCode()) * 31;
        SplitMoneyRequestStatus splitMoneyRequestStatus = this.f286276b;
        int iC = a0.d.c(p.a.c((iHashCode + (splitMoneyRequestStatus == null ? 0 : splitMoneyRequestStatus.hashCode())) * 31, 31, this.f286277c), 31, this.d);
        String str = this.e;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return this.f286279h.hashCode() + ((this.f286278g.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }
}
