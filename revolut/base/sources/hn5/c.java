package hn5;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final ImageClause a(SortingType sortingType, int i) {
        Intrinsics.checkNotNullParameter(sortingType, "<this>");
        int iB = b(sortingType.getF71600a());
        Integer numValueOf = Integer.valueOf(i);
        Float fValueOf = Float.valueOf(16.0f);
        return new ImageClause(iB, numValueOf, fValueOf, fValueOf, 16);
    }

    public static final int b(ty5.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = b.f154067a[aVar.ordinal()];
        if (i == 1) {
            return R$drawable.uikit_icn_24_arrow_thin_up;
        }
        if (i == 2) {
            return R$drawable.uikit_icn_24_arrow_thin_down;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static CompositeClause c(SortingType sortingType) {
        int i = R$attr.uikit_colorAccentNeutral;
        Intrinsics.checkNotNullParameter(sortingType, "<this>");
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(d(sortingType, i), a(sortingType, i)));
    }

    public static final TextLocalisedClause d(SortingType sortingType, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(sortingType, "<this>");
        if (sortingType instanceof SortingType.CurrentPrice) {
            i2 = R$string.crypto_sort_by_current_price;
        } else if (sortingType instanceof SortingType.MarketCap) {
            i2 = R$string.crypto_sort_by_market_cap;
        } else if (sortingType instanceof SortingType.MostBought) {
            i2 = R$string.crypto_sort_by_most_bought_subheader;
        } else if (sortingType instanceof SortingType.MostSold) {
            i2 = R$string.crypto_sort_by_most_sold_subheader;
        } else if (sortingType instanceof SortingType.PriceChange) {
            i2 = R$string.crypto_sort_by_price_change_subheader;
        } else {
            if (!(sortingType instanceof SortingType.VolumeChange)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.crypto_defi_asset_list_sort_volume_change_subheader;
        }
        return new TextLocalisedClause(i2, null, new Custom(new Custom.Color.Solid(i), false, false, 254), 10);
    }
}
