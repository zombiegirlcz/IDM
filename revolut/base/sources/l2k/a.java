package l2k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f191808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f191809c;
    public final String d;

    public a(long j2, String targetCurrency, String recipientCountry, String beneficiaryId) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        this.f191807a = targetCurrency;
        this.f191808b = recipientCountry;
        this.f191809c = j2;
        this.d = beneficiaryId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f191807a, aVar.f191807a) && Intrinsics.f(this.f191808b, aVar.f191808b) && this.f191809c == aVar.f191809c && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.d.c(p.a.c(this.f191807a.hashCode() * 31, 31, this.f191808b), 31, this.f191809c);
    }
}
