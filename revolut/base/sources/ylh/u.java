package ylh;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.statements.R$string;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static SingleChoiceDelegate.Model a(w wVar, g gVar) {
        TextLocalisedClause textLocalisedClause;
        String strQ = j6.a.q("PERIOD_CHOICE_ID_", wVar.name());
        int i = v.f314736a[wVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.statement_period_all_time, null, null, 14);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.statement_period_month, null, null, 14);
        } else if (i == 3) {
            textLocalisedClause = new TextLocalisedClause(R$string.statement_period_tax_year, null, null, 14);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.statement_period_custom, null, null, 14);
        }
        return new SingleChoiceDelegate.Model(strQ, textLocalisedClause, wVar == gVar.f314715a, null, gVar.f314716b.get(wVar), YearClass.CLASS_2008);
    }
}
