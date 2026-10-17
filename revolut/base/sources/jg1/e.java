package jg1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173901c;
    public final String d;
    public final String e;

    public e(String paymentAppProviderId, String paymentAppInstanceId, String tokenUniqueReference, String accountPanSuffix, String accountExpiry) {
        Intrinsics.checkNotNullParameter(paymentAppProviderId, "paymentAppProviderId");
        Intrinsics.checkNotNullParameter(paymentAppInstanceId, "paymentAppInstanceId");
        Intrinsics.checkNotNullParameter(tokenUniqueReference, "tokenUniqueReference");
        Intrinsics.checkNotNullParameter(accountPanSuffix, "accountPanSuffix");
        Intrinsics.checkNotNullParameter(accountExpiry, "accountExpiry");
        this.f173899a = paymentAppProviderId;
        this.f173900b = paymentAppInstanceId;
        this.f173901c = tokenUniqueReference;
        this.d = accountPanSuffix;
        this.e = accountExpiry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f173899a, eVar.f173899a) && Intrinsics.f(this.f173900b, eVar.f173900b) && Intrinsics.f(this.f173901c, eVar.f173901c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f173899a.hashCode() * 31, 31, this.f173900b), 31, this.f173901c), 31, this.d);
    }
}
