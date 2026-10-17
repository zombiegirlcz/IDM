package op0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q DYNAMIC;
    public static final q LARGE;
    public static final q MEDIUM;
    public static final q SMALL;

    static {
        q qVar = new q("SMALL", 0);
        SMALL = qVar;
        q qVar2 = new q("DYNAMIC", 1);
        DYNAMIC = qVar2;
        q qVar3 = new q("MEDIUM", 2);
        MEDIUM = qVar3;
        q qVar4 = new q("LARGE", 3);
        LARGE = qVar4;
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
