package gl6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.openbanking.ConsentPermission;
import com.revolut.domain.models.openbanking.PermissionType;
import com.revolut.feature.external_accounts.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static ArrayList a(List permissions) {
        int i;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        List<ConsentPermission> list = permissions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (ConsentPermission consentPermission : list) {
            String value = consentPermission.getValue();
            RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6);
            switch (f.f144568b[consentPermission.ordinal()]) {
                case 1:
                    i = R$string.open_banking_consent_flow_accounts_information_permission_profile;
                    break;
                case 2:
                    i = R$string.open_banking_consent_flow_accounts_information_permission_common_customer_basic_read;
                    break;
                case 3:
                    i = R$string.open_banking_consent_flow_accounts_information_permission_common_customer_detail_read;
                    break;
                case 4:
                    i = R$string.open_banking_consent_flow_accounts_information_permission_bank_accounts_basic_read;
                    break;
                case 5:
                    i = R$string.open_banking_consent_flow_accounts_information_permission_bank_accounts_detail_read;
                    break;
                case 6:
                    i = R$string.open_banking_consent_flow_accounts_information_permission_bank_payees_read;
                    break;
                case 7:
                    i = R$string.open_banking_consent_flow_accounts_information_permission_bank_regular_payments_read;
                    break;
                case 8:
                    i = R$string.open_banking_consent_flow_accounts_information_permission_bank_transactions_read;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new RowDelegate.Model(value, image24, new TextLocalisedClause(i, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        }
        return arrayList;
    }

    public static ArrayList b(List permissions) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = permissions.iterator();
        while (it8.hasNext()) {
            PermissionType permissionType = (PermissionType) it8.next();
            switch (f.f144567a[permissionType.ordinal()]) {
                case 1:
                    textLocalisedClause = new TextLocalisedClause(R$string.consent_details_permission_readAccountsBasic, null, null, 14);
                    textLocalisedClause2 = textLocalisedClause;
                    break;
                case 2:
                    textLocalisedClause = new TextLocalisedClause(R$string.consent_details_permission_readAccountsDetail, null, null, 14);
                    textLocalisedClause2 = textLocalisedClause;
                    break;
                case 3:
                    textLocalisedClause = new TextLocalisedClause(R$string.consent_details_permission_readBalances, null, null, 14);
                    textLocalisedClause2 = textLocalisedClause;
                    break;
                case 4:
                    textLocalisedClause = new TextLocalisedClause(R$string.consent_details_permission_readTransactionsBasic, null, null, 14);
                    textLocalisedClause2 = textLocalisedClause;
                    break;
                case 5:
                    textLocalisedClause = new TextLocalisedClause(R$string.consent_details_permission_readTransactionsDetail, null, null, 14);
                    textLocalisedClause2 = textLocalisedClause;
                    break;
                case 6:
                    textLocalisedClause = new TextLocalisedClause(R$string.consent_details_permission_readTransactionsCredits, null, null, 14);
                    textLocalisedClause2 = textLocalisedClause;
                    break;
                case 7:
                    textLocalisedClause = new TextLocalisedClause(R$string.consent_details_permission_readTransactionsDebits, null, null, 14);
                    textLocalisedClause2 = textLocalisedClause;
                    break;
                default:
                    IllegalStateException illegalStateException = new IllegalStateException("No title found for default permission " + permissionType);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    textLocalisedClause2 = null;
                    break;
            }
            RowDelegate.Model model = textLocalisedClause2 != null ? new RowDelegate.Model(permissionType.name(), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textLocalisedClause2, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904) : null;
            if (model != null) {
                arrayList.add(model);
            }
        }
        return arrayList;
    }
}
