package l1j;

import com.revolut.core.model.account.AccountId;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f191553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f191554c;
    public final k1j.a d;
    public final String e;

    public f(String balanceId, xi0.b balanceCurrency, AccountId accountId, k1j.a type, String targetCurrency) {
        Intrinsics.checkNotNullParameter(balanceId, "balanceId");
        Intrinsics.checkNotNullParameter(balanceCurrency, "balanceCurrency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.f191552a = balanceId;
        this.f191553b = balanceCurrency;
        this.f191554c = accountId;
        this.d = type;
        this.e = targetCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f191552a, fVar.f191552a) && Intrinsics.f(this.f191553b, fVar.f191553b) && Intrinsics.f(this.f191554c, fVar.f191554c) && this.d == fVar.d && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + l.b(this.f191554c, l.j(this.f191553b, this.f191552a.hashCode() * 31, 31), 31)) * 31);
    }
}
