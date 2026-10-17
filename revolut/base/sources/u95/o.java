package u95;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o LIMIT_EXCEEDED;
    public static final o NORMAL;
    public static final o RESTRICTED;
    public static final o WARNING_THRESHOLD;

    static {
        o oVar = new o("NORMAL", 0);
        NORMAL = oVar;
        o oVar2 = new o("WARNING_THRESHOLD", 1);
        WARNING_THRESHOLD = oVar2;
        o oVar3 = new o("LIMIT_EXCEEDED", 2);
        LIMIT_EXCEEDED = oVar3;
        o oVar4 = new o("RESTRICTED", 3);
        RESTRICTED = oVar4;
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
