package ge5;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f143222b;

    public b(String userWalletBaseCurrency, ArrayList cryptosMarketCap) {
        Intrinsics.checkNotNullParameter(userWalletBaseCurrency, "userWalletBaseCurrency");
        Intrinsics.checkNotNullParameter(cryptosMarketCap, "cryptosMarketCap");
        this.f143221a = userWalletBaseCurrency;
        this.f143222b = cryptosMarketCap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f143221a, bVar.f143221a) && this.f143222b.equals(bVar.f143222b);
    }

    public final int hashCode() {
        return this.f143222b.hashCode() + (this.f143221a.hashCode() * 31);
    }
}
