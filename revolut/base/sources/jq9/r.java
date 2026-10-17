package jq9;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoAddress f177518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f177519c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(CryptoAddress cryptoAddress, b paymentItem, int i) {
        super(0);
        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f177518b = cryptoAddress;
        this.f177519c = paymentItem;
        this.d = i;
    }

    @Override // jq9.k
    public final String a() {
        return CryptoAddress.e(this.f177518b, 0, 3).f186223a;
    }

    @Override // jq9.k
    public final b c() {
        return this.f177519c;
    }

    @Override // jq9.k
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f177518b, rVar.f177518b) && Intrinsics.f(this.f177519c, rVar.f177519c) && this.d == rVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(this.d, (this.f177519c.hashCode() + (this.f177518b.hashCode() * 31)) * 31, 31);
    }

    public /* synthetic */ r(CryptoAddress cryptoAddress, b bVar, int i, int i2) {
        this(cryptoAddress, bVar, (i2 & 4) != 0 ? 0 : i);
    }
}
