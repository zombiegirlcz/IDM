package pzd;

import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q EXCEL;
    public static final q PDF;

    @NotNull
    private final StatementsFormat format;
    private final int text;

    static {
        q qVar = new q("PDF", 0, StatementsFormat.PDF, R.string.statements_pdf);
        PDF = qVar;
        q qVar2 = new q("EXCEL", 1, StatementsFormat.EXCEL, R$string.statement_format_csv);
        EXCEL = qVar2;
        q[] qVarArr = {qVar, qVar2};
        $VALUES = qVarArr;
        $ENTRIES = vc.s.n(qVarArr);
    }

    public q(String str, int i, StatementsFormat statementsFormat, int i2) {
        this.format = statementsFormat;
        this.text = i2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    public final StatementsFormat b() {
        return this.format;
    }

    public final int c() {
        return this.text;
    }
}
