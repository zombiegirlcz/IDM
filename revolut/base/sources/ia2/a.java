package ia2;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.payid.impl.extension.dialog.NewBeneficiaryNameParcel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.z;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class a {
    public static l0 a(String newBeneficiaryName, String aliasValue) {
        Intrinsics.checkNotNullParameter(newBeneficiaryName, "newBeneficiaryName");
        Intrinsics.checkNotNullParameter(aliasValue, "aliasValue");
        return new l0(new TextLocalisedClause(R$string.confirm_pay_id_contact_change_title, null, null, 14), new CompositeClause(v.k(new TextLocalisedClause(R$string.apm_contact_change_subtitle, null, null, 14), new TextClause(newBeneficiaryName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(aliasValue, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, new TextLocalisedClause(R$string.apm_contact_change_confirm, null, null, 14), new TextLocalisedClause(R$string.apm_contact_change_change_recipient, null, null, 14), new NewBeneficiaryNameParcel(newBeneficiaryName), false, null, 964);
    }

    public static z b() {
        return new z(new TextLocalisedClause(com.revolut.feature.apm.payid.api.R$string.add_contact_error_resolve_attempts_reached_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.payid.api.R$string.add_contact_error_resolve_attempts_reached_description, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.payid.api.R$string.add_contact_error_resolve_attempts_reached_button_use_account_details_title, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
    }
}
