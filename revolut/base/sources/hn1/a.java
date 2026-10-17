package hn1;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import h30.l;
import io3.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f154030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f154031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PaymentPocketInfo f154032c;

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
        return Intrinsics.f(this.f154030a, aVar.f154030a) && Intrinsics.f(this.f154031b, aVar.f154031b) && Intrinsics.f(this.f154032c, aVar.f154032c);
    }

    public final int hashCode() {
        int iG = l.g(this.f154031b, this.f154030a.hashCode() * 31, 31);
        PaymentPocketInfo paymentPocketInfo = this.f154032c;
        return iG + (paymentPocketInfo == null ? 0 : paymentPocketInfo.hashCode());
    }

    public a(AccountId accountId, PaymentPocketInfo paymentPocketInfo, d pocket) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f154030a = accountId;
        this.f154031b = pocket;
        this.f154032c = paymentPocketInfo;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i) {
        this(AccountId.Personal.f51414a, null, d.f163144x);
        d.Companion.getClass();
    }
}
