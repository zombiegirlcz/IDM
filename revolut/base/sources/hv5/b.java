package hv5;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.ng;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import grl.b4;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final SingleChoiceDelegate.Model a(CryptoInvestmentsSortingType cryptoInvestmentsSortingType, CryptoInvestmentsSortingType selectedSortingType) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(cryptoInvestmentsSortingType, "<this>");
        Intrinsics.checkNotNullParameter(selectedSortingType, "selectedSortingType");
        Intrinsics.checkNotNullParameter(cryptoInvestmentsSortingType, "<this>");
        if (cryptoInvestmentsSortingType instanceof CryptoInvestmentsSortingType.TotalValue) {
            i = R$string.crypto_investments_sort_by_total_value_text;
        } else if (cryptoInvestmentsSortingType instanceof CryptoInvestmentsSortingType.Performance) {
            i = R$string.crypto_investments_sort_by_performance_text;
        } else if (cryptoInvestmentsSortingType instanceof CryptoInvestmentsSortingType.MarketCap) {
            i = R$string.crypto_investments_sort_by_market_cap_text;
        } else {
            if (!(cryptoInvestmentsSortingType instanceof CryptoInvestmentsSortingType.Alphabetical)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.crypto_investments_sort_by_alphabetical_text;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        boolean z = selectedSortingType.getClass() == cryptoInvestmentsSortingType.getClass();
        Intrinsics.checkNotNullParameter(selectedSortingType, "<this>");
        if (selectedSortingType instanceof CryptoInvestmentsSortingType.Alphabetical) {
            int i5 = a.f155785a[((CryptoInvestmentsSortingType.Alphabetical) selectedSortingType).f71407a.ordinal()];
            if (i5 == 1) {
                i2 = R$string.crypto_single_choice_A_to_Z;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$string.crypto_single_choice_Z_to_A;
            }
        } else {
            int i6 = a.f155785a[selectedSortingType.getF71410a().ordinal()];
            if (i6 == 1) {
                i2 = com.revolut.feature.cryptocommodity_invest.api.R$string.single_choice_low_to_high;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = com.revolut.feature.cryptocommodity_invest.api.R$string.single_choice_high_to_low;
            }
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, null, null, 14);
        Intrinsics.checkNotNullParameter(selectedSortingType, "<this>");
        int i21 = a.f155785a[selectedSortingType.getF71410a().ordinal()];
        if (i21 == 1) {
            i3 = R$drawable.uikit_icn_24_arrow_thin_up;
        } else {
            if (i21 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = R$drawable.uikit_icn_24_arrow_thin_down;
        }
        return new SingleChoiceDelegate.Model("SORTING_BOTTOM_DIALOG_ITEM_ID", textLocalisedClause, z, new ng(textLocalisedClause2, new ResourceImage(i3, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, new ImageTransformations(null, null, null, null, null, 16, 16, 31), (Clause) null, 182)), cryptoInvestmentsSortingType, b4.EXPIRED_OR_INVALID_KEY_VALUE);
    }
}
