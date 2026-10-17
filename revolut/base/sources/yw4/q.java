package yw4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q ACTIVE;
    public static final q DEACTIVATING;
    public static final q INACTIVE;
    public static final q LATE;
    public static final q TERMINATED;

    static {
        q qVar = new q("ACTIVE", 0);
        ACTIVE = qVar;
        q qVar2 = new q("INACTIVE", 1);
        INACTIVE = qVar2;
        q qVar3 = new q("DEACTIVATING", 2);
        DEACTIVATING = qVar3;
        q qVar4 = new q("LATE", 3);
        LATE = qVar4;
        q qVar5 = new q("TERMINATED", 4);
        TERMINATED = qVar5;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5};
        $VALUES = qVarArr;
        $ENTRIES = s.n(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
