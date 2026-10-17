package tde;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q ArrowRightLeft;
    public static final q Bell;
    public static final q Number;

    static {
        q qVar = new q("Bell", 0);
        Bell = qVar;
        q qVar2 = new q("ArrowRightLeft", 1);
        ArrowRightLeft = qVar2;
        q qVar3 = new q("Number", 2);
        Number = qVar3;
        q[] qVarArr = {qVar, qVar2, qVar3};
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
