package y7d;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q BOTTOM;
    public static final q TOP;

    static {
        q qVar = new q("TOP", 0);
        TOP = qVar;
        q qVar2 = new q("BOTTOM", 1);
        BOTTOM = qVar2;
        q[] qVarArr = {qVar, qVar2};
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
