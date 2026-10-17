package ynd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Savings f315450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f315451b;

    public f(AnalyticsAccount.Savings account, String name) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f315450a = account;
        this.f315451b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f315450a, fVar.f315450a) && Intrinsics.f(this.f315451b, fVar.f315451b);
    }

    @Override // ynd.h
    public final AnalyticsAccount getAccount() {
        return this.f315450a;
    }

    public final int hashCode() {
        return this.f315451b.hashCode() + (this.f315450a.hashCode() * 31);
    }
}
