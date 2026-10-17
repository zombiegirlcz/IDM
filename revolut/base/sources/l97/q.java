package l97;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q PRIMARY_SEARCH;
    public static final q SECONDARY_SEARCH;
    public static final q SUGGESTIONS;

    static {
        q qVar = new q("SUGGESTIONS", 0);
        SUGGESTIONS = qVar;
        q qVar2 = new q("PRIMARY_SEARCH", 1);
        PRIMARY_SEARCH = qVar2;
        q qVar3 = new q("SECONDARY_SEARCH", 2);
        SECONDARY_SEARCH = qVar3;
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
