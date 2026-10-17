package d7e;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.subaccount.impl.R$string;
import java.util.List;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class i {
    public static xfe.d a(Subaccount subaccount) {
        return new xfe.d(new TextLocalisedClause(R$string.vaults_closure_alert_pockets_title_v2, null, null, 14), new TextLocalisedClause(com.revolut.feature.tab.accounts.api.R$string.accounts_remove_subaccount_body, u.c(new TextClause(subaccount.a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, 12);
    }
}
