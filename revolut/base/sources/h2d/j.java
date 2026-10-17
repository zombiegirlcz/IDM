package h2d;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.separate_favourites.currency_providers.impl.R$plurals;
import com.revolut.feature.separate_favourites.currency_providers.impl.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import grl.k9;
import ix0.d0;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements x3d.f {
    public j(o fieldMapper) {
        Intrinsics.checkNotNullParameter(fieldMapper, "fieldMapper");
    }

    @Override // x3d.f
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.f310359c;
    }

    @Override // x3d.f
    public final ogd.j b(int i) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_watchlist_limit_reached_dialog_title, null, null, 14);
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.crypto_watchlist_limit_reached_dialog_description, Integer.valueOf(i), (List) null, (Style) null, 28);
        k9 k9Var = k9.Crypto;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ogd.j(textLocalisedClause, textLocalisedQuantityClause, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
    }

    @Override // x3d.f
    public final Clause c(WatchlistItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new TextClause(item.f86898a.f86865c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    @Override // x3d.f
    public final Image d(WatchlistItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new CurrencyImage(item.f86898a.f86863a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
    }

    @Override // x3d.f
    public final int e() {
        return R$string.watchlist_crypto_asset_type_name;
    }

    @Override // x3d.f
    public final Clause f() {
        return new TextLocalisedClause(R$string.watchlist_crypto_add_item_title, null, null, 14);
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
        String str = item.f86899b;
        if (bigDecimal != null) {
            xi0.b.Companion.getClass();
            moneyClauseB = u5l.a.b(u80.q.a(bigDecimal, xi0.a.a(str)), o9.NON_SENSITIVE, null, null, 14);
        } else {
            moneyClauseB = null;
        }
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(favouritesAssetDetails.f86863a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62);
        Clause clauseC = c(item);
        int i = R$string.watchlist_asset_type_from_to_template;
        xi0.a aVar = xi0.b.Companion;
        String str2 = favouritesAssetDetails.f86863a;
        aVar.getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, v.k(d0.a(xi0.a.a(str2), null), new CurrencyClause(xi0.a.a(str), CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12);
        BigDecimal bigDecimal2 = item.d;
        return new RowDelegate.Model(listId, image40, clauseC, null, 0, textLocalisedClause, null, null, 0, new RowDelegate.Model.c.b(moneyClauseB, bigDecimal2 != null ? xqi.a.b(bigDecimal2, false, 7) : null, null, false, 124), true, null, false, null, null, null, null, null, null, new ifd.f(item), null, 0, 0, 0, 0, 532673496);
    }

    @Override // x3d.f
    public final qv0.i i(ogd.e assetPair, String listId, x3d.e extras) {
        Intrinsics.checkNotNullParameter(assetPair, "assetPair");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return k(assetPair, listId, extras, true);
    }

    @Override // x3d.f
    public final RowDelegate.Model j(ogd.e assetPair, String listId, x3d.e extras) {
        Intrinsics.checkNotNullParameter(assetPair, "assetPair");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return k(assetPair, listId, extras, false);
    }

    public final RowDelegate.Model k(ogd.e eVar, String str, x3d.e eVar2, boolean z) {
        Clause clauseA;
        xi0.a aVar = xi0.b.Companion;
        FavouritesAssetDetails favouritesAssetDetails = eVar.f225109a;
        String str2 = favouritesAssetDetails.f86863a;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str2);
        String str3 = eVar.f225110b;
        xi0.b bVarA2 = str3 != null ? xi0.a.a(str3) : null;
        Image currencyImage = (!z || bVarA2 == null) ? new CurrencyImage(favouritesAssetDetails.f86863a, (ImageTransformations) null, (TextLocalisedClause) null, 14) : new PairedImage(new CurrencyImage(favouritesAssetDetails.f86863a, (ImageTransformations) null, (TextLocalisedClause) null, 14), new CurrencyImage(bVarA2.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null);
        if (z) {
            clauseA = new CompositeClause(v.k(d0.a(bVarA, null), str3 != null ? new CurrencyClause(xi0.a.a(str3), CurrencyClause.Format.Ticker.f57756a, null, 4) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        } else {
            clauseA = d0.a(bVarA, null);
        }
        return new RowDelegate.Model(str, currencyImage, null, null, clauseA, (!z || bVarA2 == null) ? new TextClause(favouritesAssetDetails.f86865c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.watchlist_asset_type_from_to_template, v.k(new CurrencyClause(bVarA, null, null, 6), new CurrencyClause(bVarA2, null, null, 6)), null, 12), null, null, 0, o.c(eVar2), o.a(eVar2), false, null, o.b(eVar2), null, null, null, eVar, null, 0, 0, 0, 0, 1056925548);
    }
}
