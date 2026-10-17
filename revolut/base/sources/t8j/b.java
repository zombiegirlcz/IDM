package t8j;

import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreen;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import sy6.j;
import t73.y2;
import t73.z2;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m0k.e f268900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f268901m;

    public b(m0k.e wealthNewsInteractor, e view) {
        Intrinsics.checkNotNullParameter(wealthNewsInteractor, "wealthNewsInteractor");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f268900l = wealthNewsInteractor;
        this.f268901m = view;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.n
    public final void H2() {
        CryptoAssetDetailsScreen cryptoAssetDetailsScreen = (CryptoAssetDetailsScreen) this.f268901m;
        r map = ((NewsDelegate) cryptoAssetDetailsScreen.i0.getValue()).p().filter(new z2(new y2(21), 11)).map(new z2(new y2(22), 12));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        n.l2(this, rd0.e.b(map), null, new j(this, null, 26), 3);
        r rVarFilter = cryptoAssetDetailsScreen.j0().f52707c.filter(new z2(new y2(23), 13));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        n.l2(this, rd0.e.b(rVarFilter), null, new a(this, null), 3);
    }

    @Override // t8j.c
    public final vkm.d Z2(xi0.b bVar) {
        if (bVar == null) {
            return rd0.e.b(nim.a.w(m0k.e.b(this.f268900l, WealthNewsCategory.Crypto.f101805b, true, null, null, null, null, 5, false, 60), new y2(20)));
        }
        return rd0.e.b(m0k.e.a(this.f268900l, WealthNewsCategory.Crypto.f101805b, bVar.f306286a, 5, false));
    }
}
