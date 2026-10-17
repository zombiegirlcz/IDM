package lfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194868b;

    public d(String accountId, String currency) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f194867a = accountId;
        this.f194868b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f194867a, dVar.f194867a) && Intrinsics.f(this.f194868b, dVar.f194868b);
    }

    public final int hashCode() {
        return this.f194868b.hashCode() + (this.f194867a.hashCode() * 31);
    }
}
