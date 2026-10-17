package aqd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o DEFAULT;
    public static final o FORCE_ONE_OFF;
    public static final o FORCE_RECURRING;

    static {
        o oVar = new o("DEFAULT", 0);
        DEFAULT = oVar;
        o oVar2 = new o("FORCE_RECURRING", 1);
        FORCE_RECURRING = oVar2;
        o oVar3 = new o("FORCE_ONE_OFF", 2);
        FORCE_ONE_OFF = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
