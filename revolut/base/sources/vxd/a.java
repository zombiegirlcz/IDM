package vxd;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CONSOLIDATED;
    public static final a TAX_CERTIFICATE;
    public static final a TAX_FILING;

    @NotNull
    private final String code;

    static {
        a aVar = new a("CONSOLIDATED", 0, "STATEMENTS.consolidated_statement");
        CONSOLIDATED = aVar;
        a aVar2 = new a("TAX_FILING", 1, "STATEMENTS.tax_filling_statement");
        TAX_FILING = aVar2;
        a aVar3 = new a("TAX_CERTIFICATE", 2, "STATEMENTS.tax_report_statements");
        TAX_CERTIFICATE = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.code = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }
}
