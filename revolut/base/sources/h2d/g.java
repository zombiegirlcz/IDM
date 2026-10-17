package h2d;

import android.os.Parcelable;
import aw0.o9;
import aw0.wa;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.separate_favourites.currency_providers.impl.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import grl.k9;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements x3d.f {
    public g(o fieldMapper) {
        Intrinsics.checkNotNullParameter(fieldMapper, "fieldMapper");
    }

    @Override // x3d.f
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.f310361h;
    }

    @Override // x3d.f
    public final ogd.j b(int i) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.watchlist_generic_asset_limit_reached_dialog_title, u.c(Integer.valueOf(R$string.watchlist_bonds_asset_type_name)), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.watchlist_generic_asset_limit_reached_dialog_description, v.k(Integer.valueOf(i), Integer.valueOf(R$string.watchlist_bonds_asset_type_name)), null, 12);
        k9 k9Var = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ogd.j(textLocalisedClause, textLocalisedClause2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
    }

    @Override // x3d.f
    public final Clause c(WatchlistItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new TextClause(item.f86898a.f86865c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    @Override // x3d.f
    public final Image d(WatchlistItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new InstrumentImage(item.f86898a.f86863a, 30, null, null);
    }

    @Override // x3d.f
    public final int e() {
        return R$string.watchlist_bonds_asset_type_name;
    }

    @Override // x3d.f
    public final Clause f() {
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    @Override // x3d.f
    public final int g() {
        return R$drawable.uikit_icn_24_wealth;
    }

    @Override // x3d.f
    public final RowDelegate.Model h(WatchlistItem item, String listId) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(listId, "listId");
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new InstrumentImage(item.f86898a.f86863a, 24, Integer.valueOf(R$drawable.uikit_icn_circle_background), Integer.valueOf(R$attr.uikit_colorGrey5)), null, null, false, null, false, 62);
        Clause clauseC = c(item);
        BigDecimal bigDecimal = item.f86901g;
        if (bigDecimal != null) {
            int i = R$string.watchlist_bonds_item_yield;
            BigDecimal bigDecimalMultiply = bigDecimal.multiply(new BigDecimal(100));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            textLocalisedClause = new TextLocalisedClause(i, u.c(new PercentageClause(bigDecimalMultiply, new PercentageClause.Format.Custom(2, 6, null, wa.SHOW_ALL_ZEROES, null), (Style) null, 4)), null, 12);
        } else {
            textLocalisedClause = null;
        }
        BigDecimal bigDecimal2 = item.f86900c;
        return new RowDelegate.Model(listId, image40, clauseC, null, 0, textLocalisedClause, null, null, 0, new RowDelegate.Model.c.b(bigDecimal2 != null ? new AssetClause(bigDecimal2, new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, ScaleMode.TradingPrecise.f51443a, false, false, 5)), item.f86899b, null, o9.NON_SENSITIVE, 8) : null, null, null, false, 126), true, null, false, null, null, null, null, null, null, new r(item, new p5d.b(item.f86898a.f86863a, "instrument", null)), null, 0, 0, 0, 0, 532673496);
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

    public final RowDelegate.Model k(ogd.e eVar, String str, x3d.e eVar2) {
        FavouritesAssetDetails favouritesAssetDetails = eVar.f225109a;
        TextClause textClause = new TextClause(favouritesAssetDetails.f86865c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(new InstrumentImage(favouritesAssetDetails.f86863a, 24, Integer.valueOf(R$drawable.uikit_icn_circle_background), Integer.valueOf(R$attr.uikit_colorGrey5)), null, null, false, null, false, 62), textClause, null, 0, null, null, null, 0, o.c(eVar2), o.a(eVar2), null, false, o.b(eVar2), null, null, null, null, null, eVar, null, 0, 0, 0, 0, 532657112);
    }
}
