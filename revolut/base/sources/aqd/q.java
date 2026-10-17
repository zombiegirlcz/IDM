package aqd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q DISABLED;
    public static final q MANUAL_EXECUTION;
    public static final q UPDATE;

    static {
        q qVar = new q("UPDATE", 0);
        UPDATE = qVar;
        q qVar2 = new q("MANUAL_EXECUTION", 1);
        MANUAL_EXECUTION = qVar2;
        q qVar3 = new q("DISABLED", 2);
        DISABLED = qVar3;
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
