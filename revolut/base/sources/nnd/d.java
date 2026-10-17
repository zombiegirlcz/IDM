package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount f217538a;

    public d(AnalyticsAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f217538a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f217538a, ((d) obj2).f217538a);
    }

    public final int hashCode() {
        return this.f217538a.hashCode();
    }
}
