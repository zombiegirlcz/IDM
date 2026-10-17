package ko5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f186235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f186237c;
    public final wk5.a d;

    public k(dj0.d recipientAmount, String str, String cryptoAddressId, wk5.a blockchain) {
        Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
        Intrinsics.checkNotNullParameter(cryptoAddressId, "cryptoAddressId");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        this.f186235a = recipientAmount;
        this.f186236b = str;
        this.f186237c = cryptoAddressId;
        this.d = blockchain;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f186235a, kVar.f186235a) && Intrinsics.f(this.f186236b, kVar.f186236b) && Intrinsics.f(this.f186237c, kVar.f186237c) && this.d == kVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f186235a.hashCode() * 31;
        String str = this.f186236b;
        return this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f186237c);
    }
}
