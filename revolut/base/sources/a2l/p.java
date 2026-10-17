package a2l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p CONFIRM;
    public static final p DISMISS;
    public static final p UNKNOWN;

    static {
        p pVar = new p("CONFIRM", 0);
        CONFIRM = pVar;
        p pVar2 = new p("DISMISS", 1);
        DISMISS = pVar2;
        p pVar3 = new p("UNKNOWN", 2);
        UNKNOWN = pVar3;
        p[] pVarArr = {pVar, pVar2, pVar3};
        $VALUES = pVarArr;
        $ENTRIES = vc.s.n(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
