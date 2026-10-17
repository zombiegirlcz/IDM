package i3k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f158243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f158244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f158245c;
    public final xi0.b d;

    public k(long j2, wi0.b recipientCountry, xi0.b senderCurrency, xi0.b recipientCurrency) {
        Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        Intrinsics.checkNotNullParameter(recipientCurrency, "recipientCurrency");
        this.f158243a = senderCurrency;
        this.f158244b = j2;
        this.f158245c = recipientCountry;
        this.d = recipientCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f158243a, kVar.f158243a) && this.f158244b == kVar.f158244b && Intrinsics.f(this.f158245c, kVar.f158245c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(a0.d.c(this.f158243a.hashCode() * 31, 31, this.f158244b), 31, this.f158245c.f297794a);
    }
}
