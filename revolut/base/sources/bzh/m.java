package bzh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kyh.g f20040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoExchangeContract$MoneyDetails f20041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoExchangeContract$MoneyDetails f20042c;
    public final wd6.e d;
    public final wd6.h e;
    public final double f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20044h;

    public m(kyh.g inputPosition, CryptoExchangeContract$MoneyDetails topMoneyDetails, CryptoExchangeContract$MoneyDetails bottomMoneyDetails, wd6.e exchangeMode, wd6.h orderType, double d, boolean z, String str) {
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        Intrinsics.checkNotNullParameter(topMoneyDetails, "topMoneyDetails");
        Intrinsics.checkNotNullParameter(bottomMoneyDetails, "bottomMoneyDetails");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f20040a = inputPosition;
        this.f20041b = topMoneyDetails;
        this.f20042c = bottomMoneyDetails;
        this.d = exchangeMode;
        this.e = orderType;
        this.f = d;
        this.f20043g = z;
        this.f20044h = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f20040a == mVar.f20040a && Intrinsics.f(this.f20041b, mVar.f20041b) && Intrinsics.f(this.f20042c, mVar.f20042c) && this.d == mVar.d && this.e == mVar.e && Double.compare(this.f, mVar.f) == 0 && this.f20043g == mVar.f20043g && Intrinsics.f(this.f20044h, mVar.f20044h);
    }

    public final int hashCode() {
        int iC = j6.a.c(m72.b.c(v1.c.b(this.e, y.g(this.d, (this.f20042c.hashCode() + ((this.f20041b.hashCode() + (this.f20040a.hashCode() * 31)) * 31)) * 31, 31), 31), this.f, 31), 31, this.f20043g);
        String str = this.f20044h;
        return iC + (str == null ? 0 : str.hashCode());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(CryptoOrderDraft draft, boolean z, String str) {
        this(draft.d, draft.f96689a, draft.f96690b, draft.e, draft.f, draft.f96700r, z, str);
        Intrinsics.checkNotNullParameter(draft, "draft");
    }

    public /* synthetic */ m(CryptoOrderDraft cryptoOrderDraft, boolean z, int i) {
        this(cryptoOrderDraft, (i & 2) != 0 ? false : z, (String) null);
    }
}
