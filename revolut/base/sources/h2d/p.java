package h2d;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.separate_favourites.currency_providers.impl.R$plurals;
import com.revolut.feature.separate_favourites.currency_providers.impl.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import grl.k9;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements x3d.f {
    public p(o fieldMapper) {
        Intrinsics.checkNotNullParameter(fieldMapper, "fieldMapper");
    }

    @Override // x3d.f
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.e;
    }

    @Override // x3d.f
    public final ogd.j b(int i) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.securities_watchlist_limit_reached_dialog_title, null, null, 14);
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.securities_watchlist_limit_reached_dialog_description, Integer.valueOf(i), (List) null, (Style) null, 28);
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
        return new InstrumentImage(item.f86898a.f86863a, 30, null, null);
    }

    @Override // x3d.f
    public final int e() {
        return R$string.watchlist_securities_asset_type_name;
    }

    @Override // x3d.f
    public final Clause f() {
        return new TextLocalisedClause(R$string.watchlist_securities_add_item_title, null, null, 14);
    }

    @Override // x3d.f
    public final int g() {
        return R$drawable.uikit_icn_24_wealth;
    }

    @Override // x3d.f
    public final RowDelegate.Model h(WatchlistItem item, String listId) {
        MoneyClause moneyClause;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(listId, "listId");
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new InstrumentImage(item.f86898a.f86863a, 24, Integer.valueOf(R$drawable.uikit_icn_circle_background), Integer.valueOf(R$attr.uikit_colorGrey5)), null, null, false, null, false, 62);
        Clause clauseC = c(item);
        TextClause textClause = new TextClause(item.f86898a.f86864b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        BigDecimal bigDecimal = item.f86900c;
        if (bigDecimal != null) {
            xi0.a aVar = xi0.b.Companion;
            String str = item.f86899b;
            aVar.getClass();
            moneyClause = new MoneyClause(pyd.c.V(cp5.d.d0(xi0.a.a(str)), bigDecimal), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
        } else {
            moneyClause = null;
        }
        BigDecimal bigDecimal2 = item.d;
        return new RowDelegate.Model(listId, image40, clauseC, null, 0, textClause, null, null, 0, new RowDelegate.Model.c.b(moneyClause, bigDecimal2 != null ? xqi.a.c(bigDecimal2, false, false, false, false, false, CertificateBody.profileType) : null, null, false, 124), true, null, false, null, null, null, null, null, null, new ifd.f(item), null, 0, 0, 0, 0, 532673496);
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
        FavouritesAssetDetails favouritesAssetDetails = eVar.f225109a;
        TextClause textClause = new TextClause(favouritesAssetDetails.f86865c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(favouritesAssetDetails.f86864b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(new InstrumentImage(favouritesAssetDetails.f86863a, 24, Integer.valueOf(R$drawable.uikit_icn_circle_background), Integer.valueOf(R$attr.uikit_colorGrey5)), null, null, false, null, false, 62), z ? textClause2 : textClause, null, 0, z ? textClause : textClause2, null, null, 0, o.c(eVar2), o.a(eVar2), null, false, o.b(eVar2), null, null, null, null, null, eVar, null, 0, 0, 0, 0, 532657112);
    }
}
