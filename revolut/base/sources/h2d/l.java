package h2d;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import x3d.d;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements x3d.f {
    public static RowDelegate.Model k(ogd.e eVar, String str, x3d.e eVar2, boolean z, boolean z3) {
        xi0.a aVar = xi0.b.Companion;
        FavouritesAssetDetails favouritesAssetDetails = eVar.f225109a;
        String str2 = favouritesAssetDetails.f86864b;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str2);
        String str3 = eVar.f225110b;
        tf tfVar = null;
        xi0.b bVarA2 = str3 != null ? xi0.a.a(str3) : null;
        Image currencyImage = (!z || str3 == null) ? new CurrencyImage(favouritesAssetDetails.f86864b, (ImageTransformations) null, (TextLocalisedClause) null, 14) : new PairedImage(new CurrencyImage(favouritesAssetDetails.f86864b, (ImageTransformations) null, (TextLocalisedClause) null, 14), new CurrencyImage(str3, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null);
        TextClause textClause = z3 ? new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(favouritesAssetDetails.f86864b, " / ", str3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause(favouritesAssetDetails.f86864b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Clause textClause2 = (!z3 || bVarA2 == null) ? new TextClause(favouritesAssetDetails.f86865c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.watchlist_asset_type_from_to_template, v.k(new CurrencyClause(bVarA, null, null, 6), new CurrencyClause(bVarA2, null, null, 6)), null, 12);
        x3d.d dVar = eVar2.f302727a;
        if (dVar instanceof x3d.c) {
            tfVar = new tf(6, ((x3d.c) dVar).f302725a, false);
        } else if (!(dVar instanceof d.a)) {
            throw new NoWhenBranchMatchedException();
        }
        tf tfVar2 = tfVar;
        boolean z4 = eVar2.f302728b;
        return new RowDelegate.Model(str, currencyImage, null, null, textClause, textClause2, null, null, 0, tfVar2, !z4, false, null, z4 ? RowDelegate.Model.b.a.f53266a : RowDelegate.Model.b.c.f53268a, null, null, null, eVar, null, 0, 0, 0, 0, 1056925548);
    }

    @Override // x3d.f
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.f310358b;
    }

    @Override // x3d.f
    public final ogd.j b(int i) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.fiat_watchlist_limit_reached_dialog_title, null, null, 14);
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.fiat_watchlist_limit_reached_dialog_description, Integer.valueOf(i), (List) null, (Style) null, 28);
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
        return R$string.watchlist_fiat_asset_type_name;
    }

    @Override // x3d.f
    public final Clause f() {
        return new TextLocalisedClause(R$string.watchlist_fiat_add_item_title, null, null, 14);
    }

    @Override // x3d.f
    public final int g() {
        return R$drawable.uikit_icn_24_coins;
    }

    @Override // x3d.f
    public final RowDelegate.Model h(WatchlistItem item, String listId) {
        RateClause rateClause;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(listId, "listId");
        CurrencyImage currencyImage = new CurrencyImage(item.f86898a.f86864b, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        Clause clauseC = c(item);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.watchlist_asset_type_from_to_template, v.k(new TextClause(item.f86898a.f86864b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(item.f86899b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
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
        return new RowDelegate.Model(listId, currencyImage, null, null, clauseC, textLocalisedClause, null, null, 0, new RowDelegate.Model.c.b(rateClause, bigDecimal2 != null ? xqi.a.c(bigDecimal2, false, false, false, false, false, CertificateBody.profileType) : null, null, false, 124), true, false, null, null, null, null, null, new ifd.f(item), null, 0, 0, 0, 0, 1056958316);
    }

    @Override // x3d.f
    public final qv0.i i(ogd.e assetPair, String listId, x3d.e extras) {
        Intrinsics.checkNotNullParameter(assetPair, "assetPair");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return k(assetPair, listId, extras, true, true);
    }

    @Override // x3d.f
    public final RowDelegate.Model j(ogd.e assetPair, String listId, x3d.e extras) {
        Intrinsics.checkNotNullParameter(assetPair, "assetPair");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return k(assetPair, listId, extras, false, false);
    }
}
