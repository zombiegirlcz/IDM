package c8e;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.subaccount.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements b {
    public final CellDetailsDelegate.Model a(Subaccount subaccount) {
        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
        return new CellDetailsDelegate.Model("DETAILS_ACCOUNT_CURRENCY_ROW", new TextLocalisedClause(R$string.subaccounts_details_info_currency, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10), new TextClause(subaccount.a(), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), 0, null, null, null, null, null, false, 0, 0, 32752);
    }

    public final CellDetailsDelegate.Model b(Subaccount subaccount) {
        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
        return new CellDetailsDelegate.Model("DETAILS_ACCOUNT_NAME_ROW", new TextLocalisedClause(R$string.subaccounts_details_info_name, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10), new TextClause(subaccount.getName(), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public final CellDetailsDelegate.Model c(Subaccount subaccount) {
        int i;
        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.subaccounts_details_info_purpose, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10);
        if (subaccount instanceof Subaccount.Group) {
            i = R$string.subaccounts_details_purpose_group;
        } else if (subaccount instanceof Subaccount.Personal) {
            i = R$string.subaccounts_details_purpose_personal;
        } else if (subaccount instanceof Subaccount.Joint) {
            i = R$string.subaccounts_details_purpose_joint;
        } else if (subaccount instanceof Subaccount.Junior) {
            i = R$string.subaccounts_details_purpose_junior;
        } else if (subaccount instanceof Subaccount.Teen) {
            i = R$string.subaccounts_details_purpose_teen;
        } else {
            if (!(subaccount instanceof Subaccount.Pro) && !(subaccount instanceof Subaccount.ProTax)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.subaccounts_details_purpose_pro;
        }
        return new CellDetailsDelegate.Model("DETAILS_ACCOUNT_PURPOSE_ROW", textLocalisedClause, new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }
}
