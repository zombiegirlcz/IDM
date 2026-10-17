package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ka {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ka[] $VALUES;
    public static final ka CHAR;
    public static final ka FULL;
    public static final ka SHORT;

    static {
        ka kaVar = new ka("FULL", 0);
        FULL = kaVar;
        ka kaVar2 = new ka("SHORT", 1);
        SHORT = kaVar2;
        ka kaVar3 = new ka("CHAR", 2);
        CHAR = kaVar3;
        ka[] kaVarArr = {kaVar, kaVar2, kaVar3};
        $VALUES = kaVarArr;
        $ENTRIES = vc.s.n(kaVarArr);
    }

    public static ka valueOf(String str) {
        return (ka) Enum.valueOf(ka.class, str);
    }

    public static ka[] values() {
        return (ka[]) $VALUES.clone();
    }
}
