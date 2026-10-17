package ur1;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import h30.l;
import io3.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f282230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f282231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PaymentPocketInfo f282232c;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f282230a, aVar.f282230a) && Intrinsics.f(this.f282231b, aVar.f282231b) && Intrinsics.f(this.f282232c, aVar.f282232c);
    }

    public final int hashCode() {
        int iG = l.g(this.f282231b, this.f282230a.hashCode() * 31, 31);
        PaymentPocketInfo paymentPocketInfo = this.f282232c;
        return iG + (paymentPocketInfo == null ? 0 : paymentPocketInfo.hashCode());
    }

    public a(AccountId accountId, PaymentPocketInfo paymentPocketInfo, d pocket) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f282230a = accountId;
        this.f282231b = pocket;
        this.f282232c = paymentPocketInfo;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i) {
        this(AccountId.Personal.f51414a, null, d.f163144x);
        d.Companion.getClass();
    }
}
