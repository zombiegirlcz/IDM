package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215961b;

    public n4(String portfolioId, String accountType) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f215960a = portfolioId;
        this.f215961b = accountType;
    }

    public final String a() {
        return this.f215961b;
    }

    public final String b() {
        return this.f215960a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj2;
        return Intrinsics.f(this.f215960a, n4Var.f215960a) && Intrinsics.f(this.f215961b, n4Var.f215961b);
    }

    public final int hashCode() {
        return this.f215961b.hashCode() + (this.f215960a.hashCode() * 31);
    }
}
