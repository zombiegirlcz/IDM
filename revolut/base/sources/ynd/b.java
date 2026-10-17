package ynd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount f315443a;

    public b(AnalyticsAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f315443a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f315443a, ((b) obj2).f315443a);
    }

    @Override // ynd.h
    public final AnalyticsAccount getAccount() {
        return this.f315443a;
    }

    public final int hashCode() {
        return this.f315443a.hashCode();
    }
}
