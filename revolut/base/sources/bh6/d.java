package bh6;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.external_accounts.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements c {
    public static qv0.i a(boolean z, String str, String str2, TextLocalisedClause textLocalisedClause, dj0.d dVar) {
        if (!z) {
            return new CellDetailsDelegate.Model(str, textLocalisedClause, new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        }
        return new CellDetailsActionDelegate.Model(str, textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Click(30, (Integer) null, (Object) null, str2, false), null, 8), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
    }

    public final List b(ExternalInstitution institution, dj0.d maxPerTransfer, dj0.d maxPerMonth, boolean z, e revolutAccountDetails, boolean z3) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(maxPerTransfer, "maxPerTransfer");
        Intrinsics.checkNotNullParameter(maxPerMonth, "maxPerMonth");
        Intrinsics.checkNotNullParameter(revolutAccountDetails, "revolutAccountDetails");
        qv0.i[] elements = {new CellDetailsDelegate.Model("ITEM_ID_FROM", new TextLocalisedClause(R$string.open_banking_mandate_from, null, null, 14), new TextClause(institution.f66108b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("ITEM_ID_TO", new TextLocalisedClause(R$string.open_banking_mandate_to, null, null, 14), new TextClause(j6.a.q("Revolut · ", revolutAccountDetails.f15236a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new ResourceImage(z ? R$drawable.uikit_icn_16_chevron_up_small : R$drawable.uikit_icn_16_chevron_down_small, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520), z ? new CellDetailsDelegate.Model("ITEM_ID_ACCOUNT_NUMBER", new TextLocalisedClause(R$string.open_banking_mandate_account_number, null, null, 14), new TextClause(revolutAccountDetails.f15237b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null, z ? new CellDetailsDelegate.Model("ITEM_ID_SORT_CODE", new TextLocalisedClause(R$string.open_banking_mandate_sort_code, null, null, 14), new TextClause(revolutAccountDetails.f15238c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null, a(z3, "ITEM_ID_MAX_PER_TRANSFER", "ACTION_CHANGE_MAX_PER_TRANSFER", new TextLocalisedClause(R$string.open_banking_mandate_max_per_transfer, null, null, 14), maxPerTransfer), a(z3, "ITEM_ID_MAX_PER_MONTH", "ACTION_CHANGE_MAX_PER_MONTH", new TextLocalisedClause(R$string.open_banking_mandate_max_per_month, null, null, 14), maxPerMonth), new CellDetailsDelegate.Model("ITEM_ID_VALID_TILL", new TextLocalisedClause(R$string.open_banking_mandate_valid_till, null, null, 14), new TextLocalisedClause(R$string.open_banking_mandate_further_notice, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
