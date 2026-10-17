package tb5;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FIXED;
    public static final a MIN_REPAYMENT;
    public static final a STATEMENT_BALANCE;

    @NotNull
    private final String raw;

    static {
        a aVar = new a("FIXED", 0, "fixed");
        FIXED = aVar;
        a aVar2 = new a("MIN_REPAYMENT", 1, "min_repayment");
        MIN_REPAYMENT = aVar2;
        a aVar3 = new a("STATEMENT_BALANCE", 2, "statement_balance");
        STATEMENT_BALANCE = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.raw = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.raw;
    }
}
