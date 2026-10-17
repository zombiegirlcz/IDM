package bcb;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f14416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f14417c;
    public final e d;
    public final String e;
    public final AccountId f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TransferScheduleData f14418g;

    public a(long j2, xi0.b targetCurrency, xi0.b sourceCurrency, e targetMoneyBox, String str, AccountId accountId, TransferScheduleData transferScheduleData) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetMoneyBox, "targetMoneyBox");
        this.f14415a = j2;
        this.f14416b = targetCurrency;
        this.f14417c = sourceCurrency;
        this.d = targetMoneyBox;
        this.e = str;
        this.f = accountId;
        this.f14418g = transferScheduleData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f14415a == aVar.f14415a && Intrinsics.f(this.f14416b, aVar.f14416b) && Intrinsics.f(this.f14417c, aVar.f14417c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f14418g, aVar.f14418g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + l.j(this.f14417c, l.j(this.f14416b, Long.hashCode(this.f14415a) * 31, 31), 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AccountId accountId = this.f;
        int iHashCode3 = (iHashCode2 + (accountId == null ? 0 : accountId.hashCode())) * 31;
        TransferScheduleData transferScheduleData = this.f14418g;
        return iHashCode3 + (transferScheduleData != null ? transferScheduleData.hashCode() : 0);
    }
}
