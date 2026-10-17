package bp4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class g {
    public static Clause a(String rate, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(rate, "rate");
        wi0.b.Companion.getClass();
        return Intrinsics.f(countryCode, wi0.b.A) ? new TextLocalisedClause(R$string.credit_card_statement_financing_confirmation_section_summary_year_rate, u.c(rate), null, 12) : new TextClause(rate, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static TextLocalisedClause b(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        return Intrinsics.f(countryCode, wi0.b.A) ? new TextLocalisedClause(R$string.credit_card_statement_financing_confirmation_section_summary_total_cost, null, null, 14) : new TextLocalisedClause(R$string.credit_card_instalment_management_section_details_apr, null, null, 14);
    }
}
