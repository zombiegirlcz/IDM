package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p PORTING_CREATE;
    public static final p PORTING_UPDATE;
    public static final p RESUBSCRIBE;
    public static final p TOPUP;

    static {
        p pVar = new p("RESUBSCRIBE", 0);
        RESUBSCRIBE = pVar;
        p pVar2 = new p("TOPUP", 1);
        TOPUP = pVar2;
        p pVar3 = new p("PORTING_CREATE", 2);
        PORTING_CREATE = pVar3;
        p pVar4 = new p("PORTING_UPDATE", 3);
        PORTING_UPDATE = pVar4;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4};
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
