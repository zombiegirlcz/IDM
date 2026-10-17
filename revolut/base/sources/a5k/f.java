package a5k;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f1447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f1449c;

    public f(qua.p recurringPayment, boolean z, AccountId accountId) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f1447a = recurringPayment;
        this.f1448b = z;
        this.f1449c = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f1447a, fVar.f1447a) && this.f1448b == fVar.f1448b && Intrinsics.f(this.f1449c, fVar.f1449c);
    }

    public final int hashCode() {
        return this.f1449c.hashCode() + j6.a.c(this.f1447a.hashCode() * 31, 31, this.f1448b);
    }
}
