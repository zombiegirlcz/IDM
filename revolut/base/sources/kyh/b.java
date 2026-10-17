package kyh;

import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature_crypto_order_flow.api.exchange.a f190892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature_crypto_order_flow.api.exchange.a f190893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f190894c;
    public final wd6.e d;
    public final q0i.i e;
    public final q0i.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f190895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Limit.UpperRestrictionLimit f190896h;
    public final Limit.LowerRestrictionLimit i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit f190897j;
    public final Limit.UsageLimit k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageTransformations f190898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f190899m;

    public b(com.revolut.feature_crypto_order_flow.api.exchange.a topMoneyDetails, com.revolut.feature_crypto_order_flow.api.exchange.a bottomMoneyDetails, g inputPosition, wd6.e exchangeMode, q0i.i iVar, q0i.c bottomMoneyBalance, boolean z, Limit.UpperRestrictionLimit upperRestrictionLimit, Limit.LowerRestrictionLimit lowerRestrictionLimit, CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit cryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit, Limit.UsageLimit usageLimit, ImageTransformations imageTransformations, List list, int i) {
        CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit cryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit2 = (i & 512) != 0 ? null : cryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit;
        Limit.UsageLimit usageLimit2 = (i & 1024) != 0 ? null : usageLimit;
        ImageTransformations imageTransformations2 = (i & 2048) != 0 ? null : imageTransformations;
        List list2 = (i & 4096) == 0 ? list : null;
        Intrinsics.checkNotNullParameter(topMoneyDetails, "topMoneyDetails");
        Intrinsics.checkNotNullParameter(bottomMoneyDetails, "bottomMoneyDetails");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(bottomMoneyBalance, "bottomMoneyBalance");
        this.f190892a = topMoneyDetails;
        this.f190893b = bottomMoneyDetails;
        this.f190894c = inputPosition;
        this.d = exchangeMode;
        this.e = iVar;
        this.f = bottomMoneyBalance;
        this.f190895g = z;
        this.f190896h = upperRestrictionLimit;
        this.i = lowerRestrictionLimit;
        this.f190897j = cryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit2;
        this.k = usageLimit2;
        this.f190898l = imageTransformations2;
        this.f190899m = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f190892a, bVar.f190892a) && Intrinsics.f(this.f190893b, bVar.f190893b) && this.f190894c == bVar.f190894c && this.d == bVar.d && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && this.f190895g == bVar.f190895g && Intrinsics.f(this.f190896h, bVar.f190896h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f190897j, bVar.f190897j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f190898l, bVar.f190898l) && Intrinsics.f(this.f190899m, bVar.f190899m);
    }

    public final int hashCode() {
        int iG = y.g(this.d, (this.f190894c.hashCode() + ((this.f190893b.hashCode() + (this.f190892a.hashCode() * 31)) * 31)) * 31, 31);
        q0i.i iVar = this.e;
        int iC = j6.a.c((this.f.hashCode() + ((iG + (iVar == null ? 0 : iVar.hashCode())) * 31)) * 31, 31, this.f190895g);
        Limit.UpperRestrictionLimit upperRestrictionLimit = this.f190896h;
        int iHashCode = (iC + (upperRestrictionLimit == null ? 0 : upperRestrictionLimit.hashCode())) * 31;
        Limit.LowerRestrictionLimit lowerRestrictionLimit = this.i;
        int iHashCode2 = (iHashCode + (lowerRestrictionLimit == null ? 0 : lowerRestrictionLimit.hashCode())) * 31;
        CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit cryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit = this.f190897j;
        int iHashCode3 = (iHashCode2 + (cryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit == null ? 0 : cryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit.hashCode())) * 31;
        Limit.UsageLimit usageLimit = this.k;
        int iHashCode4 = (iHashCode3 + (usageLimit == null ? 0 : usageLimit.hashCode())) * 31;
        ImageTransformations imageTransformations = this.f190898l;
        int iHashCode5 = (iHashCode4 + (imageTransformations == null ? 0 : imageTransformations.hashCode())) * 31;
        List list = this.f190899m;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }
}
