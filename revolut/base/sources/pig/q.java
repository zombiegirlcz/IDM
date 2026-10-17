package pig;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q MILES;
    public static final q NONE;
    public static final q POINTS;

    static {
        q qVar = new q("NONE", 0);
        NONE = qVar;
        q qVar2 = new q("POINTS", 1);
        POINTS = qVar2;
        q qVar3 = new q("MILES", 2);
        MILES = qVar3;
        q[] qVarArr = {qVar, qVar2, qVar3};
        $VALUES = qVarArr;
        $ENTRIES = vc.s.n(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
