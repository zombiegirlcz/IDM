package n4l;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f212470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingProductCode f212471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TradingAccountType f212472c;
    public final String d;

    public c(boolean z, TradingProductCode product, TradingAccountType accountType, String str) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f212470a = z;
        this.f212471b = product;
        this.f212472c = accountType;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f212470a == cVar.f212470a && Intrinsics.f(this.f212471b, cVar.f212471b) && Intrinsics.f(this.f212472c, cVar.f212472c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f212472c.hashCode() + ((this.f212471b.hashCode() + (Boolean.hashCode(this.f212470a) * 31)) * 31)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
