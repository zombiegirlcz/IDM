package i0e;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static SingleChoiceDelegate.Model a(StatementPeriodType statementPeriodType, d dVar) {
        TextLocalisedClause textLocalisedClause;
        String strQ = j6.a.q("PERIOD_CHOICE_ID_", statementPeriodType.name());
        switch (s.f157388a[statementPeriodType.ordinal()]) {
            case 1:
                textLocalisedClause = new TextLocalisedClause(R$string.statement_period_all_time, null, null, 14);
                break;
            case 2:
                textLocalisedClause = new TextLocalisedClause(R$string.statement_period_month, null, null, 14);
                break;
            case 3:
                textLocalisedClause = new TextLocalisedClause(R$string.statement_period_tax_year, null, null, 14);
                break;
            case 4:
            case 5:
                textLocalisedClause = new TextLocalisedClause(R$string.statement_period_calendar_year, null, null, 14);
                break;
            case 6:
                textLocalisedClause = new TextLocalisedClause(R$string.statement_period_custom, null, null, 14);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        StatementPeriodType statementPeriodType2 = dVar.f157361a;
        LinkedHashMap linkedHashMap = dVar.f157362b;
        SingleChoiceDelegate.Model model = new SingleChoiceDelegate.Model(strQ, textLocalisedClause, statementPeriodType == statementPeriodType2, null, linkedHashMap.get(statementPeriodType), YearClass.CLASS_2008);
        if (linkedHashMap.keySet().contains(statementPeriodType)) {
            return model;
        }
        return null;
    }
}
