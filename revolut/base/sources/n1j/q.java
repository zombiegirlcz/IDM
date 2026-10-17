package n1j;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q COMMODITIES;
    public static final q CRYPTO;
    public static final q JOINT;
    public static final q PERSONAL;
    public static final q PRO;

    static {
        q qVar = new q("PERSONAL", 0);
        PERSONAL = qVar;
        q qVar2 = new q("CRYPTO", 1);
        CRYPTO = qVar2;
        q qVar3 = new q("COMMODITIES", 2);
        COMMODITIES = qVar3;
        q qVar4 = new q("JOINT", 3);
        JOINT = qVar4;
        q qVar5 = new q("PRO", 4);
        PRO = qVar5;
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
