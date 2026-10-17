package n0i;

import com.revolut.feature.crypto.config.api.models.CryptoPeggedPair;
import kotlin.jvm.internal.Intrinsics;
import wd6.e;
import wd6.h;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f211043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f211044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f211045c;
    public final CryptoPeggedPair d;

    public a(h orderType, e exchangeMode, boolean z, CryptoPeggedPair cryptoPeggedPair) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        this.f211043a = orderType;
        this.f211044b = exchangeMode;
        this.f211045c = z;
        this.d = cryptoPeggedPair;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f211043a == aVar.f211043a && this.f211044b == aVar.f211044b && this.f211045c == aVar.f211045c && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(y.g(this.f211044b, this.f211043a.hashCode() * 31, 31), 31, this.f211045c);
        CryptoPeggedPair cryptoPeggedPair = this.d;
        return iC + (cryptoPeggedPair == null ? 0 : cryptoPeggedPair.hashCode());
    }
}
