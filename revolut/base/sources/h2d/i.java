package h2d;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.RateClause;
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
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements x3d.f {
    public i(o fieldMapper) {
        Intrinsics.checkNotNullParameter(fieldMapper, "fieldMapper");
    }

    @Override // x3d.f
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.d;
    }

    @Override // x3d.f
    public final ogd.j b(int i) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.commodities_watchlist_limit_reached_dialog_title, null, null, 14);
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.commodities_watchlist_limit_reached_dialog_description, Integer.valueOf(i), (List) null, (Style) null, 28);
        k9 k9Var = k9.Trading;
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
        return new CurrencyImage(item.f86898a.f86864b, (ImageTransformations) null, (TextLocalisedClause) null, 14);
    }

    @Override // x3d.f
    public final int e() {
        return R$string.watchlist_commodities_asset_type_name;
    }

    @Override // x3d.f
    public final Clause f() {
        return new TextLocalisedClause(R$string.watchlist_commodities_add_item_title, null, null, 14);
    }

    @Override // x3d.f
    public final int g() {
        return R$drawable.uikit_icn_24_commodities;
    }

    @Override // x3d.f
    public final RowDelegate.Model h(WatchlistItem item, String listId) {
        RateClause rateClause;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(listId, "listId");
        CurrencyImage currencyImage = new CurrencyImage(item.f86898a.f86864b, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        Clause clauseC = c(item);
        int i = R$string.watchlist_asset_type_from_to_template;
        FavouritesAssetDetails favouritesAssetDetails = item.f86898a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, v.k(new TextClause(favouritesAssetDetails.f86864b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(item.f86899b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        BigDecimal bigDecimal = item.f86900c;
        if (bigDecimal != null) {
            xi0.a aVar = xi0.b.Companion;
            String str = item.f86899b;
            aVar.getClass();
            rateClause = new RateClause(bigDecimal, xi0.a.a(str), new RateClause.Format.Default(null, true), null);
        } else {
            rateClause = null;
        }
        BigDecimal bigDecimal2 = item.d;
        return new RowDelegate.Model(listId, currencyImage, null, null, clauseC, textLocalisedClause, null, null, 0, new RowDelegate.Model.c.b(rateClause, bigDecimal2 != null ? xqi.a.c(bigDecimal2, false, false, false, false, false, CertificateBody.profileType) : null, null, false, 124), true, false, null, null, null, null, null, new r(item, new p5d.b(favouritesAssetDetails.f86863a, "commodity", null)), null, 0, 0, 0, 0, 1056958316);
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
        xi0.a aVar = xi0.b.Companion;
        FavouritesAssetDetails favouritesAssetDetails = eVar.f225109a;
        String str2 = favouritesAssetDetails.f86864b;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str2);
        String str3 = eVar.f225110b;
        xi0.b bVarA2 = str3 != null ? xi0.a.a(str3) : null;
        return new RowDelegate.Model(str, (!z || bVarA2 == null) ? new CurrencyImage(favouritesAssetDetails.f86864b, (ImageTransformations) null, (TextLocalisedClause) null, 14) : new PairedImage(new CurrencyImage(favouritesAssetDetails.f86864b, (ImageTransformations) null, (TextLocalisedClause) null, 14), new CurrencyImage(bVarA2.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null), null, null, z ? new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(favouritesAssetDetails.f86864b, " / ", str3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause(favouritesAssetDetails.f86864b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (!z || bVarA2 == null) ? new TextClause(favouritesAssetDetails.f86865c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.watchlist_asset_type_from_to_template, v.k(new CurrencyClause(bVarA, null, null, 6), new CurrencyClause(bVarA2, null, null, 6)), null, 12), null, null, 0, o.c(eVar2), o.a(eVar2), false, null, o.b(eVar2), null, null, null, eVar, null, 0, 0, 0, 0, 1056925548);
    }
}
