package bh8;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l PROCEED_WITHOUT_TRANSFER;
    public static final l TRY_AGAIN;

    static {
        l lVar = new l("TRY_AGAIN", 0);
        TRY_AGAIN = lVar;
        l lVar2 = new l("PROCEED_WITHOUT_TRANSFER", 1);
        PROCEED_WITHOUT_TRANSFER = lVar2;
        l[] lVarArr = {lVar, lVar2};
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
