package cgc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o PERSONAL;
    public static final o PRO;
    public static final o STUDENT;
    public static final o YOUTH;

    static {
        o oVar = new o("PERSONAL", 0);
        PERSONAL = oVar;
        o oVar2 = new o("YOUTH", 1);
        YOUTH = oVar2;
        o oVar3 = new o("PRO", 2);
        PRO = oVar3;
        o oVar4 = new o("STUDENT", 3);
        STUDENT = oVar4;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4};
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
