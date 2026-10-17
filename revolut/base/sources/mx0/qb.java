package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class qb {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ qb[] $VALUES;
    public static final qb DETECTING;
    public static final qb ERROR;
    public static final qb SUCCESS;

    static {
        qb qbVar = new qb("DETECTING", 0);
        DETECTING = qbVar;
        qb qbVar2 = new qb("SUCCESS", 1);
        SUCCESS = qbVar2;
        qb qbVar3 = new qb("ERROR", 2);
        ERROR = qbVar3;
        qb[] qbVarArr = {qbVar, qbVar2, qbVar3};
        $VALUES = qbVarArr;
        $ENTRIES = vc.s.n(qbVarArr);
    }

    public static qb valueOf(String str) {
        return (qb) Enum.valueOf(qb.class, str);
    }

    public static qb[] values() {
        return (qb[]) $VALUES.clone();
    }
}
