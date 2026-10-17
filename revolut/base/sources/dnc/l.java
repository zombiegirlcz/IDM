package dnc;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l BONDS_TAB_ID;
    public static final l CASH_TAB_ID;
    public static final l COMMODITIES_TAB_ID;

    @NotNull
    public static final k Companion;
    public static final l STOCKS_TAB_ID;

    @NotNull
    private final String value;

    static {
        l lVar = new l("STOCKS_TAB_ID", 0, "STOCKS_TAB_ID");
        STOCKS_TAB_ID = lVar;
        l lVar2 = new l("BONDS_TAB_ID", 1, "BONDS_TAB_ID");
        BONDS_TAB_ID = lVar2;
        l lVar3 = new l("COMMODITIES_TAB_ID", 2, "COMMODITIES_TAB_ID");
        COMMODITIES_TAB_ID = lVar3;
        l lVar4 = new l("CASH_TAB_ID", 3, "CASH_TAB_ID");
        CASH_TAB_ID = lVar4;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
        Companion = new k();
    }

    public l(String str, int i, String str2) {
        this.value = str2;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
