package fkd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q DEFAULT;
    public static final q HIGH_ALERT;
    public static final q WARNING;

    static {
        q qVar = new q("DEFAULT", 0);
        DEFAULT = qVar;
        q qVar2 = new q("WARNING", 1);
        WARNING = qVar2;
        q qVar3 = new q("HIGH_ALERT", 2);
        HIGH_ALERT = qVar3;
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
