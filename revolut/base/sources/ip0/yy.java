package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class yy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ yy[] $VALUES;
    public static final yy ITEM_CLICK;
    public static final yy PRIMARY_ACTION_CLICK;
    public static final yy SECONDARY_ACTION_CLICK;

    static {
        yy yyVar = new yy("ITEM_CLICK", 0);
        ITEM_CLICK = yyVar;
        yy yyVar2 = new yy("PRIMARY_ACTION_CLICK", 1);
        PRIMARY_ACTION_CLICK = yyVar2;
        yy yyVar3 = new yy("SECONDARY_ACTION_CLICK", 2);
        SECONDARY_ACTION_CLICK = yyVar3;
        yy[] yyVarArr = {yyVar, yyVar2, yyVar3};
        $VALUES = yyVarArr;
        $ENTRIES = vc.s.n(yyVarArr);
    }

    public static yy valueOf(String str) {
        return (yy) Enum.valueOf(yy.class, str);
    }

    public static yy[] values() {
        return (yy[]) $VALUES.clone();
    }
}
