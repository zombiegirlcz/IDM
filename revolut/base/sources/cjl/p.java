package cjl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p EMAIL;
    public static final p PHONE;

    static {
        p pVar = new p("PHONE", 0);
        PHONE = pVar;
        p pVar2 = new p("EMAIL", 1);
        EMAIL = pVar2;
        p[] pVarArr = {pVar, pVar2};
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
