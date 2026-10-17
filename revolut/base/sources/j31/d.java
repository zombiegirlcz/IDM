package j31;

import com.revolut.core.model.account.AccountId;
import io3.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f170926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f170927b;

    public d(AccountId accountId, l pocketType) {
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f170926a = pocketType;
        this.f170927b = accountId;
    }

    public final AccountId a() {
        return this.f170927b;
    }

    public final l b() {
        return this.f170926a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f170926a == dVar.f170926a && Intrinsics.f(this.f170927b, dVar.f170927b);
    }

    public final int hashCode() {
        return this.f170927b.hashCode() + (this.f170926a.hashCode() * 31);
    }
}
