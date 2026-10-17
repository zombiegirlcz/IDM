package mgb;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o FREE_PREMIUM;
    public static final o PRIORITY_SUPPORT;
    public static final o SALARY_DRAW;

    static {
        o oVar = new o("SALARY_DRAW", 0);
        SALARY_DRAW = oVar;
        o oVar2 = new o("FREE_PREMIUM", 1);
        FREE_PREMIUM = oVar2;
        o oVar3 = new o("PRIORITY_SUPPORT", 2);
        PRIORITY_SUPPORT = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        $VALUES = oVarArr;
        $ENTRIES = s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
