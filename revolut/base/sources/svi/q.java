package svi;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q COMPANION;
    public static final q GIFTED;
    public static final q LIMITED;
    public static final q RECURRING;
    public static final q UNKNOWN;
    public static final q UNLIMITED;

    static {
        q qVar = new q("LIMITED", 0);
        LIMITED = qVar;
        q qVar2 = new q("GIFTED", 1);
        GIFTED = qVar2;
        q qVar3 = new q("RECURRING", 2);
        RECURRING = qVar3;
        q qVar4 = new q("UNLIMITED", 3);
        UNLIMITED = qVar4;
        q qVar5 = new q("COMPANION", 4);
        COMPANION = qVar5;
        q qVar6 = new q("UNKNOWN", 5);
        UNKNOWN = qVar6;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5, qVar6};
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
