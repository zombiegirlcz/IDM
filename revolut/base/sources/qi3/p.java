package qi3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p ACCOUNT_CELL_ITEM;
    public static final p HEADER;
    public static final p IMAGE_ITEM;
    public static final p TEXT_ITEM;

    static {
        p pVar = new p("IMAGE_ITEM", 0);
        IMAGE_ITEM = pVar;
        p pVar2 = new p("TEXT_ITEM", 1);
        TEXT_ITEM = pVar2;
        p pVar3 = new p("HEADER", 2);
        HEADER = pVar3;
        p pVar4 = new p("ACCOUNT_CELL_ITEM", 3);
        ACCOUNT_CELL_ITEM = pVar4;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4};
        $VALUES = pVarArr;
        $ENTRIES = vc.s.n(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
