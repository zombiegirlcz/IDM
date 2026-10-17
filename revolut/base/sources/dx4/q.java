package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q CALL;
    public static final q ENVELOPE;
    public static final q INFO;
    public static final q LINK;
    public static final q PENCIL;
    public static final q PLUS;

    static {
        q qVar = new q("INFO", 0);
        INFO = qVar;
        q qVar2 = new q("PENCIL", 1);
        PENCIL = qVar2;
        q qVar3 = new q("CALL", 2);
        CALL = qVar3;
        q qVar4 = new q("ENVELOPE", 3);
        ENVELOPE = qVar4;
        q qVar5 = new q("LINK", 4);
        LINK = qVar5;
        q qVar6 = new q("PLUS", 5);
        PLUS = qVar6;
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
