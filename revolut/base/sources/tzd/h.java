package tzd;

import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h EXCEL;
    public static final h PDF;

    @NotNull
    private final StatementsFormat format;
    private final int text;

    static {
        h hVar = new h("PDF", 0, StatementsFormat.PDF, R.string.statements_pdf);
        PDF = hVar;
        h hVar2 = new h("EXCEL", 1, StatementsFormat.EXCEL, R$string.statement_format_csv);
        EXCEL = hVar2;
        h[] hVarArr = {hVar, hVar2};
        $VALUES = hVarArr;
        $ENTRIES = vc.s.n(hVarArr);
    }

    public h(String str, int i, StatementsFormat statementsFormat, int i2) {
        this.format = statementsFormat;
        this.text = i2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final StatementsFormat b() {
        return this.format;
    }

    public final int c() {
        return this.text;
    }
}
