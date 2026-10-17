package gl6;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import com.revolut.feature.external_accounts.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final Clause a(TextLocalisedClause textLocalisedClause, OpenBankingConsent.Australia consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        if (consent.k == null) {
            return textLocalisedClause;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.open_banking_consents_amended_title, null, null, 14);
        return textLocalisedClause == null ? textLocalisedClause2 : new CompositeClause(v.k(textLocalisedClause, textLocalisedClause2), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
