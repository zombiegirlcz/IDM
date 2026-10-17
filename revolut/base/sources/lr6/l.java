package lr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l E_COMMERCE;
    public static final l INVOICE;
    public static final l REVOLUT_ME;
    public static final l SALES;

    static {
        l lVar = new l("SALES", 0);
        SALES = lVar;
        l lVar2 = new l("REVOLUT_ME", 1);
        REVOLUT_ME = lVar2;
        l lVar3 = new l("INVOICE", 2);
        INVOICE = lVar3;
        l lVar4 = new l("E_COMMERCE", 3);
        E_COMMERCE = lVar4;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
