package in1;

import com.revolut.core.model.account.AccountId;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f162594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f162595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f162596c;
    public final String d;

    public i(dj0.d finalAmount, dj0.d billAmount, AccountId accountId, String pocketId) {
        Intrinsics.checkNotNullParameter(finalAmount, "finalAmount");
        Intrinsics.checkNotNullParameter(billAmount, "billAmount");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f162594a = finalAmount;
        this.f162595b = billAmount;
        this.f162596c = accountId;
        this.d = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f162594a, iVar.f162594a) && Intrinsics.f(this.f162595b, iVar.f162595b) && Intrinsics.f(this.f162596c, iVar.f162596c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.b(this.f162596c, v7.c(this.f162594a.hashCode() * 31, 31, this.f162595b), 31);
    }
}
