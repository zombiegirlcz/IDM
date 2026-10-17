package ynd;

import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.SpendingAnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpendingAnalyticsAccount f315452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f315453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SubaccountType f315454c;

    public g(SpendingAnalyticsAccount account, String name, SubaccountType type) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f315452a = account;
        this.f315453b = name;
        this.f315454c = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f315452a.equals(gVar.f315452a) && Intrinsics.f(this.f315453b, gVar.f315453b) && Intrinsics.f(this.f315454c, gVar.f315454c);
    }

    @Override // ynd.h
    public final AnalyticsAccount getAccount() {
        return this.f315452a;
    }

    public final int hashCode() {
        return this.f315454c.hashCode() + p.a.c(this.f315452a.hashCode() * 31, 31, this.f315453b);
    }
}
