package lr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p AUTHORISED;
    public static final p CANCELLED;
    public static final p CAPTURED;
    public static final p DECLINED;
    public static final p PENDING;
    public static final p UNKNOWN;

    static {
        p pVar = new p("AUTHORISED", 0);
        AUTHORISED = pVar;
        p pVar2 = new p("CAPTURED", 1);
        CAPTURED = pVar2;
        p pVar3 = new p("CANCELLED", 2);
        CANCELLED = pVar3;
        p pVar4 = new p("DECLINED", 3);
        DECLINED = pVar4;
        p pVar5 = new p("PENDING", 4);
        PENDING = pVar5;
        p pVar6 = new p("UNKNOWN", 5);
        UNKNOWN = pVar6;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5, pVar6};
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
