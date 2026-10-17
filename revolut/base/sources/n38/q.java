package n38;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q ACTIVE;
    public static final q OFFBOARDING;
    public static final q PENDING;
    public static final q TERMINATED;

    static {
        q qVar = new q("ACTIVE", 0);
        ACTIVE = qVar;
        q qVar2 = new q("TERMINATED", 1);
        TERMINATED = qVar2;
        q qVar3 = new q("OFFBOARDING", 2);
        OFFBOARDING = qVar3;
        q qVar4 = new q("PENDING", 3);
        PENDING = qVar4;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4};
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
