package enk;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p DOWNWARDS;
    public static final p UNDEFINED;
    public static final p UPWARDS;

    static {
        p pVar = new p("DOWNWARDS", 0);
        DOWNWARDS = pVar;
        p pVar2 = new p("UPWARDS", 1);
        UPWARDS = pVar2;
        p pVar3 = new p("UNDEFINED", 2);
        UNDEFINED = pVar3;
        p[] pVarArr = {pVar, pVar2, pVar3};
        $VALUES = pVarArr;
        $ENTRIES = s.n(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
