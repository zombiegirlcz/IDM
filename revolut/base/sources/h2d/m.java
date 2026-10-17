package h2d;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.separate_favourites.currency_providers.impl.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import grl.k9;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements x3d.f {
    public m(o fieldMapper) {
        Intrinsics.checkNotNullParameter(fieldMapper, "fieldMapper");
    }

    @Override // x3d.f
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.k;
    }

    @Override // x3d.f
    public final ogd.j b(int i) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.watchlist_generic_asset_limit_reached_dialog_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.watchlist_generic_asset_limit_reached_dialog_description, v.k(Integer.valueOf(i), new TextLocalisedClause(R$string.watchlist_futures_asset_type_name, null, null, 14)), null, 12);
        k9 k9Var = k9.Crypto;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ogd.j(textLocalisedClause, textLocalisedClause2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
    }

    @Override // x3d.f
    public final Clause c(WatchlistItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        xi0.a aVar = xi0.b.Companion;
        String str = item.f86898a.f86863a;
        aVar.getClass();
        return new CurrencyClause(xi0.a.a(str), null, null, 6);
    }

    @Override // x3d.f
    public final Image d(WatchlistItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new CurrencyImage(item.f86898a.f86863a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
    }

    @Override // x3d.f
    public final int e() {
        return R$string.watchlist_futures_asset_type_name;
    }

    @Override // x3d.f
    public final Clause f() {
        return new TextLocalisedClause(R$string.watchlist_futures_add_item_title, null, null, 14);
    }

    @Override // x3d.f
    public final int g() {
        return R$drawable.uikit_icn_24_bitcoin;
    }

    @Override // x3d.f
    public final RowDelegate.Model h(WatchlistItem item, String listId) {
        MoneyClause moneyClauseB;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(listId, "listId");
        BigDecimal bigDecimal = item.f86900c;
        FavouritesAssetDetails favouritesAssetDetails = item.f86898a;
        if (bigDecimal != null) {
            xi0.a aVar = xi0.b.Companion;
            String str = item.f86899b;
            aVar.getClass();
            moneyClauseB = u5l.a.b(u80.q.a(bigDecimal, xi0.a.a(str)), o9.NON_SENSITIVE, null, null, 14);
        } else {
            moneyClauseB = null;
        }
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(favouritesAssetDetails.f86863a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62);
        Clause clauseC = c(item);
        xi0.a aVar2 = xi0.b.Companion;
        String str2 = favouritesAssetDetails.f86863a;
        aVar2.getClass();
        CurrencyClause currencyClause = new CurrencyClause(xi0.a.a(str2), null, null, 6);
        BigDecimal bigDecimal2 = item.d;
        return new RowDelegate.Model(listId, image40, clauseC, null, 0, currencyClause, null, null, 0, new RowDelegate.Model.c.b(moneyClauseB, bigDecimal2 != null ? xqi.a.b(bigDecimal2, false, 7) : null, null, false, 124), true, null, false, null, null, null, null, null, null, new ifd.f(item), null, 0, 0, 0, 0, 532673496);
    }

    @Override // x3d.f
    public final qv0.i i(ogd.e assetPair, String listId, x3d.e extras) {
        Intrinsics.checkNotNullParameter(assetPair, "assetPair");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return k(assetPair, listId, extras);
    }

    @Override // x3d.f
    public final RowDelegate.Model j(ogd.e assetPair, String listId, x3d.e extras) {
        Intrinsics.checkNotNullParameter(assetPair, "assetPair");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return k(assetPair, listId, extras);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.RowDelegate.Model k(ogd.e r26, java.lang.String r27, x3d.e r28) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h2d.m.k(ogd.e, java.lang.String, x3d.e):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }
}
