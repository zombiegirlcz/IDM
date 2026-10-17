package d3c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l CARD;
    public static final l REVOLUT_PAY;
    public static final l UNKNOWN;

    static {
        l lVar = new l("UNKNOWN", 0);
        UNKNOWN = lVar;
        l lVar2 = new l("CARD", 1);
        CARD = lVar2;
        l lVar3 = new l("REVOLUT_PAY", 2);
        REVOLUT_PAY = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
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
