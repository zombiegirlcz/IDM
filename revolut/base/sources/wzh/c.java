package wzh;

import cli.j;
import com.revolut.feature.crypto.config.api.models.CryptoPeggedPair;
import kotlin.jvm.internal.Intrinsics;
import wd6.h;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f301421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd6.e f301422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoPeggedPair f301423c;

    public c(h orderType, wd6.e exchangeMode, CryptoPeggedPair cryptoPeggedPair) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        this.f301421a = orderType;
        this.f301422b = exchangeMode;
        this.f301423c = cryptoPeggedPair;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f301421a == cVar.f301421a && this.f301422b == cVar.f301422b && Intrinsics.f(this.f301423c, cVar.f301423c);
    }

    public final int hashCode() {
        int iG = y.g(this.f301422b, this.f301421a.hashCode() * 31, 31);
        CryptoPeggedPair cryptoPeggedPair = this.f301423c;
        return iG + (cryptoPeggedPair == null ? 0 : cryptoPeggedPair.hashCode());
    }
}
