package eoi;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q ACTIVE;
    public static final q CANCELLED;
    public static final q FINISHED;
    public static final q NOT_STARTED;
    public static final q PENDING;

    static {
        q qVar = new q("NOT_STARTED", 0);
        NOT_STARTED = qVar;
        q qVar2 = new q("PENDING", 1);
        PENDING = qVar2;
        q qVar3 = new q("ACTIVE", 2);
        ACTIVE = qVar3;
        q qVar4 = new q("FINISHED", 3);
        FINISHED = qVar4;
        q qVar5 = new q("CANCELLED", 4);
        CANCELLED = qVar5;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5};
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
