package q97;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.wealth.analytics.navigation.ComplexAnalyticsDestination;
import grl.k9;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o3 implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kbf.a f243759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kpj.f f243760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.l f243761c;

    public o3(t97.c productCellProvider, kbf.a tradingAddOnSpecificAddOnInteractor, kpj.f analyticsProductTypeEnabledInteractor, ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(tradingAddOnSpecificAddOnInteractor, "tradingAddOnSpecificAddOnInteractor");
        Intrinsics.checkNotNullParameter(analyticsProductTypeEnabledInteractor, "analyticsProductTypeEnabledInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f243759a = tradingAddOnSpecificAddOnInteractor;
        this.f243760b = analyticsProductTypeEnabledInteractor;
        this.f243761c = tradingConfigInteractor;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        t97.d[] elements = {t97.d.CRYPTO_ANALYTICS, t97.d.COMMODITIES_ANALYTICS, t97.d.STOCKS_ANALYTICS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.d0.T(kotlin.collections.d.y0(elements), id10);
    }

    @Override // p97.c
    public final efm.r b() {
        efm.r map = m70.a.f(((wbf.n) this.f243759a).b(lbf.f.TRADING_PRO, false), new pv7.t(20), new q2(10), new q2(11)).switchMap(new h2(12, new q56.o(this, 21))).map(new h2(13, new l1(this, 15)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Pair pair;
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        p97.b bVar = productCell.f234280a;
        if (bVar == t97.d.CRYPTO_ANALYTICS) {
            ixg.b bVar2 = ixg.b.CRYPTO;
            k9 k9Var = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            pair = new Pair(bVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
        } else if (bVar == t97.d.COMMODITIES_ANALYTICS) {
            ixg.b bVar3 = ixg.b.COMMODITY;
            k9 k9Var2 = k9.Wealth;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            pair = new Pair(bVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2));
        } else {
            if (bVar != t97.d.STOCKS_ANALYTICS) {
                ufm.b bVarM = efm.d0.m(o97.e.f223096a);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            }
            ixg.b bVar4 = ixg.b.STOCKS;
            k9 k9Var3 = k9.Wealth;
            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
            pair = new Pair(bVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3));
        }
        ufm.b bVarM2 = efm.d0.m(new o97.l(zh9.u0.f(new ComplexAnalyticsDestination(null, (ixg.b) pair.f186385a, null, null, new AnalyticsProduct.Retail(((AnalyticsProduct.Retail) pair.f186386b).f50300a), null, 45))));
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }
}
