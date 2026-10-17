package wr1;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f299491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f299492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f299493c;
    public final ApmQuote d;

    public i(dj0.d amount, AccountId accountId, String pocketId, ApmQuote apmQuote) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f299491a = amount;
        this.f299492b = accountId;
        this.f299493c = pocketId;
        this.d = apmQuote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f299491a, iVar.f299491a) && Intrinsics.f(this.f299492b, iVar.f299492b) && Intrinsics.f(this.f299493c, iVar.f299493c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(h30.l.b(this.f299492b, this.f299491a.hashCode() * 31, 31), 31, this.f299493c);
        ApmQuote apmQuote = this.d;
        return iC + (apmQuote == null ? 0 : apmQuote.hashCode());
    }
}
