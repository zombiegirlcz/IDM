package kr1;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.postal_check.api.R$string;
import nii.v;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static y0 a(int i) {
        return new y0("ID_TERMS_DIALOG", new v(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(R$string.postal_check_terms_and_conditions_description, u.c(new TextLocalisedClause(R$string.postal_check_terms_and_conditions_description_link, null, new Click(30, (Integer) null, (Object) null, "ID_TERMS_CLAUSE", false), 10)), null, 12), null, new TextLocalisedClause(R$string.postal_check_terms_and_conditions_action, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_action_cancel, null, null, 14), null, null, null, false, null, 4032), false, 4);
    }
}
