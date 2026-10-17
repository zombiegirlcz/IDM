package ny5;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.ng;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoSortingPickerInputData;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import grl.b4;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.y;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static y a(SortingType selectedSortingType) {
        Intrinsics.checkNotNullParameter(selectedSortingType, "selectedSortingType");
        CryptoSortingPickerInputData.INSTANCE.getClass();
        return new y(b(selectedSortingType, CryptoSortingPickerInputData.f71513c), new rp0.t(new TextLocalisedClause(R$string.cryptocommodity_invest_crypto_sort_by_title, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, null, 1016);
    }

    public static ArrayList b(SortingType sortingType, List allowedSortingTypes) {
        int i;
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(sortingType, "selectedSortingType");
        Intrinsics.checkNotNullParameter(allowedSortingTypes, "allowedSortingTypes");
        List<SortingType> list = allowedSortingTypes;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (SortingType sortingType2 : list) {
            Intrinsics.checkNotNullParameter(sortingType2, "<this>");
            Intrinsics.checkNotNullParameter(sortingType, "sortingType");
            if (sortingType2 instanceof SortingType.CurrentPrice) {
                i = R$string.crypto_sort_by_current_price;
            } else if (sortingType2 instanceof SortingType.MarketCap) {
                i = R$string.crypto_sort_by_market_cap;
            } else if (sortingType2 instanceof SortingType.MostBought) {
                i = R$string.crypto_sort_by_most_bought;
            } else if (sortingType2 instanceof SortingType.MostSold) {
                i = R$string.crypto_sort_by_most_sold;
            } else if (sortingType2 instanceof SortingType.PriceChange) {
                i = R$string.crypto_sort_by_price_change;
            } else {
                if (!(sortingType2 instanceof SortingType.VolumeChange)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.crypto_defi_asset_list_sort_volume_change;
            }
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, null, 14);
            boolean z = sortingType.getClass() == sortingType2.getClass();
            int i2 = w.f220679a[sortingType.getF71600a().ordinal()];
            if (i2 == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.single_choice_low_to_high, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.single_choice_high_to_low, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10);
            }
            arrayList.add(new SingleChoiceDelegate.Model("id_sorting_dialog", textLocalisedClause2, z, new ng(textLocalisedClause, new ResourceImage(hn5.c.b(sortingType.getF71600a()), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, new ImageTransformations(null, null, null, null, null, 16, 16, 31), (Clause) null, 182)), sortingType2, b4.EXPIRED_OR_INVALID_KEY_VALUE));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("id_sorting_dialog_action_button", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.crypto_common_action_apply, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, R$attr.uikit_dp24, 0, 0, 0, 14);
        return d0.E0(zhm.u.c(model), arrayList);
    }
}
