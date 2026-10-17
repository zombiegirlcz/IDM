package wp5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddress f299124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f299125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f299126c;

    public k(CryptoAddress cryptoAddress, boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f299124a = cryptoAddress;
        this.f299125b = z;
        this.f299126c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f299124a, kVar.f299124a) && this.f299125b == kVar.f299125b && Intrinsics.f(this.f299126c, kVar.f299126c);
    }

    public final int hashCode() {
        CryptoAddress cryptoAddress = this.f299124a;
        return this.f299126c.hashCode() + j6.a.c((cryptoAddress == null ? 0 : cryptoAddress.hashCode()) * 31, 31, this.f299125b);
    }
}
